// Generated from /home/coti/Downloads/TecCompilacion2024-master(1)/TecCompilacion2024-master/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1

package compiladores;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class compiladoresLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, PA=3, PC=4, LLA=5, LLC=6, PYC=7, IGUAL=8, SUMA=9, RESTA=10, 
		MULT=11, DIV=12, MOD=13, INT=14, IF=15, FOR=16, WHILE=17, RETURN=18, ELSE=19, 
		NUMERO=20, ID=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "LETRA", "DIGITO", "WS", "PA", "PC", "LLA", "LLC", "PYC", "IGUAL", 
			"SUMA", "RESTA", "MULT", "DIV", "MOD", "INT", "IF", "FOR", "WHILE", "RETURN", 
			"ELSE", "NUMERO", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, "'('", "')'", "'{'", "'}'", "';'", "'='", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'int'", "'if'", "'for'", "'while'", "'return'", 
			"'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "WS", "PA", "PC", "LLA", "LLC", "PYC", "IGUAL", "SUMA", "RESTA", 
			"MULT", "DIV", "MOD", "INT", "IF", "FOR", "WHILE", "RETURN", "ELSE", 
			"NUMERO", "ID"
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


	public compiladoresLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compiladores.g4"; }

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
		"\u0004\u0000\u0015\u0080\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003"+
		"7\b\u0003\u000b\u0003\f\u00038\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0004\u0015"+
		"q\b\u0015\u000b\u0015\f\u0015r\u0001\u0016\u0001\u0016\u0003\u0016w\b"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016|\b\u0016\n\u0016"+
		"\f\u0016\u007f\t\u0016\u0000\u0000\u0017\u0001\u0001\u0003\u0000\u0005"+
		"\u0000\u0007\u0002\t\u0003\u000b\u0004\r\u0005\u000f\u0006\u0011\u0007"+
		"\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b\f\u001d\r\u001f\u000e!\u000f"+
		"#\u0010%\u0011\'\u0012)\u0013+\u0014-\u0015\u0001\u0000\u0003\u0002\u0000"+
		"AZaz\u0001\u000009\u0003\u0000\t\n\r\r  \u0083\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0001/\u0001\u0000\u0000\u0000\u0003"+
		"1\u0001\u0000\u0000\u0000\u00053\u0001\u0000\u0000\u0000\u00076\u0001"+
		"\u0000\u0000\u0000\t<\u0001\u0000\u0000\u0000\u000b>\u0001\u0000\u0000"+
		"\u0000\r@\u0001\u0000\u0000\u0000\u000fB\u0001\u0000\u0000\u0000\u0011"+
		"D\u0001\u0000\u0000\u0000\u0013F\u0001\u0000\u0000\u0000\u0015H\u0001"+
		"\u0000\u0000\u0000\u0017J\u0001\u0000\u0000\u0000\u0019L\u0001\u0000\u0000"+
		"\u0000\u001bN\u0001\u0000\u0000\u0000\u001dP\u0001\u0000\u0000\u0000\u001f"+
		"R\u0001\u0000\u0000\u0000!V\u0001\u0000\u0000\u0000#Y\u0001\u0000\u0000"+
		"\u0000%]\u0001\u0000\u0000\u0000\'c\u0001\u0000\u0000\u0000)j\u0001\u0000"+
		"\u0000\u0000+p\u0001\u0000\u0000\u0000-v\u0001\u0000\u0000\u0000/0\u0005"+
		",\u0000\u00000\u0002\u0001\u0000\u0000\u000012\u0007\u0000\u0000\u0000"+
		"2\u0004\u0001\u0000\u0000\u000034\u0007\u0001\u0000\u00004\u0006\u0001"+
		"\u0000\u0000\u000057\u0007\u0002\u0000\u000065\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:;\u0006\u0003\u0000\u0000;\b\u0001\u0000"+
		"\u0000\u0000<=\u0005(\u0000\u0000=\n\u0001\u0000\u0000\u0000>?\u0005)"+
		"\u0000\u0000?\f\u0001\u0000\u0000\u0000@A\u0005{\u0000\u0000A\u000e\u0001"+
		"\u0000\u0000\u0000BC\u0005}\u0000\u0000C\u0010\u0001\u0000\u0000\u0000"+
		"DE\u0005;\u0000\u0000E\u0012\u0001\u0000\u0000\u0000FG\u0005=\u0000\u0000"+
		"G\u0014\u0001\u0000\u0000\u0000HI\u0005+\u0000\u0000I\u0016\u0001\u0000"+
		"\u0000\u0000JK\u0005-\u0000\u0000K\u0018\u0001\u0000\u0000\u0000LM\u0005"+
		"*\u0000\u0000M\u001a\u0001\u0000\u0000\u0000NO\u0005/\u0000\u0000O\u001c"+
		"\u0001\u0000\u0000\u0000PQ\u0005%\u0000\u0000Q\u001e\u0001\u0000\u0000"+
		"\u0000RS\u0005i\u0000\u0000ST\u0005n\u0000\u0000TU\u0005t\u0000\u0000"+
		"U \u0001\u0000\u0000\u0000VW\u0005i\u0000\u0000WX\u0005f\u0000\u0000X"+
		"\"\u0001\u0000\u0000\u0000YZ\u0005f\u0000\u0000Z[\u0005o\u0000\u0000["+
		"\\\u0005r\u0000\u0000\\$\u0001\u0000\u0000\u0000]^\u0005w\u0000\u0000"+
		"^_\u0005h\u0000\u0000_`\u0005i\u0000\u0000`a\u0005l\u0000\u0000ab\u0005"+
		"e\u0000\u0000b&\u0001\u0000\u0000\u0000cd\u0005r\u0000\u0000de\u0005e"+
		"\u0000\u0000ef\u0005t\u0000\u0000fg\u0005u\u0000\u0000gh\u0005r\u0000"+
		"\u0000hi\u0005n\u0000\u0000i(\u0001\u0000\u0000\u0000jk\u0005e\u0000\u0000"+
		"kl\u0005l\u0000\u0000lm\u0005s\u0000\u0000mn\u0005e\u0000\u0000n*\u0001"+
		"\u0000\u0000\u0000oq\u0003\u0005\u0002\u0000po\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000s,\u0001\u0000\u0000\u0000tw\u0003\u0003\u0001\u0000uw\u0005_\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000vu\u0001\u0000\u0000\u0000w}\u0001\u0000"+
		"\u0000\u0000x|\u0003\u0003\u0001\u0000y|\u0003\u0005\u0002\u0000z|\u0005"+
		"_\u0000\u0000{x\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{z\u0001"+
		"\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~.\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u0006\u00008rv{}\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}