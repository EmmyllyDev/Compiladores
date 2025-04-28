# Generated from C:/Compilador/minhaLinguagem.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .minhaLinguagemParser import minhaLinguagemParser
else:
    from minhaLinguagemParser import minhaLinguagemParser

# This class defines a complete generic visitor for a parse tree produced by minhaLinguagemParser.

class minhaLinguagemVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by minhaLinguagemParser#programa.
    def visitPrograma(self, ctx:minhaLinguagemParser.ProgramaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minhaLinguagemParser#comandos.
    def visitComandos(self, ctx:minhaLinguagemParser.ComandosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minhaLinguagemParser#comando_ler.
    def visitComando_ler(self, ctx:minhaLinguagemParser.Comando_lerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minhaLinguagemParser#comando_escrever.
    def visitComando_escrever(self, ctx:minhaLinguagemParser.Comando_escreverContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minhaLinguagemParser#comando_condicional.
    def visitComando_condicional(self, ctx:minhaLinguagemParser.Comando_condicionalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minhaLinguagemParser#comando_repeticao.
    def visitComando_repeticao(self, ctx:minhaLinguagemParser.Comando_repeticaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minhaLinguagemParser#comando_atribuicao.
    def visitComando_atribuicao(self, ctx:minhaLinguagemParser.Comando_atribuicaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minhaLinguagemParser#comando_declaracao.
    def visitComando_declaracao(self, ctx:minhaLinguagemParser.Comando_declaracaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minhaLinguagemParser#tipo.
    def visitTipo(self, ctx:minhaLinguagemParser.TipoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minhaLinguagemParser#expressao.
    def visitExpressao(self, ctx:minhaLinguagemParser.ExpressaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minhaLinguagemParser#expressao_aritmetica.
    def visitExpressao_aritmetica(self, ctx:minhaLinguagemParser.Expressao_aritmeticaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minhaLinguagemParser#termo.
    def visitTermo(self, ctx:minhaLinguagemParser.TermoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minhaLinguagemParser#expressao_logica.
    def visitExpressao_logica(self, ctx:minhaLinguagemParser.Expressao_logicaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minhaLinguagemParser#fator_logico.
    def visitFator_logico(self, ctx:minhaLinguagemParser.Fator_logicoContext):
        return self.visitChildren(ctx)



del minhaLinguagemParser