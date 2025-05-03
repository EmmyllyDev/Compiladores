import logging
from antlr4 import *
from graphviz import Digraph
from generado.fimlyLexer import fimlyLexer
from generado.fimlyParser import fimlyParser
from erro import CustomErrorListener  # Classe de tratamento de erro que você já tem
import sys

# Função para configurar o logging
def configurar_logger():
    logger = logging.getLogger('analisador_lexico')
    logger.setLevel(logging.DEBUG)
    file_handler = logging.FileHandler('log_lexico.txt', mode='w', encoding='utf-8')
    console_handler = logging.StreamHandler(sys.stdout)

    formatter = logging.Formatter('%(asctime)s - %(message)s', datefmt='%Y-%m-%d %H:%M:%S')
    file_handler.setFormatter(formatter)
    console_handler.setFormatter(formatter)

    logger.addHandler(file_handler)
    logger.addHandler(console_handler)
    return logger

# Função para processar o arquivo e gerar os tokens
def processar_tokens(input_stream):
    # Configura o logger
    logger = configurar_logger()

    # Criação do Lexer e Token Stream
    lexer = fimlyLexer(input_stream)
    token_stream = CommonTokenStream(lexer)

    logger.info("\nTokens gerados:")

        # Itera sobre todos os tokens gerados pelo lexer
    for token in lexer.getAllTokens():
        tipo = fimlyLexer.symbolicNames[token.type] if token.type < len(fimlyLexer.symbolicNames) else "DESCONHECIDO"
        lexema = token.text     
        linha = token.line
        coluna = token.column
        logger.info(f"<{tipo}, '{lexema}', Linha {linha}, Coluna {coluna}>")     # Registra a informação do token

        
    return token_stream

def gerar_imagem_ast(minha_arvore, nome_arquivo="ast", parser=None):
    # Cria um gráfico dirigido (digraph)
    dot = Digraph(format='png')

    def adicionar_no(dot, node, parent=None):
        node_id = str(id(node))
        dot.node(node_id, label=node.getText())
        if parent:
            dot.edge(parent, node_id)
        if hasattr(node, 'children'):
            for child in node.children:
                adicionar_no(dot, child, node_id)

    # Depuração: Mostra os nós
    print(minha_arvore.toStringTree(recog=parser))
    
    adicionar_no(dot, minha_arvore)
    dot.render(nome_arquivo, view=True)  # Salva e exibe a AST

def analisar_codigo(input_stream):
    # Lê o código e gera tokens
    token_stream = processar_tokens(input_stream)

    # Instancia o parser
    parser = fimlyParser(token_stream)

    # Associa o erro listener personalizado
    error_listener = CustomErrorListener()
    parser.removeErrorListeners()  # Remove listeners padrão
    parser.addErrorListener(error_listener)  # Adiciona o custom listener

    # Faz a análise sintática
    try:
        tree = parser.fimly()  # Executa o parsing (método 'programa' depende da sua gramática)
    except Exception as e:
        print(f"Erro na análise sintática: {e}")

    if error_listener.tem_erro:
        print("Erros encontrados durante a análise.")
    else:
        print("Análise sintática concluída sem erros.")
        gerar_imagem_ast(tree)
            

def main():
    # Lê o código fonte
    input_stream = FileStream('codigo.fimly', encoding="utf-8")
    with open('codigo.fimly', 'r', encoding='utf-8') as file:
        conteudo = file.read()

    # Exibe o conteúdo do arquivo no terminal
    print(conteudo)

    # Chama a função para analisar o código
    analisar_codigo(input_stream)
  
if __name__ == "__main__":
    main()
