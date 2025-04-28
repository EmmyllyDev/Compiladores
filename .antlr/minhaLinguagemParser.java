// Generated from c:/Compilador/minhaLinguagem.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class minhaLinguagemParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ESCREVER=3, LER=4, SE=5, ENTAO=6, SENAO=7, ENQUANTO=8, 
		FAÇA=9, FIM=10, INTEIRO=11, STRING=12, ID=13, NUMERO=14, OP_ARIT=15, OP_LOGICO=16, 
		OP_COMPARACAO=17, ABRE_PAR=18, FECHA_PAR=19, FINAL=20, ASPAS=21, ESP_BRANCO=22;
	public static final int
		RULE_programa = 0, RULE_comandos = 1, RULE_comando_ler = 2, RULE_comando_escrever = 3, 
		RULE_comando_condicional = 4, RULE_comando_repeticao = 5, RULE_comando_atribuicao = 6, 
		RULE_comando_declaracao = 7, RULE_tipo = 8, RULE_expressao = 9, RULE_expressao_aritmetica = 10, 
		RULE_termo = 11, RULE_expressao_logica = 12, RULE_fator_logico = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "comandos", "comando_ler", "comando_escrever", "comando_condicional", 
			"comando_repeticao", "comando_atribuicao", "comando_declaracao", "tipo", 
			"expressao", "expressao_aritmetica", "termo", "expressao_logica", "fator_logico"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'!'", "'escrever'", "'ler'", "'se'", "'entao'", "'senao'", 
			"'enquanto'", "'fa\\u00E7a'", "'fim'", "'inteiro'", "'string'", null, 
			null, null, null, null, "'('", "')'", "';'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "ESCREVER", "LER", "SE", "ENTAO", "SENAO", "ENQUANTO", 
			"FA\u0002A", "FIM", "INTEIRO", "STRING", "ID", "NUMERO", "OP_ARIT", "OP_LOGICO", 
			"OP_COMPARACAO", "ABRE_PAR", "FECHA_PAR", "FINAL", "ASPAS", "ESP_BRANCO"
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
	public String getGrammarFileName() { return "minhaLinguagem.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public minhaLinguagemParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode EOF() { return getToken(minhaLinguagemParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			comandos();
			setState(29);
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
	public static class ComandosContext extends ParserRuleContext {
		public List<Comando_lerContext> comando_ler() {
			return getRuleContexts(Comando_lerContext.class);
		}
		public Comando_lerContext comando_ler(int i) {
			return getRuleContext(Comando_lerContext.class,i);
		}
		public List<Comando_escreverContext> comando_escrever() {
			return getRuleContexts(Comando_escreverContext.class);
		}
		public Comando_escreverContext comando_escrever(int i) {
			return getRuleContext(Comando_escreverContext.class,i);
		}
		public List<Comando_condicionalContext> comando_condicional() {
			return getRuleContexts(Comando_condicionalContext.class);
		}
		public Comando_condicionalContext comando_condicional(int i) {
			return getRuleContext(Comando_condicionalContext.class,i);
		}
		public List<Comando_repeticaoContext> comando_repeticao() {
			return getRuleContexts(Comando_repeticaoContext.class);
		}
		public Comando_repeticaoContext comando_repeticao(int i) {
			return getRuleContext(Comando_repeticaoContext.class,i);
		}
		public List<Comando_atribuicaoContext> comando_atribuicao() {
			return getRuleContexts(Comando_atribuicaoContext.class);
		}
		public Comando_atribuicaoContext comando_atribuicao(int i) {
			return getRuleContext(Comando_atribuicaoContext.class,i);
		}
		public List<Comando_declaracaoContext> comando_declaracao() {
			return getRuleContexts(Comando_declaracaoContext.class);
		}
		public Comando_declaracaoContext comando_declaracao(int i) {
			return getRuleContext(Comando_declaracaoContext.class,i);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(37);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LER:
					{
					setState(31);
					comando_ler();
					}
					break;
				case ESCREVER:
					{
					setState(32);
					comando_escrever();
					}
					break;
				case SE:
					{
					setState(33);
					comando_condicional();
					}
					break;
				case ENQUANTO:
					{
					setState(34);
					comando_repeticao();
					}
					break;
				case ID:
					{
					setState(35);
					comando_atribuicao();
					}
					break;
				case INTEIRO:
				case STRING:
					{
					setState(36);
					comando_declaracao();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 14648L) != 0) );
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
		public TerminalNode LER() { return getToken(minhaLinguagemParser.LER, 0); }
		public TerminalNode ABRE_PAR() { return getToken(minhaLinguagemParser.ABRE_PAR, 0); }
		public TerminalNode ID() { return getToken(minhaLinguagemParser.ID, 0); }
		public TerminalNode FECHA_PAR() { return getToken(minhaLinguagemParser.FECHA_PAR, 0); }
		public TerminalNode FINAL() { return getToken(minhaLinguagemParser.FINAL, 0); }
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
			setState(41);
			match(LER);
			setState(42);
			match(ABRE_PAR);
			setState(43);
			match(ID);
			setState(44);
			match(FECHA_PAR);
			setState(45);
			match(FINAL);
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
		public TerminalNode ESCREVER() { return getToken(minhaLinguagemParser.ESCREVER, 0); }
		public TerminalNode ABRE_PAR() { return getToken(minhaLinguagemParser.ABRE_PAR, 0); }
		public TerminalNode FECHA_PAR() { return getToken(minhaLinguagemParser.FECHA_PAR, 0); }
		public TerminalNode FINAL() { return getToken(minhaLinguagemParser.FINAL, 0); }
		public List<TerminalNode> ASPAS() { return getTokens(minhaLinguagemParser.ASPAS); }
		public TerminalNode ASPAS(int i) {
			return getToken(minhaLinguagemParser.ASPAS, i);
		}
		public TerminalNode ID() { return getToken(minhaLinguagemParser.ID, 0); }
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
			setState(47);
			match(ESCREVER);
			setState(48);
			match(ABRE_PAR);
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASPAS:
				{
				setState(49);
				match(ASPAS);
				setState(50);
				match(ID);
				setState(51);
				match(ASPAS);
				}
				break;
			case ID:
				{
				setState(52);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(55);
			match(FECHA_PAR);
			setState(56);
			match(FINAL);
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
		public TerminalNode SE() { return getToken(minhaLinguagemParser.SE, 0); }
		public TerminalNode ABRE_PAR() { return getToken(minhaLinguagemParser.ABRE_PAR, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PAR() { return getToken(minhaLinguagemParser.FECHA_PAR, 0); }
		public TerminalNode ENTAO() { return getToken(minhaLinguagemParser.ENTAO, 0); }
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public TerminalNode FIM() { return getToken(minhaLinguagemParser.FIM, 0); }
		public TerminalNode SENAO() { return getToken(minhaLinguagemParser.SENAO, 0); }
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
			setState(58);
			match(SE);
			setState(59);
			match(ABRE_PAR);
			setState(60);
			expressao();
			setState(61);
			match(FECHA_PAR);
			setState(62);
			match(ENTAO);
			setState(63);
			comandos();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(64);
				match(SENAO);
				setState(65);
				comandos();
				}
			}

			setState(68);
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
		public TerminalNode ENQUANTO() { return getToken(minhaLinguagemParser.ENQUANTO, 0); }
		public TerminalNode ABRE_PAR() { return getToken(minhaLinguagemParser.ABRE_PAR, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PAR() { return getToken(minhaLinguagemParser.FECHA_PAR, 0); }
		public TerminalNode FAÇA() { return getToken(minhaLinguagemParser.FAÇA, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode FIM() { return getToken(minhaLinguagemParser.FIM, 0); }
		public Comando_repeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_repeticao; }
	}

	public final Comando_repeticaoContext comando_repeticao() throws RecognitionException {
		Comando_repeticaoContext _localctx = new Comando_repeticaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comando_repeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(ENQUANTO);
			setState(71);
			match(ABRE_PAR);
			setState(72);
			expressao();
			setState(73);
			match(FECHA_PAR);
			setState(74);
			match(FAÇA);
			setState(75);
			comandos();
			setState(76);
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
		public TerminalNode ID() { return getToken(minhaLinguagemParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(minhaLinguagemParser.FINAL, 0); }
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
			setState(78);
			match(ID);
			setState(79);
			match(T__0);
			setState(80);
			expressao();
			setState(81);
			match(FINAL);
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
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ABRE_PAR() { return getToken(minhaLinguagemParser.ABRE_PAR, 0); }
		public TerminalNode ID() { return getToken(minhaLinguagemParser.ID, 0); }
		public TerminalNode FECHA_PAR() { return getToken(minhaLinguagemParser.FECHA_PAR, 0); }
		public TerminalNode FINAL() { return getToken(minhaLinguagemParser.FINAL, 0); }
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
			setState(83);
			tipo();
			setState(84);
			match(ABRE_PAR);
			setState(85);
			match(ID);
			setState(86);
			match(FECHA_PAR);
			setState(87);
			match(FINAL);
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
		public TerminalNode INTEIRO() { return getToken(minhaLinguagemParser.INTEIRO, 0); }
		public TerminalNode STRING() { return getToken(minhaLinguagemParser.STRING, 0); }
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
			setState(89);
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
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				expressao_logica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
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
		public List<TerminalNode> OP_ARIT() { return getTokens(minhaLinguagemParser.OP_ARIT); }
		public TerminalNode OP_ARIT(int i) {
			return getToken(minhaLinguagemParser.OP_ARIT, i);
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
			setState(95);
			termo();
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_ARIT) {
				{
				{
				setState(96);
				match(OP_ARIT);
				setState(97);
				termo();
				}
				}
				setState(102);
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
		public TerminalNode NUMERO() { return getToken(minhaLinguagemParser.NUMERO, 0); }
		public TerminalNode ID() { return getToken(minhaLinguagemParser.ID, 0); }
		public TerminalNode ABRE_PAR() { return getToken(minhaLinguagemParser.ABRE_PAR, 0); }
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public TerminalNode FECHA_PAR() { return getToken(minhaLinguagemParser.FECHA_PAR, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_termo);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(NUMERO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(ID);
				}
				break;
			case ABRE_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(ABRE_PAR);
				setState(106);
				expressao_aritmetica();
				setState(107);
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
		public List<Expressao_aritmeticaContext> expressao_aritmetica() {
			return getRuleContexts(Expressao_aritmeticaContext.class);
		}
		public Expressao_aritmeticaContext expressao_aritmetica(int i) {
			return getRuleContext(Expressao_aritmeticaContext.class,i);
		}
		public TerminalNode OP_COMPARACAO() { return getToken(minhaLinguagemParser.OP_COMPARACAO, 0); }
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public List<TerminalNode> OP_LOGICO() { return getTokens(minhaLinguagemParser.OP_LOGICO); }
		public TerminalNode OP_LOGICO(int i) {
			return getToken(minhaLinguagemParser.OP_LOGICO, i);
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
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				expressao_aritmetica();
				setState(112);
				match(OP_COMPARACAO);
				setState(113);
				expressao_aritmetica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				fator_logico();
				{
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP_LOGICO) {
					{
					{
					setState(116);
					match(OP_LOGICO);
					setState(117);
					fator_logico();
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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
	public static class Fator_logicoContext extends ParserRuleContext {
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public Fator_logicoContext fator_logico() {
			return getRuleContext(Fator_logicoContext.class,0);
		}
		public TerminalNode ABRE_PAR() { return getToken(minhaLinguagemParser.ABRE_PAR, 0); }
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public TerminalNode FECHA_PAR() { return getToken(minhaLinguagemParser.FECHA_PAR, 0); }
		public TerminalNode ID() { return getToken(minhaLinguagemParser.ID, 0); }
		public TerminalNode NUMERO() { return getToken(minhaLinguagemParser.NUMERO, 0); }
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fator_logico);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				expressao_aritmetica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__1);
				setState(127);
				fator_logico();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(ABRE_PAR);
				setState(129);
				expressao_logica();
				setState(130);
				match(FECHA_PAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0016\u0089\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001&\b\u0001\u000b\u0001\f\u0001\'\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00036\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004C\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0003"+
		"\t^\b\t\u0001\n\u0001\n\u0001\n\u0005\nc\b\n\n\n\f\nf\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"n\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\fw\b\f\n\f\f\fz\t\f\u0003\f|\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0087\b\r\u0001\r\u0000\u0000"+
		"\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u0000\u0001\u0001\u0000\u000b\f\u008c\u0000\u001c\u0001\u0000\u0000"+
		"\u0000\u0002%\u0001\u0000\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u0006"+
		"/\u0001\u0000\u0000\u0000\b:\u0001\u0000\u0000\u0000\nF\u0001\u0000\u0000"+
		"\u0000\fN\u0001\u0000\u0000\u0000\u000eS\u0001\u0000\u0000\u0000\u0010"+
		"Y\u0001\u0000\u0000\u0000\u0012]\u0001\u0000\u0000\u0000\u0014_\u0001"+
		"\u0000\u0000\u0000\u0016m\u0001\u0000\u0000\u0000\u0018{\u0001\u0000\u0000"+
		"\u0000\u001a\u0086\u0001\u0000\u0000\u0000\u001c\u001d\u0003\u0002\u0001"+
		"\u0000\u001d\u001e\u0005\u0000\u0000\u0001\u001e\u0001\u0001\u0000\u0000"+
		"\u0000\u001f&\u0003\u0004\u0002\u0000 &\u0003\u0006\u0003\u0000!&\u0003"+
		"\b\u0004\u0000\"&\u0003\n\u0005\u0000#&\u0003\f\u0006\u0000$&\u0003\u000e"+
		"\u0007\u0000%\u001f\u0001\u0000\u0000\u0000% \u0001\u0000\u0000\u0000"+
		"%!\u0001\u0000\u0000\u0000%\"\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000%$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'%\u0001\u0000"+
		"\u0000\u0000\'(\u0001\u0000\u0000\u0000(\u0003\u0001\u0000\u0000\u0000"+
		")*\u0005\u0004\u0000\u0000*+\u0005\u0012\u0000\u0000+,\u0005\r\u0000\u0000"+
		",-\u0005\u0013\u0000\u0000-.\u0005\u0014\u0000\u0000.\u0005\u0001\u0000"+
		"\u0000\u0000/0\u0005\u0003\u0000\u000005\u0005\u0012\u0000\u000012\u0005"+
		"\u0015\u0000\u000023\u0005\r\u0000\u000036\u0005\u0015\u0000\u000046\u0005"+
		"\r\u0000\u000051\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u000067\u0001"+
		"\u0000\u0000\u000078\u0005\u0013\u0000\u000089\u0005\u0014\u0000\u0000"+
		"9\u0007\u0001\u0000\u0000\u0000:;\u0005\u0005\u0000\u0000;<\u0005\u0012"+
		"\u0000\u0000<=\u0003\u0012\t\u0000=>\u0005\u0013\u0000\u0000>?\u0005\u0006"+
		"\u0000\u0000?B\u0003\u0002\u0001\u0000@A\u0005\u0007\u0000\u0000AC\u0003"+
		"\u0002\u0001\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DE\u0005\n\u0000\u0000E\t\u0001\u0000\u0000"+
		"\u0000FG\u0005\b\u0000\u0000GH\u0005\u0012\u0000\u0000HI\u0003\u0012\t"+
		"\u0000IJ\u0005\u0013\u0000\u0000JK\u0005\t\u0000\u0000KL\u0003\u0002\u0001"+
		"\u0000LM\u0005\n\u0000\u0000M\u000b\u0001\u0000\u0000\u0000NO\u0005\r"+
		"\u0000\u0000OP\u0005\u0001\u0000\u0000PQ\u0003\u0012\t\u0000QR\u0005\u0014"+
		"\u0000\u0000R\r\u0001\u0000\u0000\u0000ST\u0003\u0010\b\u0000TU\u0005"+
		"\u0012\u0000\u0000UV\u0005\r\u0000\u0000VW\u0005\u0013\u0000\u0000WX\u0005"+
		"\u0014\u0000\u0000X\u000f\u0001\u0000\u0000\u0000YZ\u0007\u0000\u0000"+
		"\u0000Z\u0011\u0001\u0000\u0000\u0000[^\u0003\u0018\f\u0000\\^\u0003\u0014"+
		"\n\u0000][\u0001\u0000\u0000\u0000]\\\u0001\u0000\u0000\u0000^\u0013\u0001"+
		"\u0000\u0000\u0000_d\u0003\u0016\u000b\u0000`a\u0005\u000f\u0000\u0000"+
		"ac\u0003\u0016\u000b\u0000b`\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000e\u0015\u0001"+
		"\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gn\u0005\u000e\u0000\u0000"+
		"hn\u0005\r\u0000\u0000ij\u0005\u0012\u0000\u0000jk\u0003\u0014\n\u0000"+
		"kl\u0005\u0013\u0000\u0000ln\u0001\u0000\u0000\u0000mg\u0001\u0000\u0000"+
		"\u0000mh\u0001\u0000\u0000\u0000mi\u0001\u0000\u0000\u0000n\u0017\u0001"+
		"\u0000\u0000\u0000op\u0003\u0014\n\u0000pq\u0005\u0011\u0000\u0000qr\u0003"+
		"\u0014\n\u0000r|\u0001\u0000\u0000\u0000sx\u0003\u001a\r\u0000tu\u0005"+
		"\u0010\u0000\u0000uw\u0003\u001a\r\u0000vt\u0001\u0000\u0000\u0000wz\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{o\u0001\u0000\u0000"+
		"\u0000{s\u0001\u0000\u0000\u0000|\u0019\u0001\u0000\u0000\u0000}\u0087"+
		"\u0003\u0014\n\u0000~\u007f\u0005\u0002\u0000\u0000\u007f\u0087\u0003"+
		"\u001a\r\u0000\u0080\u0081\u0005\u0012\u0000\u0000\u0081\u0082\u0003\u0018"+
		"\f\u0000\u0082\u0083\u0005\u0013\u0000\u0000\u0083\u0087\u0001\u0000\u0000"+
		"\u0000\u0084\u0087\u0005\r\u0000\u0000\u0085\u0087\u0005\u000e\u0000\u0000"+
		"\u0086}\u0001\u0000\u0000\u0000\u0086~\u0001\u0000\u0000\u0000\u0086\u0080"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u001b\u0001\u0000\u0000\u0000\n%\'5B]d"+
		"mx{\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}