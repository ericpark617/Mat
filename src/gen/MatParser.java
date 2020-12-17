package gen;

// Generated from c:\Users\Main PC\Documents\Mat\src\Mat.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MatParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, DISPLAY=5, CREATE=6, READ=7, POW=8, SQLPAREN=9, 
		SQRPAREN=10, PLUS=11, MINUS=12, MULT=13, DIV=14, EQ=15, BLOCK_COMMENT=16, 
		LINE_COMMENT=17, WS=18, ID=19, INT=20, DOUBLE=21;
	public static final int
		RULE_prog = 0, RULE_action = 1, RULE_displayAction = 2, RULE_assignAction = 3, 
		RULE_createAction = 4, RULE_readAction = 5, RULE_matrix = 6, RULE_expr = 7, 
		RULE_atom = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "action", "displayAction", "assignAction", "createAction", "readAction", 
			"matrix", "expr", "atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'by'", "'matrix where'", "'to'", "','", "'display'", "'create'", 
			"'read'", "'^'", "'['", "']'", "'+'", "'-'", "'*'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "DISPLAY", "CREATE", "READ", "POW", "SQLPAREN", 
			"SQRPAREN", "PLUS", "MINUS", "MULT", "DIV", "EQ", "BLOCK_COMMENT", "LINE_COMMENT", 
			"WS", "ID", "INT", "DOUBLE"
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
	public String getGrammarFileName() { return "Mat.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MatParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MatParser.EOF, 0); }
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatVisitor ) return ((MatVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPLAY) | (1L << CREATE) | (1L << READ) | (1L << ID))) != 0)) {
				{
				{
				setState(18);
				action();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
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

	public static class ActionContext extends ParserRuleContext {
		public DisplayActionContext displayAction() {
			return getRuleContext(DisplayActionContext.class,0);
		}
		public AssignActionContext assignAction() {
			return getRuleContext(AssignActionContext.class,0);
		}
		public CreateActionContext createAction() {
			return getRuleContext(CreateActionContext.class,0);
		}
		public ReadActionContext readAction() {
			return getRuleContext(ReadActionContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatVisitor ) return ((MatVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_action);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISPLAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				displayAction();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				assignAction();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				createAction();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				readAction();
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

	public static class DisplayActionContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(MatParser.DISPLAY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DisplayActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayAction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatVisitor ) return ((MatVisitor<? extends T>)visitor).visitDisplayAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayActionContext displayAction() throws RecognitionException {
		DisplayActionContext _localctx = new DisplayActionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_displayAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(DISPLAY);
			setState(33);
			expr(0);
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

	public static class AssignActionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MatParser.ID, 0); }
		public TerminalNode EQ() { return getToken(MatParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignAction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatVisitor ) return ((MatVisitor<? extends T>)visitor).visitAssignAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignActionContext assignAction() throws RecognitionException {
		AssignActionContext _localctx = new AssignActionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(ID);
			setState(36);
			match(EQ);
			setState(37);
			expr(0);
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

	public static class CreateActionContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MatParser.CREATE, 0); }
		public List<TerminalNode> INT() { return getTokens(MatParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MatParser.INT, i);
		}
		public TerminalNode SQLPAREN() { return getToken(MatParser.SQLPAREN, 0); }
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public TerminalNode SQRPAREN() { return getToken(MatParser.SQRPAREN, 0); }
		public TerminalNode ID() { return getToken(MatParser.ID, 0); }
		public CreateActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createAction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatVisitor ) return ((MatVisitor<? extends T>)visitor).visitCreateAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateActionContext createAction() throws RecognitionException {
		CreateActionContext _localctx = new CreateActionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(CREATE);
			setState(40);
			match(INT);
			setState(41);
			match(T__0);
			setState(42);
			match(INT);
			setState(43);
			match(T__1);
			setState(44);
			match(SQLPAREN);
			setState(45);
			matrix();
			setState(46);
			match(SQRPAREN);
			setState(47);
			match(T__2);
			setState(48);
			match(ID);
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

	public static class ReadActionContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(MatParser.READ, 0); }
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public ReadActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readAction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatVisitor ) return ((MatVisitor<? extends T>)visitor).visitReadAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadActionContext readAction() throws RecognitionException {
		ReadActionContext _localctx = new ReadActionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_readAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(READ);
			setState(51);
			matrix();
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

	public static class MatrixContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(MatParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MatParser.INT, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(MatParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(MatParser.DOUBLE, i);
		}
		public MatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatVisitor ) return ((MatVisitor<? extends T>)visitor).visitMatrix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixContext matrix() throws RecognitionException {
		MatrixContext _localctx = new MatrixContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_matrix);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(54);
					match(T__3);
					setState(55);
					_la = _input.LA(1);
					if ( !(_la==INT || _la==DOUBLE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtmContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtmContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatVisitor ) return ((MatVisitor<? extends T>)visitor).visitAtm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(MatParser.POW, 0); }
		public PowerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatVisitor ) return ((MatVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusminusContext extends ExprContext {
		public List<MatrixContext> matrix() {
			return getRuleContexts(MatrixContext.class);
		}
		public MatrixContext matrix(int i) {
			return getRuleContext(MatrixContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MatParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MatParser.MINUS, 0); }
		public PlusminusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatVisitor ) return ((MatVisitor<? extends T>)visitor).visitPlusminus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultdivContext extends ExprContext {
		public List<MatrixContext> matrix() {
			return getRuleContexts(MatrixContext.class);
		}
		public MatrixContext matrix(int i) {
			return getRuleContext(MatrixContext.class,i);
		}
		public TerminalNode MULT() { return getToken(MatParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(MatParser.DIV, 0); }
		public MultdivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatVisitor ) return ((MatVisitor<? extends T>)visitor).visitMultdiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new PlusminusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(62);
				matrix();
				setState(63);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(64);
				matrix();
				}
				break;
			case 2:
				{
				_localctx = new MultdivContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				matrix();
				setState(67);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(68);
				matrix();
				}
				break;
			case 3:
				{
				_localctx = new AtmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PowerContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(73);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(74);
					match(POW);
					setState(75);
					expr(2);
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerContext extends AtomContext {
		public TerminalNode INT() { return getToken(MatParser.INT, 0); }
		public IntegerContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatVisitor ) return ((MatVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierContext extends AtomContext {
		public TerminalNode ID() { return getToken(MatParser.ID, 0); }
		public IdentifierContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatVisitor ) return ((MatVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MatrContext extends AtomContext {
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public MatrContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatVisitor ) return ((MatVisitor<? extends T>)visitor).visitMatr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleContext extends AtomContext {
		public TerminalNode DOUBLE() { return getToken(MatParser.DOUBLE, 0); }
		public DoubleContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatVisitor ) return ((MatVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atom);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(INT);
				}
				break;
			case 2:
				_localctx = new DoubleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(DOUBLE);
				}
				break;
			case 3:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(ID);
				}
				break;
			case 4:
				_localctx = new MatrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				matrix();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27Z\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3!\n\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\7\b;\n\b\f\b\16\b>\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\tJ\n\t\3\t\3\t\3\t\7\tO\n\t\f\t\16\tR\13\t\3\n\3\n\3\n\3\n\5\n"+
		"X\n\n\3\n\2\3\20\13\2\4\6\b\n\f\16\20\22\2\5\3\2\26\27\3\2\r\16\3\2\17"+
		"\20\2[\2\27\3\2\2\2\4 \3\2\2\2\6\"\3\2\2\2\b%\3\2\2\2\n)\3\2\2\2\f\64"+
		"\3\2\2\2\16\67\3\2\2\2\20I\3\2\2\2\22W\3\2\2\2\24\26\5\4\3\2\25\24\3\2"+
		"\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31\27\3\2"+
		"\2\2\32\33\7\2\2\3\33\3\3\2\2\2\34!\5\6\4\2\35!\5\b\5\2\36!\5\n\6\2\37"+
		"!\5\f\7\2 \34\3\2\2\2 \35\3\2\2\2 \36\3\2\2\2 \37\3\2\2\2!\5\3\2\2\2\""+
		"#\7\7\2\2#$\5\20\t\2$\7\3\2\2\2%&\7\25\2\2&\'\7\21\2\2\'(\5\20\t\2(\t"+
		"\3\2\2\2)*\7\b\2\2*+\7\26\2\2+,\7\3\2\2,-\7\26\2\2-.\7\4\2\2./\7\13\2"+
		"\2/\60\5\16\b\2\60\61\7\f\2\2\61\62\7\5\2\2\62\63\7\25\2\2\63\13\3\2\2"+
		"\2\64\65\7\t\2\2\65\66\5\16\b\2\66\r\3\2\2\2\67<\t\2\2\289\7\6\2\29;\t"+
		"\2\2\2:8\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\17\3\2\2\2><\3\2\2\2?"+
		"@\b\t\1\2@A\5\16\b\2AB\t\3\2\2BC\5\16\b\2CJ\3\2\2\2DE\5\16\b\2EF\t\4\2"+
		"\2FG\5\16\b\2GJ\3\2\2\2HJ\5\22\n\2I?\3\2\2\2ID\3\2\2\2IH\3\2\2\2JP\3\2"+
		"\2\2KL\f\4\2\2LM\7\n\2\2MO\5\20\t\4NK\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3"+
		"\2\2\2Q\21\3\2\2\2RP\3\2\2\2SX\7\26\2\2TX\7\27\2\2UX\7\25\2\2VX\5\16\b"+
		"\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\23\3\2\2\2\b\27 <IPW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}