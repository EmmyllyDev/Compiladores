# Generated from C:/Compilador/minhaLinguagem.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,22,137,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,4,1,38,8,1,11,1,12,1,39,1,2,
        1,2,1,2,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,3,3,3,54,8,3,1,3,1,3,1,
        3,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,3,4,67,8,4,1,4,1,4,1,5,1,5,1,5,
        1,5,1,5,1,5,1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,7,1,7,1,7,1,7,1,7,1,7,
        1,8,1,8,1,9,1,9,3,9,94,8,9,1,10,1,10,1,10,5,10,99,8,10,10,10,12,
        10,102,9,10,1,11,1,11,1,11,1,11,1,11,1,11,3,11,110,8,11,1,12,1,12,
        1,12,1,12,1,12,1,12,1,12,5,12,119,8,12,10,12,12,12,122,9,12,3,12,
        124,8,12,1,13,1,13,1,13,1,13,1,13,1,13,1,13,1,13,1,13,3,13,135,8,
        13,1,13,0,0,14,0,2,4,6,8,10,12,14,16,18,20,22,24,26,0,1,1,0,11,12,
        140,0,28,1,0,0,0,2,37,1,0,0,0,4,41,1,0,0,0,6,47,1,0,0,0,8,58,1,0,
        0,0,10,70,1,0,0,0,12,78,1,0,0,0,14,83,1,0,0,0,16,89,1,0,0,0,18,93,
        1,0,0,0,20,95,1,0,0,0,22,109,1,0,0,0,24,123,1,0,0,0,26,134,1,0,0,
        0,28,29,3,2,1,0,29,30,5,0,0,1,30,1,1,0,0,0,31,38,3,4,2,0,32,38,3,
        6,3,0,33,38,3,8,4,0,34,38,3,10,5,0,35,38,3,12,6,0,36,38,3,14,7,0,
        37,31,1,0,0,0,37,32,1,0,0,0,37,33,1,0,0,0,37,34,1,0,0,0,37,35,1,
        0,0,0,37,36,1,0,0,0,38,39,1,0,0,0,39,37,1,0,0,0,39,40,1,0,0,0,40,
        3,1,0,0,0,41,42,5,4,0,0,42,43,5,18,0,0,43,44,5,13,0,0,44,45,5,19,
        0,0,45,46,5,20,0,0,46,5,1,0,0,0,47,48,5,3,0,0,48,53,5,18,0,0,49,
        50,5,21,0,0,50,51,5,13,0,0,51,54,5,21,0,0,52,54,5,13,0,0,53,49,1,
        0,0,0,53,52,1,0,0,0,54,55,1,0,0,0,55,56,5,19,0,0,56,57,5,20,0,0,
        57,7,1,0,0,0,58,59,5,5,0,0,59,60,5,18,0,0,60,61,3,18,9,0,61,62,5,
        19,0,0,62,63,5,6,0,0,63,66,3,2,1,0,64,65,5,7,0,0,65,67,3,2,1,0,66,
        64,1,0,0,0,66,67,1,0,0,0,67,68,1,0,0,0,68,69,5,10,0,0,69,9,1,0,0,
        0,70,71,5,8,0,0,71,72,5,18,0,0,72,73,3,18,9,0,73,74,5,19,0,0,74,
        75,5,9,0,0,75,76,3,2,1,0,76,77,5,10,0,0,77,11,1,0,0,0,78,79,5,13,
        0,0,79,80,5,1,0,0,80,81,3,18,9,0,81,82,5,20,0,0,82,13,1,0,0,0,83,
        84,3,16,8,0,84,85,5,18,0,0,85,86,5,13,0,0,86,87,5,19,0,0,87,88,5,
        20,0,0,88,15,1,0,0,0,89,90,7,0,0,0,90,17,1,0,0,0,91,94,3,24,12,0,
        92,94,3,20,10,0,93,91,1,0,0,0,93,92,1,0,0,0,94,19,1,0,0,0,95,100,
        3,22,11,0,96,97,5,15,0,0,97,99,3,22,11,0,98,96,1,0,0,0,99,102,1,
        0,0,0,100,98,1,0,0,0,100,101,1,0,0,0,101,21,1,0,0,0,102,100,1,0,
        0,0,103,110,5,14,0,0,104,110,5,13,0,0,105,106,5,18,0,0,106,107,3,
        20,10,0,107,108,5,19,0,0,108,110,1,0,0,0,109,103,1,0,0,0,109,104,
        1,0,0,0,109,105,1,0,0,0,110,23,1,0,0,0,111,112,3,20,10,0,112,113,
        5,17,0,0,113,114,3,20,10,0,114,124,1,0,0,0,115,120,3,26,13,0,116,
        117,5,16,0,0,117,119,3,26,13,0,118,116,1,0,0,0,119,122,1,0,0,0,120,
        118,1,0,0,0,120,121,1,0,0,0,121,124,1,0,0,0,122,120,1,0,0,0,123,
        111,1,0,0,0,123,115,1,0,0,0,124,25,1,0,0,0,125,135,3,20,10,0,126,
        127,5,2,0,0,127,135,3,26,13,0,128,129,5,18,0,0,129,130,3,24,12,0,
        130,131,5,19,0,0,131,135,1,0,0,0,132,135,5,13,0,0,133,135,5,14,0,
        0,134,125,1,0,0,0,134,126,1,0,0,0,134,128,1,0,0,0,134,132,1,0,0,
        0,134,133,1,0,0,0,135,27,1,0,0,0,10,37,39,53,66,93,100,109,120,123,
        134
    ]

class minhaLinguagemParser ( Parser ):

    grammarFileName = "minhaLinguagem.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'='", "'!'", "'escrever'", "'ler'", "'se'", 
                     "'entao'", "'senao'", "'enquanto'", "'fa\\u00E7a'", 
                     "'fim'", "'inteiro'", "'string'", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "'('", "')'", 
                     "';'", "'\"'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "ESCREVER", 
                      "LER", "SE", "ENTAO", "SENAO", "ENQUANTO", "FA\u0002A", 
                      "FIM", "INTEIRO", "STRING", "ID", "NUMERO", "OP_ARIT", 
                      "OP_LOGICO", "OP_COMPARACAO", "ABRE_PAR", "FECHA_PAR", 
                      "FINAL", "ASPAS", "ESP_BRANCO" ]

    RULE_programa = 0
    RULE_comandos = 1
    RULE_comando_ler = 2
    RULE_comando_escrever = 3
    RULE_comando_condicional = 4
    RULE_comando_repeticao = 5
    RULE_comando_atribuicao = 6
    RULE_comando_declaracao = 7
    RULE_tipo = 8
    RULE_expressao = 9
    RULE_expressao_aritmetica = 10
    RULE_termo = 11
    RULE_expressao_logica = 12
    RULE_fator_logico = 13

    ruleNames =  [ "programa", "comandos", "comando_ler", "comando_escrever", 
                   "comando_condicional", "comando_repeticao", "comando_atribuicao", 
                   "comando_declaracao", "tipo", "expressao", "expressao_aritmetica", 
                   "termo", "expressao_logica", "fator_logico" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    ESCREVER=3
    LER=4
    SE=5
    ENTAO=6
    SENAO=7
    ENQUANTO=8
    FAÇA=9
    FIM=10
    INTEIRO=11
    STRING=12
    ID=13
    NUMERO=14
    OP_ARIT=15
    OP_LOGICO=16
    OP_COMPARACAO=17
    ABRE_PAR=18
    FECHA_PAR=19
    FINAL=20
    ASPAS=21
    ESP_BRANCO=22

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def comandos(self):
            return self.getTypedRuleContext(minhaLinguagemParser.ComandosContext,0)


        def EOF(self):
            return self.getToken(minhaLinguagemParser.EOF, 0)

        def getRuleIndex(self):
            return minhaLinguagemParser.RULE_programa

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrograma" ):
                listener.enterPrograma(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrograma" ):
                listener.exitPrograma(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPrograma" ):
                return visitor.visitPrograma(self)
            else:
                return visitor.visitChildren(self)




    def programa(self):

        localctx = minhaLinguagemParser.ProgramaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_programa)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 28
            self.comandos()
            self.state = 29
            self.match(minhaLinguagemParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ComandosContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def comando_ler(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(minhaLinguagemParser.Comando_lerContext)
            else:
                return self.getTypedRuleContext(minhaLinguagemParser.Comando_lerContext,i)


        def comando_escrever(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(minhaLinguagemParser.Comando_escreverContext)
            else:
                return self.getTypedRuleContext(minhaLinguagemParser.Comando_escreverContext,i)


        def comando_condicional(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(minhaLinguagemParser.Comando_condicionalContext)
            else:
                return self.getTypedRuleContext(minhaLinguagemParser.Comando_condicionalContext,i)


        def comando_repeticao(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(minhaLinguagemParser.Comando_repeticaoContext)
            else:
                return self.getTypedRuleContext(minhaLinguagemParser.Comando_repeticaoContext,i)


        def comando_atribuicao(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(minhaLinguagemParser.Comando_atribuicaoContext)
            else:
                return self.getTypedRuleContext(minhaLinguagemParser.Comando_atribuicaoContext,i)


        def comando_declaracao(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(minhaLinguagemParser.Comando_declaracaoContext)
            else:
                return self.getTypedRuleContext(minhaLinguagemParser.Comando_declaracaoContext,i)


        def getRuleIndex(self):
            return minhaLinguagemParser.RULE_comandos

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComandos" ):
                listener.enterComandos(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComandos" ):
                listener.exitComandos(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitComandos" ):
                return visitor.visitComandos(self)
            else:
                return visitor.visitChildren(self)




    def comandos(self):

        localctx = minhaLinguagemParser.ComandosContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_comandos)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 37 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 37
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [4]:
                    self.state = 31
                    self.comando_ler()
                    pass
                elif token in [3]:
                    self.state = 32
                    self.comando_escrever()
                    pass
                elif token in [5]:
                    self.state = 33
                    self.comando_condicional()
                    pass
                elif token in [8]:
                    self.state = 34
                    self.comando_repeticao()
                    pass
                elif token in [13]:
                    self.state = 35
                    self.comando_atribuicao()
                    pass
                elif token in [11, 12]:
                    self.state = 36
                    self.comando_declaracao()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 39 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 14648) != 0)):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Comando_lerContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LER(self):
            return self.getToken(minhaLinguagemParser.LER, 0)

        def ABRE_PAR(self):
            return self.getToken(minhaLinguagemParser.ABRE_PAR, 0)

        def ID(self):
            return self.getToken(minhaLinguagemParser.ID, 0)

        def FECHA_PAR(self):
            return self.getToken(minhaLinguagemParser.FECHA_PAR, 0)

        def FINAL(self):
            return self.getToken(minhaLinguagemParser.FINAL, 0)

        def getRuleIndex(self):
            return minhaLinguagemParser.RULE_comando_ler

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComando_ler" ):
                listener.enterComando_ler(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComando_ler" ):
                listener.exitComando_ler(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitComando_ler" ):
                return visitor.visitComando_ler(self)
            else:
                return visitor.visitChildren(self)




    def comando_ler(self):

        localctx = minhaLinguagemParser.Comando_lerContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_comando_ler)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 41
            self.match(minhaLinguagemParser.LER)
            self.state = 42
            self.match(minhaLinguagemParser.ABRE_PAR)
            self.state = 43
            self.match(minhaLinguagemParser.ID)
            self.state = 44
            self.match(minhaLinguagemParser.FECHA_PAR)
            self.state = 45
            self.match(minhaLinguagemParser.FINAL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Comando_escreverContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ESCREVER(self):
            return self.getToken(minhaLinguagemParser.ESCREVER, 0)

        def ABRE_PAR(self):
            return self.getToken(minhaLinguagemParser.ABRE_PAR, 0)

        def FECHA_PAR(self):
            return self.getToken(minhaLinguagemParser.FECHA_PAR, 0)

        def FINAL(self):
            return self.getToken(minhaLinguagemParser.FINAL, 0)

        def ASPAS(self, i:int=None):
            if i is None:
                return self.getTokens(minhaLinguagemParser.ASPAS)
            else:
                return self.getToken(minhaLinguagemParser.ASPAS, i)

        def ID(self):
            return self.getToken(minhaLinguagemParser.ID, 0)

        def getRuleIndex(self):
            return minhaLinguagemParser.RULE_comando_escrever

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComando_escrever" ):
                listener.enterComando_escrever(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComando_escrever" ):
                listener.exitComando_escrever(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitComando_escrever" ):
                return visitor.visitComando_escrever(self)
            else:
                return visitor.visitChildren(self)




    def comando_escrever(self):

        localctx = minhaLinguagemParser.Comando_escreverContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_comando_escrever)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 47
            self.match(minhaLinguagemParser.ESCREVER)
            self.state = 48
            self.match(minhaLinguagemParser.ABRE_PAR)
            self.state = 53
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [21]:
                self.state = 49
                self.match(minhaLinguagemParser.ASPAS)
                self.state = 50
                self.match(minhaLinguagemParser.ID)
                self.state = 51
                self.match(minhaLinguagemParser.ASPAS)
                pass
            elif token in [13]:
                self.state = 52
                self.match(minhaLinguagemParser.ID)
                pass
            else:
                raise NoViableAltException(self)

            self.state = 55
            self.match(minhaLinguagemParser.FECHA_PAR)
            self.state = 56
            self.match(minhaLinguagemParser.FINAL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Comando_condicionalContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SE(self):
            return self.getToken(minhaLinguagemParser.SE, 0)

        def ABRE_PAR(self):
            return self.getToken(minhaLinguagemParser.ABRE_PAR, 0)

        def expressao(self):
            return self.getTypedRuleContext(minhaLinguagemParser.ExpressaoContext,0)


        def FECHA_PAR(self):
            return self.getToken(minhaLinguagemParser.FECHA_PAR, 0)

        def ENTAO(self):
            return self.getToken(minhaLinguagemParser.ENTAO, 0)

        def comandos(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(minhaLinguagemParser.ComandosContext)
            else:
                return self.getTypedRuleContext(minhaLinguagemParser.ComandosContext,i)


        def FIM(self):
            return self.getToken(minhaLinguagemParser.FIM, 0)

        def SENAO(self):
            return self.getToken(minhaLinguagemParser.SENAO, 0)

        def getRuleIndex(self):
            return minhaLinguagemParser.RULE_comando_condicional

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComando_condicional" ):
                listener.enterComando_condicional(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComando_condicional" ):
                listener.exitComando_condicional(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitComando_condicional" ):
                return visitor.visitComando_condicional(self)
            else:
                return visitor.visitChildren(self)




    def comando_condicional(self):

        localctx = minhaLinguagemParser.Comando_condicionalContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_comando_condicional)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 58
            self.match(minhaLinguagemParser.SE)
            self.state = 59
            self.match(minhaLinguagemParser.ABRE_PAR)
            self.state = 60
            self.expressao()
            self.state = 61
            self.match(minhaLinguagemParser.FECHA_PAR)
            self.state = 62
            self.match(minhaLinguagemParser.ENTAO)
            self.state = 63
            self.comandos()
            self.state = 66
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==7:
                self.state = 64
                self.match(minhaLinguagemParser.SENAO)
                self.state = 65
                self.comandos()


            self.state = 68
            self.match(minhaLinguagemParser.FIM)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Comando_repeticaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ENQUANTO(self):
            return self.getToken(minhaLinguagemParser.ENQUANTO, 0)

        def ABRE_PAR(self):
            return self.getToken(minhaLinguagemParser.ABRE_PAR, 0)

        def expressao(self):
            return self.getTypedRuleContext(minhaLinguagemParser.ExpressaoContext,0)


        def FECHA_PAR(self):
            return self.getToken(minhaLinguagemParser.FECHA_PAR, 0)

        def FAÇA(self):
            return self.getToken(minhaLinguagemParser.FAÇA, 0)

        def comandos(self):
            return self.getTypedRuleContext(minhaLinguagemParser.ComandosContext,0)


        def FIM(self):
            return self.getToken(minhaLinguagemParser.FIM, 0)

        def getRuleIndex(self):
            return minhaLinguagemParser.RULE_comando_repeticao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComando_repeticao" ):
                listener.enterComando_repeticao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComando_repeticao" ):
                listener.exitComando_repeticao(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitComando_repeticao" ):
                return visitor.visitComando_repeticao(self)
            else:
                return visitor.visitChildren(self)




    def comando_repeticao(self):

        localctx = minhaLinguagemParser.Comando_repeticaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_comando_repeticao)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 70
            self.match(minhaLinguagemParser.ENQUANTO)
            self.state = 71
            self.match(minhaLinguagemParser.ABRE_PAR)
            self.state = 72
            self.expressao()
            self.state = 73
            self.match(minhaLinguagemParser.FECHA_PAR)
            self.state = 74
            self.match(minhaLinguagemParser.FAÇA)
            self.state = 75
            self.comandos()
            self.state = 76
            self.match(minhaLinguagemParser.FIM)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Comando_atribuicaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(minhaLinguagemParser.ID, 0)

        def expressao(self):
            return self.getTypedRuleContext(minhaLinguagemParser.ExpressaoContext,0)


        def FINAL(self):
            return self.getToken(minhaLinguagemParser.FINAL, 0)

        def getRuleIndex(self):
            return minhaLinguagemParser.RULE_comando_atribuicao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComando_atribuicao" ):
                listener.enterComando_atribuicao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComando_atribuicao" ):
                listener.exitComando_atribuicao(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitComando_atribuicao" ):
                return visitor.visitComando_atribuicao(self)
            else:
                return visitor.visitChildren(self)




    def comando_atribuicao(self):

        localctx = minhaLinguagemParser.Comando_atribuicaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_comando_atribuicao)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 78
            self.match(minhaLinguagemParser.ID)
            self.state = 79
            self.match(minhaLinguagemParser.T__0)
            self.state = 80
            self.expressao()
            self.state = 81
            self.match(minhaLinguagemParser.FINAL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Comando_declaracaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def tipo(self):
            return self.getTypedRuleContext(minhaLinguagemParser.TipoContext,0)


        def ABRE_PAR(self):
            return self.getToken(minhaLinguagemParser.ABRE_PAR, 0)

        def ID(self):
            return self.getToken(minhaLinguagemParser.ID, 0)

        def FECHA_PAR(self):
            return self.getToken(minhaLinguagemParser.FECHA_PAR, 0)

        def FINAL(self):
            return self.getToken(minhaLinguagemParser.FINAL, 0)

        def getRuleIndex(self):
            return minhaLinguagemParser.RULE_comando_declaracao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComando_declaracao" ):
                listener.enterComando_declaracao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComando_declaracao" ):
                listener.exitComando_declaracao(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitComando_declaracao" ):
                return visitor.visitComando_declaracao(self)
            else:
                return visitor.visitChildren(self)




    def comando_declaracao(self):

        localctx = minhaLinguagemParser.Comando_declaracaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_comando_declaracao)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 83
            self.tipo()
            self.state = 84
            self.match(minhaLinguagemParser.ABRE_PAR)
            self.state = 85
            self.match(minhaLinguagemParser.ID)
            self.state = 86
            self.match(minhaLinguagemParser.FECHA_PAR)
            self.state = 87
            self.match(minhaLinguagemParser.FINAL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TipoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INTEIRO(self):
            return self.getToken(minhaLinguagemParser.INTEIRO, 0)

        def STRING(self):
            return self.getToken(minhaLinguagemParser.STRING, 0)

        def getRuleIndex(self):
            return minhaLinguagemParser.RULE_tipo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTipo" ):
                listener.enterTipo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTipo" ):
                listener.exitTipo(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTipo" ):
                return visitor.visitTipo(self)
            else:
                return visitor.visitChildren(self)




    def tipo(self):

        localctx = minhaLinguagemParser.TipoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_tipo)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 89
            _la = self._input.LA(1)
            if not(_la==11 or _la==12):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expressao_logica(self):
            return self.getTypedRuleContext(minhaLinguagemParser.Expressao_logicaContext,0)


        def expressao_aritmetica(self):
            return self.getTypedRuleContext(minhaLinguagemParser.Expressao_aritmeticaContext,0)


        def getRuleIndex(self):
            return minhaLinguagemParser.RULE_expressao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressao" ):
                listener.enterExpressao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressao" ):
                listener.exitExpressao(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressao" ):
                return visitor.visitExpressao(self)
            else:
                return visitor.visitChildren(self)




    def expressao(self):

        localctx = minhaLinguagemParser.ExpressaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_expressao)
        try:
            self.state = 93
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,4,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 91
                self.expressao_logica()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 92
                self.expressao_aritmetica()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Expressao_aritmeticaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def termo(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(minhaLinguagemParser.TermoContext)
            else:
                return self.getTypedRuleContext(minhaLinguagemParser.TermoContext,i)


        def OP_ARIT(self, i:int=None):
            if i is None:
                return self.getTokens(minhaLinguagemParser.OP_ARIT)
            else:
                return self.getToken(minhaLinguagemParser.OP_ARIT, i)

        def getRuleIndex(self):
            return minhaLinguagemParser.RULE_expressao_aritmetica

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressao_aritmetica" ):
                listener.enterExpressao_aritmetica(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressao_aritmetica" ):
                listener.exitExpressao_aritmetica(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressao_aritmetica" ):
                return visitor.visitExpressao_aritmetica(self)
            else:
                return visitor.visitChildren(self)




    def expressao_aritmetica(self):

        localctx = minhaLinguagemParser.Expressao_aritmeticaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_expressao_aritmetica)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 95
            self.termo()

            self.state = 100
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==15:
                self.state = 96
                self.match(minhaLinguagemParser.OP_ARIT)
                self.state = 97
                self.termo()
                self.state = 102
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TermoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMERO(self):
            return self.getToken(minhaLinguagemParser.NUMERO, 0)

        def ID(self):
            return self.getToken(minhaLinguagemParser.ID, 0)

        def ABRE_PAR(self):
            return self.getToken(minhaLinguagemParser.ABRE_PAR, 0)

        def expressao_aritmetica(self):
            return self.getTypedRuleContext(minhaLinguagemParser.Expressao_aritmeticaContext,0)


        def FECHA_PAR(self):
            return self.getToken(minhaLinguagemParser.FECHA_PAR, 0)

        def getRuleIndex(self):
            return minhaLinguagemParser.RULE_termo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTermo" ):
                listener.enterTermo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTermo" ):
                listener.exitTermo(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTermo" ):
                return visitor.visitTermo(self)
            else:
                return visitor.visitChildren(self)




    def termo(self):

        localctx = minhaLinguagemParser.TermoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_termo)
        try:
            self.state = 109
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [14]:
                self.enterOuterAlt(localctx, 1)
                self.state = 103
                self.match(minhaLinguagemParser.NUMERO)
                pass
            elif token in [13]:
                self.enterOuterAlt(localctx, 2)
                self.state = 104
                self.match(minhaLinguagemParser.ID)
                pass
            elif token in [18]:
                self.enterOuterAlt(localctx, 3)
                self.state = 105
                self.match(minhaLinguagemParser.ABRE_PAR)
                self.state = 106
                self.expressao_aritmetica()
                self.state = 107
                self.match(minhaLinguagemParser.FECHA_PAR)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Expressao_logicaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expressao_aritmetica(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(minhaLinguagemParser.Expressao_aritmeticaContext)
            else:
                return self.getTypedRuleContext(minhaLinguagemParser.Expressao_aritmeticaContext,i)


        def OP_COMPARACAO(self):
            return self.getToken(minhaLinguagemParser.OP_COMPARACAO, 0)

        def fator_logico(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(minhaLinguagemParser.Fator_logicoContext)
            else:
                return self.getTypedRuleContext(minhaLinguagemParser.Fator_logicoContext,i)


        def OP_LOGICO(self, i:int=None):
            if i is None:
                return self.getTokens(minhaLinguagemParser.OP_LOGICO)
            else:
                return self.getToken(minhaLinguagemParser.OP_LOGICO, i)

        def getRuleIndex(self):
            return minhaLinguagemParser.RULE_expressao_logica

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressao_logica" ):
                listener.enterExpressao_logica(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressao_logica" ):
                listener.exitExpressao_logica(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressao_logica" ):
                return visitor.visitExpressao_logica(self)
            else:
                return visitor.visitChildren(self)




    def expressao_logica(self):

        localctx = minhaLinguagemParser.Expressao_logicaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_expressao_logica)
        self._la = 0 # Token type
        try:
            self.state = 123
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,8,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 111
                self.expressao_aritmetica()
                self.state = 112
                self.match(minhaLinguagemParser.OP_COMPARACAO)
                self.state = 113
                self.expressao_aritmetica()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 115
                self.fator_logico()

                self.state = 120
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==16:
                    self.state = 116
                    self.match(minhaLinguagemParser.OP_LOGICO)
                    self.state = 117
                    self.fator_logico()
                    self.state = 122
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Fator_logicoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expressao_aritmetica(self):
            return self.getTypedRuleContext(minhaLinguagemParser.Expressao_aritmeticaContext,0)


        def fator_logico(self):
            return self.getTypedRuleContext(minhaLinguagemParser.Fator_logicoContext,0)


        def ABRE_PAR(self):
            return self.getToken(minhaLinguagemParser.ABRE_PAR, 0)

        def expressao_logica(self):
            return self.getTypedRuleContext(minhaLinguagemParser.Expressao_logicaContext,0)


        def FECHA_PAR(self):
            return self.getToken(minhaLinguagemParser.FECHA_PAR, 0)

        def ID(self):
            return self.getToken(minhaLinguagemParser.ID, 0)

        def NUMERO(self):
            return self.getToken(minhaLinguagemParser.NUMERO, 0)

        def getRuleIndex(self):
            return minhaLinguagemParser.RULE_fator_logico

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFator_logico" ):
                listener.enterFator_logico(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFator_logico" ):
                listener.exitFator_logico(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFator_logico" ):
                return visitor.visitFator_logico(self)
            else:
                return visitor.visitChildren(self)




    def fator_logico(self):

        localctx = minhaLinguagemParser.Fator_logicoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_fator_logico)
        try:
            self.state = 134
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,9,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 125
                self.expressao_aritmetica()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 126
                self.match(minhaLinguagemParser.T__1)
                self.state = 127
                self.fator_logico()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 128
                self.match(minhaLinguagemParser.ABRE_PAR)
                self.state = 129
                self.expressao_logica()
                self.state = 130
                self.match(minhaLinguagemParser.FECHA_PAR)
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 132
                self.match(minhaLinguagemParser.ID)
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 133
                self.match(minhaLinguagemParser.NUMERO)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





