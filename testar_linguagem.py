from antlr4 import *
from antlr4.error.ErrorListener import ErrorListener
from minhaLinguagemLexer import minhaLinguagemLexer
import sys

class MyErrorListener(ErrorListener):
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        print(f"ERRO LÉXICO [Linha {line}, Coluna {column}]: Símbolo '{offendingSymbol.text}' inválido.")
        sys.exit(1)

def main():
    input_stream = FileStream('pascal.fonte', encoding='utf-8')

    lexer = minhaLinguagemLexer(input_stream)

    lexer.removeErrorListeners()
    lexer.addErrorListener(MyErrorListener())

    token = lexer.nextToken()
    with open('log_tokens.txt', 'w', encoding='utf-8') as log_file:
        while token.type != Token.EOF:

            if token.type >= len(lexer.symbolicNames) or lexer.symbolicNames[token.type] is None:
                token_type = f"UNKNOWN({token.type})"
            else:
                token_type = lexer.symbolicNames[token.type]
            lexema = token.text
            linha = token.line
            coluna = token.column

            output = f"<{token_type}, '{lexema}', Linha {linha}, Coluna {coluna}>"
            print(output)
            log_file.write(output + '\n')

            token = lexer.nextToken()

if __name__ == '__main__':
    main()
