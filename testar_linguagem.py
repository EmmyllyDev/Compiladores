from antlr4 import *
from generado.fimlyLexer import fimlyLexer 
from generado.fimlyParser import fimlyParser 
from tratar_erro import CustomErrorListener 

def main():
    # Lê o código fonte
    input_stream = FileStream("codigo.fimly", encoding="utf-8")

    lexer = fimlyLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = fimlyParser(token_stream)

    erro_listener = CustomErrorListener()
    parser.removeErrorListeners()  # Remove os listeners padrão
    parser.addErrorListener(erro_listener)  # Adiciona o listener customizado
    
    tree = parser.programa()

    if erro_listener.tem_erro:
        print("Foram encontrados erros no código.")
    else:
        print("Código analisado com sucesso!")

if __name__ == "__main__":
    main()