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
		public TerminalNode EOF() { return getToken(fimlyParser.EOF, 0); }
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
			setState(40);
			match(EOF);
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
			setState(42);
			match(VAR);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(43);
				declaracao_var();
				}
				}
				setState(48);
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
			setState(49);
			match(ID);
			setState(50);
			match(DOIS_PONTOS);
			setState(51);
			tipo();
			setState(52);
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
			setState(54);
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 66636L) != 0)) {
				{
				{
				setState(56);
				comando();
				}
				}
				setState(61);
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
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				comando_ler();
				}
				break;
			case ESCREVA:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				comando_escrever();
				}
				break;
			case SE:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				comando_condicional();
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				comando_repeticao();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
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
			setState(69);
			match(LEIA);
			setState(70);
			match(ABRE_PAR);
			setState(71);
			match(ID);
			setState(72);
			match(FECHA_PAR);
			setState(73);
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
			setState(75);
			match(ESCREVA);
			setState(76);
			match(ABRE_PAR);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17760256L) != 0)) {
				{
				setState(77);
				lista_expressao();
				}
			}

			setState(80);
			match(FECHA_PAR);
			setState(81);
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
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				expressao();
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17760256L) != 0)) {
					{
					{
					setState(84);
					expressao();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(CADEIA);
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
			setState(93);
			match(SE);
			setState(94);
			match(ABRE_PAR);
			setState(95);
			expressao();
			setState(96);
			match(FECHA_PAR);
			setState(97);
			match(ENTAO);
			setState(98);
			comandos();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(99);
				match(SENAO);
				setState(100);
				comandos();
				}
			}

			setState(103);
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
			setState(105);
			match(ENQUANTO);
			setState(106);
			match(ABRE_PAR);
			setState(107);
			expressao();
			setState(108);
			match(FECHA_PAR);
			setState(109);
			match(FACA);
			setState(110);
			comandos();
			setState(111);
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
			setState(113);
			match(ID);
			setState(114);
			match(IGUAL);
			setState(115);
			expressao();
			setState(116);
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
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				expressao_logica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
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
		enterRule(_localctx, 26, RULE_expressao_aritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			termo();
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_ARIT) {
				{
				{
				setState(123);
				match(OP_ARIT);
				setState(124);
				termo();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO_INTEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(NUMERO_INTEIRO);
				}
				break;
			case NUMERO_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(NUMERO_FLOAT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(ID);
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				match(CADEIA);
				}
				break;
			case ABRE_PAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				match(ABRE_PAR);
				setState(135);
				expressao_aritmetica();
				setState(136);
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
			setState(140);
			expressao_comparacao();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_LOGICO) {
				{
				{
				setState(141);
				match(OP_LOGICO);
				setState(142);
				expressao_comparacao();
				}
				}
				setState(147);
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
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(OP_LOGICO);
				setState(149);
				fator_logico();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				expressao_comparacao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(ABRE_PAR);
				setState(152);
				expressao_logica();
				setState(153);
				match(FECHA_PAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				match(NUMERO_INTEIRO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
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
			setState(160);
			expressao_aritmetica();
			setState(161);
			match(OP_COMPARACAO);
			setState(162);
			expressao_aritmetica();
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
		"\u0004\u0001\u001e\u00a5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0005\u0001-\b\u0001\n\u0001\f\u00010\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0005\u0004:\b\u0004\n\u0004\f\u0004=\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005D\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007O\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0005\bV\b\b\n\b\f\bY\t\b\u0001\b\u0003"+
		"\b\\\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\tf\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0003\fy\b\f\u0001\r\u0001\r\u0001\r\u0005"+
		"\r~\b\r\n\r\f\r\u0081\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u008b\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0090\b\u000f\n\u000f"+
		"\f\u000f\u0093\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u009f\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0000\u0000\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000\u0001\u0001\u0000"+
		"\r\u000f\u00a8\u0000$\u0001\u0000\u0000\u0000\u0002*\u0001\u0000\u0000"+
		"\u0000\u00041\u0001\u0000\u0000\u0000\u00066\u0001\u0000\u0000\u0000\b"+
		";\u0001\u0000\u0000\u0000\nC\u0001\u0000\u0000\u0000\fE\u0001\u0000\u0000"+
		"\u0000\u000eK\u0001\u0000\u0000\u0000\u0010[\u0001\u0000\u0000\u0000\u0012"+
		"]\u0001\u0000\u0000\u0000\u0014i\u0001\u0000\u0000\u0000\u0016q\u0001"+
		"\u0000\u0000\u0000\u0018x\u0001\u0000\u0000\u0000\u001az\u0001\u0000\u0000"+
		"\u0000\u001c\u008a\u0001\u0000\u0000\u0000\u001e\u008c\u0001\u0000\u0000"+
		"\u0000 \u009e\u0001\u0000\u0000\u0000\"\u00a0\u0001\u0000\u0000\u0000"+
		"$%\u0003\u0002\u0001\u0000%&\u0005\u0001\u0000\u0000&\'\u0003\b\u0004"+
		"\u0000\'(\u0005\u0005\u0000\u0000()\u0005\u0000\u0000\u0001)\u0001\u0001"+
		"\u0000\u0000\u0000*.\u0005\u0004\u0000\u0000+-\u0003\u0004\u0002\u0000"+
		",+\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/\u0003\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u000012\u0005\u0010\u0000\u000023\u0005\u0019\u0000\u0000"+
		"34\u0003\u0006\u0003\u000045\u0005\u001b\u0000\u00005\u0005\u0001\u0000"+
		"\u0000\u000067\u0007\u0000\u0000\u00007\u0007\u0001\u0000\u0000\u0000"+
		"8:\u0003\n\u0005\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\t\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000>D\u0003\f\u0006\u0000?D\u0003\u000e\u0007"+
		"\u0000@D\u0003\u0012\t\u0000AD\u0003\u0014\n\u0000BD\u0003\u0016\u000b"+
		"\u0000C>\u0001\u0000\u0000\u0000C?\u0001\u0000\u0000\u0000C@\u0001\u0000"+
		"\u0000\u0000CA\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000D\u000b"+
		"\u0001\u0000\u0000\u0000EF\u0005\u0002\u0000\u0000FG\u0005\u0018\u0000"+
		"\u0000GH\u0005\u0010\u0000\u0000HI\u0005\u001a\u0000\u0000IJ\u0005\u001b"+
		"\u0000\u0000J\r\u0001\u0000\u0000\u0000KL\u0005\u0003\u0000\u0000LN\u0005"+
		"\u0018\u0000\u0000MO\u0003\u0010\b\u0000NM\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0005\u001a\u0000\u0000"+
		"QR\u0005\u001b\u0000\u0000R\u000f\u0001\u0000\u0000\u0000SW\u0003\u0018"+
		"\f\u0000TV\u0003\u0018\f\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\\\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z\\\u0005\u0013\u0000\u0000"+
		"[S\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\\u0011\u0001\u0000"+
		"\u0000\u0000]^\u0005\u0006\u0000\u0000^_\u0005\u0018\u0000\u0000_`\u0003"+
		"\u0018\f\u0000`a\u0005\u001a\u0000\u0000ab\u0005\u0007\u0000\u0000be\u0003"+
		"\b\u0004\u0000cd\u0005\b\u0000\u0000df\u0003\b\u0004\u0000ec\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0005"+
		"\t\u0000\u0000h\u0013\u0001\u0000\u0000\u0000ij\u0005\n\u0000\u0000jk"+
		"\u0005\u0018\u0000\u0000kl\u0003\u0018\f\u0000lm\u0005\u001a\u0000\u0000"+
		"mn\u0005\u000b\u0000\u0000no\u0003\b\u0004\u0000op\u0005\f\u0000\u0000"+
		"p\u0015\u0001\u0000\u0000\u0000qr\u0005\u0010\u0000\u0000rs\u0005\u0017"+
		"\u0000\u0000st\u0003\u0018\f\u0000tu\u0005\u001b\u0000\u0000u\u0017\u0001"+
		"\u0000\u0000\u0000vy\u0003\u001e\u000f\u0000wy\u0003\u001a\r\u0000xv\u0001"+
		"\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000y\u0019\u0001\u0000\u0000"+
		"\u0000z\u007f\u0003\u001c\u000e\u0000{|\u0005\u0014\u0000\u0000|~\u0003"+
		"\u001c\u000e\u0000}{\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u001b\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0082\u008b\u0005\u0011\u0000\u0000\u0083\u008b\u0005\u0012\u0000\u0000"+
		"\u0084\u008b\u0005\u0010\u0000\u0000\u0085\u008b\u0005\u0013\u0000\u0000"+
		"\u0086\u0087\u0005\u0018\u0000\u0000\u0087\u0088\u0003\u001a\r\u0000\u0088"+
		"\u0089\u0005\u001a\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a"+
		"\u0082\u0001\u0000\u0000\u0000\u008a\u0083\u0001\u0000\u0000\u0000\u008a"+
		"\u0084\u0001\u0000\u0000\u0000\u008a\u0085\u0001\u0000\u0000\u0000\u008a"+
		"\u0086\u0001\u0000\u0000\u0000\u008b\u001d\u0001\u0000\u0000\u0000\u008c"+
		"\u0091\u0003\"\u0011\u0000\u008d\u008e\u0005\u0015\u0000\u0000\u008e\u0090"+
		"\u0003\"\u0011\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0093\u0001"+
		"\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u001f\u0001\u0000\u0000\u0000\u0093\u0091\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005\u0015\u0000\u0000\u0095\u009f\u0003"+
		" \u0010\u0000\u0096\u009f\u0003\"\u0011\u0000\u0097\u0098\u0005\u0018"+
		"\u0000\u0000\u0098\u0099\u0003\u001e\u000f\u0000\u0099\u009a\u0005\u001a"+
		"\u0000\u0000\u009a\u009f\u0001\u0000\u0000\u0000\u009b\u009f\u0005\u0010"+
		"\u0000\u0000\u009c\u009f\u0005\u0011\u0000\u0000\u009d\u009f\u0005\u0012"+
		"\u0000\u0000\u009e\u0094\u0001\u0000\u0000\u0000\u009e\u0096\u0001\u0000"+
		"\u0000\u0000\u009e\u0097\u0001\u0000\u0000\u0000\u009e\u009b\u0001\u0000"+
		"\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009d\u0001\u0000"+
		"\u0000\u0000\u009f!\u0001\u0000\u0000\u0000\u00a0\u00a1\u0003\u001a\r"+
		"\u0000\u00a1\u00a2\u0005\u0016\u0000\u0000\u00a2\u00a3\u0003\u001a\r\u0000"+
		"\u00a3#\u0001\u0000\u0000\u0000\f.;CNW[ex\u007f\u008a\u0091\u009e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}