// Generated from d:/UNIV/ANUL_II/LFC - Limbaje Formale si Compilatoare/Custom-Compiler/CustomCompiler/CustomCompiler/CustomLanguage.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CustomLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPENPTHS=1, CLOSEPTHS=2, OPENEDBLOCK=3, CLOSEDBLOCK=4, COMMA=5, SEMICOLON=6, 
		INTEGER_TYPE=7, FLOAT_TYPE=8, DOUBLE_TYPE=9, STRING_TYPE=10, VOID_TYPE=11, 
		RETURN=12, FOR_LOOP=13, WHILE_LOOP=14, ELSE_IF=15, IF=16, ELSE=17, INCREMENT=18, 
		DECREMENT=19, MUL=20, DIV=21, ADD=22, SUB=23, MOD=24, SMALLER_EQ=25, GREATER_EQ=26, 
		SAME=27, DIFF=28, SMALLER=29, GREATER=30, AND=31, NOT=32, OR=33, EQADD=34, 
		EQSUB=35, EQMUL=36, EQDIV=37, EQMOD=38, EQUAL=39, NAME=40, INTEGER_VALUE=41, 
		FLOAT_VALUE=42, STRING_VALUE=43, BLOCK_COMMENTARY=44, LINE_COMMENTARY=45, 
		WS=46;
	public static final int
		RULE_base_structure = 0, RULE_global = 1, RULE_global_var = 2, RULE_func_decl = 3, 
		RULE_body = 4, RULE_openedblock = 5, RULE_closedblock = 6, RULE_if_statement = 7, 
		RULE_other_statements = 8, RULE_else_if_statement = 9, RULE_else_statement = 10, 
		RULE_loop = 11, RULE_code_line = 12, RULE_return = 13, RULE_attribution = 14, 
		RULE_param_decl = 15, RULE_other_param = 16, RULE_init_param = 17, RULE_var_decl = 18, 
		RULE_other_var = 19, RULE_init_var = 20, RULE_instruction = 21, RULE_instruction_list = 22, 
		RULE_other_instructions = 23, RULE_return_type = 24, RULE_data_type = 25, 
		RULE_data_value = 26, RULE_name = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"base_structure", "global", "global_var", "func_decl", "body", "openedblock", 
			"closedblock", "if_statement", "other_statements", "else_if_statement", 
			"else_statement", "loop", "code_line", "return", "attribution", "param_decl", 
			"other_param", "init_param", "var_decl", "other_var", "init_var", "instruction", 
			"instruction_list", "other_instructions", "return_type", "data_type", 
			"data_value", "name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "','", "';'", "'int'", "'float'", "'double'", 
			"'string'", "'void'", "'return'", "'for'", "'while'", "'else if'", "'if'", 
			"'else'", "'++'", "'--'", "'*'", "'/'", "'+'", "'-'", "'%'", "'<='", 
			"'>='", "'=='", "'!='", "'<'", "'>'", "'&&'", "'!'", "'||'", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPENPTHS", "CLOSEPTHS", "OPENEDBLOCK", "CLOSEDBLOCK", "COMMA", 
			"SEMICOLON", "INTEGER_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "STRING_TYPE", 
			"VOID_TYPE", "RETURN", "FOR_LOOP", "WHILE_LOOP", "ELSE_IF", "IF", "ELSE", 
			"INCREMENT", "DECREMENT", "MUL", "DIV", "ADD", "SUB", "MOD", "SMALLER_EQ", 
			"GREATER_EQ", "SAME", "DIFF", "SMALLER", "GREATER", "AND", "NOT", "OR", 
			"EQADD", "EQSUB", "EQMUL", "EQDIV", "EQMOD", "EQUAL", "NAME", "INTEGER_VALUE", 
			"FLOAT_VALUE", "STRING_VALUE", "BLOCK_COMMENTARY", "LINE_COMMENTARY", 
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

	@Override
	public String getGrammarFileName() { return "CustomLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CustomLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Base_structureContext extends ParserRuleContext {
		public GlobalContext global() {
			return getRuleContext(GlobalContext.class,0);
		}
		public Func_declContext func_decl() {
			return getRuleContext(Func_declContext.class,0);
		}
		public Base_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterBase_structure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitBase_structure(this);
		}
	}

	public final Base_structureContext base_structure() throws RecognitionException {
		Base_structureContext _localctx = new Base_structureContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_base_structure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			global();
			setState(57);
			func_decl();
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
	public static class GlobalContext extends ParserRuleContext {
		public List<Func_declContext> func_decl() {
			return getRuleContexts(Func_declContext.class);
		}
		public Func_declContext func_decl(int i) {
			return getRuleContext(Func_declContext.class,i);
		}
		public List<Global_varContext> global_var() {
			return getRuleContexts(Global_varContext.class);
		}
		public Global_varContext global_var(int i) {
			return getRuleContext(Global_varContext.class,i);
		}
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitGlobal(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_global);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(61);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(59);
						func_decl();
						}
						break;
					case 2:
						{
						setState(60);
						global_var();
						}
						break;
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
	public static class Global_varContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CustomLanguageParser.SEMICOLON, 0); }
		public Global_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterGlobal_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitGlobal_var(this);
		}
	}

	public final Global_varContext global_var() throws RecognitionException {
		Global_varContext _localctx = new Global_varContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_global_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			var_decl();
			setState(67);
			match(SEMICOLON);
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
	public static class Func_declContext extends ParserRuleContext {
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(CustomLanguageParser.NAME, 0); }
		public TerminalNode OPENPTHS() { return getToken(CustomLanguageParser.OPENPTHS, 0); }
		public Param_declContext param_decl() {
			return getRuleContext(Param_declContext.class,0);
		}
		public TerminalNode CLOSEPTHS() { return getToken(CustomLanguageParser.CLOSEPTHS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterFunc_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitFunc_decl(this);
		}
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			return_type();
			setState(70);
			match(NAME);
			setState(71);
			match(OPENPTHS);
			setState(72);
			param_decl();
			setState(73);
			match(CLOSEPTHS);
			setState(74);
			body();
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
	public static class BodyContext extends ParserRuleContext {
		public OpenedblockContext openedblock() {
			return getRuleContext(OpenedblockContext.class,0);
		}
		public ClosedblockContext closedblock() {
			return getRuleContext(ClosedblockContext.class,0);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public List<If_statementContext> if_statement() {
			return getRuleContexts(If_statementContext.class);
		}
		public If_statementContext if_statement(int i) {
			return getRuleContext(If_statementContext.class,i);
		}
		public List<Code_lineContext> code_line() {
			return getRuleContexts(Code_lineContext.class);
		}
		public Code_lineContext code_line(int i) {
			return getRuleContext(Code_lineContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			openedblock();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16496970266498L) != 0)) {
				{
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FOR_LOOP:
				case WHILE_LOOP:
					{
					setState(77);
					loop();
					}
					break;
				case IF:
					{
					setState(78);
					if_statement();
					}
					break;
				case OPENPTHS:
				case INTEGER_TYPE:
				case FLOAT_TYPE:
				case DOUBLE_TYPE:
				case STRING_TYPE:
				case RETURN:
				case INCREMENT:
				case DECREMENT:
				case NOT:
				case NAME:
				case INTEGER_VALUE:
				case FLOAT_VALUE:
				case STRING_VALUE:
					{
					setState(79);
					code_line();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			closedblock();
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
	public static class OpenedblockContext extends ParserRuleContext {
		public TerminalNode OPENEDBLOCK() { return getToken(CustomLanguageParser.OPENEDBLOCK, 0); }
		public OpenedblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openedblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterOpenedblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitOpenedblock(this);
		}
	}

	public final OpenedblockContext openedblock() throws RecognitionException {
		OpenedblockContext _localctx = new OpenedblockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_openedblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(OPENEDBLOCK);
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
	public static class ClosedblockContext extends ParserRuleContext {
		public TerminalNode CLOSEDBLOCK() { return getToken(CustomLanguageParser.CLOSEDBLOCK, 0); }
		public ClosedblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closedblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterClosedblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitClosedblock(this);
		}
	}

	public final ClosedblockContext closedblock() throws RecognitionException {
		ClosedblockContext _localctx = new ClosedblockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_closedblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(CLOSEDBLOCK);
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
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CustomLanguageParser.IF, 0); }
		public TerminalNode OPENPTHS() { return getToken(CustomLanguageParser.OPENPTHS, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode CLOSEPTHS() { return getToken(CustomLanguageParser.CLOSEPTHS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Other_statementsContext other_statements() {
			return getRuleContext(Other_statementsContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(IF);
			setState(92);
			match(OPENPTHS);
			setState(93);
			instruction(0);
			setState(94);
			match(CLOSEPTHS);
			setState(95);
			body();
			setState(96);
			other_statements();
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
	public static class Other_statementsContext extends ParserRuleContext {
		public List<Else_if_statementContext> else_if_statement() {
			return getRuleContexts(Else_if_statementContext.class);
		}
		public Else_if_statementContext else_if_statement(int i) {
			return getRuleContext(Else_if_statementContext.class,i);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public Other_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterOther_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitOther_statements(this);
		}
	}

	public final Other_statementsContext other_statements() throws RecognitionException {
		Other_statementsContext _localctx = new Other_statementsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_other_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(98);
				else_if_statement();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(104);
				else_statement();
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
	public static class Else_if_statementContext extends ParserRuleContext {
		public TerminalNode ELSE_IF() { return getToken(CustomLanguageParser.ELSE_IF, 0); }
		public TerminalNode OPENPTHS() { return getToken(CustomLanguageParser.OPENPTHS, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode CLOSEPTHS() { return getToken(CustomLanguageParser.CLOSEPTHS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Else_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterElse_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitElse_if_statement(this);
		}
	}

	public final Else_if_statementContext else_if_statement() throws RecognitionException {
		Else_if_statementContext _localctx = new Else_if_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_else_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ELSE_IF);
			setState(108);
			match(OPENPTHS);
			setState(109);
			instruction(0);
			setState(110);
			match(CLOSEPTHS);
			setState(111);
			body();
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
	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CustomLanguageParser.ELSE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitElse_statement(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(ELSE);
			setState(114);
			body();
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
	public static class LoopContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode FOR_LOOP() { return getToken(CustomLanguageParser.FOR_LOOP, 0); }
		public TerminalNode OPENPTHS() { return getToken(CustomLanguageParser.OPENPTHS, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CustomLanguageParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CustomLanguageParser.SEMICOLON, i);
		}
		public TerminalNode CLOSEPTHS() { return getToken(CustomLanguageParser.CLOSEPTHS, 0); }
		public TerminalNode WHILE_LOOP() { return getToken(CustomLanguageParser.WHILE_LOOP, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR_LOOP:
				{
				{
				setState(116);
				match(FOR_LOOP);
				setState(117);
				match(OPENPTHS);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1920L) != 0)) {
					{
					setState(118);
					var_decl();
					}
				}

				setState(121);
				match(SEMICOLON);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16496970170370L) != 0)) {
					{
					setState(122);
					instruction(0);
					}
				}

				setState(125);
				match(SEMICOLON);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16496970170370L) != 0)) {
					{
					setState(126);
					instruction(0);
					}
				}

				setState(129);
				match(CLOSEPTHS);
				}
				}
				break;
			case WHILE_LOOP:
				{
				{
				setState(130);
				match(WHILE_LOOP);
				setState(131);
				match(OPENPTHS);
				setState(132);
				instruction(0);
				setState(133);
				match(CLOSEPTHS);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(137);
			body();
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
	public static class Code_lineContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(CustomLanguageParser.SEMICOLON, 0); }
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Code_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterCode_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitCode_line(this);
		}
	}

	public final Code_lineContext code_line() throws RecognitionException {
		Code_lineContext _localctx = new Code_lineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_code_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(139);
				attribution();
				}
				break;
			case 2:
				{
				setState(140);
				instruction(0);
				}
				break;
			case 3:
				{
				setState(141);
				return_();
				}
				break;
			case 4:
				{
				setState(142);
				var_decl();
				}
				break;
			}
			setState(145);
			match(SEMICOLON);
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
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CustomLanguageParser.RETURN, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitReturn(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(RETURN);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16496970170370L) != 0)) {
				{
				setState(148);
				instruction(0);
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
	public static class AttributionContext extends ParserRuleContext {
		public AttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution; }
	 
		public AttributionContext() { }
		public void copyFrom(AttributionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubtractThenEqExpContext extends AttributionContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQSUB() { return getToken(CustomLanguageParser.EQSUB, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public SubtractThenEqExpContext(AttributionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterSubtractThenEqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitSubtractThenEqExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivideThenEqExpContext extends AttributionContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQDIV() { return getToken(CustomLanguageParser.EQDIV, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public DivideThenEqExpContext(AttributionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterDivideThenEqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitDivideThenEqExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AditionThenEqExpContext extends AttributionContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQADD() { return getToken(CustomLanguageParser.EQADD, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public AditionThenEqExpContext(AttributionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterAditionThenEqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitAditionThenEqExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModuloThenEqExpContext extends AttributionContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQMOD() { return getToken(CustomLanguageParser.EQMOD, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public ModuloThenEqExpContext(AttributionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterModuloThenEqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitModuloThenEqExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyThenEqExpContext extends AttributionContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQMUL() { return getToken(CustomLanguageParser.EQMUL, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public MultiplyThenEqExpContext(AttributionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterMultiplyThenEqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitMultiplyThenEqExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualExpContext extends AttributionContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(CustomLanguageParser.EQUAL, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public EqualExpContext(AttributionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterEqualExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitEqualExp(this);
		}
	}

	public final AttributionContext attribution() throws RecognitionException {
		AttributionContext _localctx = new AttributionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attribution);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new AditionThenEqExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				name();
				setState(152);
				match(EQADD);
				setState(153);
				instruction(0);
				}
				break;
			case 2:
				_localctx = new SubtractThenEqExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				name();
				setState(156);
				match(EQSUB);
				setState(157);
				instruction(0);
				}
				break;
			case 3:
				_localctx = new MultiplyThenEqExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				name();
				setState(160);
				match(EQMUL);
				setState(161);
				instruction(0);
				}
				break;
			case 4:
				_localctx = new DivideThenEqExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				name();
				setState(164);
				match(EQDIV);
				setState(165);
				instruction(0);
				}
				break;
			case 5:
				_localctx = new ModuloThenEqExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
				name();
				setState(168);
				match(EQMOD);
				setState(169);
				instruction(0);
				}
				break;
			case 6:
				_localctx = new EqualExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				name();
				setState(172);
				match(EQUAL);
				setState(173);
				instruction(0);
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
	public static class Param_declContext extends ParserRuleContext {
		public Init_paramContext init_param() {
			return getRuleContext(Init_paramContext.class,0);
		}
		public List<Other_paramContext> other_param() {
			return getRuleContexts(Other_paramContext.class);
		}
		public Other_paramContext other_param(int i) {
			return getRuleContext(Other_paramContext.class,i);
		}
		public Param_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterParam_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitParam_decl(this);
		}
	}

	public final Param_declContext param_decl() throws RecognitionException {
		Param_declContext _localctx = new Param_declContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_param_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1920L) != 0)) {
				{
				setState(177);
				init_param();
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(178);
					other_param();
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class Other_paramContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(CustomLanguageParser.COMMA, 0); }
		public Init_paramContext init_param() {
			return getRuleContext(Init_paramContext.class,0);
		}
		public Other_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterOther_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitOther_param(this);
		}
	}

	public final Other_paramContext other_param() throws RecognitionException {
		Other_paramContext _localctx = new Other_paramContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_other_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(COMMA);
			setState(187);
			init_param();
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
	public static class Init_paramContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Init_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterInit_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitInit_param(this);
		}
	}

	public final Init_paramContext init_param() throws RecognitionException {
		Init_paramContext _localctx = new Init_paramContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_init_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			data_type();
			setState(190);
			name();
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
	public static class Var_declContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Init_varContext init_var() {
			return getRuleContext(Init_varContext.class,0);
		}
		public List<Other_varContext> other_var() {
			return getRuleContexts(Other_varContext.class);
		}
		public Other_varContext other_var(int i) {
			return getRuleContext(Other_varContext.class,i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			data_type();
			setState(193);
			init_var();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(194);
				other_var();
				}
				}
				setState(199);
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
	public static class Other_varContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(CustomLanguageParser.COMMA, 0); }
		public Init_varContext init_var() {
			return getRuleContext(Init_varContext.class,0);
		}
		public Other_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterOther_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitOther_var(this);
		}
	}

	public final Other_varContext other_var() throws RecognitionException {
		Other_varContext _localctx = new Other_varContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_other_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(COMMA);
			setState(201);
			init_var();
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
	public static class Init_varContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(CustomLanguageParser.EQUAL, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public Init_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterInit_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitInit_var(this);
		}
	}

	public final Init_varContext init_var() throws RecognitionException {
		Init_varContext _localctx = new Init_varContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_init_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			name();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(204);
				match(EQUAL);
				setState(205);
				instruction(0);
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
	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SmallerEqExpContext extends InstructionContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode SMALLER_EQ() { return getToken(CustomLanguageParser.SMALLER_EQ, 0); }
		public SmallerEqExpContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterSmallerEqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitSmallerEqExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreincrementExpContext extends InstructionContext {
		public TerminalNode INCREMENT() { return getToken(CustomLanguageParser.INCREMENT, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public PreincrementExpContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterPreincrementExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitPreincrementExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableAtomExpContext extends InstructionContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public VariableAtomExpContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterVariableAtomExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitVariableAtomExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueAtomEXpContext extends InstructionContext {
		public Data_valueContext data_value() {
			return getRuleContext(Data_valueContext.class,0);
		}
		public ValueAtomEXpContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterValueAtomEXp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitValueAtomEXp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PredecrementExpContext extends InstructionContext {
		public TerminalNode DECREMENT() { return getToken(CustomLanguageParser.DECREMENT, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public PredecrementExpContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterPredecrementExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitPredecrementExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicNotExpContext extends InstructionContext {
		public TerminalNode NOT() { return getToken(CustomLanguageParser.NOT, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public LogicNotExpContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterLogicNotExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitLogicNotExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExpContext extends InstructionContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OPENPTHS() { return getToken(CustomLanguageParser.OPENPTHS, 0); }
		public TerminalNode CLOSEPTHS() { return getToken(CustomLanguageParser.CLOSEPTHS, 0); }
		public Instruction_listContext instruction_list() {
			return getRuleContext(Instruction_listContext.class,0);
		}
		public FunctionCallExpContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterFunctionCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitFunctionCallExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostdecrementExpContext extends InstructionContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode DECREMENT() { return getToken(CustomLanguageParser.DECREMENT, 0); }
		public PostdecrementExpContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterPostdecrementExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitPostdecrementExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModuloExpContext extends InstructionContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode MOD() { return getToken(CustomLanguageParser.MOD, 0); }
		public ModuloExpContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterModuloExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitModuloExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterEqExpContext extends InstructionContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode GREATER_EQ() { return getToken(CustomLanguageParser.GREATER_EQ, 0); }
		public GreaterEqExpContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterGreaterEqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitGreaterEqExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SmallerExpContext extends InstructionContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode SMALLER() { return getToken(CustomLanguageParser.SMALLER, 0); }
		public SmallerExpContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterSmallerExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitSmallerExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterExpContext extends InstructionContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode GREATER() { return getToken(CustomLanguageParser.GREATER, 0); }
		public GreaterExpContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterGreaterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitGreaterExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicAndExpContext extends InstructionContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode AND() { return getToken(CustomLanguageParser.AND, 0); }
		public LogicAndExpContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterLogicAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitLogicAndExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicOrExpContext extends InstructionContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode OR() { return getToken(CustomLanguageParser.OR, 0); }
		public LogicOrExpContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterLogicOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitLogicOrExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParanhesisExpContext extends InstructionContext {
		public TerminalNode OPENPTHS() { return getToken(CustomLanguageParser.OPENPTHS, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode CLOSEPTHS() { return getToken(CustomLanguageParser.CLOSEPTHS, 0); }
		public ParanhesisExpContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterParanhesisExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitParanhesisExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubtractExpContext extends InstructionContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode SUB() { return getToken(CustomLanguageParser.SUB, 0); }
		public SubtractExpContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterSubtractExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitSubtractExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SameValueExpContext extends InstructionContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode SAME() { return getToken(CustomLanguageParser.SAME, 0); }
		public SameValueExpContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterSameValueExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitSameValueExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DiffValueExpContext extends InstructionContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode DIFF() { return getToken(CustomLanguageParser.DIFF, 0); }
		public DiffValueExpContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterDiffValueExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitDiffValueExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyExpContext extends InstructionContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(CustomLanguageParser.MUL, 0); }
		public MultiplyExpContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterMultiplyExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitMultiplyExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivideExpContext extends InstructionContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(CustomLanguageParser.DIV, 0); }
		public DivideExpContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterDivideExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitDivideExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AditionExpContext extends InstructionContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(CustomLanguageParser.ADD, 0); }
		public AditionExpContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterAditionExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitAditionExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostincrementExpContext extends InstructionContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(CustomLanguageParser.INCREMENT, 0); }
		public PostincrementExpContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterPostincrementExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitPostincrementExp(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		return instruction(0);
	}

	private InstructionContext instruction(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InstructionContext _localctx = new InstructionContext(_ctx, _parentState);
		InstructionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_instruction, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new VariableAtomExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(209);
				name();
				}
				break;
			case 2:
				{
				_localctx = new ValueAtomEXpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				data_value();
				}
				break;
			case 3:
				{
				_localctx = new ParanhesisExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(OPENPTHS);
				setState(212);
				instruction(0);
				setState(213);
				match(CLOSEPTHS);
				}
				break;
			case 4:
				{
				_localctx = new FunctionCallExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				name();
				setState(216);
				match(OPENPTHS);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16496970170370L) != 0)) {
					{
					setState(217);
					instruction_list();
					}
				}

				setState(220);
				match(CLOSEPTHS);
				}
				break;
			case 5:
				{
				_localctx = new LogicNotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				match(NOT);
				setState(223);
				instruction(18);
				}
				break;
			case 6:
				{
				_localctx = new PreincrementExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(INCREMENT);
				setState(225);
				instruction(17);
				}
				break;
			case 7:
				{
				_localctx = new PredecrementExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				match(DECREMENT);
				setState(227);
				instruction(15);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(273);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new AditionExpContext(new InstructionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_instruction);
						setState(230);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(231);
						match(ADD);
						setState(232);
						instruction(14);
						}
						break;
					case 2:
						{
						_localctx = new SubtractExpContext(new InstructionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_instruction);
						setState(233);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(234);
						match(SUB);
						setState(235);
						instruction(13);
						}
						break;
					case 3:
						{
						_localctx = new MultiplyExpContext(new InstructionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_instruction);
						setState(236);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(237);
						match(MUL);
						setState(238);
						instruction(12);
						}
						break;
					case 4:
						{
						_localctx = new DivideExpContext(new InstructionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_instruction);
						setState(239);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(240);
						match(DIV);
						setState(241);
						instruction(11);
						}
						break;
					case 5:
						{
						_localctx = new ModuloExpContext(new InstructionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_instruction);
						setState(242);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(243);
						match(MOD);
						setState(244);
						instruction(10);
						}
						break;
					case 6:
						{
						_localctx = new SmallerEqExpContext(new InstructionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_instruction);
						setState(245);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(246);
						match(SMALLER_EQ);
						setState(247);
						instruction(9);
						}
						break;
					case 7:
						{
						_localctx = new GreaterEqExpContext(new InstructionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_instruction);
						setState(248);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(249);
						match(GREATER_EQ);
						setState(250);
						instruction(8);
						}
						break;
					case 8:
						{
						_localctx = new SmallerExpContext(new InstructionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_instruction);
						setState(251);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(252);
						match(SMALLER);
						setState(253);
						instruction(7);
						}
						break;
					case 9:
						{
						_localctx = new GreaterExpContext(new InstructionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_instruction);
						setState(254);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(255);
						match(GREATER);
						setState(256);
						instruction(6);
						}
						break;
					case 10:
						{
						_localctx = new SameValueExpContext(new InstructionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_instruction);
						setState(257);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(258);
						match(SAME);
						setState(259);
						instruction(5);
						}
						break;
					case 11:
						{
						_localctx = new DiffValueExpContext(new InstructionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_instruction);
						setState(260);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(261);
						match(DIFF);
						setState(262);
						instruction(4);
						}
						break;
					case 12:
						{
						_localctx = new LogicAndExpContext(new InstructionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_instruction);
						setState(263);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(264);
						match(AND);
						setState(265);
						instruction(3);
						}
						break;
					case 13:
						{
						_localctx = new LogicOrExpContext(new InstructionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_instruction);
						setState(266);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(267);
						match(OR);
						setState(268);
						instruction(2);
						}
						break;
					case 14:
						{
						_localctx = new PostincrementExpContext(new InstructionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_instruction);
						setState(269);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(270);
						match(INCREMENT);
						}
						break;
					case 15:
						{
						_localctx = new PostdecrementExpContext(new InstructionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_instruction);
						setState(271);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(272);
						match(DECREMENT);
						}
						break;
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
	public static class Instruction_listContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public List<Other_instructionsContext> other_instructions() {
			return getRuleContexts(Other_instructionsContext.class);
		}
		public Other_instructionsContext other_instructions(int i) {
			return getRuleContext(Other_instructionsContext.class,i);
		}
		public Instruction_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterInstruction_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitInstruction_list(this);
		}
	}

	public final Instruction_listContext instruction_list() throws RecognitionException {
		Instruction_listContext _localctx = new Instruction_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_instruction_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			instruction(0);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(279);
				other_instructions();
				}
				}
				setState(284);
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
	public static class Other_instructionsContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(CustomLanguageParser.COMMA, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public Other_instructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterOther_instructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitOther_instructions(this);
		}
	}

	public final Other_instructionsContext other_instructions() throws RecognitionException {
		Other_instructionsContext _localctx = new Other_instructionsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_other_instructions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(COMMA);
			setState(286);
			instruction(0);
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
	public static class Return_typeContext extends ParserRuleContext {
		public TerminalNode VOID_TYPE() { return getToken(CustomLanguageParser.VOID_TYPE, 0); }
		public TerminalNode INTEGER_TYPE() { return getToken(CustomLanguageParser.INTEGER_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(CustomLanguageParser.FLOAT_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(CustomLanguageParser.DOUBLE_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(CustomLanguageParser.STRING_TYPE, 0); }
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitReturn_type(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_return_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3968L) != 0)) ) {
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
	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode INTEGER_TYPE() { return getToken(CustomLanguageParser.INTEGER_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(CustomLanguageParser.FLOAT_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(CustomLanguageParser.DOUBLE_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(CustomLanguageParser.STRING_TYPE, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitData_type(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1920L) != 0)) ) {
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
	public static class Data_valueContext extends ParserRuleContext {
		public TerminalNode FLOAT_VALUE() { return getToken(CustomLanguageParser.FLOAT_VALUE, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(CustomLanguageParser.INTEGER_VALUE, 0); }
		public TerminalNode STRING_VALUE() { return getToken(CustomLanguageParser.STRING_VALUE, 0); }
		public Data_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterData_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitData_value(this);
		}
	}

	public final Data_valueContext data_value() throws RecognitionException {
		Data_valueContext _localctx = new Data_valueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_data_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15393162788864L) != 0)) ) {
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
	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(CustomLanguageParser.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLanguageListener ) ((CustomLanguageListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(NAME);
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
		case 21:
			return instruction_sempred((InstructionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean instruction_sempred(InstructionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		case 13:
			return precpred(_ctx, 16);
		case 14:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u0129\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001"+
		">\b\u0001\n\u0001\f\u0001A\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"Q\b\u0004\n\u0004\f\u0004T\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0005\bd\b\b"+
		"\n\b\f\bg\t\b\u0001\b\u0003\bj\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000bx\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b|\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0080\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0088\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0090\b\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0003\r\u0096\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b0\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u00b4\b\u000f\n\u000f\f\u000f\u00b7\t\u000f"+
		"\u0003\u000f\u00b9\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u00c4\b\u0012\n\u0012\f\u0012\u00c7\t\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00cf\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00db\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u00e5\b\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0112"+
		"\b\u0015\n\u0015\f\u0015\u0115\t\u0015\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u0119\b\u0016\n\u0016\f\u0016\u011c\t\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0000\u0001*\u001c\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.0246\u0000\u0003\u0001\u0000\u0007\u000b\u0001\u0000\u0007\n"+
		"\u0001\u0000)+\u013b\u00008\u0001\u0000\u0000\u0000\u0002?\u0001\u0000"+
		"\u0000\u0000\u0004B\u0001\u0000\u0000\u0000\u0006E\u0001\u0000\u0000\u0000"+
		"\bL\u0001\u0000\u0000\u0000\nW\u0001\u0000\u0000\u0000\fY\u0001\u0000"+
		"\u0000\u0000\u000e[\u0001\u0000\u0000\u0000\u0010e\u0001\u0000\u0000\u0000"+
		"\u0012k\u0001\u0000\u0000\u0000\u0014q\u0001\u0000\u0000\u0000\u0016\u0087"+
		"\u0001\u0000\u0000\u0000\u0018\u008f\u0001\u0000\u0000\u0000\u001a\u0093"+
		"\u0001\u0000\u0000\u0000\u001c\u00af\u0001\u0000\u0000\u0000\u001e\u00b8"+
		"\u0001\u0000\u0000\u0000 \u00ba\u0001\u0000\u0000\u0000\"\u00bd\u0001"+
		"\u0000\u0000\u0000$\u00c0\u0001\u0000\u0000\u0000&\u00c8\u0001\u0000\u0000"+
		"\u0000(\u00cb\u0001\u0000\u0000\u0000*\u00e4\u0001\u0000\u0000\u0000,"+
		"\u0116\u0001\u0000\u0000\u0000.\u011d\u0001\u0000\u0000\u00000\u0120\u0001"+
		"\u0000\u0000\u00002\u0122\u0001\u0000\u0000\u00004\u0124\u0001\u0000\u0000"+
		"\u00006\u0126\u0001\u0000\u0000\u000089\u0003\u0002\u0001\u00009:\u0003"+
		"\u0006\u0003\u0000:\u0001\u0001\u0000\u0000\u0000;>\u0003\u0006\u0003"+
		"\u0000<>\u0003\u0004\u0002\u0000=;\u0001\u0000\u0000\u0000=<\u0001\u0000"+
		"\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@\u0003\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000BC\u0003$\u0012\u0000CD\u0005\u0006\u0000\u0000D\u0005\u0001\u0000"+
		"\u0000\u0000EF\u00030\u0018\u0000FG\u0005(\u0000\u0000GH\u0005\u0001\u0000"+
		"\u0000HI\u0003\u001e\u000f\u0000IJ\u0005\u0002\u0000\u0000JK\u0003\b\u0004"+
		"\u0000K\u0007\u0001\u0000\u0000\u0000LR\u0003\n\u0005\u0000MQ\u0003\u0016"+
		"\u000b\u0000NQ\u0003\u000e\u0007\u0000OQ\u0003\u0018\f\u0000PM\u0001\u0000"+
		"\u0000\u0000PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000QT\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"SU\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UV\u0003\f\u0006\u0000"+
		"V\t\u0001\u0000\u0000\u0000WX\u0005\u0003\u0000\u0000X\u000b\u0001\u0000"+
		"\u0000\u0000YZ\u0005\u0004\u0000\u0000Z\r\u0001\u0000\u0000\u0000[\\\u0005"+
		"\u0010\u0000\u0000\\]\u0005\u0001\u0000\u0000]^\u0003*\u0015\u0000^_\u0005"+
		"\u0002\u0000\u0000_`\u0003\b\u0004\u0000`a\u0003\u0010\b\u0000a\u000f"+
		"\u0001\u0000\u0000\u0000bd\u0003\u0012\t\u0000cb\u0001\u0000\u0000\u0000"+
		"dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hj\u0003\u0014"+
		"\n\u0000ih\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u0011\u0001"+
		"\u0000\u0000\u0000kl\u0005\u000f\u0000\u0000lm\u0005\u0001\u0000\u0000"+
		"mn\u0003*\u0015\u0000no\u0005\u0002\u0000\u0000op\u0003\b\u0004\u0000"+
		"p\u0013\u0001\u0000\u0000\u0000qr\u0005\u0011\u0000\u0000rs\u0003\b\u0004"+
		"\u0000s\u0015\u0001\u0000\u0000\u0000tu\u0005\r\u0000\u0000uw\u0005\u0001"+
		"\u0000\u0000vx\u0003$\u0012\u0000wv\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0005\u0006\u0000\u0000z|\u0003"+
		"*\u0015\u0000{z\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}\u007f\u0005\u0006\u0000\u0000~\u0080\u0003*\u0015"+
		"\u0000\u007f~\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0088\u0005\u0002\u0000\u0000"+
		"\u0082\u0083\u0005\u000e\u0000\u0000\u0083\u0084\u0005\u0001\u0000\u0000"+
		"\u0084\u0085\u0003*\u0015\u0000\u0085\u0086\u0005\u0002\u0000\u0000\u0086"+
		"\u0088\u0001\u0000\u0000\u0000\u0087t\u0001\u0000\u0000\u0000\u0087\u0082"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0003\b\u0004\u0000\u008a\u0017\u0001\u0000\u0000\u0000\u008b\u0090\u0003"+
		"\u001c\u000e\u0000\u008c\u0090\u0003*\u0015\u0000\u008d\u0090\u0003\u001a"+
		"\r\u0000\u008e\u0090\u0003$\u0012\u0000\u008f\u008b\u0001\u0000\u0000"+
		"\u0000\u008f\u008c\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000"+
		"\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005\u0006\u0000\u0000\u0092\u0019\u0001\u0000\u0000"+
		"\u0000\u0093\u0095\u0005\f\u0000\u0000\u0094\u0096\u0003*\u0015\u0000"+
		"\u0095\u0094\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000"+
		"\u0096\u001b\u0001\u0000\u0000\u0000\u0097\u0098\u00036\u001b\u0000\u0098"+
		"\u0099\u0005\"\u0000\u0000\u0099\u009a\u0003*\u0015\u0000\u009a\u00b0"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u00036\u001b\u0000\u009c\u009d\u0005"+
		"#\u0000\u0000\u009d\u009e\u0003*\u0015\u0000\u009e\u00b0\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u00036\u001b\u0000\u00a0\u00a1\u0005$\u0000\u0000\u00a1"+
		"\u00a2\u0003*\u0015\u0000\u00a2\u00b0\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u00036\u001b\u0000\u00a4\u00a5\u0005%\u0000\u0000\u00a5\u00a6\u0003*"+
		"\u0015\u0000\u00a6\u00b0\u0001\u0000\u0000\u0000\u00a7\u00a8\u00036\u001b"+
		"\u0000\u00a8\u00a9\u0005&\u0000\u0000\u00a9\u00aa\u0003*\u0015\u0000\u00aa"+
		"\u00b0\u0001\u0000\u0000\u0000\u00ab\u00ac\u00036\u001b\u0000\u00ac\u00ad"+
		"\u0005\'\u0000\u0000\u00ad\u00ae\u0003*\u0015\u0000\u00ae\u00b0\u0001"+
		"\u0000\u0000\u0000\u00af\u0097\u0001\u0000\u0000\u0000\u00af\u009b\u0001"+
		"\u0000\u0000\u0000\u00af\u009f\u0001\u0000\u0000\u0000\u00af\u00a3\u0001"+
		"\u0000\u0000\u0000\u00af\u00a7\u0001\u0000\u0000\u0000\u00af\u00ab\u0001"+
		"\u0000\u0000\u0000\u00b0\u001d\u0001\u0000\u0000\u0000\u00b1\u00b5\u0003"+
		"\"\u0011\u0000\u00b2\u00b4\u0003 \u0010\u0000\u00b3\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u001f\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0005\u0005\u0000\u0000\u00bb\u00bc\u0003\"\u0011"+
		"\u0000\u00bc!\u0001\u0000\u0000\u0000\u00bd\u00be\u00032\u0019\u0000\u00be"+
		"\u00bf\u00036\u001b\u0000\u00bf#\u0001\u0000\u0000\u0000\u00c0\u00c1\u0003"+
		"2\u0019\u0000\u00c1\u00c5\u0003(\u0014\u0000\u00c2\u00c4\u0003&\u0013"+
		"\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c6%\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0005\u0005\u0000\u0000\u00c9\u00ca\u0003(\u0014\u0000\u00ca"+
		"\'\u0001\u0000\u0000\u0000\u00cb\u00ce\u00036\u001b\u0000\u00cc\u00cd"+
		"\u0005\'\u0000\u0000\u00cd\u00cf\u0003*\u0015\u0000\u00ce\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf)\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0006\u0015\uffff\uffff\u0000\u00d1\u00e5\u0003"+
		"6\u001b\u0000\u00d2\u00e5\u00034\u001a\u0000\u00d3\u00d4\u0005\u0001\u0000"+
		"\u0000\u00d4\u00d5\u0003*\u0015\u0000\u00d5\u00d6\u0005\u0002\u0000\u0000"+
		"\u00d6\u00e5\u0001\u0000\u0000\u0000\u00d7\u00d8\u00036\u001b\u0000\u00d8"+
		"\u00da\u0005\u0001\u0000\u0000\u00d9\u00db\u0003,\u0016\u0000\u00da\u00d9"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u0002\u0000\u0000\u00dd\u00e5"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0005 \u0000\u0000\u00df\u00e5\u0003"+
		"*\u0015\u0012\u00e0\u00e1\u0005\u0012\u0000\u0000\u00e1\u00e5\u0003*\u0015"+
		"\u0011\u00e2\u00e3\u0005\u0013\u0000\u0000\u00e3\u00e5\u0003*\u0015\u000f"+
		"\u00e4\u00d0\u0001\u0000\u0000\u0000\u00e4\u00d2\u0001\u0000\u0000\u0000"+
		"\u00e4\u00d3\u0001\u0000\u0000\u0000\u00e4\u00d7\u0001\u0000\u0000\u0000"+
		"\u00e4\u00de\u0001\u0000\u0000\u0000\u00e4\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u0113\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\n\r\u0000\u0000\u00e7\u00e8\u0005\u0016\u0000\u0000\u00e8"+
		"\u0112\u0003*\u0015\u000e\u00e9\u00ea\n\f\u0000\u0000\u00ea\u00eb\u0005"+
		"\u0017\u0000\u0000\u00eb\u0112\u0003*\u0015\r\u00ec\u00ed\n\u000b\u0000"+
		"\u0000\u00ed\u00ee\u0005\u0014\u0000\u0000\u00ee\u0112\u0003*\u0015\f"+
		"\u00ef\u00f0\n\n\u0000\u0000\u00f0\u00f1\u0005\u0015\u0000\u0000\u00f1"+
		"\u0112\u0003*\u0015\u000b\u00f2\u00f3\n\t\u0000\u0000\u00f3\u00f4\u0005"+
		"\u0018\u0000\u0000\u00f4\u0112\u0003*\u0015\n\u00f5\u00f6\n\b\u0000\u0000"+
		"\u00f6\u00f7\u0005\u0019\u0000\u0000\u00f7\u0112\u0003*\u0015\t\u00f8"+
		"\u00f9\n\u0007\u0000\u0000\u00f9\u00fa\u0005\u001a\u0000\u0000\u00fa\u0112"+
		"\u0003*\u0015\b\u00fb\u00fc\n\u0006\u0000\u0000\u00fc\u00fd\u0005\u001d"+
		"\u0000\u0000\u00fd\u0112\u0003*\u0015\u0007\u00fe\u00ff\n\u0005\u0000"+
		"\u0000\u00ff\u0100\u0005\u001e\u0000\u0000\u0100\u0112\u0003*\u0015\u0006"+
		"\u0101\u0102\n\u0004\u0000\u0000\u0102\u0103\u0005\u001b\u0000\u0000\u0103"+
		"\u0112\u0003*\u0015\u0005\u0104\u0105\n\u0003\u0000\u0000\u0105\u0106"+
		"\u0005\u001c\u0000\u0000\u0106\u0112\u0003*\u0015\u0004\u0107\u0108\n"+
		"\u0002\u0000\u0000\u0108\u0109\u0005\u001f\u0000\u0000\u0109\u0112\u0003"+
		"*\u0015\u0003\u010a\u010b\n\u0001\u0000\u0000\u010b\u010c\u0005!\u0000"+
		"\u0000\u010c\u0112\u0003*\u0015\u0002\u010d\u010e\n\u0010\u0000\u0000"+
		"\u010e\u0112\u0005\u0012\u0000\u0000\u010f\u0110\n\u000e\u0000\u0000\u0110"+
		"\u0112\u0005\u0013\u0000\u0000\u0111\u00e6\u0001\u0000\u0000\u0000\u0111"+
		"\u00e9\u0001\u0000\u0000\u0000\u0111\u00ec\u0001\u0000\u0000\u0000\u0111"+
		"\u00ef\u0001\u0000\u0000\u0000\u0111\u00f2\u0001\u0000\u0000\u0000\u0111"+
		"\u00f5\u0001\u0000\u0000\u0000\u0111\u00f8\u0001\u0000\u0000\u0000\u0111"+
		"\u00fb\u0001\u0000\u0000\u0000\u0111\u00fe\u0001\u0000\u0000\u0000\u0111"+
		"\u0101\u0001\u0000\u0000\u0000\u0111\u0104\u0001\u0000\u0000\u0000\u0111"+
		"\u0107\u0001\u0000\u0000\u0000\u0111\u010a\u0001\u0000\u0000\u0000\u0111"+
		"\u010d\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112"+
		"\u0115\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113"+
		"\u0114\u0001\u0000\u0000\u0000\u0114+\u0001\u0000\u0000\u0000\u0115\u0113"+
		"\u0001\u0000\u0000\u0000\u0116\u011a\u0003*\u0015\u0000\u0117\u0119\u0003"+
		".\u0017\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000"+
		"\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000"+
		"\u0000\u0000\u011b-\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0005\u0005\u0000\u0000\u011e\u011f\u0003*\u0015\u0000"+
		"\u011f/\u0001\u0000\u0000\u0000\u0120\u0121\u0007\u0000\u0000\u0000\u0121"+
		"1\u0001\u0000\u0000\u0000\u0122\u0123\u0007\u0001\u0000\u0000\u01233\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0007\u0002\u0000\u0000\u01255\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0005(\u0000\u0000\u01277\u0001\u0000\u0000\u0000"+
		"\u0016=?PReiw{\u007f\u0087\u008f\u0095\u00af\u00b5\u00b8\u00c5\u00ce\u00da"+
		"\u00e4\u0111\u0113\u011a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}