// Generated from c:/Compilador/fimly.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class fimlyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INICIO=2, FIM=3, FIM_AL=4, ESCREVER=5, LER=6, SE=7, ENTAO=8, SENAO=9, 
		ENQUANTO=10, FAÇA=11, INTEIRO=12, STRING=13, ID=14, NUMERO=15, OP_ARIT=16, 
		OP_LOGICO=17, OP_COMPARACAO=18, IGUAL=19, ABRE_PAR=20, FECHA_PAR=21, PONTO_VIR=22, 
		ASPAS=23, ESP_BRANCO=24;
	public static final int
		RULE_programa = 0, RULE_comando = 1, RULE_comando_ler = 2, RULE_comando_escrever = 3, 
		RULE_comando_condicional = 4, RULE_comando_repeticao = 5, RULE_comando_atribuicao = 6, 
		RULE_comando_declaracao = 7, RULE_tipo = 8, RULE_expressao = 9, RULE_expressao_aritmetica = 10, 
		RULE_termo = 11, RULE_expressao_logica = 12, RULE_fator_logico = 13, RULE_expressao_comparacao = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "comando", "comando_ler", "comando_escrever", "comando_condicional", 
			"comando_repeticao", "comando_atribuicao", "comando_declaracao", "tipo", 
			"expressao", "expressao_aritmetica", "termo", "expressao_logica", "fator_logico", 
			"expressao_comparacao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'inicio'", "'fim'", "'fimalgoritmo'", "'escrever'", "'ler'", 
			"'se'", "'entao'", "'senao'", "'enquanto'", "'fa\\u00E7a'", "'inteiro'", 
			null, null, null, null, null, null, "'='", "'('", "')'", "';'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "INICIO", "FIM", "FIM_AL", "ESCREVER", "LER", "SE", "ENTAO", 
			"SENAO", "ENQUANTO", "FA\u0002A", "INTEIRO", "STRING", "ID", "NUMERO", 
			"OP_ARIT", "OP_LOGICO", "OP_COMPARACAO", "IGUAL", "ABRE_PAR", "FECHA_PAR", 
			"PONTO_VIR", "ASPAS", "ESP_BRANCO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "fimly.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public fimlyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(fimlyParser.INICIO, 0); }
		public TerminalNode FIM_AL() { return getToken(fimlyParser.FIM_AL, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(INICIO);
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				comando();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17632L) != 0) );
			setState(36);
			match(FIM_AL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public Comando_lerContext comando_ler() {
			return getRuleContext(Comando_lerContext.class,0);
		}
		public Comando_escreverContext comando_escrever() {
			return getRuleContext(Comando_escreverContext.class,0);
		}
		public Comando_condicionalContext comando_condicional() {
			return getRuleContext(Comando_condicionalContext.class,0);
		}
		public Comando_repeticaoContext comando_repeticao() {
			return getRuleContext(Comando_repeticaoContext.class,0);
		}
		public Comando_atribuicaoContext comando_atribuicao() {
			return getRuleContext(Comando_atribuicaoContext.class,0);
		}
		public Comando_declaracaoContext comando_declaracao() {
			return getRuleContext(Comando_declaracaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comando);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				comando_ler();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				comando_escrever();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				comando_condicional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				comando_repeticao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				comando_atribuicao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				comando_declaracao();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Comando_lerContext extends ParserRuleContext {
		public TerminalNode LER() { return getToken(fimlyParser.LER, 0); }
		public TerminalNode ABRE_PAR() { return getToken(fimlyParser.ABRE_PAR, 0); }
		public TerminalNode ID() { return getToken(fimlyParser.ID, 0); }
		public TerminalNode FECHA_PAR() { return getToken(fimlyParser.FECHA_PAR, 0); }
		public TerminalNode PONTO_VIR() { return getToken(fimlyParser.PONTO_VIR, 0); }
		public Comando_lerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_ler; }
	}

	public final Comando_lerContext comando_ler() throws RecognitionException {
		Comando_lerContext _localctx = new Comando_lerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comando_ler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(LER);
			setState(47);
			match(ABRE_PAR);
			setState(48);
			match(ID);
			setState(49);
			match(FECHA_PAR);
			setState(50);
			match(PONTO_VIR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Comando_escreverContext extends ParserRuleContext {
		public TerminalNode ESCREVER() { return getToken(fimlyParser.ESCREVER, 0); }
		public TerminalNode ABRE_PAR() { return getToken(fimlyParser.ABRE_PAR, 0); }
		public TerminalNode FECHA_PAR() { return getToken(fimlyParser.FECHA_PAR, 0); }
		public TerminalNode PONTO_VIR() { return getToken(fimlyParser.PONTO_VIR, 0); }
		public List<TerminalNode> ASPAS() { return getTokens(fimlyParser.ASPAS); }
		public TerminalNode ASPAS(int i) {
			return getToken(fimlyParser.ASPAS, i);
		}
		public TerminalNode ID() { return getToken(fimlyParser.ID, 0); }
		public Comando_escreverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_escrever; }
	}

	public final Comando_escreverContext comando_escrever() throws RecognitionException {
		Comando_escreverContext _localctx = new Comando_escreverContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comando_escrever);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ESCREVER);
			setState(53);
			match(ABRE_PAR);
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASPAS:
				{
				setState(54);
				match(ASPAS);
				setState(55);
				match(ID);
				setState(56);
				match(ASPAS);
				}
				break;
			case ID:
				{
				setState(57);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(60);
			match(FECHA_PAR);
			setState(61);
			match(PONTO_VIR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Comando_condicionalContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(fimlyParser.SE, 0); }
		public TerminalNode ABRE_PAR() { return getToken(fimlyParser.ABRE_PAR, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PAR() { return getToken(fimlyParser.FECHA_PAR, 0); }
		public TerminalNode ENTAO() { return getToken(fimlyParser.ENTAO, 0); }
		public TerminalNode FIM() { return getToken(fimlyParser.FIM, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public TerminalNode SENAO() { return getToken(fimlyParser.SENAO, 0); }
		public Comando_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_condicional; }
	}

	public final Comando_condicionalContext comando_condicional() throws RecognitionException {
		Comando_condicionalContext _localctx = new Comando_condicionalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comando_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(SE);
			setState(64);
			match(ABRE_PAR);
			setState(65);
			expressao();
			setState(66);
			match(FECHA_PAR);
			setState(67);
			match(ENTAO);
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				comando();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17632L) != 0) );
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(73);
				match(SENAO);
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(74);
					comando();
					}
					}
					setState(77); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17632L) != 0) );
				}
			}

			setState(81);
			match(FIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Comando_repeticaoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(fimlyParser.ENQUANTO, 0); }
		public TerminalNode ABRE_PAR() { return getToken(fimlyParser.ABRE_PAR, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PAR() { return getToken(fimlyParser.FECHA_PAR, 0); }
		public TerminalNode FAÇA() { return getToken(fimlyParser.FAÇA, 0); }
		public TerminalNode FIM() { return getToken(fimlyParser.FIM, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public Comando_repeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_repeticao; }
	}

	public final Comando_repeticaoContext comando_repeticao() throws RecognitionException {
		Comando_repeticaoContext _localctx = new Comando_repeticaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comando_repeticao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(ENQUANTO);
			setState(84);
			match(ABRE_PAR);
			setState(85);
			expressao();
			setState(86);
			match(FECHA_PAR);
			setState(87);
			match(FAÇA);
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88);
				comando();
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17632L) != 0) );
			setState(93);
			match(FIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Comando_atribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(fimlyParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(fimlyParser.IGUAL, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PONTO_VIR() { return getToken(fimlyParser.PONTO_VIR, 0); }
		public Comando_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_atribuicao; }
	}

	public final Comando_atribuicaoContext comando_atribuicao() throws RecognitionException {
		Comando_atribuicaoContext _localctx = new Comando_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comando_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(ID);
			setState(96);
			match(IGUAL);
			setState(97);
			expressao();
			setState(98);
			match(PONTO_VIR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Comando_declaracaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(fimlyParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(fimlyParser.IGUAL, 0); }
		public TerminalNode ABRE_PAR() { return getToken(fimlyParser.ABRE_PAR, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode FECHA_PAR() { return getToken(fimlyParser.FECHA_PAR, 0); }
		public TerminalNode PONTO_VIR() { return getToken(fimlyParser.PONTO_VIR, 0); }
		public Comando_declaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_declaracao; }
	}

	public final Comando_declaracaoContext comando_declaracao() throws RecognitionException {
		Comando_declaracaoContext _localctx = new Comando_declaracaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comando_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(ID);
			setState(101);
			match(IGUAL);
			setState(102);
			match(ABRE_PAR);
			setState(103);
			tipo();
			setState(104);
			match(FECHA_PAR);
			setState(105);
			match(PONTO_VIR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INTEIRO() { return getToken(fimlyParser.INTEIRO, 0); }
		public TerminalNode STRING() { return getToken(fimlyParser.STRING, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==INTEIRO || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressao);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				expressao_logica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				expressao_aritmetica();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_aritmeticaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> OP_ARIT() { return getTokens(fimlyParser.OP_ARIT); }
		public TerminalNode OP_ARIT(int i) {
			return getToken(fimlyParser.OP_ARIT, i);
		}
		public Expressao_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_aritmetica; }
	}

	public final Expressao_aritmeticaContext expressao_aritmetica() throws RecognitionException {
		Expressao_aritmeticaContext _localctx = new Expressao_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressao_aritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			termo();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_ARIT) {
				{
				{
				setState(114);
				match(OP_ARIT);
				setState(115);
				termo();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(fimlyParser.NUMERO, 0); }
		public TerminalNode ID() { return getToken(fimlyParser.ID, 0); }
		public TerminalNode ABRE_PAR() { return getToken(fimlyParser.ABRE_PAR, 0); }
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public TerminalNode FECHA_PAR() { return getToken(fimlyParser.FECHA_PAR, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_termo);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(NUMERO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(ID);
				}
				break;
			case ABRE_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(ABRE_PAR);
				setState(124);
				expressao_aritmetica();
				setState(125);
				match(FECHA_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_logicaContext extends ParserRuleContext {
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public List<TerminalNode> OP_LOGICO() { return getTokens(fimlyParser.OP_LOGICO); }
		public TerminalNode OP_LOGICO(int i) {
			return getToken(fimlyParser.OP_LOGICO, i);
		}
		public Expressao_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_logica; }
	}

	public final Expressao_logicaContext expressao_logica() throws RecognitionException {
		Expressao_logicaContext _localctx = new Expressao_logicaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expressao_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			fator_logico();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_LOGICO) {
				{
				{
				setState(130);
				match(OP_LOGICO);
				setState(131);
				fator_logico();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fator_logicoContext extends ParserRuleContext {
		public Fator_logicoContext fator_logico() {
			return getRuleContext(Fator_logicoContext.class,0);
		}
		public Expressao_comparacaoContext expressao_comparacao() {
			return getRuleContext(Expressao_comparacaoContext.class,0);
		}
		public TerminalNode ABRE_PAR() { return getToken(fimlyParser.ABRE_PAR, 0); }
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public TerminalNode FECHA_PAR() { return getToken(fimlyParser.FECHA_PAR, 0); }
		public TerminalNode ID() { return getToken(fimlyParser.ID, 0); }
		public TerminalNode NUMERO() { return getToken(fimlyParser.NUMERO, 0); }
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fator_logico);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(T__0);
				setState(138);
				fator_logico();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				expressao_comparacao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(ABRE_PAR);
				setState(141);
				expressao_logica();
				setState(142);
				match(FECHA_PAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				match(NUMERO);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_comparacaoContext extends ParserRuleContext {
		public List<Expressao_aritmeticaContext> expressao_aritmetica() {
			return getRuleContexts(Expressao_aritmeticaContext.class);
		}
		public Expressao_aritmeticaContext expressao_aritmetica(int i) {
			return getRuleContext(Expressao_aritmeticaContext.class,i);
		}
		public TerminalNode OP_COMPARACAO() { return getToken(fimlyParser.OP_COMPARACAO, 0); }
		public TerminalNode ID() { return getToken(fimlyParser.ID, 0); }
		public Expressao_comparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_comparacao; }
	}

	public final Expressao_comparacaoContext expressao_comparacao() throws RecognitionException {
		Expressao_comparacaoContext _localctx = new Expressao_comparacaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressao_comparacao);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				expressao_aritmetica();
				setState(149);
				match(OP_COMPARACAO);
				setState(150);
				expressao_aritmetica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(ID);
				setState(153);
				match(OP_COMPARACAO);
				setState(154);
				expressao_aritmetica();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0018\u009e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001"+
		"\u0000\u0004\u0000!\b\u0000\u000b\u0000\f\u0000\"\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001-\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003;\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0004\u0004F\b\u0004\u000b\u0004\f\u0004G\u0001\u0004\u0001"+
		"\u0004\u0004\u0004L\b\u0004\u000b\u0004\f\u0004M\u0003\u0004P\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0004\u0005Z\b\u0005\u000b\u0005\f\u0005[\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0003\tp\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0005\nu\b\n\n\n\f\nx\t\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0080\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u0085\b\f\n\f\f\f\u0088\t\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0093"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u009c\b\u000e\u0001\u000e\u0000\u0000\u000f"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u0000\u0001\u0001\u0000\f\r\u00a3\u0000\u001e\u0001\u0000\u0000"+
		"\u0000\u0002,\u0001\u0000\u0000\u0000\u0004.\u0001\u0000\u0000\u0000\u0006"+
		"4\u0001\u0000\u0000\u0000\b?\u0001\u0000\u0000\u0000\nS\u0001\u0000\u0000"+
		"\u0000\f_\u0001\u0000\u0000\u0000\u000ed\u0001\u0000\u0000\u0000\u0010"+
		"k\u0001\u0000\u0000\u0000\u0012o\u0001\u0000\u0000\u0000\u0014q\u0001"+
		"\u0000\u0000\u0000\u0016\u007f\u0001\u0000\u0000\u0000\u0018\u0081\u0001"+
		"\u0000\u0000\u0000\u001a\u0092\u0001\u0000\u0000\u0000\u001c\u009b\u0001"+
		"\u0000\u0000\u0000\u001e \u0005\u0002\u0000\u0000\u001f!\u0003\u0002\u0001"+
		"\u0000 \u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\" \u0001"+
		"\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000"+
		"$%\u0005\u0004\u0000\u0000%\u0001\u0001\u0000\u0000\u0000&-\u0003\u0004"+
		"\u0002\u0000\'-\u0003\u0006\u0003\u0000(-\u0003\b\u0004\u0000)-\u0003"+
		"\n\u0005\u0000*-\u0003\f\u0006\u0000+-\u0003\u000e\u0007\u0000,&\u0001"+
		"\u0000\u0000\u0000,\'\u0001\u0000\u0000\u0000,(\u0001\u0000\u0000\u0000"+
		",)\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,+\u0001\u0000\u0000"+
		"\u0000-\u0003\u0001\u0000\u0000\u0000./\u0005\u0006\u0000\u0000/0\u0005"+
		"\u0014\u0000\u000001\u0005\u000e\u0000\u000012\u0005\u0015\u0000\u0000"+
		"23\u0005\u0016\u0000\u00003\u0005\u0001\u0000\u0000\u000045\u0005\u0005"+
		"\u0000\u00005:\u0005\u0014\u0000\u000067\u0005\u0017\u0000\u000078\u0005"+
		"\u000e\u0000\u00008;\u0005\u0017\u0000\u00009;\u0005\u000e\u0000\u0000"+
		":6\u0001\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<=\u0005\u0015\u0000\u0000=>\u0005\u0016\u0000\u0000>\u0007\u0001"+
		"\u0000\u0000\u0000?@\u0005\u0007\u0000\u0000@A\u0005\u0014\u0000\u0000"+
		"AB\u0003\u0012\t\u0000BC\u0005\u0015\u0000\u0000CE\u0005\b\u0000\u0000"+
		"DF\u0003\u0002\u0001\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HO\u0001\u0000"+
		"\u0000\u0000IK\u0005\t\u0000\u0000JL\u0003\u0002\u0001\u0000KJ\u0001\u0000"+
		"\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OI\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0005\u0003\u0000"+
		"\u0000R\t\u0001\u0000\u0000\u0000ST\u0005\n\u0000\u0000TU\u0005\u0014"+
		"\u0000\u0000UV\u0003\u0012\t\u0000VW\u0005\u0015\u0000\u0000WY\u0005\u000b"+
		"\u0000\u0000XZ\u0003\u0002\u0001\u0000YX\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]^\u0005\u0003\u0000\u0000^\u000b\u0001\u0000"+
		"\u0000\u0000_`\u0005\u000e\u0000\u0000`a\u0005\u0013\u0000\u0000ab\u0003"+
		"\u0012\t\u0000bc\u0005\u0016\u0000\u0000c\r\u0001\u0000\u0000\u0000de"+
		"\u0005\u000e\u0000\u0000ef\u0005\u0013\u0000\u0000fg\u0005\u0014\u0000"+
		"\u0000gh\u0003\u0010\b\u0000hi\u0005\u0015\u0000\u0000ij\u0005\u0016\u0000"+
		"\u0000j\u000f\u0001\u0000\u0000\u0000kl\u0007\u0000\u0000\u0000l\u0011"+
		"\u0001\u0000\u0000\u0000mp\u0003\u0018\f\u0000np\u0003\u0014\n\u0000o"+
		"m\u0001\u0000\u0000\u0000on\u0001\u0000\u0000\u0000p\u0013\u0001\u0000"+
		"\u0000\u0000qv\u0003\u0016\u000b\u0000rs\u0005\u0010\u0000\u0000su\u0003"+
		"\u0016\u000b\u0000tr\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\u0015\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000y\u0080\u0005\u000f\u0000\u0000"+
		"z\u0080\u0005\u000e\u0000\u0000{|\u0005\u0014\u0000\u0000|}\u0003\u0014"+
		"\n\u0000}~\u0005\u0015\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f"+
		"y\u0001\u0000\u0000\u0000\u007fz\u0001\u0000\u0000\u0000\u007f{\u0001"+
		"\u0000\u0000\u0000\u0080\u0017\u0001\u0000\u0000\u0000\u0081\u0086\u0003"+
		"\u001a\r\u0000\u0082\u0083\u0005\u0011\u0000\u0000\u0083\u0085\u0003\u001a"+
		"\r\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000"+
		"\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000"+
		"\u0000\u0087\u0019\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0005\u0001\u0000\u0000\u008a\u0093\u0003\u001a\r\u0000"+
		"\u008b\u0093\u0003\u001c\u000e\u0000\u008c\u008d\u0005\u0014\u0000\u0000"+
		"\u008d\u008e\u0003\u0018\f\u0000\u008e\u008f\u0005\u0015\u0000\u0000\u008f"+
		"\u0093\u0001\u0000\u0000\u0000\u0090\u0093\u0005\u000e\u0000\u0000\u0091"+
		"\u0093\u0005\u000f\u0000\u0000\u0092\u0089\u0001\u0000\u0000\u0000\u0092"+
		"\u008b\u0001\u0000\u0000\u0000\u0092\u008c\u0001\u0000\u0000\u0000\u0092"+
		"\u0090\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u001b\u0001\u0000\u0000\u0000\u0094\u0095\u0003\u0014\n\u0000\u0095\u0096"+
		"\u0005\u0012\u0000\u0000\u0096\u0097\u0003\u0014\n\u0000\u0097\u009c\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0005\u000e\u0000\u0000\u0099\u009a\u0005"+
		"\u0012\u0000\u0000\u009a\u009c\u0003\u0014\n\u0000\u009b\u0094\u0001\u0000"+
		"\u0000\u0000\u009b\u0098\u0001\u0000\u0000\u0000\u009c\u001d\u0001\u0000"+
		"\u0000\u0000\r\",:GMO[ov\u007f\u0086\u0092\u009b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}