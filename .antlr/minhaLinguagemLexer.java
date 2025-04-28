// Generated from c:/Compilador/minhaLinguagem.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class minhaLinguagemLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ESCREVER=3, LER=4, SE=5, ENTAO=6, SENAO=7, ENQUANTO=8, 
		FAÇA=9, FIM=10, INTEIRO=11, STRING=12, ID=13, NUMERO=14, OP_ARIT=15, OP_LOGICO=16, 
		OP_COMPARACAO=17, ABRE_PAR=18, FECHA_PAR=19, FINAL=20, ASPAS=21, ESP_BRANCO=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "ESCREVER", "LER", "SE", "ENTAO", "SENAO", "ENQUANTO", 
			"FAÇA", "FIM", "INTEIRO", "STRING", "ID", "NUMERO", "OP_ARIT", "OP_LOGICO", 
			"OP_COMPARACAO", "ABRE_PAR", "FECHA_PAR", "FINAL", "ASPAS", "ESP_BRANCO"
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


	public minhaLinguagemLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "minhaLinguagem.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0016\u009c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0005\fq\b\f\n\f\f\ft\t\f\u0001\r\u0004\r"+
		"w\b\r\u000b\r\f\rx\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0081\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u008c\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0004"+
		"\u0015\u0097\b\u0015\u000b\u0015\f\u0015\u0098\u0001\u0015\u0001\u0015"+
		"\u0000\u0000\u0016\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016\u0001\u0000\u0006\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001"+
		"\u000009\u0003\u0000*+--//\u0002\u0000<<>>\u0003\u0000\t\n\r\r  \u00a3"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000\u0000\u0003/"+
		"\u0001\u0000\u0000\u0000\u00051\u0001\u0000\u0000\u0000\u0007:\u0001\u0000"+
		"\u0000\u0000\t>\u0001\u0000\u0000\u0000\u000bA\u0001\u0000\u0000\u0000"+
		"\rG\u0001\u0000\u0000\u0000\u000fM\u0001\u0000\u0000\u0000\u0011V\u0001"+
		"\u0000\u0000\u0000\u0013[\u0001\u0000\u0000\u0000\u0015_\u0001\u0000\u0000"+
		"\u0000\u0017g\u0001\u0000\u0000\u0000\u0019n\u0001\u0000\u0000\u0000\u001b"+
		"v\u0001\u0000\u0000\u0000\u001dz\u0001\u0000\u0000\u0000\u001f\u0080\u0001"+
		"\u0000\u0000\u0000!\u008b\u0001\u0000\u0000\u0000#\u008d\u0001\u0000\u0000"+
		"\u0000%\u008f\u0001\u0000\u0000\u0000\'\u0091\u0001\u0000\u0000\u0000"+
		")\u0093\u0001\u0000\u0000\u0000+\u0096\u0001\u0000\u0000\u0000-.\u0005"+
		"=\u0000\u0000.\u0002\u0001\u0000\u0000\u0000/0\u0005!\u0000\u00000\u0004"+
		"\u0001\u0000\u0000\u000012\u0005e\u0000\u000023\u0005s\u0000\u000034\u0005"+
		"c\u0000\u000045\u0005r\u0000\u000056\u0005e\u0000\u000067\u0005v\u0000"+
		"\u000078\u0005e\u0000\u000089\u0005r\u0000\u00009\u0006\u0001\u0000\u0000"+
		"\u0000:;\u0005l\u0000\u0000;<\u0005e\u0000\u0000<=\u0005r\u0000\u0000"+
		"=\b\u0001\u0000\u0000\u0000>?\u0005s\u0000\u0000?@\u0005e\u0000\u0000"+
		"@\n\u0001\u0000\u0000\u0000AB\u0005e\u0000\u0000BC\u0005n\u0000\u0000"+
		"CD\u0005t\u0000\u0000DE\u0005a\u0000\u0000EF\u0005o\u0000\u0000F\f\u0001"+
		"\u0000\u0000\u0000GH\u0005s\u0000\u0000HI\u0005e\u0000\u0000IJ\u0005n"+
		"\u0000\u0000JK\u0005a\u0000\u0000KL\u0005o\u0000\u0000L\u000e\u0001\u0000"+
		"\u0000\u0000MN\u0005e\u0000\u0000NO\u0005n\u0000\u0000OP\u0005q\u0000"+
		"\u0000PQ\u0005u\u0000\u0000QR\u0005a\u0000\u0000RS\u0005n\u0000\u0000"+
		"ST\u0005t\u0000\u0000TU\u0005o\u0000\u0000U\u0010\u0001\u0000\u0000\u0000"+
		"VW\u0005f\u0000\u0000WX\u0005a\u0000\u0000XY\u0005\u00e7\u0000\u0000Y"+
		"Z\u0005a\u0000\u0000Z\u0012\u0001\u0000\u0000\u0000[\\\u0005f\u0000\u0000"+
		"\\]\u0005i\u0000\u0000]^\u0005m\u0000\u0000^\u0014\u0001\u0000\u0000\u0000"+
		"_`\u0005i\u0000\u0000`a\u0005n\u0000\u0000ab\u0005t\u0000\u0000bc\u0005"+
		"e\u0000\u0000cd\u0005i\u0000\u0000de\u0005r\u0000\u0000ef\u0005o\u0000"+
		"\u0000f\u0016\u0001\u0000\u0000\u0000gh\u0005s\u0000\u0000hi\u0005t\u0000"+
		"\u0000ij\u0005r\u0000\u0000jk\u0005i\u0000\u0000kl\u0005n\u0000\u0000"+
		"lm\u0005g\u0000\u0000m\u0018\u0001\u0000\u0000\u0000nr\u0007\u0000\u0000"+
		"\u0000oq\u0007\u0001\u0000\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000"+
		"\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\u001a"+
		"\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uw\u0007\u0002\u0000"+
		"\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y\u001c\u0001\u0000\u0000\u0000"+
		"z{\u0007\u0003\u0000\u0000{\u001e\u0001\u0000\u0000\u0000|}\u0005&\u0000"+
		"\u0000}\u0081\u0005&\u0000\u0000~\u007f\u0005|\u0000\u0000\u007f\u0081"+
		"\u0005|\u0000\u0000\u0080|\u0001\u0000\u0000\u0000\u0080~\u0001\u0000"+
		"\u0000\u0000\u0081 \u0001\u0000\u0000\u0000\u0082\u0083\u0005=\u0000\u0000"+
		"\u0083\u008c\u0005=\u0000\u0000\u0084\u0085\u0005!\u0000\u0000\u0085\u008c"+
		"\u0005=\u0000\u0000\u0086\u008c\u0007\u0004\u0000\u0000\u0087\u0088\u0005"+
		"<\u0000\u0000\u0088\u008c\u0005=\u0000\u0000\u0089\u008a\u0005>\u0000"+
		"\u0000\u008a\u008c\u0005=\u0000\u0000\u008b\u0082\u0001\u0000\u0000\u0000"+
		"\u008b\u0084\u0001\u0000\u0000\u0000\u008b\u0086\u0001\u0000\u0000\u0000"+
		"\u008b\u0087\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008c\"\u0001\u0000\u0000\u0000\u008d\u008e\u0005(\u0000\u0000\u008e"+
		"$\u0001\u0000\u0000\u0000\u008f\u0090\u0005)\u0000\u0000\u0090&\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0005;\u0000\u0000\u0092(\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0005\"\u0000\u0000\u0094*\u0001\u0000\u0000\u0000"+
		"\u0095\u0097\u0007\u0005\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0006\u0015\u0000\u0000\u009b,\u0001\u0000\u0000\u0000\u0006"+
		"\u0000rx\u0080\u008b\u0098\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}