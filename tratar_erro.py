import logging
from antlr4.error.ErrorListener import ErrorListener

class CustomErrorListener(ErrorListener):
    def __init__(self):
        super(CustomErrorListener, self).__init__()
        self.tem_erro = False

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        # Marca que houve erro
        self.tem_erro = True

        # Verifica se o erro é léxico
        if "token recognition error" in msg:  
            simbolo = offendingSymbol.text if offendingSymbol else msg.split(":")[-1].strip().strip("'")
            mensagem = f"ERRO LÉXICO [Linha {line}, Coluna {column}]: Símbolo '{simbolo}' inválido."
            print(f"\033[91m{mensagem}\033[0m")  # Exibe em vermelho no console
            logging.warning(mensagem)  # Loga o erro léxico
        else:
            # Caso o erro seja sintático
            esperado = "outro elemento válido"
            encontrado = offendingSymbol.text if offendingSymbol else "EOF"
            
            # Tenta obter os tokens esperados
            if hasattr(e, "getExpectedTokens"):
                expected = list(e.getExpectedTokens())
                nomes = recognizer.literalNames if hasattr(recognizer, "literalNames") else []
                esperado_tokens = []

                for i in expected:
                    if i < len(nomes) and nomes[i] is not None:
                        esperado_tokens.append(nomes[i].strip("'"))
                
                if esperado_tokens:
                    esperado = "', '".join(esperado_tokens)

            mensagem = f"ERRO SINTÁTICO [Linha {line}, Coluna {column}]: Esperado '{esperado}', encontrado '{encontrado}'."
            print(f"\033[91m{mensagem}\033[0m")  # Exibe em vermelho no console
            logging.warning(mensagem)  # Loga o erro sintático

# Exemplo de configuração do logging para registrar os erros em um arquivo
logging.basicConfig(
    filename="compilador.log",
    level=logging.WARNING,
    format="%(asctime)s - %(levelname)s - %(message)s"
)
