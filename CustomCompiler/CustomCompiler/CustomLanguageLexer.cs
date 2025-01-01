//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.13.1
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from d:/UNIV/ANUL_II/LFC - Limbaje Formale si Compilatoare/Custom-Compiler/CustomCompiler/CustomCompiler/CustomLanguage.g4 by ANTLR 4.13.1

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.13.1")]
[System.CLSCompliant(false)]
public partial class CustomLanguageLexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		OPENPTHS=1, CLOSEPTHS=2, OPENEDBLOCK=3, CLOSEDBLOCK=4, COMMA=5, SEMICOLON=6, 
		INTEGER_TYPE=7, FLOAT_TYPE=8, DOUBLE_TYPE=9, STRING_TYPE=10, VOID_TYPE=11, 
		RETURN=12, FOR_LOOP=13, WHILE_LOOP=14, ELSE_IF=15, IF=16, ELSE=17, INCREMENT=18, 
		DECREMENT=19, MUL=20, DIV=21, ADD=22, SUB=23, MOD=24, SMALLER_EQ=25, GREATER_EQ=26, 
		SAME=27, DIFF=28, SMALLER=29, GREATER=30, AND=31, NOT=32, OR=33, EQADD=34, 
		EQSUB=35, EQMUL=36, EQDIV=37, EQMOD=38, EQUAL=39, NAME=40, INTEGER_VALUE=41, 
		FLOAT_VALUE=42, STRING_VALUE=43, BLOCK_COMMENTARY=44, LINE_COMMENTARY=45, 
		WS=46;
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"OPENPTHS", "CLOSEPTHS", "OPENEDBLOCK", "CLOSEDBLOCK", "COMMA", "SEMICOLON", 
		"INTEGER_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "STRING_TYPE", "VOID_TYPE", 
		"RETURN", "FOR_LOOP", "WHILE_LOOP", "ELSE_IF", "IF", "ELSE", "INCREMENT", 
		"DECREMENT", "MUL", "DIV", "ADD", "SUB", "MOD", "SMALLER_EQ", "GREATER_EQ", 
		"SAME", "DIFF", "SMALLER", "GREATER", "AND", "NOT", "OR", "EQADD", "EQSUB", 
		"EQMUL", "EQDIV", "EQMOD", "EQUAL", "NAME", "INTEGER_VALUE", "FLOAT_VALUE", 
		"STRING_VALUE", "BLOCK_COMMENTARY", "LINE_COMMENTARY", "WS"
	};


	public CustomLanguageLexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public CustomLanguageLexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, "'('", "')'", "'{'", "'}'", "','", "';'", "'int'", "'float'", "'double'", 
		"'string'", "'void'", "'return'", "'for'", "'while'", "'else if'", "'if'", 
		"'else'", "'++'", "'--'", "'*'", "'/'", "'+'", "'-'", "'%'", "'<='", "'>='", 
		"'=='", "'!='", "'<'", "'>'", "'&&'", "'!'", "'||'", "'+='", "'-='", "'*='", 
		"'/='", "'%='", "'='"
	};
	private static readonly string[] _SymbolicNames = {
		null, "OPENPTHS", "CLOSEPTHS", "OPENEDBLOCK", "CLOSEDBLOCK", "COMMA", 
		"SEMICOLON", "INTEGER_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "STRING_TYPE", 
		"VOID_TYPE", "RETURN", "FOR_LOOP", "WHILE_LOOP", "ELSE_IF", "IF", "ELSE", 
		"INCREMENT", "DECREMENT", "MUL", "DIV", "ADD", "SUB", "MOD", "SMALLER_EQ", 
		"GREATER_EQ", "SAME", "DIFF", "SMALLER", "GREATER", "AND", "NOT", "OR", 
		"EQADD", "EQSUB", "EQMUL", "EQDIV", "EQMOD", "EQUAL", "NAME", "INTEGER_VALUE", 
		"FLOAT_VALUE", "STRING_VALUE", "BLOCK_COMMENTARY", "LINE_COMMENTARY", 
		"WS"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "CustomLanguage.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override int[] SerializedAtn { get { return _serializedATN; } }

	static CustomLanguageLexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static int[] _serializedATN = {
		4,0,46,299,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
		6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,2,14,
		7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,7,20,2,21,
		7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,26,2,27,7,27,2,28,
		7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,32,2,33,7,33,2,34,7,34,2,35,
		7,35,2,36,7,36,2,37,7,37,2,38,7,38,2,39,7,39,2,40,7,40,2,41,7,41,2,42,
		7,42,2,43,7,43,2,44,7,44,2,45,7,45,1,0,1,0,1,1,1,1,1,2,1,2,1,3,1,3,1,4,
		1,4,1,5,1,5,1,6,1,6,1,6,1,6,1,7,1,7,1,7,1,7,1,7,1,7,1,8,1,8,1,8,1,8,1,
		8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,1,9,1,9,1,10,1,10,1,10,1,10,1,10,1,11,1,
		11,1,11,1,11,1,11,1,11,1,11,1,12,1,12,1,12,1,12,1,13,1,13,1,13,1,13,1,
		13,1,13,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,15,1,15,1,15,1,16,1,
		16,1,16,1,16,1,16,1,17,1,17,1,17,1,18,1,18,1,18,1,19,1,19,1,20,1,20,1,
		21,1,21,1,22,1,22,1,23,1,23,1,24,1,24,1,24,1,25,1,25,1,25,1,26,1,26,1,
		26,1,27,1,27,1,27,1,28,1,28,1,29,1,29,1,30,1,30,1,30,1,31,1,31,1,32,1,
		32,1,32,1,33,1,33,1,33,1,34,1,34,1,34,1,35,1,35,1,35,1,36,1,36,1,36,1,
		37,1,37,1,37,1,38,1,38,1,39,1,39,5,39,227,8,39,10,39,12,39,230,9,39,1,
		40,3,40,233,8,40,1,40,4,40,236,8,40,11,40,12,40,237,1,41,3,41,241,8,41,
		1,41,4,41,244,8,41,11,41,12,41,245,1,41,1,41,4,41,250,8,41,11,41,12,41,
		251,1,42,1,42,1,42,1,42,4,42,258,8,42,11,42,12,42,259,1,42,3,42,263,8,
		42,1,43,1,43,1,43,1,43,4,43,269,8,43,11,43,12,43,270,1,43,1,43,4,43,275,
		8,43,11,43,12,43,276,1,43,1,43,1,44,1,44,1,44,1,44,4,44,285,8,44,11,44,
		12,44,286,1,44,1,44,1,44,1,44,1,45,4,45,294,8,45,11,45,12,45,295,1,45,
		1,45,3,259,270,286,0,46,1,1,3,2,5,3,7,4,9,5,11,6,13,7,15,8,17,9,19,10,
		21,11,23,12,25,13,27,14,29,15,31,16,33,17,35,18,37,19,39,20,41,21,43,22,
		45,23,47,24,49,25,51,26,53,27,55,28,57,29,59,30,61,31,63,32,65,33,67,34,
		69,35,71,36,73,37,75,38,77,39,79,40,81,41,83,42,85,43,87,44,89,45,91,46,
		1,0,6,2,0,65,90,97,122,3,0,48,57,65,90,97,122,2,0,43,43,45,45,1,0,48,57,
		1,0,10,10,3,0,9,10,13,13,32,32,310,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,
		0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,0,15,1,0,0,0,0,17,1,
		0,0,0,0,19,1,0,0,0,0,21,1,0,0,0,0,23,1,0,0,0,0,25,1,0,0,0,0,27,1,0,0,0,
		0,29,1,0,0,0,0,31,1,0,0,0,0,33,1,0,0,0,0,35,1,0,0,0,0,37,1,0,0,0,0,39,
		1,0,0,0,0,41,1,0,0,0,0,43,1,0,0,0,0,45,1,0,0,0,0,47,1,0,0,0,0,49,1,0,0,
		0,0,51,1,0,0,0,0,53,1,0,0,0,0,55,1,0,0,0,0,57,1,0,0,0,0,59,1,0,0,0,0,61,
		1,0,0,0,0,63,1,0,0,0,0,65,1,0,0,0,0,67,1,0,0,0,0,69,1,0,0,0,0,71,1,0,0,
		0,0,73,1,0,0,0,0,75,1,0,0,0,0,77,1,0,0,0,0,79,1,0,0,0,0,81,1,0,0,0,0,83,
		1,0,0,0,0,85,1,0,0,0,0,87,1,0,0,0,0,89,1,0,0,0,0,91,1,0,0,0,1,93,1,0,0,
		0,3,95,1,0,0,0,5,97,1,0,0,0,7,99,1,0,0,0,9,101,1,0,0,0,11,103,1,0,0,0,
		13,105,1,0,0,0,15,109,1,0,0,0,17,115,1,0,0,0,19,122,1,0,0,0,21,129,1,0,
		0,0,23,134,1,0,0,0,25,141,1,0,0,0,27,145,1,0,0,0,29,151,1,0,0,0,31,159,
		1,0,0,0,33,162,1,0,0,0,35,167,1,0,0,0,37,170,1,0,0,0,39,173,1,0,0,0,41,
		175,1,0,0,0,43,177,1,0,0,0,45,179,1,0,0,0,47,181,1,0,0,0,49,183,1,0,0,
		0,51,186,1,0,0,0,53,189,1,0,0,0,55,192,1,0,0,0,57,195,1,0,0,0,59,197,1,
		0,0,0,61,199,1,0,0,0,63,202,1,0,0,0,65,204,1,0,0,0,67,207,1,0,0,0,69,210,
		1,0,0,0,71,213,1,0,0,0,73,216,1,0,0,0,75,219,1,0,0,0,77,222,1,0,0,0,79,
		224,1,0,0,0,81,232,1,0,0,0,83,240,1,0,0,0,85,262,1,0,0,0,87,264,1,0,0,
		0,89,280,1,0,0,0,91,293,1,0,0,0,93,94,5,40,0,0,94,2,1,0,0,0,95,96,5,41,
		0,0,96,4,1,0,0,0,97,98,5,123,0,0,98,6,1,0,0,0,99,100,5,125,0,0,100,8,1,
		0,0,0,101,102,5,44,0,0,102,10,1,0,0,0,103,104,5,59,0,0,104,12,1,0,0,0,
		105,106,5,105,0,0,106,107,5,110,0,0,107,108,5,116,0,0,108,14,1,0,0,0,109,
		110,5,102,0,0,110,111,5,108,0,0,111,112,5,111,0,0,112,113,5,97,0,0,113,
		114,5,116,0,0,114,16,1,0,0,0,115,116,5,100,0,0,116,117,5,111,0,0,117,118,
		5,117,0,0,118,119,5,98,0,0,119,120,5,108,0,0,120,121,5,101,0,0,121,18,
		1,0,0,0,122,123,5,115,0,0,123,124,5,116,0,0,124,125,5,114,0,0,125,126,
		5,105,0,0,126,127,5,110,0,0,127,128,5,103,0,0,128,20,1,0,0,0,129,130,5,
		118,0,0,130,131,5,111,0,0,131,132,5,105,0,0,132,133,5,100,0,0,133,22,1,
		0,0,0,134,135,5,114,0,0,135,136,5,101,0,0,136,137,5,116,0,0,137,138,5,
		117,0,0,138,139,5,114,0,0,139,140,5,110,0,0,140,24,1,0,0,0,141,142,5,102,
		0,0,142,143,5,111,0,0,143,144,5,114,0,0,144,26,1,0,0,0,145,146,5,119,0,
		0,146,147,5,104,0,0,147,148,5,105,0,0,148,149,5,108,0,0,149,150,5,101,
		0,0,150,28,1,0,0,0,151,152,5,101,0,0,152,153,5,108,0,0,153,154,5,115,0,
		0,154,155,5,101,0,0,155,156,5,32,0,0,156,157,5,105,0,0,157,158,5,102,0,
		0,158,30,1,0,0,0,159,160,5,105,0,0,160,161,5,102,0,0,161,32,1,0,0,0,162,
		163,5,101,0,0,163,164,5,108,0,0,164,165,5,115,0,0,165,166,5,101,0,0,166,
		34,1,0,0,0,167,168,5,43,0,0,168,169,5,43,0,0,169,36,1,0,0,0,170,171,5,
		45,0,0,171,172,5,45,0,0,172,38,1,0,0,0,173,174,5,42,0,0,174,40,1,0,0,0,
		175,176,5,47,0,0,176,42,1,0,0,0,177,178,5,43,0,0,178,44,1,0,0,0,179,180,
		5,45,0,0,180,46,1,0,0,0,181,182,5,37,0,0,182,48,1,0,0,0,183,184,5,60,0,
		0,184,185,5,61,0,0,185,50,1,0,0,0,186,187,5,62,0,0,187,188,5,61,0,0,188,
		52,1,0,0,0,189,190,5,61,0,0,190,191,5,61,0,0,191,54,1,0,0,0,192,193,5,
		33,0,0,193,194,5,61,0,0,194,56,1,0,0,0,195,196,5,60,0,0,196,58,1,0,0,0,
		197,198,5,62,0,0,198,60,1,0,0,0,199,200,5,38,0,0,200,201,5,38,0,0,201,
		62,1,0,0,0,202,203,5,33,0,0,203,64,1,0,0,0,204,205,5,124,0,0,205,206,5,
		124,0,0,206,66,1,0,0,0,207,208,5,43,0,0,208,209,5,61,0,0,209,68,1,0,0,
		0,210,211,5,45,0,0,211,212,5,61,0,0,212,70,1,0,0,0,213,214,5,42,0,0,214,
		215,5,61,0,0,215,72,1,0,0,0,216,217,5,47,0,0,217,218,5,61,0,0,218,74,1,
		0,0,0,219,220,5,37,0,0,220,221,5,61,0,0,221,76,1,0,0,0,222,223,5,61,0,
		0,223,78,1,0,0,0,224,228,7,0,0,0,225,227,7,1,0,0,226,225,1,0,0,0,227,230,
		1,0,0,0,228,226,1,0,0,0,228,229,1,0,0,0,229,80,1,0,0,0,230,228,1,0,0,0,
		231,233,7,2,0,0,232,231,1,0,0,0,232,233,1,0,0,0,233,235,1,0,0,0,234,236,
		7,3,0,0,235,234,1,0,0,0,236,237,1,0,0,0,237,235,1,0,0,0,237,238,1,0,0,
		0,238,82,1,0,0,0,239,241,7,2,0,0,240,239,1,0,0,0,240,241,1,0,0,0,241,243,
		1,0,0,0,242,244,7,3,0,0,243,242,1,0,0,0,244,245,1,0,0,0,245,243,1,0,0,
		0,245,246,1,0,0,0,246,247,1,0,0,0,247,249,5,46,0,0,248,250,7,3,0,0,249,
		248,1,0,0,0,250,251,1,0,0,0,251,249,1,0,0,0,251,252,1,0,0,0,252,84,1,0,
		0,0,253,254,5,34,0,0,254,263,5,34,0,0,255,257,5,34,0,0,256,258,9,0,0,0,
		257,256,1,0,0,0,258,259,1,0,0,0,259,260,1,0,0,0,259,257,1,0,0,0,260,261,
		1,0,0,0,261,263,5,34,0,0,262,253,1,0,0,0,262,255,1,0,0,0,263,86,1,0,0,
		0,264,265,5,47,0,0,265,266,5,42,0,0,266,268,1,0,0,0,267,269,9,0,0,0,268,
		267,1,0,0,0,269,270,1,0,0,0,270,271,1,0,0,0,270,268,1,0,0,0,271,274,1,
		0,0,0,272,273,5,42,0,0,273,275,5,47,0,0,274,272,1,0,0,0,275,276,1,0,0,
		0,276,274,1,0,0,0,276,277,1,0,0,0,277,278,1,0,0,0,278,279,6,43,0,0,279,
		88,1,0,0,0,280,281,5,47,0,0,281,282,5,47,0,0,282,284,1,0,0,0,283,285,9,
		0,0,0,284,283,1,0,0,0,285,286,1,0,0,0,286,287,1,0,0,0,286,284,1,0,0,0,
		287,288,1,0,0,0,288,289,7,4,0,0,289,290,1,0,0,0,290,291,6,44,0,0,291,90,
		1,0,0,0,292,294,7,5,0,0,293,292,1,0,0,0,294,295,1,0,0,0,295,293,1,0,0,
		0,295,296,1,0,0,0,296,297,1,0,0,0,297,298,6,45,0,0,298,92,1,0,0,0,13,0,
		228,232,237,240,245,251,259,262,270,276,286,295,1,6,0,0
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
