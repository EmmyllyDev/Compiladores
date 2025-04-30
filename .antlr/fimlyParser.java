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
		INICIO=1, LEIA=2, ESCREVA=3, VAR=4, FIM_AL=5, SE=6, ENTAO=7, SENAO=8, 
		FIM_SE=9, ENQUANTO=10, FACA=11, FIM_ENQ=12, INT=13, FLOAT=14, STRING=15, 
		ID=16, NUMERO_INTEIRO=17, NUMERO_FLOAT=18, CADEIA=19, OP_ARIT=20, OP_LOGICO=21, 
		OP_COMPARACAO=22, IGUAL=23, ABRE_PAR=24, DOIS_PONTOS=25, FECHA_PAR=26, 
		PONTO_VIR=27, ASPAS=28, VIRG=29, WS=30;
	public static final int
		RULE_fimly = 0, RULE_declaracoes = 1, RULE_declaracao_var = 2, RULE_tipo = 3, 
		RULE_comandos = 4, RULE_comando = 5, RULE_comando_ler = 6, RULE_comando_escrever = 7, 
		RULE_lista_expressao = 8, RULE_comando_condicional = 9, RULE_comando_repeticao = 10, 
		RULE_comando_atribuicao = 11, RULE_expressao = 12, RULE_expressao_aritmetica = 13, 
		RULE_termo = 14, RULE_expressao_logica = 15, RULE_fator_logico = 16, RULE_expressao_comparacao = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"fimly", "declaracoes", "declaracao_var", "tipo", "comandos", "comando", 
			"comando_ler", "comando_escrever", "lista_expressao", "comando_condicional", 
			"comando_repeticao", "comando_atribuicao", "expressao", "expressao_aritmetica", 
			"termo", "expressao_logica", "fator_logico", "expressao_comparacao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio'", "'leia'", "'escreva'", "'var'", "'fimalgoritmo'", "'se'", 
			"'entao'", "'senao'", "'fimse'", "'enquanto'", "'faca'", "'fimenquanto'", 
			"'inteiro'", "'float'", "'string'", null, null, null, null, null, null, 
			null, "'='", "'('", "':'", "')'", "';'", "'\"'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INICIO", "LEIA", "ESCREVA", "VAR", "FIM_AL", "SE", "ENTAO", "SENAO", 
			"FIM_SE", "ENQUANTO", "FACA", "FIM_ENQ", "INT", "FLOAT", "STRING", "ID", 
			"NUMERO_INTEIRO", "NUMERO_FLOAT", "CADEIA", "OP_ARIT", "OP_LOGICO", "OP_COMPARACAO", 
			"IGUAL", "ABRE_PAR", "DOIS_PONTOS", "FECHA_PAR", "PONTO_VIR", "ASPAS", 
			"VIRG", "WS"
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
	public static class FimlyContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode INICIO() { return getToken(fimlyParser.INICIO, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode FIM_AL() { return getToken(fimlyParser.FIM_AL, 0); }
		public FimlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fimly; }
	}

	public final FimlyContext fimly() throws RecognitionException {
		FimlyContext _localctx = new FimlyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fimly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			declaracoes();
			setState(37);
			match(INICIO);
			setState(38);
			comandos();
			setState(39);
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
	public static class DeclaracoesContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(fimlyParser.VAR, 0); }
		public List<Declaracao_varContext> declaracao_var() {
			return getRuleContexts(Declaracao_varContext.class);
		}
		public Declaracao_varContext declaracao_var(int i) {
			return getRuleContext(Declaracao_varContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(VAR);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(42);
				declaracao_var();
				}
				}
				setState(47);
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
	public static class Declaracao_varContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(fimlyParser.ID, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(fimlyParser.DOIS_PONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode PONTO_VIR() { return getToken(fimlyParser.PONTO_VIR, 0); }
		public Declaracao_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_var; }
	}

	public final Declaracao_varContext declaracao_var() throws RecognitionException {
		Declaracao_varContext _localctx = new Declaracao_varContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(ID);
			setState(49);
			match(DOIS_PONTOS);
			setState(50);
			tipo();
			setState(51);
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
		public TerminalNode INT() { return getToken(fimlyParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(fimlyParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(fimlyParser.STRING, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
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
	public static class ComandosContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 66636L) != 0)) {
				{
				{
				setState(55);
				comando();
				}
				}
				setState(60);
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
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comando);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				comando_ler();
				}
				break;
			case ESCREVA:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				comando_escrever();
				}
				break;
			case SE:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				comando_condicional();
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				comando_repeticao();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				comando_atribuicao();
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
	public static class Comando_lerContext extends ParserRuleContext {
		public TerminalNode LEIA() { return getToken(fimlyParser.LEIA, 0); }
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
		enterRule(_localctx, 12, RULE_comando_ler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(LEIA);
			setState(69);
			match(ABRE_PAR);
			setState(70);
			match(ID);
			setState(71);
			match(FECHA_PAR);
			setState(72);
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
		public TerminalNode ESCREVA() { return getToken(fimlyParser.ESCREVA, 0); }
		public TerminalNode ABRE_PAR() { return getToken(fimlyParser.ABRE_PAR, 0); }
		public TerminalNode FECHA_PAR() { return getToken(fimlyParser.FECHA_PAR, 0); }
		public TerminalNode PONTO_VIR() { return getToken(fimlyParser.PONTO_VIR, 0); }
		public Lista_expressaoContext lista_expressao() {
			return getRuleContext(Lista_expressaoContext.class,0);
		}
		public Comando_escreverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_escrever; }
	}

	public final Comando_escreverContext comando_escrever() throws RecognitionException {
		Comando_escreverContext _localctx = new Comando_escreverContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comando_escrever);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(ESCREVA);
			setState(75);
			match(ABRE_PAR);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17760256L) != 0)) {
				{
				setState(76);
				lista_expressao();
				}
			}

			setState(79);
			match(FECHA_PAR);
			setState(80);
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
	public static class Lista_expressaoContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode CADEIA() { return getToken(fimlyParser.CADEIA, 0); }
		public Lista_expressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_expressao; }
	}

	public final Lista_expressaoContext lista_expressao() throws RecognitionException {
		Lista_expressaoContext _localctx = new Lista_expressaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lista_expressao);
		int _la;
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case NUMERO_INTEIRO:
			case NUMERO_FLOAT:
			case ABRE_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				expressao();
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17235968L) != 0)) {
					{
					{
					setState(83);
					expressao();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(CADEIA);
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
	public static class Comando_condicionalContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(fimlyParser.SE, 0); }
		public TerminalNode ABRE_PAR() { return getToken(fimlyParser.ABRE_PAR, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PAR() { return getToken(fimlyParser.FECHA_PAR, 0); }
		public TerminalNode ENTAO() { return getToken(fimlyParser.ENTAO, 0); }
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public TerminalNode FIM_SE() { return getToken(fimlyParser.FIM_SE, 0); }
		public TerminalNode SENAO() { return getToken(fimlyParser.SENAO, 0); }
		public Comando_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_condicional; }
	}

	public final Comando_condicionalContext comando_condicional() throws RecognitionException {
		Comando_condicionalContext _localctx = new Comando_condicionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comando_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(SE);
			setState(93);
			match(ABRE_PAR);
			setState(94);
			expressao();
			setState(95);
			match(FECHA_PAR);
			setState(96);
			match(ENTAO);
			setState(97);
			comandos();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(98);
				match(SENAO);
				setState(99);
				comandos();
				}
			}

			setState(102);
			match(FIM_SE);
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
		public TerminalNode FACA() { return getToken(fimlyParser.FACA, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode FIM_ENQ() { return getToken(fimlyParser.FIM_ENQ, 0); }
		public Comando_repeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_repeticao; }
	}

	public final Comando_repeticaoContext comando_repeticao() throws RecognitionException {
		Comando_repeticaoContext _localctx = new Comando_repeticaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comando_repeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(ENQUANTO);
			setState(105);
			match(ABRE_PAR);
			setState(106);
			expressao();
			setState(107);
			match(FECHA_PAR);
			setState(108);
			match(FACA);
			setState(109);
			comandos();
			setState(110);
			match(FIM_ENQ);
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
		enterRule(_localctx, 22, RULE_comando_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(ID);
			setState(113);
			match(IGUAL);
			setState(114);
			expressao();
			setState(115);
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
		enterRule(_localctx, 24, RULE_expressao);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				expressao_logica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				expressao_aritmetica(0);
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
		public TerminalNode ABRE_PAR() { return getToken(fimlyParser.ABRE_PAR, 0); }
		public List<Expressao_aritmeticaContext> expressao_aritmetica() {
			return getRuleContexts(Expressao_aritmeticaContext.class);
		}
		public Expressao_aritmeticaContext expressao_aritmetica(int i) {
			return getRuleContext(Expressao_aritmeticaContext.class,i);
		}
		public TerminalNode FECHA_PAR() { return getToken(fimlyParser.FECHA_PAR, 0); }
		public TerminalNode NUMERO_INTEIRO() { return getToken(fimlyParser.NUMERO_INTEIRO, 0); }
		public TerminalNode NUMERO_FLOAT() { return getToken(fimlyParser.NUMERO_FLOAT, 0); }
		public TerminalNode ID() { return getToken(fimlyParser.ID, 0); }
		public TerminalNode OP_ARIT() { return getToken(fimlyParser.OP_ARIT, 0); }
		public Expressao_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_aritmetica; }
	}

	public final Expressao_aritmeticaContext expressao_aritmetica() throws RecognitionException {
		return expressao_aritmetica(0);
	}

	private Expressao_aritmeticaContext expressao_aritmetica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expressao_aritmeticaContext _localctx = new Expressao_aritmeticaContext(_ctx, _parentState);
		Expressao_aritmeticaContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expressao_aritmetica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_PAR:
				{
				setState(122);
				match(ABRE_PAR);
				setState(123);
				expressao_aritmetica(0);
				setState(124);
				match(FECHA_PAR);
				}
				break;
			case NUMERO_INTEIRO:
				{
				setState(126);
				match(NUMERO_INTEIRO);
				}
				break;
			case NUMERO_FLOAT:
				{
				setState(127);
				match(NUMERO_FLOAT);
				}
				break;
			case ID:
				{
				setState(128);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expressao_aritmeticaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressao_aritmetica);
					setState(131);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(132);
					match(OP_ARIT);
					setState(133);
					expressao_aritmetica(6);
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public TerminalNode NUMERO_INTEIRO() { return getToken(fimlyParser.NUMERO_INTEIRO, 0); }
		public TerminalNode NUMERO_FLOAT() { return getToken(fimlyParser.NUMERO_FLOAT, 0); }
		public TerminalNode ID() { return getToken(fimlyParser.ID, 0); }
		public TerminalNode CADEIA() { return getToken(fimlyParser.CADEIA, 0); }
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
		enterRule(_localctx, 28, RULE_termo);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO_INTEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(NUMERO_INTEIRO);
				}
				break;
			case NUMERO_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(NUMERO_FLOAT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(ID);
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				match(CADEIA);
				}
				break;
			case ABRE_PAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				match(ABRE_PAR);
				setState(144);
				expressao_aritmetica(0);
				setState(145);
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
		public List<Expressao_comparacaoContext> expressao_comparacao() {
			return getRuleContexts(Expressao_comparacaoContext.class);
		}
		public Expressao_comparacaoContext expressao_comparacao(int i) {
			return getRuleContext(Expressao_comparacaoContext.class,i);
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
		enterRule(_localctx, 30, RULE_expressao_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			expressao_comparacao();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_LOGICO) {
				{
				{
				setState(150);
				match(OP_LOGICO);
				setState(151);
				expressao_comparacao();
				}
				}
				setState(156);
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
		public TerminalNode OP_LOGICO() { return getToken(fimlyParser.OP_LOGICO, 0); }
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
		public TerminalNode NUMERO_INTEIRO() { return getToken(fimlyParser.NUMERO_INTEIRO, 0); }
		public TerminalNode NUMERO_FLOAT() { return getToken(fimlyParser.NUMERO_FLOAT, 0); }
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fator_logico);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(OP_LOGICO);
				setState(158);
				fator_logico();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				expressao_comparacao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(ABRE_PAR);
				setState(161);
				expressao_logica();
				setState(162);
				match(FECHA_PAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				match(NUMERO_INTEIRO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(166);
				match(NUMERO_FLOAT);
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
		public Expressao_comparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_comparacao; }
	}

	public final Expressao_comparacaoContext expressao_comparacao() throws RecognitionException {
		Expressao_comparacaoContext _localctx = new Expressao_comparacaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressao_comparacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			expressao_aritmetica(0);
			setState(170);
			match(OP_COMPARACAO);
			setState(171);
			expressao_aritmetica(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expressao_aritmetica_sempred((Expressao_aritmeticaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_aritmetica_sempred(Expressao_aritmeticaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u00ae\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005"+
		"\u0001,\b\u0001\n\u0001\f\u0001/\t\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0005"+
		"\u00049\b\u0004\n\u0004\f\u0004<\t\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005C\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007N\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0005\bU\b\b\n\b\f\bX\t\b\u0001\b\u0003\b[\b\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\te\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0003\fx\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u0082\b\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u0087\b\r\n\r\f\r\u008a\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0094"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0099\b\u000f"+
		"\n\u000f\f\u000f\u009c\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00a8\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0000\u0001\u001a\u0012\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000\u0001"+
		"\u0001\u0000\r\u000f\u00b4\u0000$\u0001\u0000\u0000\u0000\u0002)\u0001"+
		"\u0000\u0000\u0000\u00040\u0001\u0000\u0000\u0000\u00065\u0001\u0000\u0000"+
		"\u0000\b:\u0001\u0000\u0000\u0000\nB\u0001\u0000\u0000\u0000\fD\u0001"+
		"\u0000\u0000\u0000\u000eJ\u0001\u0000\u0000\u0000\u0010Z\u0001\u0000\u0000"+
		"\u0000\u0012\\\u0001\u0000\u0000\u0000\u0014h\u0001\u0000\u0000\u0000"+
		"\u0016p\u0001\u0000\u0000\u0000\u0018w\u0001\u0000\u0000\u0000\u001a\u0081"+
		"\u0001\u0000\u0000\u0000\u001c\u0093\u0001\u0000\u0000\u0000\u001e\u0095"+
		"\u0001\u0000\u0000\u0000 \u00a7\u0001\u0000\u0000\u0000\"\u00a9\u0001"+
		"\u0000\u0000\u0000$%\u0003\u0002\u0001\u0000%&\u0005\u0001\u0000\u0000"+
		"&\'\u0003\b\u0004\u0000\'(\u0005\u0005\u0000\u0000(\u0001\u0001\u0000"+
		"\u0000\u0000)-\u0005\u0004\u0000\u0000*,\u0003\u0004\u0002\u0000+*\u0001"+
		"\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000.\u0003\u0001\u0000\u0000\u0000/-\u0001\u0000"+
		"\u0000\u000001\u0005\u0010\u0000\u000012\u0005\u0019\u0000\u000023\u0003"+
		"\u0006\u0003\u000034\u0005\u001b\u0000\u00004\u0005\u0001\u0000\u0000"+
		"\u000056\u0007\u0000\u0000\u00006\u0007\u0001\u0000\u0000\u000079\u0003"+
		"\n\u0005\u000087\u0001\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;\t\u0001\u0000\u0000\u0000"+
		"<:\u0001\u0000\u0000\u0000=C\u0003\f\u0006\u0000>C\u0003\u000e\u0007\u0000"+
		"?C\u0003\u0012\t\u0000@C\u0003\u0014\n\u0000AC\u0003\u0016\u000b\u0000"+
		"B=\u0001\u0000\u0000\u0000B>\u0001\u0000\u0000\u0000B?\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000C\u000b\u0001"+
		"\u0000\u0000\u0000DE\u0005\u0002\u0000\u0000EF\u0005\u0018\u0000\u0000"+
		"FG\u0005\u0010\u0000\u0000GH\u0005\u001a\u0000\u0000HI\u0005\u001b\u0000"+
		"\u0000I\r\u0001\u0000\u0000\u0000JK\u0005\u0003\u0000\u0000KM\u0005\u0018"+
		"\u0000\u0000LN\u0003\u0010\b\u0000ML\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0005\u001a\u0000\u0000PQ\u0005"+
		"\u001b\u0000\u0000Q\u000f\u0001\u0000\u0000\u0000RV\u0003\u0018\f\u0000"+
		"SU\u0003\u0018\f\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W[\u0001\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000Y[\u0005\u0013\u0000\u0000ZR\u0001\u0000"+
		"\u0000\u0000ZY\u0001\u0000\u0000\u0000[\u0011\u0001\u0000\u0000\u0000"+
		"\\]\u0005\u0006\u0000\u0000]^\u0005\u0018\u0000\u0000^_\u0003\u0018\f"+
		"\u0000_`\u0005\u001a\u0000\u0000`a\u0005\u0007\u0000\u0000ad\u0003\b\u0004"+
		"\u0000bc\u0005\b\u0000\u0000ce\u0003\b\u0004\u0000db\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0005\t\u0000"+
		"\u0000g\u0013\u0001\u0000\u0000\u0000hi\u0005\n\u0000\u0000ij\u0005\u0018"+
		"\u0000\u0000jk\u0003\u0018\f\u0000kl\u0005\u001a\u0000\u0000lm\u0005\u000b"+
		"\u0000\u0000mn\u0003\b\u0004\u0000no\u0005\f\u0000\u0000o\u0015\u0001"+
		"\u0000\u0000\u0000pq\u0005\u0010\u0000\u0000qr\u0005\u0017\u0000\u0000"+
		"rs\u0003\u0018\f\u0000st\u0005\u001b\u0000\u0000t\u0017\u0001\u0000\u0000"+
		"\u0000ux\u0003\u001e\u000f\u0000vx\u0003\u001a\r\u0000wu\u0001\u0000\u0000"+
		"\u0000wv\u0001\u0000\u0000\u0000x\u0019\u0001\u0000\u0000\u0000yz\u0006"+
		"\r\uffff\uffff\u0000z{\u0005\u0018\u0000\u0000{|\u0003\u001a\r\u0000|"+
		"}\u0005\u001a\u0000\u0000}\u0082\u0001\u0000\u0000\u0000~\u0082\u0005"+
		"\u0011\u0000\u0000\u007f\u0082\u0005\u0012\u0000\u0000\u0080\u0082\u0005"+
		"\u0010\u0000\u0000\u0081y\u0001\u0000\u0000\u0000\u0081~\u0001\u0000\u0000"+
		"\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0088\u0001\u0000\u0000\u0000\u0083\u0084\n\u0005\u0000\u0000"+
		"\u0084\u0085\u0005\u0014\u0000\u0000\u0085\u0087\u0003\u001a\r\u0006\u0086"+
		"\u0083\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089"+
		"\u001b\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b"+
		"\u0094\u0005\u0011\u0000\u0000\u008c\u0094\u0005\u0012\u0000\u0000\u008d"+
		"\u0094\u0005\u0010\u0000\u0000\u008e\u0094\u0005\u0013\u0000\u0000\u008f"+
		"\u0090\u0005\u0018\u0000\u0000\u0090\u0091\u0003\u001a\r\u0000\u0091\u0092"+
		"\u0005\u001a\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u008b"+
		"\u0001\u0000\u0000\u0000\u0093\u008c\u0001\u0000\u0000\u0000\u0093\u008d"+
		"\u0001\u0000\u0000\u0000\u0093\u008e\u0001\u0000\u0000\u0000\u0093\u008f"+
		"\u0001\u0000\u0000\u0000\u0094\u001d\u0001\u0000\u0000\u0000\u0095\u009a"+
		"\u0003\"\u0011\u0000\u0096\u0097\u0005\u0015\u0000\u0000\u0097\u0099\u0003"+
		"\"\u0011\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000"+
		"\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000"+
		"\u0000\u0000\u009b\u001f\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0005\u0015\u0000\u0000\u009e\u00a8\u0003 \u0010"+
		"\u0000\u009f\u00a8\u0003\"\u0011\u0000\u00a0\u00a1\u0005\u0018\u0000\u0000"+
		"\u00a1\u00a2\u0003\u001e\u000f\u0000\u00a2\u00a3\u0005\u001a\u0000\u0000"+
		"\u00a3\u00a8\u0001\u0000\u0000\u0000\u00a4\u00a8\u0005\u0010\u0000\u0000"+
		"\u00a5\u00a8\u0005\u0011\u0000\u0000\u00a6\u00a8\u0005\u0012\u0000\u0000"+
		"\u00a7\u009d\u0001\u0000\u0000\u0000\u00a7\u009f\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a0\u0001\u0000\u0000\u0000\u00a7\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a8!\u0001\u0000\u0000\u0000\u00a9\u00aa\u0003\u001a\r\u0000\u00aa"+
		"\u00ab\u0005\u0016\u0000\u0000\u00ab\u00ac\u0003\u001a\r\u0000\u00ac#"+
		"\u0001\u0000\u0000\u0000\r-:BMVZdw\u0081\u0088\u0093\u009a\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}