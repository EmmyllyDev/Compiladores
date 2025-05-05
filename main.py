from antlr4 import *
from src.fimlyLexer import fimlyLexer
from src.fimlyParser import fimlyParser
from src.parser import parse_file 
from src.CustomErrorListener import CustomErrorListener
from src.scanner import scan_file
from src.ast_visualizer import ASTVisualizer

def mostrar_arquivo(nome_arquivo):
    try:
        with open(nome_arquivo, 'r') as file:
            conteudo = file.read()  # Lê o conteúdo do arquivo
            print(conteudo)  # Exibe o conteúdo no terminal
    except FileNotFoundError:
        print(f"O arquivo {nome_arquivo} não foi encontrado.")

def main():
    arquivo_fimly = "codigo.fimly"  # Nome do arquivo a ser lido

    # Mostrar conteúdo do arquivo no terminal
    mostrar_arquivo(arquivo_fimly)

    # Scanner
    tokens, tem_erro_lexico = scan_file(arquivo_fimly)
    if tem_erro_lexico:
        print("Erros léxicos encontrados. Encerrando.")
        return

    # Parser
    input_stream = FileStream(arquivo_fimly, encoding='utf-8')
    lexer = fimlyLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = fimlyParser(token_stream)

    parser.removeErrorListeners()
    error_listener = CustomErrorListener()
    parser.addErrorListener(error_listener)

    arvore = parser.fimly()

    if error_listener.tem_erro:
        print("Erros sintáticos encontrados. Encerrando.")
        return

    print("\nÁrvore de derivação (estrutura):")
    print(arvore.toStringTree(recog=parser))

    raiz = parse_file(arquivo_fimly)
    if raiz is None:
        return

    visualizer = ASTVisualizer()

    # Exporta para .dot
    visualizer.export_to_dot(raiz)

    # Gera imagem PNG
    visualizer.generate_png("ast.dot", "ast.png")

if __name__ == "__main__":
    main()
