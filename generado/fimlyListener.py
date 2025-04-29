# Generated from fimly.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .fimlyParser import fimlyParser
else:
    from fimlyParser import fimlyParser

# This class defines a complete listener for a parse tree produced by fimlyParser.
class fimlyListener(ParseTreeListener):

    # Enter a parse tree produced by fimlyParser#programa.
    def enterPrograma(self, ctx:fimlyParser.ProgramaContext):
        pass

    # Exit a parse tree produced by fimlyParser#programa.
    def exitPrograma(self, ctx:fimlyParser.ProgramaContext):
        pass


    # Enter a parse tree produced by fimlyParser#declaracoes.
    def enterDeclaracoes(self, ctx:fimlyParser.DeclaracoesContext):
        pass

    # Exit a parse tree produced by fimlyParser#declaracoes.
    def exitDeclaracoes(self, ctx:fimlyParser.DeclaracoesContext):
        pass


    # Enter a parse tree produced by fimlyParser#declaracao_var.
    def enterDeclaracao_var(self, ctx:fimlyParser.Declaracao_varContext):
        pass

    # Exit a parse tree produced by fimlyParser#declaracao_var.
    def exitDeclaracao_var(self, ctx:fimlyParser.Declaracao_varContext):
        pass


    # Enter a parse tree produced by fimlyParser#tipo.
    def enterTipo(self, ctx:fimlyParser.TipoContext):
        pass

    # Exit a parse tree produced by fimlyParser#tipo.
    def exitTipo(self, ctx:fimlyParser.TipoContext):
        pass


    # Enter a parse tree produced by fimlyParser#comando.
    def enterComando(self, ctx:fimlyParser.ComandoContext):
        pass

    # Exit a parse tree produced by fimlyParser#comando.
    def exitComando(self, ctx:fimlyParser.ComandoContext):
        pass


    # Enter a parse tree produced by fimlyParser#comando_ler.
    def enterComando_ler(self, ctx:fimlyParser.Comando_lerContext):
        pass

    # Exit a parse tree produced by fimlyParser#comando_ler.
    def exitComando_ler(self, ctx:fimlyParser.Comando_lerContext):
        pass


    # Enter a parse tree produced by fimlyParser#comando_escrever.
    def enterComando_escrever(self, ctx:fimlyParser.Comando_escreverContext):
        pass

    # Exit a parse tree produced by fimlyParser#comando_escrever.
    def exitComando_escrever(self, ctx:fimlyParser.Comando_escreverContext):
        pass


    # Enter a parse tree produced by fimlyParser#lista_expressao.
    def enterLista_expressao(self, ctx:fimlyParser.Lista_expressaoContext):
        pass

    # Exit a parse tree produced by fimlyParser#lista_expressao.
    def exitLista_expressao(self, ctx:fimlyParser.Lista_expressaoContext):
        pass


    # Enter a parse tree produced by fimlyParser#comando_condicional.
    def enterComando_condicional(self, ctx:fimlyParser.Comando_condicionalContext):
        pass

    # Exit a parse tree produced by fimlyParser#comando_condicional.
    def exitComando_condicional(self, ctx:fimlyParser.Comando_condicionalContext):
        pass


    # Enter a parse tree produced by fimlyParser#comando_repeticao.
    def enterComando_repeticao(self, ctx:fimlyParser.Comando_repeticaoContext):
        pass

    # Exit a parse tree produced by fimlyParser#comando_repeticao.
    def exitComando_repeticao(self, ctx:fimlyParser.Comando_repeticaoContext):
        pass


    # Enter a parse tree produced by fimlyParser#comando_atribuicao.
    def enterComando_atribuicao(self, ctx:fimlyParser.Comando_atribuicaoContext):
        pass

    # Exit a parse tree produced by fimlyParser#comando_atribuicao.
    def exitComando_atribuicao(self, ctx:fimlyParser.Comando_atribuicaoContext):
        pass


    # Enter a parse tree produced by fimlyParser#expressao.
    def enterExpressao(self, ctx:fimlyParser.ExpressaoContext):
        pass

    # Exit a parse tree produced by fimlyParser#expressao.
    def exitExpressao(self, ctx:fimlyParser.ExpressaoContext):
        pass


    # Enter a parse tree produced by fimlyParser#expressao_aritmetica.
    def enterExpressao_aritmetica(self, ctx:fimlyParser.Expressao_aritmeticaContext):
        pass

    # Exit a parse tree produced by fimlyParser#expressao_aritmetica.
    def exitExpressao_aritmetica(self, ctx:fimlyParser.Expressao_aritmeticaContext):
        pass


    # Enter a parse tree produced by fimlyParser#termo.
    def enterTermo(self, ctx:fimlyParser.TermoContext):
        pass

    # Exit a parse tree produced by fimlyParser#termo.
    def exitTermo(self, ctx:fimlyParser.TermoContext):
        pass


    # Enter a parse tree produced by fimlyParser#expressao_logica.
    def enterExpressao_logica(self, ctx:fimlyParser.Expressao_logicaContext):
        pass

    # Exit a parse tree produced by fimlyParser#expressao_logica.
    def exitExpressao_logica(self, ctx:fimlyParser.Expressao_logicaContext):
        pass


    # Enter a parse tree produced by fimlyParser#fator_logico.
    def enterFator_logico(self, ctx:fimlyParser.Fator_logicoContext):
        pass

    # Exit a parse tree produced by fimlyParser#fator_logico.
    def exitFator_logico(self, ctx:fimlyParser.Fator_logicoContext):
        pass


    # Enter a parse tree produced by fimlyParser#expressao_comparacao.
    def enterExpressao_comparacao(self, ctx:fimlyParser.Expressao_comparacaoContext):
        pass

    # Exit a parse tree produced by fimlyParser#expressao_comparacao.
    def exitExpressao_comparacao(self, ctx:fimlyParser.Expressao_comparacaoContext):
        pass



del fimlyParser