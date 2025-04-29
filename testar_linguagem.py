from antlr4 import *
from generado.fimlyLexer import fimlyLexer 
from generado.fimlyParser import fimlyParser 
from erro import CustomErrorListener, exibir_tokens
from graphviz import Digraph 

def gerar_imagem_ast(tree, nome_arquivo="ast", parser=None):
    # Cria um gráfico dirigido (digraph)
    dot = Digraph(format='png')  # 'png' gera uma imagem em formato PNG

    # Função recursiva para construir o gráfico a partir da árvore sintática
    def adicionar_no(dot, node, parent=None):
        # Cria um identificador único para cada nó
        node_id = str(id(node))

        # Adiciona o nó ao gráfico
        dot.node(node_id, label=node.getText())

        # Se existir um nó pai, cria a aresta entre eles
        if parent:
            dot.edge(parent, node_id)

        # Adiciona recursivamente os filhos do nó (caso existam)
        if hasattr(node, 'children'):
            for child in node.children:
                adicionar_no(dot, child, node_id)

    # Adiciona o nó raiz (root) da árvore
    adicionar_no(dot, tree)

    # Salva a árvore em um arquivo .png
    dot.render(nome_arquivo, view=True)  # Salva como 'ast.png' e abre a imagem

# Função principal que faz a leitura do código e chama o parser
def main():
    # Lê o código fonte
    input_stream = FileStream('codigo.fimly', encoding="utf-8")
    with open('codigo.fimly', 'r', encoding='utf-8') as file:   
        codigo_fonte = file.read()  # Lê o conteúdo do arquivo

    # Exibe o código fonte no terminal
    print(codigo_fonte)


    # Leitura dos tokens
    lexer = fimlyLexer(input_stream)  # Usando o lexer gerado pelo ANTLR
    token_stream = CommonTokenStream(lexer)

    # Instancia o parser
    parser = fimlyParser(token_stream)
    
    # Associa o erro listener personalizado
    error_listener = CustomErrorListener()
    parser.removeErrorListeners()  # Remove listeners padrão
    parser.addErrorListener(error_listener)  # Adiciona o custom listener

    # Faz a análise sintática
    tree = parser.programa()  # Executa o parsing

    # Verifica se houve erro durante o parsing
    if error_listener.tem_erro:
        print("Erros encontrados durante a análise.")
    else:
        print("Análise concluída sem erros.")
        # Exibe os tokens utilizados
        exibir_tokens(lexer)

if __name__ == "__main__":
    main()
