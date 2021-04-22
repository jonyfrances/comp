// Generated from /home/gamer/Desktop/Comp/Interpreter_1/src/algLexer.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class algLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, BOOL=2, FLOAT=3, STRING=4, VOID=5, SIZEOF=6, NULL=7, ALG=8, TRUE=9, 
		FALSE=10, WHILE=11, DO=12, FINALLY=13, LEAVE=14, RESTART=15, RETURN=16, 
		IF=17, THEN=18, ELSE=19, WRITE=20, WRITELN=21, NEXTLINE=22, CARRIAGE_RETURN=23, 
		SPACE=24, TAB=25, EXP_COMMENT=26, OP_COMMENT=27, DELIMITER_COMMA=28, TERMINATOR=29, 
		DELIMITER_LPAR=30, DELIMITER_RPAR=31, IDENT=32, LITERAL_INT=33, LITERAL_REAL=34, 
		STRINGS=35, SQUARE_LBRACKET=36, SQUARE_RBRACKET=37, PLUS=38, MINUS=39, 
		QUESTION_MARK=40, PERCENTAGE=41, GREATER_THAN=42, LESS_THAN=43, GREATER_OR_EQUAL_THAN=44, 
		LESS_OR_EQUAL_THAN=45, EQUAL_TO=46, NOT_EQUAL_TO=47, TILDE=48, AND_OPERATOR=49, 
		OR_OPERATOR=50, EQUAL=51, SHIFT_RIGHT=52, AT_SIGN=53, ASTERISK=54, FORWARD_SLASH=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "BOOL", "FLOAT", "STRING", "VOID", "SIZEOF", "NULL", "ALG", "TRUE", 
			"FALSE", "WHILE", "DO", "FINALLY", "LEAVE", "RESTART", "RETURN", "IF", 
			"THEN", "ELSE", "WRITE", "WRITELN", "NEXTLINE", "CARRIAGE_RETURN", "SPACE", 
			"TAB", "EXP_COMMENT", "OP_COMMENT", "DELIMITER_COMMA", "TERMINATOR", 
			"DELIMITER_LPAR", "DELIMITER_RPAR", "IDENT", "LITERAL_INT", "LITERAL_REAL", 
			"STRINGS", "SQUARE_LBRACKET", "SQUARE_RBRACKET", "PLUS", "MINUS", "QUESTION_MARK", 
			"PERCENTAGE", "GREATER_THAN", "LESS_THAN", "GREATER_OR_EQUAL_THAN", "LESS_OR_EQUAL_THAN", 
			"EQUAL_TO", "NOT_EQUAL_TO", "TILDE", "AND_OPERATOR", "OR_OPERATOR", "EQUAL", 
			"SHIFT_RIGHT", "AT_SIGN", "ASTERISK", "FORWARD_SLASH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'bool'", "'float'", "'string'", "'void'", "'sizeof'", 
			"'null'", "'alg'", "'true'", "'false'", "'while'", "'do'", "'finally'", 
			"'leave'", "'restart'", "'return'", "'if'", "'then'", "'else'", "'write'", 
			"'writeln'", "'\n'", "'\r'", "' '", "'\t'", null, null, "','", "';'", 
			"'('", "')'", null, null, null, null, "'['", "']'", "'+'", "'-'", "'?'", 
			"'%'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'~'", "'&&'", "'||'", 
			"'='", "'>>'", "'@'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "BOOL", "FLOAT", "STRING", "VOID", "SIZEOF", "NULL", "ALG", 
			"TRUE", "FALSE", "WHILE", "DO", "FINALLY", "LEAVE", "RESTART", "RETURN", 
			"IF", "THEN", "ELSE", "WRITE", "WRITELN", "NEXTLINE", "CARRIAGE_RETURN", 
			"SPACE", "TAB", "EXP_COMMENT", "OP_COMMENT", "DELIMITER_COMMA", "TERMINATOR", 
			"DELIMITER_LPAR", "DELIMITER_RPAR", "IDENT", "LITERAL_INT", "LITERAL_REAL", 
			"STRINGS", "SQUARE_LBRACKET", "SQUARE_RBRACKET", "PLUS", "MINUS", "QUESTION_MARK", 
			"PERCENTAGE", "GREATER_THAN", "LESS_THAN", "GREATER_OR_EQUAL_THAN", "LESS_OR_EQUAL_THAN", 
			"EQUAL_TO", "NOT_EQUAL_TO", "TILDE", "AND_OPERATOR", "OR_OPERATOR", "EQUAL", 
			"SHIFT_RIGHT", "AT_SIGN", "ASTERISK", "FORWARD_SLASH"
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


	public algLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "algLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0174\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u00fd\n\33\f\33"+
		"\16\33\u0100\13\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u0108\n\34\f\34"+
		"\16\34\u010b\13\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\7!\u011a\n!\f!\16!\u011d\13!\3\"\3\"\7\"\u0121\n\"\f\"\16\"\u0124"+
		"\13\"\3\"\5\"\u0127\n\"\3#\3#\3#\6#\u012c\n#\r#\16#\u012d\5#\u0130\n#"+
		"\3#\3#\5#\u0134\n#\3#\5#\u0137\n#\3$\3$\3$\3$\7$\u013d\n$\f$\16$\u0140"+
		"\13$\3$\3$\5$\u0144\n$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,"+
		"\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\5\u00fe"+
		"\u0109\u013e\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9\3\2\13\5\2C\\c|\u0082\u0101\7\2\62;C\\aac|\u0082\u0101"+
		"\3\2\63;\3\2\62;\4\2GGgg\4\2--//\3\2))\3\2\2\2\3\2\u0080\u0080\2\u017e"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\3q\3\2\2\2\5u\3\2\2\2\7z\3\2\2\2\t\u0080\3\2\2\2\13\u0087"+
		"\3\2\2\2\r\u008c\3\2\2\2\17\u0093\3\2\2\2\21\u0098\3\2\2\2\23\u009c\3"+
		"\2\2\2\25\u00a1\3\2\2\2\27\u00a7\3\2\2\2\31\u00ad\3\2\2\2\33\u00b0\3\2"+
		"\2\2\35\u00b8\3\2\2\2\37\u00be\3\2\2\2!\u00c6\3\2\2\2#\u00cd\3\2\2\2%"+
		"\u00d0\3\2\2\2\'\u00d5\3\2\2\2)\u00da\3\2\2\2+\u00e0\3\2\2\2-\u00e8\3"+
		"\2\2\2/\u00ec\3\2\2\2\61\u00f0\3\2\2\2\63\u00f4\3\2\2\2\65\u00f8\3\2\2"+
		"\2\67\u0103\3\2\2\29\u010f\3\2\2\2;\u0111\3\2\2\2=\u0113\3\2\2\2?\u0115"+
		"\3\2\2\2A\u0117\3\2\2\2C\u0126\3\2\2\2E\u0128\3\2\2\2G\u0143\3\2\2\2I"+
		"\u0145\3\2\2\2K\u0147\3\2\2\2M\u0149\3\2\2\2O\u014b\3\2\2\2Q\u014d\3\2"+
		"\2\2S\u014f\3\2\2\2U\u0151\3\2\2\2W\u0153\3\2\2\2Y\u0155\3\2\2\2[\u0158"+
		"\3\2\2\2]\u015b\3\2\2\2_\u015e\3\2\2\2a\u0161\3\2\2\2c\u0163\3\2\2\2e"+
		"\u0166\3\2\2\2g\u0169\3\2\2\2i\u016b\3\2\2\2k\u016e\3\2\2\2m\u0170\3\2"+
		"\2\2o\u0172\3\2\2\2qr\7k\2\2rs\7p\2\2st\7v\2\2t\4\3\2\2\2uv\7d\2\2vw\7"+
		"q\2\2wx\7q\2\2xy\7n\2\2y\6\3\2\2\2z{\7h\2\2{|\7n\2\2|}\7q\2\2}~\7c\2\2"+
		"~\177\7v\2\2\177\b\3\2\2\2\u0080\u0081\7u\2\2\u0081\u0082\7v\2\2\u0082"+
		"\u0083\7t\2\2\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085\u0086\7i\2\2"+
		"\u0086\n\3\2\2\2\u0087\u0088\7x\2\2\u0088\u0089\7q\2\2\u0089\u008a\7k"+
		"\2\2\u008a\u008b\7f\2\2\u008b\f\3\2\2\2\u008c\u008d\7u\2\2\u008d\u008e"+
		"\7k\2\2\u008e\u008f\7|\2\2\u008f\u0090\7g\2\2\u0090\u0091\7q\2\2\u0091"+
		"\u0092\7h\2\2\u0092\16\3\2\2\2\u0093\u0094\7p\2\2\u0094\u0095\7w\2\2\u0095"+
		"\u0096\7n\2\2\u0096\u0097\7n\2\2\u0097\20\3\2\2\2\u0098\u0099\7c\2\2\u0099"+
		"\u009a\7n\2\2\u009a\u009b\7i\2\2\u009b\22\3\2\2\2\u009c\u009d\7v\2\2\u009d"+
		"\u009e\7t\2\2\u009e\u009f\7w\2\2\u009f\u00a0\7g\2\2\u00a0\24\3\2\2\2\u00a1"+
		"\u00a2\7h\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7u\2\2"+
		"\u00a5\u00a6\7g\2\2\u00a6\26\3\2\2\2\u00a7\u00a8\7y\2\2\u00a8\u00a9\7"+
		"j\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7g\2\2\u00ac\30"+
		"\3\2\2\2\u00ad\u00ae\7f\2\2\u00ae\u00af\7q\2\2\u00af\32\3\2\2\2\u00b0"+
		"\u00b1\7h\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7c\2\2"+
		"\u00b4\u00b5\7n\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7{\2\2\u00b7\34\3\2"+
		"\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc"+
		"\7x\2\2\u00bc\u00bd\7g\2\2\u00bd\36\3\2\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0"+
		"\7g\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7c\2\2\u00c3"+
		"\u00c4\7t\2\2\u00c4\u00c5\7v\2\2\u00c5 \3\2\2\2\u00c6\u00c7\7t\2\2\u00c7"+
		"\u00c8\7g\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7w\2\2\u00ca\u00cb\7t\2\2"+
		"\u00cb\u00cc\7p\2\2\u00cc\"\3\2\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7h"+
		"\2\2\u00cf$\3\2\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7j\2\2\u00d2\u00d3"+
		"\7g\2\2\u00d3\u00d4\7p\2\2\u00d4&\3\2\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7"+
		"\7n\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7g\2\2\u00d9(\3\2\2\2\u00da\u00db"+
		"\7y\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7v\2\2\u00de"+
		"\u00df\7g\2\2\u00df*\3\2\2\2\u00e0\u00e1\7y\2\2\u00e1\u00e2\7t\2\2\u00e2"+
		"\u00e3\7k\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7n\2\2"+
		"\u00e6\u00e7\7p\2\2\u00e7,\3\2\2\2\u00e8\u00e9\7\f\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00eb\b\27\2\2\u00eb.\3\2\2\2\u00ec\u00ed\7\17\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u00ef\b\30\2\2\u00ef\60\3\2\2\2\u00f0\u00f1\7\"\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\b\31\2\2\u00f3\62\3\2\2\2\u00f4\u00f5\7\13"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\b\32\2\2\u00f7\64\3\2\2\2\u00f8\u00f9"+
		"\7%\2\2\u00f9\u00fa\7%\2\2\u00fa\u00fe\3\2\2\2\u00fb\u00fd\13\2\2\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00ff\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7\f\2\2\u0102"+
		"\66\3\2\2\2\u0103\u0104\7*\2\2\u0104\u0105\7,\2\2\u0105\u0109\3\2\2\2"+
		"\u0106\u0108\13\2\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c"+
		"\u010d\7,\2\2\u010d\u010e\7+\2\2\u010e8\3\2\2\2\u010f\u0110\7.\2\2\u0110"+
		":\3\2\2\2\u0111\u0112\7=\2\2\u0112<\3\2\2\2\u0113\u0114\7*\2\2\u0114>"+
		"\3\2\2\2\u0115\u0116\7+\2\2\u0116@\3\2\2\2\u0117\u011b\t\2\2\2\u0118\u011a"+
		"\t\3\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011cB\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0122\t\4\2\2"+
		"\u011f\u0121\t\5\2\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0127\3\2\2\2\u0124\u0122\3\2\2\2\u0125"+
		"\u0127\7\62\2\2\u0126\u011e\3\2\2\2\u0126\u0125\3\2\2\2\u0127D\3\2\2\2"+
		"\u0128\u012f\5C\"\2\u0129\u012b\7\60\2\2\u012a\u012c\t\5\2\2\u012b\u012a"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u0130\3\2\2\2\u012f\u0129\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0136\3\2"+
		"\2\2\u0131\u0133\t\6\2\2\u0132\u0134\t\7\2\2\u0133\u0132\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\5C\"\2\u0136\u0131\3\2"+
		"\2\2\u0136\u0137\3\2\2\2\u0137F\3\2\2\2\u0138\u0139\t\b\2\2\u0139\u0144"+
		"\t\b\2\2\u013a\u013e\t\b\2\2\u013b\u013d\n\t\2\2\u013c\u013b\3\2\2\2\u013d"+
		"\u0140\3\2\2\2\u013e\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0141\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0141\u0142\n\n\2\2\u0142\u0144\t\b\2\2\u0143"+
		"\u0138\3\2\2\2\u0143\u013a\3\2\2\2\u0144H\3\2\2\2\u0145\u0146\7]\2\2\u0146"+
		"J\3\2\2\2\u0147\u0148\7_\2\2\u0148L\3\2\2\2\u0149\u014a\7-\2\2\u014aN"+
		"\3\2\2\2\u014b\u014c\7/\2\2\u014cP\3\2\2\2\u014d\u014e\7A\2\2\u014eR\3"+
		"\2\2\2\u014f\u0150\7\'\2\2\u0150T\3\2\2\2\u0151\u0152\7@\2\2\u0152V\3"+
		"\2\2\2\u0153\u0154\7>\2\2\u0154X\3\2\2\2\u0155\u0156\7@\2\2\u0156\u0157"+
		"\7?\2\2\u0157Z\3\2\2\2\u0158\u0159\7>\2\2\u0159\u015a\7?\2\2\u015a\\\3"+
		"\2\2\2\u015b\u015c\7?\2\2\u015c\u015d\7?\2\2\u015d^\3\2\2\2\u015e\u015f"+
		"\7#\2\2\u015f\u0160\7?\2\2\u0160`\3\2\2\2\u0161\u0162\7\u0080\2\2\u0162"+
		"b\3\2\2\2\u0163\u0164\7(\2\2\u0164\u0165\7(\2\2\u0165d\3\2\2\2\u0166\u0167"+
		"\7~\2\2\u0167\u0168\7~\2\2\u0168f\3\2\2\2\u0169\u016a\7?\2\2\u016ah\3"+
		"\2\2\2\u016b\u016c\7@\2\2\u016c\u016d\7@\2\2\u016dj\3\2\2\2\u016e\u016f"+
		"\7B\2\2\u016fl\3\2\2\2\u0170\u0171\7,\2\2\u0171n\3\2\2\2\u0172\u0173\7"+
		"\61\2\2\u0173p\3\2\2\2\16\2\u00fe\u0109\u011b\u0122\u0126\u012d\u012f"+
		"\u0133\u0136\u013e\u0143\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}