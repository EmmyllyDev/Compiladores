# Generated from fimly.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .fimlyParser import fimlyParser
else:
    from fimlyParser import fimlyParser

# This class defines a complete generic visitor for a parse tree produced by fimlyParser.

class fimlyVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by fimlyParser#programa.
    def visitPrograma(self, ctx:fimlyParser.ProgramaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fimlyParser#declaracoes.
    def visitDeclaracoes(self, ctx:fimlyParser.DeclaracoesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fimlyParser#declaracao_var.
    def visitDeclaracao_var(self, ctx:fimlyParser.Declaracao_varContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fimlyParser#tipo.
    def visitTipo(self, ctx:fimlyParser.TipoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fimlyParser#comando.
    def visitComando(self, ctx:fimlyParser.ComandoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fimlyParser#comando_ler.
    def visitComando_ler(self, ctx:fimlyParser.Comando_lerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fimlyParser#comando_escrever.
    def visitComando_escrever(self, ctx:fimlyParser.Comando_escreverContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fimlyParser#lista_expressao.
    def visitLista_expressao(self, ctx:fimlyParser.Lista_expressaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fimlyParser#comando_condicional.
    def visitComando_condicional(self, ctx:fimlyParser.Comando_condicionalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fimlyParser#comando_repeticao.
    def visitComando_repeticao(self, ctx:fimlyParser.Comando_repeticaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fimlyParser#comando_atribuicao.
    def visitComando_atribuicao(self, ctx:fimlyParser.Comando_atribuicaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fimlyParser#expressao.
    def visitExpressao(self, ctx:fimlyParser.ExpressaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fimlyParser#expressao_aritmetica.
    def visitExpressao_aritmetica(self, ctx:fimlyParser.Expressao_aritmeticaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fimlyParser#termo.
    def visitTermo(self, ctx:fimlyParser.TermoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fimlyParser#expressao_logica.
    def visitExpressao_logica(self, ctx:fimlyParser.Expressao_logicaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fimlyParser#fator_logico.
    def visitFator_logico(self, ctx:fimlyParser.Fator_logicoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fimlyParser#expressao_comparacao.
    def visitExpressao_comparacao(self, ctx:fimlyParser.Expressao_comparacaoContext):
        return self.visitChildren(ctx)



del fimlyParser