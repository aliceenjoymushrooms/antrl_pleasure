// Generated from ./src/parser/grammar/Grammar.g4 by ANTLR 4.7.2

package compiler.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TRUE=2, FALSE=3, READ=4, WRITE=5, IF=6, ELSE=7, STR=8, VAR=9, 
		GR=10, LS=11, EQ=12, GRT=13, LST=14, NEQ=15, ATR=16, OEX=17, CEX=18, OBL=19, 
		CBL=20, NOT=21, ADD=22, SUB=23, MUL=24, DIV=25, MOD=26, NUM=27, EOL=28, 
		COMMENT=29, LINE_COMMENT=30, WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "TRUE", "FALSE", "READ", "WRITE", "IF", "ELSE", "STR", "VAR", 
			"GR", "LS", "EQ", "GRT", "LST", "NEQ", "ATR", "OEX", "CEX", "OBL", "CBL", 
			"NOT", "ADD", "SUB", "MUL", "DIV", "MOD", "NUM", "EOL", "COMMENT", "LINE_COMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'true'", "'false'", "'read'", "'write'", "'if'", "'else'", 
			null, null, "'>'", "'<'", "'=='", "'>='", "'<='", "'!='", "'='", "'('", 
			"')'", "'{'", "'}'", null, "'+'", "'-'", "'*'", "'/'", "'%'", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "TRUE", "FALSE", "READ", "WRITE", "IF", "ELSE", "STR", "VAR", 
			"GR", "LS", "EQ", "GRT", "LST", "NEQ", "ATR", "OEX", "CEX", "OBL", "CBL", 
			"NOT", "ADD", "SUB", "MUL", "DIV", "MOD", "NUM", "EOL", "COMMENT", "LINE_COMMENT", 
			"WS"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00cd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\7\td\n"+
		"\t\f\t\16\tg\13\t\3\t\3\t\3\n\3\n\7\nm\n\n\f\n\16\np\13\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0090"+
		"\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\5\34\u009d"+
		"\n\34\3\34\6\34\u00a0\n\34\r\34\16\34\u00a1\3\34\3\34\6\34\u00a6\n\34"+
		"\r\34\16\34\u00a7\5\34\u00aa\n\34\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u00b2"+
		"\n\36\f\36\16\36\u00b5\13\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\7\37\u00c0\n\37\f\37\16\37\u00c3\13\37\3\37\3\37\3 \6 \u00c8\n \r"+
		" \16 \u00c9\3 \3 \3\u00b3\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!\3\2\t\6\2\f\f\17\17$$^^\4\2C\\c|\6\2"+
		"\62;C\\aac|\4\2--//\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u00d6\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7H\3\2\2\2\tN\3\2\2\2"+
		"\13S\3\2\2\2\rY\3\2\2\2\17\\\3\2\2\2\21a\3\2\2\2\23j\3\2\2\2\25q\3\2\2"+
		"\2\27s\3\2\2\2\31u\3\2\2\2\33x\3\2\2\2\35{\3\2\2\2\37~\3\2\2\2!\u0081"+
		"\3\2\2\2#\u0083\3\2\2\2%\u0085\3\2\2\2\'\u0087\3\2\2\2)\u0089\3\2\2\2"+
		"+\u008f\3\2\2\2-\u0091\3\2\2\2/\u0093\3\2\2\2\61\u0095\3\2\2\2\63\u0097"+
		"\3\2\2\2\65\u0099\3\2\2\2\67\u009c\3\2\2\29\u00ab\3\2\2\2;\u00ad\3\2\2"+
		"\2=\u00bb\3\2\2\2?\u00c7\3\2\2\2AB\7#\2\2B\4\3\2\2\2CD\7v\2\2DE\7t\2\2"+
		"EF\7w\2\2FG\7g\2\2G\6\3\2\2\2HI\7h\2\2IJ\7c\2\2JK\7n\2\2KL\7u\2\2LM\7"+
		"g\2\2M\b\3\2\2\2NO\7t\2\2OP\7g\2\2PQ\7c\2\2QR\7f\2\2R\n\3\2\2\2ST\7y\2"+
		"\2TU\7t\2\2UV\7k\2\2VW\7v\2\2WX\7g\2\2X\f\3\2\2\2YZ\7k\2\2Z[\7h\2\2[\16"+
		"\3\2\2\2\\]\7g\2\2]^\7n\2\2^_\7u\2\2_`\7g\2\2`\20\3\2\2\2ae\7$\2\2bd\n"+
		"\2\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7"+
		"$\2\2i\22\3\2\2\2jn\t\3\2\2km\t\4\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no"+
		"\3\2\2\2o\24\3\2\2\2pn\3\2\2\2qr\7@\2\2r\26\3\2\2\2st\7>\2\2t\30\3\2\2"+
		"\2uv\7?\2\2vw\7?\2\2w\32\3\2\2\2xy\7@\2\2yz\7?\2\2z\34\3\2\2\2{|\7>\2"+
		"\2|}\7?\2\2}\36\3\2\2\2~\177\7#\2\2\177\u0080\7?\2\2\u0080 \3\2\2\2\u0081"+
		"\u0082\7?\2\2\u0082\"\3\2\2\2\u0083\u0084\7*\2\2\u0084$\3\2\2\2\u0085"+
		"\u0086\7+\2\2\u0086&\3\2\2\2\u0087\u0088\7}\2\2\u0088(\3\2\2\2\u0089\u008a"+
		"\7\177\2\2\u008a*\3\2\2\2\u008b\u0090\7#\2\2\u008c\u008d\7P\2\2\u008d"+
		"\u008e\7Q\2\2\u008e\u0090\7V\2\2\u008f\u008b\3\2\2\2\u008f\u008c\3\2\2"+
		"\2\u0090,\3\2\2\2\u0091\u0092\7-\2\2\u0092.\3\2\2\2\u0093\u0094\7/\2\2"+
		"\u0094\60\3\2\2\2\u0095\u0096\7,\2\2\u0096\62\3\2\2\2\u0097\u0098\7\61"+
		"\2\2\u0098\64\3\2\2\2\u0099\u009a\7\'\2\2\u009a\66\3\2\2\2\u009b\u009d"+
		"\t\5\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e"+
		"\u00a0\t\6\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a9\3\2\2\2\u00a3\u00a5\7\60\2\2\u00a4"+
		"\u00a6\t\6\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a3\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa8\3\2\2\2\u00ab\u00ac\7=\2\2\u00ac:\3\2\2\2\u00ad"+
		"\u00ae\7\61\2\2\u00ae\u00af\7,\2\2\u00af\u00b3\3\2\2\2\u00b0\u00b2\13"+
		"\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7,"+
		"\2\2\u00b7\u00b8\7\61\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b\36\2\2\u00ba"+
		"<\3\2\2\2\u00bb\u00bc\7\61\2\2\u00bc\u00bd\7\61\2\2\u00bd\u00c1\3\2\2"+
		"\2\u00be\u00c0\n\7\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c5\b\37\2\2\u00c5>\3\2\2\2\u00c6\u00c8\t\b\2\2\u00c7\u00c6\3\2\2\2"+
		"\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00cc\b \2\2\u00cc@\3\2\2\2\r\2en\u008f\u009c\u00a1\u00a7"+
		"\u00a9\u00b3\u00c1\u00c9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}