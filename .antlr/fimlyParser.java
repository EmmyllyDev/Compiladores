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
		INICIO=1, LEIA=2, ESCREVA=3, ESCREVAL=4, VAR=5, FIM_AL=6, SE=7, ENTAO=8, 
		SENAO=9, FIM_SE=10, ENQUANTO=11, FACA=12, FIM_ENQ=13, INT=14, FLOAT=15, 
		STRING=16, ID=17, NUMERO_INTEIRO=18, NUMERO_FLOAT=19, CADEIA=20, OP_ARIT=21, 
		OP_LOGICO=22, OP_COMPARACAO=23, IGUAL=24, ABRE_PAR=25, FECHA_PAR=26, DOIS_PONTOS=27, 
		PONTO_VIR=28, ASPAS=29, VIRG=30, WS=31;
	public static final int
		RULE_fimly = 0, RULE_declaracoes = 1, RULE_declaracao_var = 2, RULE_tipo = 3, 
		RULE_bloco = 4, RULE_comando = 5, RULE_comando_ler = 6, RULE_comando_escrever = 7, 
		RULE_lista_expressao = 8, RULE_comando_condicional = 9, RULE_comando_repeticao = 10, 
		RULE_comando_atribuicao = 11, RULE_expressao = 12, RULE_expressao_aritmetica = 13, 
		RULE_termo = 14, RULE_expressao_logica = 15, RULE_fator_logico = 16, RULE_expressao_comparacao = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"fimly", "declaracoes", "declaracao_var", "tipo", "bloco", "comando", 
			"comando_ler", "comando_escrever", "lista_expressao", "comando_condicional", 
			"comando_repeticao", "comando_atribuicao", "expressao", "expressao_aritmetica", 
			"termo", "expressao_logica", "fator_logico", "expressao_comparacao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio'", "'leia'", "'escreva'", "'escreval'", "'var'", "'fimalgoritmo'", 
			"'se'", "'entao'", "'senao'", "'fimse'", "'enquanto'", "'faca'", "'fimenquanto'", 
			"'inteiro'", "'float'", "'string'", null, null, null, null, null, null, 
			null, "'='", "'('", "')'", "':'", "';'", "'\"'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INICIO", "LEIA", "ESCREVA", "ESCREVAL", "VAR", "FIM_AL", "SE", 
			"ENTAO", "SENAO", "FIM_SE", "ENQUANTO", "FACA", "FIM_ENQ", "INT", "FLOAT", 
			"STRING", "ID", "NUMERO_INTEIRO", "NUMERO_FLOAT", "CADEIA", "OP_ARIT", 
			"OP_LOGICO", "OP_COMPARACAO", "IGUAL", "ABRE_PAR", "FECHA_PAR", "DOIS_PONTOS", 
			"PONTO_VIR", "ASPAS", "VIRG", "WS"
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
		public TerminalNode INICIO() { return getToken(fimlyParser.INICIO, 0); }
		public TerminalNode FIM_AL() { return getToken(fimlyParser.FIM_AL, 0); }
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public FimlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fimly; }
	}

	public final FimlyContext fimly() throws RecognitionException {
		FimlyContext _localctx = new FimlyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fimly);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(36);
				declaracoes();
				}
			}

			setState(39);
			match(INICIO);
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				comando();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 133276L) != 0) );
			setState(45);
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
			setState(47);
			match(VAR);
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				declaracao_var();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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
			setState(53);
			match(ID);
			setState(54);
			match(DOIS_PONTOS);
			setState(55);
			tipo();
			setState(56);
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
			setState(58);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 114688L) != 0)) ) {
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
	public static class BlocoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 133276L) != 0)) {
				{
				{
				setState(60);
				comando();
				}
				}
				setState(65);
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
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				comando_ler();
				}
				break;
			case ESCREVA:
			case ESCREVAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				comando_escrever();
				}
				break;
			case SE:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				comando_condicional();
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				comando_repeticao();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
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
			setState(73);
			match(LEIA);
			setState(74);
			match(ABRE_PAR);
			setState(75);
			match(ID);
			setState(76);
			match(FECHA_PAR);
			setState(77);
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
		public TerminalNode ABRE_PAR() { return getToken(fimlyParser.ABRE_PAR, 0); }
		public TerminalNode FECHA_PAR() { return getToken(fimlyParser.FECHA_PAR, 0); }
		public TerminalNode PONTO_VIR() { return getToken(fimlyParser.PONTO_VIR, 0); }
		public TerminalNode ESCREVA() { return getToken(fimlyParser.ESCREVA, 0); }
		public TerminalNode ESCREVAL() { return getToken(fimlyParser.ESCREVAL, 0); }
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
			setState(79);
			_la = _input.LA(1);
			if ( !(_la==ESCREVA || _la==ESCREVAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(80);
			match(ABRE_PAR);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 39714816L) != 0)) {
				{
				setState(81);
				lista_expressao();
				}
			}

			setState(84);
			match(FECHA_PAR);
			setState(85);
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
		public List<TerminalNode> VIRG() { return getTokens(fimlyParser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(fimlyParser.VIRG, i);
		}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			expressao();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRG) {
				{
				{
				setState(88);
				match(VIRG);
				setState(89);
				expressao();
				}
				}
				setState(94);
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
	public static class Comando_condicionalContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(fimlyParser.SE, 0); }
		public TerminalNode ABRE_PAR() { return getToken(fimlyParser.ABRE_PAR, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PAR() { return getToken(fimlyParser.FECHA_PAR, 0); }
		public TerminalNode ENTAO() { return getToken(fimlyParser.ENTAO, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
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
			setState(95);
			match(SE);
			setState(96);
			match(ABRE_PAR);
			setState(97);
			expressao();
			setState(98);
			match(FECHA_PAR);
			setState(99);
			match(ENTAO);
			setState(100);
			bloco();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(101);
				match(SENAO);
				setState(102);
				bloco();
				}
			}

			setState(105);
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
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
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
			setState(107);
			match(ENQUANTO);
			setState(108);
			match(ABRE_PAR);
			setState(109);
			expressao();
			setState(110);
			match(FECHA_PAR);
			setState(111);
			match(FACA);
			setState(112);
			bloco();
			setState(113);
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
			setState(115);
			match(ID);
			setState(116);
			match(IGUAL);
			setState(117);
			expressao();
			setState(118);
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
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				expressao_logica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
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
			setState(124);
			termo();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_ARIT) {
				{
				{
				setState(125);
				match(OP_ARIT);
				setState(126);
				termo();
				}
				}
				setState(131);
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
		public TerminalNode NUMERO_INTEIRO() { return getToken(fimlyParser.NUMERO_INTEIRO, 0); }
		public TerminalNode NUMERO_FLOAT() { return getToken(fimlyParser.NUMERO_FLOAT, 0); }
		public TerminalNode ID() { return getToken(fimlyParser.ID, 0); }
		public TerminalNode CADEIA() { return getToken(fimlyParser.CADEIA, 0); }
		public TerminalNode ABRE_PAR() { return getToken(fimlyParser.ABRE_PAR, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
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
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO_INTEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(NUMERO_INTEIRO);
				}
				break;
			case NUMERO_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(NUMERO_FLOAT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(ID);
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(CADEIA);
				}
				break;
			case ABRE_PAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				match(ABRE_PAR);
				setState(137);
				expressao();
				setState(138);
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
		enterRule(_localctx, 30, RULE_expressao_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			fator_logico();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_LOGICO) {
				{
				{
				setState(143);
				match(OP_LOGICO);
				setState(144);
				fator_logico();
				}
				}
				setState(149);
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
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(OP_LOGICO);
				setState(151);
				fator_logico();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				expressao_comparacao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(ABRE_PAR);
				setState(154);
				expressao_logica();
				setState(155);
				match(FECHA_PAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				match(NUMERO_INTEIRO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
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
			setState(162);
			expressao_aritmetica();
			setState(163);
			match(OP_COMPARACAO);
			setState(164);
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
		"\u0004\u0001\u001f\u00a7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0003"+
		"\u0000&\b\u0000\u0001\u0000\u0001\u0000\u0004\u0000*\b\u0000\u000b\u0000"+
		"\f\u0000+\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u0001"+
		"2\b\u0001\u000b\u0001\f\u00013\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0005\u0004>\b"+
		"\u0004\n\u0004\f\u0004A\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005H\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007S\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0005\b[\b\b\n\b\f\b^\t\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\th\b\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003"+
		"\f{\b\f\u0001\r\u0001\r\u0001\r\u0005\r\u0080\b\r\n\r\f\r\u0083\t\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u008d\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u0092\b\u000f\n\u000f\f\u000f\u0095\t\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00a1\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"\u0000\u0002\u0001\u0000\u000e\u0010\u0001\u0000\u0003\u0004"+
		"\u00ab\u0000%\u0001\u0000\u0000\u0000\u0002/\u0001\u0000\u0000\u0000\u0004"+
		"5\u0001\u0000\u0000\u0000\u0006:\u0001\u0000\u0000\u0000\b?\u0001\u0000"+
		"\u0000\u0000\nG\u0001\u0000\u0000\u0000\fI\u0001\u0000\u0000\u0000\u000e"+
		"O\u0001\u0000\u0000\u0000\u0010W\u0001\u0000\u0000\u0000\u0012_\u0001"+
		"\u0000\u0000\u0000\u0014k\u0001\u0000\u0000\u0000\u0016s\u0001\u0000\u0000"+
		"\u0000\u0018z\u0001\u0000\u0000\u0000\u001a|\u0001\u0000\u0000\u0000\u001c"+
		"\u008c\u0001\u0000\u0000\u0000\u001e\u008e\u0001\u0000\u0000\u0000 \u00a0"+
		"\u0001\u0000\u0000\u0000\"\u00a2\u0001\u0000\u0000\u0000$&\u0003\u0002"+
		"\u0001\u0000%$\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\'\u0001"+
		"\u0000\u0000\u0000\')\u0005\u0001\u0000\u0000(*\u0003\n\u0005\u0000)("+
		"\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000"+
		"\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0005\u0006"+
		"\u0000\u0000.\u0001\u0001\u0000\u0000\u0000/1\u0005\u0005\u0000\u0000"+
		"02\u0003\u0004\u0002\u000010\u0001\u0000\u0000\u000023\u0001\u0000\u0000"+
		"\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u00004\u0003\u0001"+
		"\u0000\u0000\u000056\u0005\u0011\u0000\u000067\u0005\u001b\u0000\u0000"+
		"78\u0003\u0006\u0003\u000089\u0005\u001c\u0000\u00009\u0005\u0001\u0000"+
		"\u0000\u0000:;\u0007\u0000\u0000\u0000;\u0007\u0001\u0000\u0000\u0000"+
		"<>\u0003\n\u0005\u0000=<\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000"+
		"?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@\t\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000BH\u0003\f\u0006\u0000CH\u0003\u000e\u0007"+
		"\u0000DH\u0003\u0012\t\u0000EH\u0003\u0014\n\u0000FH\u0003\u0016\u000b"+
		"\u0000GB\u0001\u0000\u0000\u0000GC\u0001\u0000\u0000\u0000GD\u0001\u0000"+
		"\u0000\u0000GE\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000H\u000b"+
		"\u0001\u0000\u0000\u0000IJ\u0005\u0002\u0000\u0000JK\u0005\u0019\u0000"+
		"\u0000KL\u0005\u0011\u0000\u0000LM\u0005\u001a\u0000\u0000MN\u0005\u001c"+
		"\u0000\u0000N\r\u0001\u0000\u0000\u0000OP\u0007\u0001\u0000\u0000PR\u0005"+
		"\u0019\u0000\u0000QS\u0003\u0010\b\u0000RQ\u0001\u0000\u0000\u0000RS\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0005\u001a\u0000\u0000"+
		"UV\u0005\u001c\u0000\u0000V\u000f\u0001\u0000\u0000\u0000W\\\u0003\u0018"+
		"\f\u0000XY\u0005\u001e\u0000\u0000Y[\u0003\u0018\f\u0000ZX\u0001\u0000"+
		"\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]\u0011\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000_`\u0005\u0007\u0000\u0000`a\u0005\u0019\u0000\u0000ab\u0003\u0018"+
		"\f\u0000bc\u0005\u001a\u0000\u0000cd\u0005\b\u0000\u0000dg\u0003\b\u0004"+
		"\u0000ef\u0005\t\u0000\u0000fh\u0003\b\u0004\u0000ge\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0005\n\u0000"+
		"\u0000j\u0013\u0001\u0000\u0000\u0000kl\u0005\u000b\u0000\u0000lm\u0005"+
		"\u0019\u0000\u0000mn\u0003\u0018\f\u0000no\u0005\u001a\u0000\u0000op\u0005"+
		"\f\u0000\u0000pq\u0003\b\u0004\u0000qr\u0005\r\u0000\u0000r\u0015\u0001"+
		"\u0000\u0000\u0000st\u0005\u0011\u0000\u0000tu\u0005\u0018\u0000\u0000"+
		"uv\u0003\u0018\f\u0000vw\u0005\u001c\u0000\u0000w\u0017\u0001\u0000\u0000"+
		"\u0000x{\u0003\u001e\u000f\u0000y{\u0003\u001a\r\u0000zx\u0001\u0000\u0000"+
		"\u0000zy\u0001\u0000\u0000\u0000{\u0019\u0001\u0000\u0000\u0000|\u0081"+
		"\u0003\u001c\u000e\u0000}~\u0005\u0015\u0000\u0000~\u0080\u0003\u001c"+
		"\u000e\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000"+
		"\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u001b\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000"+
		"\u0000\u0084\u008d\u0005\u0012\u0000\u0000\u0085\u008d\u0005\u0013\u0000"+
		"\u0000\u0086\u008d\u0005\u0011\u0000\u0000\u0087\u008d\u0005\u0014\u0000"+
		"\u0000\u0088\u0089\u0005\u0019\u0000\u0000\u0089\u008a\u0003\u0018\f\u0000"+
		"\u008a\u008b\u0005\u001a\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000"+
		"\u008c\u0084\u0001\u0000\u0000\u0000\u008c\u0085\u0001\u0000\u0000\u0000"+
		"\u008c\u0086\u0001\u0000\u0000\u0000\u008c\u0087\u0001\u0000\u0000\u0000"+
		"\u008c\u0088\u0001\u0000\u0000\u0000\u008d\u001d\u0001\u0000\u0000\u0000"+
		"\u008e\u0093\u0003 \u0010\u0000\u008f\u0090\u0005\u0016\u0000\u0000\u0090"+
		"\u0092\u0003 \u0010\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0095"+
		"\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0001\u0000\u0000\u0000\u0094\u001f\u0001\u0000\u0000\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0016\u0000\u0000\u0097\u00a1"+
		"\u0003 \u0010\u0000\u0098\u00a1\u0003\"\u0011\u0000\u0099\u009a\u0005"+
		"\u0019\u0000\u0000\u009a\u009b\u0003\u001e\u000f\u0000\u009b\u009c\u0005"+
		"\u001a\u0000\u0000\u009c\u00a1\u0001\u0000\u0000\u0000\u009d\u00a1\u0005"+
		"\u0011\u0000\u0000\u009e\u00a1\u0005\u0012\u0000\u0000\u009f\u00a1\u0005"+
		"\u0013\u0000\u0000\u00a0\u0096\u0001\u0000\u0000\u0000\u00a0\u0098\u0001"+
		"\u0000\u0000\u0000\u00a0\u0099\u0001\u0000\u0000\u0000\u00a0\u009d\u0001"+
		"\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u009f\u0001"+
		"\u0000\u0000\u0000\u00a1!\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003\u001a"+
		"\r\u0000\u00a3\u00a4\u0005\u0017\u0000\u0000\u00a4\u00a5\u0003\u001a\r"+
		"\u0000\u00a5#\u0001\u0000\u0000\u0000\r%+3?GR\\gz\u0081\u008c\u0093\u00a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}