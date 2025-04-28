# Generated from C:/Compilador/minhaLinguagem.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .minhaLinguagemParser import minhaLinguagemParser
else:
    from minhaLinguagemParser import minhaLinguagemParser

# This class defines a complete listener for a parse tree produced by minhaLinguagemParser.
class minhaLinguagemListener(ParseTreeListener):

    # Enter a parse tree produced by minhaLinguagemParser#programa.
    def enterPrograma(self, ctx:minhaLinguagemParser.ProgramaContext):
        pass

    # Exit a parse tree produced by minhaLinguagemParser#programa.
    def exitPrograma(self, ctx:minhaLinguagemParser.ProgramaContext):
        pass


    # Enter a parse tree produced by minhaLinguagemParser#comandos.
    def enterComandos(self, ctx:minhaLinguagemParser.ComandosContext):
        pass

    # Exit a parse tree produced by minhaLinguagemParser#comandos.
    def exitComandos(self, ctx:minhaLinguagemParser.ComandosContext):
        pass


    # Enter a parse tree produced by minhaLinguagemParser#comando_ler.
    def enterComando_ler(self, ctx:minhaLinguagemParser.Comando_lerContext):
        pass

    # Exit a parse tree produced by minhaLinguagemParser#comando_ler.
    def exitComando_ler(self, ctx:minhaLinguagemParser.Comando_lerContext):
        pass


    # Enter a parse tree produced by minhaLinguagemParser#comando_escrever.
    def enterComando_escrever(self, ctx:minhaLinguagemParser.Comando_escreverContext):
        pass

    # Exit a parse tree produced by minhaLinguagemParser#comando_escrever.
    def exitComando_escrever(self, ctx:minhaLinguagemParser.Comando_escreverContext):
        pass


    # Enter a parse tree produced by minhaLinguagemParser#comando_condicional.
    def enterComando_condicional(self, ctx:minhaLinguagemParser.Comando_condicionalContext):
        pass

    # Exit a parse tree produced by minhaLinguagemParser#comando_condicional.
    def exitComando_condicional(self, ctx:minhaLinguagemParser.Comando_condicionalContext):
        pass


    # Enter a parse tree produced by minhaLinguagemParser#comando_repeticao.
    def enterComando_repeticao(self, ctx:minhaLinguagemParser.Comando_repeticaoContext):
        pass

    # Exit a parse tree produced by minhaLinguagemParser#comando_repeticao.
    def exitComando_repeticao(self, ctx:minhaLinguagemParser.Comando_repeticaoContext):
        pass


    # Enter a parse tree produced by minhaLinguagemParser#comando_atribuicao.
    def enterComando_atribuicao(self, ctx:minhaLinguagemParser.Comando_atribuicaoContext):
        pass

    # Exit a parse tree produced by minhaLinguagemParser#comando_atribuicao.
    def exitComando_atribuicao(self, ctx:minhaLinguagemParser.Comando_atribuicaoContext):
        pass


    # Enter a parse tree produced by minhaLinguagemParser#comando_declaracao.
    def enterComando_declaracao(self, ctx:minhaLinguagemParser.Comando_declaracaoContext):
        pass

    # Exit a parse tree produced by minhaLinguagemParser#comando_declaracao.
    def exitComando_declaracao(self, ctx:minhaLinguagemParser.Comando_declaracaoContext):
        pass


    # Enter a parse tree produced by minhaLinguagemParser#tipo.
    def enterTipo(self, ctx:minhaLinguagemParser.TipoContext):
        pass

    # Exit a parse tree produced by minhaLinguagemParser#tipo.
    def exitTipo(self, ctx:minhaLinguagemParser.TipoContext):
        pass


    # Enter a parse tree produced by minhaLinguagemParser#expressao.
    def enterExpressao(self, ctx:minhaLinguagemParser.ExpressaoContext):
        pass

    # Exit a parse tree produced by minhaLinguagemParser#expressao.
    def exitExpressao(self, ctx:minhaLinguagemParser.ExpressaoContext):
        pass


    # Enter a parse tree produced by minhaLinguagemParser#expressao_aritmetica.
    def enterExpressao_aritmetica(self, ctx:minhaLinguagemParser.Expressao_aritmeticaContext):
        pass

    # Exit a parse tree produced by minhaLinguagemParser#expressao_aritmetica.
    def exitExpressao_aritmetica(self, ctx:minhaLinguagemParser.Expressao_aritmeticaContext):
        pass


    # Enter a parse tree produced by minhaLinguagemParser#termo.
    def enterTermo(self, ctx:minhaLinguagemParser.TermoContext):
        pass

    # Exit a parse tree produced by minhaLinguagemParser#termo.
    def exitTermo(self, ctx:minhaLinguagemParser.TermoContext):
        pass


    # Enter a parse tree produced by minhaLinguagemParser#expressao_logica.
    def enterExpressao_logica(self, ctx:minhaLinguagemParser.Expressao_logicaContext):
        pass

    # Exit a parse tree produced by minhaLinguagemParser#expressao_logica.
    def exitExpressao_logica(self, ctx:minhaLinguagemParser.Expressao_logicaContext):
        pass


    # Enter a parse tree produced by minhaLinguagemParser#fator_logico.
    def enterFator_logico(self, ctx:minhaLinguagemParser.Fator_logicoContext):
        pass

    # Exit a parse tree produced by minhaLinguagemParser#fator_logico.
    def exitFator_logico(self, ctx:minhaLinguagemParser.Fator_logicoContext):
        pass



del minhaLinguagemParser