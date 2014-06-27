// Generated from C.g4 by ANTLR 4.2

	package com.rocketscience;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;
	import java.util.HashSet;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		Auto=17, Break=18, Case=19, Char=20, Const=21, Continue=22, Default=23, 
		Do=24, Double=25, Else=26, Enum=27, Extern=28, Float=29, For=30, Goto=31, 
		If=32, Inline=33, Int=34, Long=35, Register=36, Restrict=37, Return=38, 
		Short=39, Signed=40, Sizeof=41, Static=42, Struct=43, Switch=44, Typedef=45, 
		Union=46, Unsigned=47, Void=48, Volatile=49, While=50, Alignas=51, Alignof=52, 
		Atomic=53, Bool=54, Complex=55, Generic=56, Imaginary=57, Noreturn=58, 
		StaticAssert=59, ThreadLocal=60, LeftParen=61, RightParen=62, LeftBracket=63, 
		RightBracket=64, LeftBrace=65, RightBrace=66, Less=67, LessEqual=68, Greater=69, 
		GreaterEqual=70, LeftShift=71, RightShift=72, Plus=73, PlusPlus=74, Minus=75, 
		MinusMinus=76, Star=77, Div=78, Mod=79, And=80, Or=81, AndAnd=82, OrOr=83, 
		Caret=84, Not=85, Tilde=86, Question=87, Colon=88, Semi=89, Comma=90, 
		Assign=91, StarAssign=92, DivAssign=93, ModAssign=94, PlusAssign=95, MinusAssign=96, 
		LeftShiftAssign=97, RightShiftAssign=98, AndAssign=99, XorAssign=100, 
		OrAssign=101, Equal=102, NotEqual=103, Arrow=104, Dot=105, Ellipsis=106, 
		Identifier=107, Constant=108, StringLiteral=109, Whitespace=110, Newline=111, 
		BlockComment=112, LineComment=113;
	public static final String[] tokenNames = {
		"<INVALID>", "'.h>'", "'__m128'", "'__extension__'", "'__stdcall'", "'__asm__'", 
		"'__declspec'", "'__asm'", "'__inline__'", "'__builtin_va_arg'", "'__m128d'", 
		"'#include <'", "'__builtin_offsetof'", "'__attribute__'", "'__typeof__'", 
		"'__volatile__'", "'__m128i'", "'auto'", "'break'", "'case'", "'char'", 
		"'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", 
		"'extern'", "'float'", "'for'", "'goto'", "'if'", "'inline'", "'int'", 
		"'long'", "'register'", "'restrict'", "'return'", "'short'", "'signed'", 
		"'sizeof'", "'static'", "'struct'", "'switch'", "'typedef'", "'union'", 
		"'unsigned'", "'void'", "'volatile'", "'while'", "'_Alignas'", "'_Alignof'", 
		"'_Atomic'", "'_Bool'", "'_Complex'", "'_Generic'", "'_Imaginary'", "'_Noreturn'", 
		"'_Static_assert'", "'_Thread_local'", "'('", "')'", "'['", "']'", "'{'", 
		"'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", "'-'", 
		"'--'", "'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", 
		"'~'", "'?'", "':'", "';'", "','", "'='", "'*='", "'/='", "'%='", "'+='", 
		"'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'=='", "'!='", "'->'", 
		"'.'", "'...'", "Identifier", "Constant", "StringLiteral", "Whitespace", 
		"Newline", "BlockComment", "LineComment"
	};
	public static final int
		RULE_includeDef = 0, RULE_primaryExpression = 1, RULE_genericSelection = 2, 
		RULE_genericAssocList = 3, RULE_genericAssociation = 4, RULE_postfixExpression = 5, 
		RULE_argumentExpressionList = 6, RULE_moreLessMethodExpression = 7, RULE_lessMethodExpression = 8, 
		RULE_methodExpression = 9, RULE_unaryExpression = 10, RULE_unaryOperator = 11, 
		RULE_castExpression = 12, RULE_multiplicativeExpression = 13, RULE_additiveExpression = 14, 
		RULE_shiftExpression = 15, RULE_relationalExpression = 16, RULE_equalityExpression = 17, 
		RULE_andExpression = 18, RULE_exclusiveOrExpression = 19, RULE_inclusiveOrExpression = 20, 
		RULE_logicalAndExpression = 21, RULE_logicalOrExpression = 22, RULE_conditionalExpression = 23, 
		RULE_assignmentExpression = 24, RULE_assignmentOperator = 25, RULE_expression = 26, 
		RULE_constantExpression = 27, RULE_declaration = 28, RULE_declarationSpecifiers = 29, 
		RULE_declarationSpecifiers2 = 30, RULE_declarationSpecifier = 31, RULE_initDeclaratorList = 32, 
		RULE_initDeclarator = 33, RULE_storageClassSpecifier = 34, RULE_typeSpecifier = 35, 
		RULE_structOrUnionSpecifier = 36, RULE_structOrUnion = 37, RULE_structDeclarationList = 38, 
		RULE_structDeclaration = 39, RULE_specifierQualifierList = 40, RULE_structDeclaratorList = 41, 
		RULE_structDeclarator = 42, RULE_enumSpecifier = 43, RULE_enumeratorList = 44, 
		RULE_enumerator = 45, RULE_enumerationConstant = 46, RULE_atomicTypeSpecifier = 47, 
		RULE_typeQualifier = 48, RULE_functionSpecifier = 49, RULE_alignmentSpecifier = 50, 
		RULE_declarator = 51, RULE_directDeclarator = 52, RULE_gccDeclaratorExtension = 53, 
		RULE_gccAttributeSpecifier = 54, RULE_gccAttributeList = 55, RULE_gccAttribute = 56, 
		RULE_nestedParenthesesBlock = 57, RULE_pointer = 58, RULE_typeQualifierList = 59, 
		RULE_parameterTypeList = 60, RULE_parameterList = 61, RULE_parameterDeclaration = 62, 
		RULE_identifierList = 63, RULE_typeName = 64, RULE_abstractDeclarator = 65, 
		RULE_directAbstractDeclarator = 66, RULE_typedefName = 67, RULE_initializer = 68, 
		RULE_initializerList = 69, RULE_designation = 70, RULE_designatorList = 71, 
		RULE_designator = 72, RULE_staticAssertDeclaration = 73, RULE_statement = 74, 
		RULE_labeledStatement = 75, RULE_compoundStatement = 76, RULE_blockItemList = 77, 
		RULE_blockItem = 78, RULE_expressionStatement = 79, RULE_ifGood = 80, 
		RULE_testExpresstion = 81, RULE_initStatement = 82, RULE_selectionStatement = 83, 
		RULE_iterationStatement = 84, RULE_jumpStatement = 85, RULE_compilationUnit = 86, 
		RULE_translationUnit = 87, RULE_externalDeclaration = 88, RULE_functionDefinition = 89, 
		RULE_declarationList = 90;
	public static final String[] ruleNames = {
		"includeDef", "primaryExpression", "genericSelection", "genericAssocList", 
		"genericAssociation", "postfixExpression", "argumentExpressionList", "moreLessMethodExpression", 
		"lessMethodExpression", "methodExpression", "unaryExpression", "unaryOperator", 
		"castExpression", "multiplicativeExpression", "additiveExpression", "shiftExpression", 
		"relationalExpression", "equalityExpression", "andExpression", "exclusiveOrExpression", 
		"inclusiveOrExpression", "logicalAndExpression", "logicalOrExpression", 
		"conditionalExpression", "assignmentExpression", "assignmentOperator", 
		"expression", "constantExpression", "declaration", "declarationSpecifiers", 
		"declarationSpecifiers2", "declarationSpecifier", "initDeclaratorList", 
		"initDeclarator", "storageClassSpecifier", "typeSpecifier", "structOrUnionSpecifier", 
		"structOrUnion", "structDeclarationList", "structDeclaration", "specifierQualifierList", 
		"structDeclaratorList", "structDeclarator", "enumSpecifier", "enumeratorList", 
		"enumerator", "enumerationConstant", "atomicTypeSpecifier", "typeQualifier", 
		"functionSpecifier", "alignmentSpecifier", "declarator", "directDeclarator", 
		"gccDeclaratorExtension", "gccAttributeSpecifier", "gccAttributeList", 
		"gccAttribute", "nestedParenthesesBlock", "pointer", "typeQualifierList", 
		"parameterTypeList", "parameterList", "parameterDeclaration", "identifierList", 
		"typeName", "abstractDeclarator", "directAbstractDeclarator", "typedefName", 
		"initializer", "initializerList", "designation", "designatorList", "designator", 
		"staticAssertDeclaration", "statement", "labeledStatement", "compoundStatement", 
		"blockItemList", "blockItem", "expressionStatement", "ifGood", "testExpresstion", 
		"initStatement", "selectionStatement", "iterationStatement", "jumpStatement", 
		"compilationUnit", "translationUnit", "externalDeclaration", "functionDefinition", 
		"declarationList"
	};

	@Override
	public String getGrammarFileName() { return "C.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		
		private ArrayList<String> listOfErrorsGlobal=new ArrayList<String>();
		private ArrayList<Integer> arrayDemention=new ArrayList<Integer>();
		private ArrayList<String> setOfFields=new ArrayList<String>();
		private ArrayList< ArrayList<String>>globalLists=new ArrayList<ArrayList<String>>();
		private boolean isFirst=false;
		private boolean ifUp=false; 
		private boolean endExp=false;
		private boolean isInit=false;
		private boolean errorInit=false;
		private boolean declarationOfArray=false;
		private boolean multiEx=false;
		private boolean leftMulti=false;
		
		
		
		

	public CParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IncludeDefContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public IncludeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterIncludeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitIncludeDef(this);
		}
	}

	public final IncludeDefContext includeDef() throws RecognitionException {
		IncludeDefContext _localctx = new IncludeDefContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_includeDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); match(11);
			setState(183); match(Identifier);
			setState(184); match(1);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Constant() { return getToken(CParser.Constant, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(CParser.StringLiteral); }
		public GenericSelectionContext genericSelection() {
			return getRuleContext(GenericSelectionContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode StringLiteral(int i) {
			return getToken(CParser.StringLiteral, i);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primaryExpression);
		int _la;
		try {
			int _alt;
			setState(219);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187); match(Constant);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(188); match(StringLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(191); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193); match(LeftParen);
				setState(194); expression(0);
				setState(195); match(RightParen);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(197); genericSelection();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(199);
				_la = _input.LA(1);
				if (_la==3) {
					{
					setState(198); match(3);
					}
				}

				setState(201); match(LeftParen);
				setState(202); compoundStatement();
				setState(203); match(RightParen);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(205); match(9);
				setState(206); match(LeftParen);
				setState(207); unaryExpression();
				setState(208); match(Comma);
				setState(209); typeName();
				setState(210); match(RightParen);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(212); match(12);
				setState(213); match(LeftParen);
				setState(214); typeName();
				setState(215); match(Comma);
				setState(216); unaryExpression();
				setState(217); match(RightParen);
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

	public static class GenericSelectionContext extends ParserRuleContext {
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public GenericSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericSelection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterGenericSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitGenericSelection(this);
		}
	}

	public final GenericSelectionContext genericSelection() throws RecognitionException {
		GenericSelectionContext _localctx = new GenericSelectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_genericSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); match(Generic);
			setState(222); match(LeftParen);
			setState(223); assignmentExpression();
			setState(224); match(Comma);
			setState(225); genericAssocList(0);
			setState(226); match(RightParen);
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

	public static class GenericAssocListContext extends ParserRuleContext {
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public GenericAssociationContext genericAssociation() {
			return getRuleContext(GenericAssociationContext.class,0);
		}
		public GenericAssocListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssocList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterGenericAssocList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitGenericAssocList(this);
		}
	}

	public final GenericAssocListContext genericAssocList() throws RecognitionException {
		return genericAssocList(0);
	}

	private GenericAssocListContext genericAssocList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GenericAssocListContext _localctx = new GenericAssocListContext(_ctx, _parentState);
		GenericAssocListContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_genericAssocList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(229); genericAssociation();
			}
			_ctx.stop = _input.LT(-1);
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GenericAssocListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_genericAssocList);
					setState(231);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(232); match(Comma);
					setState(233); genericAssociation();
					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class GenericAssociationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public GenericAssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssociation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterGenericAssociation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitGenericAssociation(this);
		}
	}

	public final GenericAssociationContext genericAssociation() throws RecognitionException {
		GenericAssociationContext _localctx = new GenericAssociationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_genericAssociation);
		try {
			setState(246);
			switch (_input.LA(1)) {
			case 2:
			case 3:
			case 10:
			case 14:
			case 16:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Atomic:
			case Bool:
			case Complex:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(239); typeName();
				setState(240); match(Colon);
				setState(241); assignmentExpression();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 2);
				{
				setState(243); match(Default);
				setState(244); match(Colon);
				setState(245); assignmentExpression();
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitPostfixExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_postfixExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(249); primaryExpression();
				}
				break;

			case 2:
				{
				setState(250); match(LeftParen);
				setState(251); typeName();
				setState(252); match(RightParen);
				setState(253); match(LeftBrace);
				setState(254); initializerList(0);
				setState(255); match(RightBrace);
				}
				break;

			case 3:
				{
				setState(257); match(LeftParen);
				setState(258); typeName();
				setState(259); match(RightParen);
				setState(260); match(LeftBrace);
				setState(261); initializerList(0);
				setState(262); match(Comma);
				setState(263); match(RightBrace);
				}
				break;

			case 4:
				{
				setState(265); match(3);
				setState(266); match(LeftParen);
				setState(267); typeName();
				setState(268); match(RightParen);
				setState(269); match(LeftBrace);
				setState(270); initializerList(0);
				setState(271); match(RightBrace);
				}
				break;

			case 5:
				{
				setState(273); match(3);
				setState(274); match(LeftParen);
				setState(275); typeName();
				setState(276); match(RightParen);
				setState(277); match(LeftBrace);
				setState(278); initializerList(0);
				setState(279); match(Comma);
				setState(280); match(RightBrace);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(299);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(284);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(285); match(LeftBracket);
						setState(286); expression(0);
						setState(287); match(RightBracket);
						}
						break;

					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(289);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(290); match(Dot);
						setState(291); match(Identifier);
						}
						break;

					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(292);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(293); match(Arrow);
						setState(294); match(Identifier);
						}
						break;

					case 4:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(295);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(296); match(PlusPlus);
						}
						break;

					case 5:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(297);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(298); match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterArgumentExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitArgumentExpressionList(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		return argumentExpressionList(0);
	}

	private ArgumentExpressionListContext argumentExpressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, _parentState);
		ArgumentExpressionListContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_argumentExpressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(305); assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argumentExpressionList);
					setState(307);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(308); match(Comma);
					setState(309); assignmentExpression();
					}
					} 
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class MoreLessMethodExpressionContext extends ParserRuleContext {
		public LessMethodExpressionContext lessMethodExpression() {
			return getRuleContext(LessMethodExpressionContext.class,0);
		}
		public MoreLessMethodExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreLessMethodExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterMoreLessMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitMoreLessMethodExpression(this);
		}
	}

	public final MoreLessMethodExpressionContext moreLessMethodExpression() throws RecognitionException {
		MoreLessMethodExpressionContext _localctx = new MoreLessMethodExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_moreLessMethodExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315); lessMethodExpression();
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

	public static class LessMethodExpressionContext extends ParserRuleContext {
		public MethodExpressionContext methodExpression() {
			return getRuleContext(MethodExpressionContext.class,0);
		}
		public LessMethodExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessMethodExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterLessMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitLessMethodExpression(this);
		}
	}

	public final LessMethodExpressionContext lessMethodExpression() throws RecognitionException {
		LessMethodExpressionContext _localctx = new LessMethodExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lessMethodExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317); methodExpression();
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

	public static class MethodExpressionContext extends ParserRuleContext {
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public MethodExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitMethodExpression(this);
		}
	}

	public final MethodExpressionContext methodExpression() throws RecognitionException {
		MethodExpressionContext _localctx = new MethodExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodExpression);
		try {
			setState(330);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319); primaryExpression();
				setState(320); match(LeftParen);
				setState(321); argumentExpressionList(0);
				setState(322); match(RightParen);
				if(!isFirst){
						globalLists.get(0).add(_input.getTokenSource().getLine()+"|IF001");
						isFirst=true;
					}
					
					
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325); primaryExpression();
				setState(326); match(LeftParen);
				setState(327); match(RightParen);

					
					if(!isFirst){
							globalLists.get(0).add(_input.getTokenSource().getLine()+"|IF001");
						isFirst=true;
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public MoreLessMethodExpressionContext moreLessMethodExpression() {
			return getRuleContext(MoreLessMethodExpressionContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unaryExpression);
		try {
			setState(356);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				isFirst=true;
				setState(333); postfixExpression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334); moreLessMethodExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(335); match(PlusPlus);
				setState(336); unaryExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(337); match(MinusMinus);
				setState(338); unaryExpression();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(339); unaryOperator();
				setState(340); castExpression();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(342); match(Sizeof);
				setState(343); unaryExpression();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(344); match(Sizeof);
				setState(345); match(LeftParen);
				setState(346); typeName();
				setState(347); match(RightParen);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(349); match(Alignof);
				setState(350); match(LeftParen);
				setState(351); typeName();
				setState(352); match(RightParen);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(354); match(AndAnd);
				setState(355); match(Identifier);
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitUnaryOperator(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (Minus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class CastExpressionContext extends ParserRuleContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_castExpression);
		try {
			setState(374);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360); unaryExpression();

				 	if(multiEx||leftMulti){
					try{
						
						int multiplay=Integer.valueOf(_localctx.getText());
							if((multiplay & -multiplay) == multiplay){
								globalLists.get(0).add(_input.getTokenSource().getLine()+"|M001");
							}		
						}
						catch(NumberFormatException exp){
							/*System.out.println(exp.getStackTrace());*/
							
						try{			
						int multiplay=Integer.valueOf(_localctx.getParent().getText().substring(0, _localctx.getParent().getText().indexOf('*')));
							if((multiplay & -multiplay) == multiplay){
								globalLists.get(0).add(_input.getTokenSource().getLine()+"|M001");
							}		
						}
						catch(NumberFormatException exp1){
							/*System.out.println(exp1.getStackTrace());*/
						}
										
						}
						
					}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363); match(LeftParen);
				setState(364); typeName();
				setState(365); match(RightParen);
				setState(366); castExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(368); match(3);
				setState(369); match(LeftParen);
				setState(370); typeName();
				setState(371); match(RightParen);
				setState(372); castExpression();
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(377); castExpression();
			if(multiEx){leftMulti=true;}
			}
			_ctx.stop = _input.LT(-1);
			setState(392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(390);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(380);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(381); match(Star);
						 multiEx=true;
						setState(383); castExpression();
						}
						break;

					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(384);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(385); match(Div);
						setState(386); castExpression();
						}
						break;

					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(387);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(388); match(Mod);
						setState(389); castExpression();
						}
						break;
					}
					} 
				}
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(396); multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(410);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(408);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(398);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(399); match(Plus);
						setState(400); multiplicativeExpression(0);
						if(isInit&&!errorInit){ globalLists.get(0).add(_input.getTokenSource().getLine()+"|D001"); errorInit=true; 
						          	
						          }
						}
						break;

					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(403);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(404); match(Minus);
						setState(405); multiplicativeExpression(0);
						if(isInit&&!errorInit){ globalLists.get(0).add(_input.getTokenSource().getLine()+"|D001"); errorInit=true; 
						          }
						}
						break;
					}
					} 
				}
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class ShiftExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(414); additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(422);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(416);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(417); match(LeftShift);
						setState(418); additiveExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(419);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(420); match(RightShift);
						setState(421); additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(428); shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(444);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(442);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(430);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(431); match(Less);
						setState(432); shiftExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(433);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(434); match(Greater);
						setState(435); shiftExpression(0);
						}
						break;

					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(436);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(437); match(LessEqual);
						setState(438); shiftExpression(0);
						}
						break;

					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(439);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(440); match(GreaterEqual);
						setState(441); shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(446);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(448); relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(456);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(450);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(451); match(Equal);
						setState(452); relationalExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(453);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(454); match(NotEqual);
						setState(455); relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(462); equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(464);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(465); match(And);
					setState(466); equalityExpression(0);
					}
					} 
				}
				setState(471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(473); andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(480);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(475);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(476); match(Caret);
					setState(477); andExpression(0);
					}
					} 
				}
				setState(482);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(484); exclusiveOrExpression(0);
			/*isFirst=true;*/
			}
			_ctx.stop = _input.LT(-1);
			setState(492);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(487);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(488); match(Or);
					setState(489); exclusiveOrExpression(0);
					}
					} 
				}
				setState(494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitLogicalAndExpression(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		return logicalAndExpression(0);
	}

	private LogicalAndExpressionContext logicalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, _parentState);
		LogicalAndExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(496); inclusiveOrExpression(0);
			if(endExp)isFirst=true;
			}
			_ctx.stop = _input.LT(-1);
			setState(506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(499);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(500); match(AndAnd);
					setState(501); inclusiveOrExpression(0);
					 
					          	endExp=true; 
					          
					}
					} 
				}
				setState(508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitLogicalOrExpression(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		return logicalOrExpression(0);
	}

	private LogicalOrExpressionContext logicalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, _parentState);
		LogicalOrExpressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(510); logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(517);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(512);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(513); match(OrOr);
					setState(514); logicalAndExpression(0);
					}
					} 
				}
				setState(519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520); logicalOrExpression(0);
			setState(526);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(521); match(Question);
				setState(522); expression(0);
				setState(523); match(Colon);
				setState(524); conditionalExpression();
				}
				break;
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignmentExpression);
		try {
			setState(535);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(528); conditionalExpression();

					
				if(declarationOfArray){
					try{
					if(!_localctx.getText().equals(""))  /* error */
					arrayDemention.add(Integer.valueOf(_localctx.getText()));
					if(arrayDemention.size()>1){
						for(int i=1;i<arrayDemention.size();i++){	
							if((arrayDemention.get(i) & -arrayDemention.get(i))!=arrayDemention.get(i)){
								globalLists.get(0).add(_input.getTokenSource().getLine()+"|ARD001");
							}
						}
					}
					}
					catch(NumberFormatException exp){
							/*System.out.println(exp.getStackTrace());*/
						}
					
				}


				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531); unaryExpression();
				setState(532); assignmentOperator();
				setState(533); assignmentExpression();
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_la = _input.LA(1);
			if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (Assign - 91)) | (1L << (StarAssign - 91)) | (1L << (DivAssign - 91)) | (1L << (ModAssign - 91)) | (1L << (PlusAssign - 91)) | (1L << (MinusAssign - 91)) | (1L << (LeftShiftAssign - 91)) | (1L << (RightShiftAssign - 91)) | (1L << (AndAssign - 91)) | (1L << (XorAssign - 91)) | (1L << (OrAssign - 91)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(540); assignmentExpression();
			multiEx=false;leftMulti=false;
			}
			_ctx.stop = _input.LT(-1);
			setState(548);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(543);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(544); match(Comma);
					setState(545); assignmentExpression();
					}
					} 
				}
				setState(550);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551); conditionalExpression();
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

	public static class DeclarationContext extends ParserRuleContext {
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declaration);
		int _la;
		try {
			setState(560);
			switch (_input.LA(1)) {
			case 2:
			case 3:
			case 4:
			case 6:
			case 8:
			case 10:
			case 13:
			case 14:
			case 16:
			case Auto:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Extern:
			case Float:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Typedef:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Alignas:
			case Atomic:
			case Bool:
			case Complex:
			case Noreturn:
			case ThreadLocal:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(553); declarationSpecifiers();
				setState(555);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (LeftParen - 61)) | (1L << (Star - 61)) | (1L << (Caret - 61)) | (1L << (Identifier - 61)))) != 0)) {
					{
					setState(554); initDeclaratorList(0);
					}
				}

				setState(557); match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(559); staticAssertDeclaration();
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

	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDeclarationSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDeclarationSpecifiers(this);
		}
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(563); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(562); declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(565); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class DeclarationSpecifiers2Context extends ParserRuleContext {
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifiers2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDeclarationSpecifiers2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDeclarationSpecifiers2(this);
		}
	}

	public final DeclarationSpecifiers2Context declarationSpecifiers2() throws RecognitionException {
		DeclarationSpecifiers2Context _localctx = new DeclarationSpecifiers2Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_declarationSpecifiers2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(568); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(567); declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(570); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public AlignmentSpecifierContext alignmentSpecifier() {
			return getRuleContext(AlignmentSpecifierContext.class,0);
		}
		public FunctionSpecifierContext functionSpecifier() {
			return getRuleContext(FunctionSpecifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDeclarationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDeclarationSpecifier(this);
		}
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_declarationSpecifier);
		try {
			setState(577);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(572); storageClassSpecifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(573); typeSpecifier();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(574); typeQualifier();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(575); functionSpecifier();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(576); alignmentSpecifier();
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

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitInitDeclaratorList(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		return initDeclaratorList(0);
	}

	private InitDeclaratorListContext initDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, _parentState);
		InitDeclaratorListContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_initDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			declarationOfArray=true;arrayDemention=new ArrayList<Integer>();
			setState(581); initDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initDeclaratorList);
					setState(583);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(584); match(Comma);
					setState(585); initDeclarator();
					}
					} 
				}
				setState(590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class InitDeclaratorContext extends ParserRuleContext {
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitInitDeclarator(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_initDeclarator);
		try {
			setState(597);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(591); declarator();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592); declarator();
				setState(593); match(Assign);
				isInit=true; errorInit=false;
				setState(595); initializer();
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

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStorageClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStorageClassSpecifier(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Extern) | (1L << Register) | (1L << Static) | (1L << Typedef) | (1L << ThreadLocal))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class TypeSpecifierContext extends ParserRuleContext {
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AtomicTypeSpecifierContext atomicTypeSpecifier() {
			return getRuleContext(AtomicTypeSpecifierContext.class,0);
		}
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitTypeSpecifier(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_typeSpecifier);
		int _la;
		try {
			setState(615);
			switch (_input.LA(1)) {
			case 2:
			case 10:
			case 16:
			case Char:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Bool:
			case Complex:
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 10) | (1L << 16) | (1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Unsigned) | (1L << Void) | (1L << Bool) | (1L << Complex))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 2);
				{
				setState(602); match(3);
				setState(603); match(LeftParen);
				setState(604);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 10) | (1L << 16))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(605); match(RightParen);
				}
				break;
			case Atomic:
				enterOuterAlt(_localctx, 3);
				{
				setState(606); atomicTypeSpecifier();
				}
				break;
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 4);
				{
				setState(607); structOrUnionSpecifier();
				}
				break;
			case Enum:
				enterOuterAlt(_localctx, 5);
				{
				setState(608); enumSpecifier();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 6);
				{
				setState(609); typedefName();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 7);
				{
				setState(610); match(14);
				setState(611); match(LeftParen);
				setState(612); constantExpression();
				setState(613); match(RightParen);
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

	public static class StructOrUnionSpecifierContext extends ParserRuleContext {
		public StructOrUnionContext structOrUnion() {
			return getRuleContext(StructOrUnionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public StructOrUnionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStructOrUnionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStructOrUnionSpecifier(this);
		}
	}

	public final StructOrUnionSpecifierContext structOrUnionSpecifier() throws RecognitionException {
		StructOrUnionSpecifierContext _localctx = new StructOrUnionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_structOrUnionSpecifier);
		int _la;
		try {
			setState(628);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(617); structOrUnion();
				setState(619);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(618); match(Identifier);
					}
				}

				setState(621); match(LeftBrace);
				setState(622); structDeclarationList(0);
				setState(623); match(RightBrace);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625); structOrUnion();
				setState(626); match(Identifier);
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

	public static class StructOrUnionContext extends ParserRuleContext {
		public StructOrUnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStructOrUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStructOrUnion(this);
		}
	}

	public final StructOrUnionContext structOrUnion() throws RecognitionException {
		StructOrUnionContext _localctx = new StructOrUnionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_structOrUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			_la = _input.LA(1);
			if ( !(_la==Struct || _la==Union) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class StructDeclarationListContext extends ParserRuleContext {
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public StructDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStructDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStructDeclarationList(this);
		}
	}

	public final StructDeclarationListContext structDeclarationList() throws RecognitionException {
		return structDeclarationList(0);
	}

	private StructDeclarationListContext structDeclarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructDeclarationListContext _localctx = new StructDeclarationListContext(_ctx, _parentState);
		StructDeclarationListContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_structDeclarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(633); structDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(639);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructDeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_structDeclarationList);
					setState(635);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(636); structDeclaration();
					}
					} 
				}
				setState(641);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	public static class StructDeclarationContext extends ParserRuleContext {
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStructDeclaration(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_structDeclaration);
		int _la;
		try {
			setState(649);
			switch (_input.LA(1)) {
			case 2:
			case 3:
			case 10:
			case 14:
			case 16:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Atomic:
			case Bool:
			case Complex:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(642); specifierQualifierList();
				setState(644);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (LeftParen - 61)) | (1L << (Star - 61)) | (1L << (Caret - 61)) | (1L << (Colon - 61)) | (1L << (Identifier - 61)))) != 0)) {
					{
					setState(643); structDeclaratorList(0);
					}
				}

				setState(646); match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(648); staticAssertDeclaration();
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

	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterSpecifierQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitSpecifierQualifierList(this);
		}
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_specifierQualifierList);
		try {
			setState(659);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(651); typeSpecifier();
				setState(653);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(652); specifierQualifierList();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(655); typeQualifier();
				setState(657);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(656); specifierQualifierList();
					}
					break;
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

	public static class StructDeclaratorListContext extends ParserRuleContext {
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public StructDeclaratorContext structDeclarator() {
			return getRuleContext(StructDeclaratorContext.class,0);
		}
		public StructDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStructDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStructDeclaratorList(this);
		}
	}

	public final StructDeclaratorListContext structDeclaratorList() throws RecognitionException {
		return structDeclaratorList(0);
	}

	private StructDeclaratorListContext structDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructDeclaratorListContext _localctx = new StructDeclaratorListContext(_ctx, _parentState);
		StructDeclaratorListContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_structDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(662); structDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(669);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_structDeclaratorList);
					setState(664);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(665); match(Comma);
					setState(666); structDeclarator();
					}
					} 
				}
				setState(671);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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

	public static class StructDeclaratorContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public StructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStructDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStructDeclarator(this);
		}
	}

	public final StructDeclaratorContext structDeclarator() throws RecognitionException {
		StructDeclaratorContext _localctx = new StructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_structDeclarator);
		int _la;
		try {
			setState(678);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(672); declarator();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (LeftParen - 61)) | (1L << (Star - 61)) | (1L << (Caret - 61)) | (1L << (Identifier - 61)))) != 0)) {
					{
					setState(673); declarator();
					}
				}

				setState(676); match(Colon);
				setState(677); constantExpression();
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

	public static class EnumSpecifierContext extends ParserRuleContext {
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterEnumSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitEnumSpecifier(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_enumSpecifier);
		int _la;
		try {
			setState(699);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(680); match(Enum);
				setState(682);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(681); match(Identifier);
					}
				}

				setState(684); match(LeftBrace);
				setState(685); enumeratorList(0);
				setState(686); match(RightBrace);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(688); match(Enum);
				setState(690);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(689); match(Identifier);
					}
				}

				setState(692); match(LeftBrace);
				setState(693); enumeratorList(0);
				setState(694); match(Comma);
				setState(695); match(RightBrace);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(697); match(Enum);
				setState(698); match(Identifier);
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

	public static class EnumeratorListContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterEnumeratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitEnumeratorList(this);
		}
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		return enumeratorList(0);
	}

	private EnumeratorListContext enumeratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, _parentState);
		EnumeratorListContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_enumeratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(702); enumerator();
			}
			_ctx.stop = _input.LT(-1);
			setState(709);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorList);
					setState(704);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(705); match(Comma);
					setState(706); enumerator();
					}
					} 
				}
				setState(711);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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

	public static class EnumeratorContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumerationConstantContext enumerationConstant() {
			return getRuleContext(EnumerationConstantContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitEnumerator(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_enumerator);
		try {
			setState(717);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(712); enumerationConstant();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(713); enumerationConstant();
				setState(714); match(Assign);
				setState(715); constantExpression();
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

	public static class EnumerationConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public EnumerationConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterEnumerationConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitEnumerationConstant(this);
		}
	}

	public final EnumerationConstantContext enumerationConstant() throws RecognitionException {
		EnumerationConstantContext _localctx = new EnumerationConstantContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719); match(Identifier);
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

	public static class AtomicTypeSpecifierContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public AtomicTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAtomicTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAtomicTypeSpecifier(this);
		}
	}

	public final AtomicTypeSpecifierContext atomicTypeSpecifier() throws RecognitionException {
		AtomicTypeSpecifierContext _localctx = new AtomicTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_atomicTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721); match(Atomic);
			setState(722); match(LeftParen);
			setState(723); typeName();
			setState(724); match(RightParen);
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

	public static class TypeQualifierContext extends ParserRuleContext {
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterTypeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitTypeQualifier(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class FunctionSpecifierContext extends ParserRuleContext {
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterFunctionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitFunctionSpecifier(this);
		}
	}

	public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
		FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_functionSpecifier);
		int _la;
		try {
			setState(734);
			switch (_input.LA(1)) {
			case 4:
			case 8:
			case Inline:
			case Noreturn:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 8) | (1L << Inline) | (1L << Noreturn))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 2);
				{
				setState(729); gccAttributeSpecifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 3);
				{
				setState(730); match(6);
				setState(731); match(LeftParen);
				setState(732); match(Identifier);
				setState(733); match(RightParen);
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

	public static class AlignmentSpecifierContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AlignmentSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAlignmentSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAlignmentSpecifier(this);
		}
	}

	public final AlignmentSpecifierContext alignmentSpecifier() throws RecognitionException {
		AlignmentSpecifierContext _localctx = new AlignmentSpecifierContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_alignmentSpecifier);
		try {
			setState(746);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(736); match(Alignas);
				setState(737); match(LeftParen);
				setState(738); typeName();
				setState(739); match(RightParen);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(741); match(Alignas);
				setState(742); match(LeftParen);
				setState(743); constantExpression();
				setState(744); match(RightParen);
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

	public static class DeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_declarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			_la = _input.LA(1);
			if (_la==Star || _la==Caret) {
				{
				setState(748); pointer();
				}
			}

			setState(751); directDeclarator(0);
			 
					String name=_localctx.getText();
					
						
					if(name.indexOf('(')==-1&& name.indexOf('[')==-1){
					
						if(!globalLists.get(1).contains(name))
						globalLists.get(1).add(name);
					}
					else{
						if(name.indexOf('(')!=-1){
							name=name.substring(0,name.indexOf('('));
							if(!globalLists.get(1).contains(name))
							globalLists.get(1).add(name);
						}else{
							name=name.substring(0,name.indexOf('['));
							if(!globalLists.get(1).contains(name))
							
							globalLists.get(1).add(name);
						}
						
					}
					
				
				
			setState(756);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(753); gccDeclaratorExtension();
					}
					} 
				}
				setState(758);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDirectDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDirectDeclarator(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(760); match(Identifier);
				}
				break;
			case LeftParen:
				{
				setState(761); match(LeftParen);
				setState(762); declarator();
				setState(763); match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(812);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(810);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(767);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(768); match(LeftBracket);
						setState(770);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(769); typeQualifierList(0);
							}
						}

						setState(773);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 12) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
							{
							setState(772); assignmentExpression();
							}
						}

						setState(775); match(RightBracket);
						}
						break;

					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(776);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(777); match(LeftBracket);
						setState(778); match(Static);
						setState(780);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(779); typeQualifierList(0);
							}
						}

						setState(782); assignmentExpression();
						setState(783); match(RightBracket);
						}
						break;

					case 3:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(785);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(786); match(LeftBracket);
						setState(787); typeQualifierList(0);
						setState(788); match(Static);
						setState(789); assignmentExpression();
						setState(790); match(RightBracket);
						}
						break;

					case 4:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(792);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(793); match(LeftBracket);
						setState(795);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(794); typeQualifierList(0);
							}
						}

						setState(797); match(Star);
						setState(798); match(RightBracket);
						}
						break;

					case 5:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(799);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(800); match(LeftParen);
						setState(801); parameterTypeList();
						setState(802); match(RightParen);
						}
						break;

					case 6:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(804);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(805); match(LeftParen);
						setState(807);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(806); identifierList(0);
							}
						}

						setState(809); match(RightParen);
						}
						break;
					}
					} 
				}
				setState(814);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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

	public static class GccDeclaratorExtensionContext extends ParserRuleContext {
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(CParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CParser.StringLiteral, i);
		}
		public GccDeclaratorExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccDeclaratorExtension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterGccDeclaratorExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitGccDeclaratorExtension(this);
		}
	}

	public final GccDeclaratorExtensionContext gccDeclaratorExtension() throws RecognitionException {
		GccDeclaratorExtensionContext _localctx = new GccDeclaratorExtensionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_gccDeclaratorExtension);
		int _la;
		try {
			setState(824);
			switch (_input.LA(1)) {
			case 7:
				enterOuterAlt(_localctx, 1);
				{
				setState(815); match(7);
				setState(816); match(LeftParen);
				setState(818); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(817); match(StringLiteral);
					}
					}
					setState(820); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				setState(822); match(RightParen);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 2);
				{
				setState(823); gccAttributeSpecifier();
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

	public static class GccAttributeSpecifierContext extends ParserRuleContext {
		public GccAttributeListContext gccAttributeList() {
			return getRuleContext(GccAttributeListContext.class,0);
		}
		public GccAttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterGccAttributeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitGccAttributeSpecifier(this);
		}
	}

	public final GccAttributeSpecifierContext gccAttributeSpecifier() throws RecognitionException {
		GccAttributeSpecifierContext _localctx = new GccAttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_gccAttributeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826); match(13);
			setState(827); match(LeftParen);
			setState(828); match(LeftParen);
			setState(829); gccAttributeList();
			setState(830); match(RightParen);
			setState(831); match(RightParen);
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

	public static class GccAttributeListContext extends ParserRuleContext {
		public GccAttributeContext gccAttribute(int i) {
			return getRuleContext(GccAttributeContext.class,i);
		}
		public List<GccAttributeContext> gccAttribute() {
			return getRuleContexts(GccAttributeContext.class);
		}
		public GccAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterGccAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitGccAttributeList(this);
		}
	}

	public final GccAttributeListContext gccAttributeList() throws RecognitionException {
		GccAttributeListContext _localctx = new GccAttributeListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_gccAttributeList);
		int _la;
		try {
			setState(842);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(833); gccAttribute();
				setState(838);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(834); match(Comma);
					setState(835); gccAttribute();
					}
					}
					setState(840);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class GccAttributeContext extends ParserRuleContext {
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public GccAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterGccAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitGccAttribute(this);
		}
	}

	public final GccAttributeContext gccAttribute() throws RecognitionException {
		GccAttributeContext _localctx = new GccAttributeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_gccAttribute);
		int _la;
		try {
			setState(853);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case Auto:
			case Break:
			case Case:
			case Char:
			case Const:
			case Continue:
			case Default:
			case Do:
			case Double:
			case Else:
			case Enum:
			case Extern:
			case Float:
			case For:
			case Goto:
			case If:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Return:
			case Short:
			case Signed:
			case Sizeof:
			case Static:
			case Struct:
			case Switch:
			case Typedef:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case While:
			case Alignas:
			case Alignof:
			case Atomic:
			case Bool:
			case Complex:
			case Generic:
			case Imaginary:
			case Noreturn:
			case StaticAssert:
			case ThreadLocal:
			case LeftBracket:
			case RightBracket:
			case LeftBrace:
			case RightBrace:
			case Less:
			case LessEqual:
			case Greater:
			case GreaterEqual:
			case LeftShift:
			case RightShift:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case Div:
			case Mod:
			case And:
			case Or:
			case AndAnd:
			case OrOr:
			case Caret:
			case Not:
			case Tilde:
			case Question:
			case Colon:
			case Semi:
			case Assign:
			case StarAssign:
			case DivAssign:
			case ModAssign:
			case PlusAssign:
			case MinusAssign:
			case LeftShiftAssign:
			case RightShiftAssign:
			case AndAssign:
			case XorAssign:
			case OrAssign:
			case Equal:
			case NotEqual:
			case Arrow:
			case Dot:
			case Ellipsis:
			case Identifier:
			case Constant:
			case StringLiteral:
			case Whitespace:
			case Newline:
			case BlockComment:
			case LineComment:
				enterOuterAlt(_localctx, 1);
				{
				setState(844);
				_la = _input.LA(1);
				if ( _la <= 0 || (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (LeftParen - 61)) | (1L << (RightParen - 61)) | (1L << (Comma - 61)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(850);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(845); match(LeftParen);
					setState(847);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 12) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
						{
						setState(846); argumentExpressionList(0);
						}
					}

					setState(849); match(RightParen);
					}
				}

				}
				break;
			case RightParen:
			case Comma:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class NestedParenthesesBlockContext extends ParserRuleContext {
		public List<NestedParenthesesBlockContext> nestedParenthesesBlock() {
			return getRuleContexts(NestedParenthesesBlockContext.class);
		}
		public NestedParenthesesBlockContext nestedParenthesesBlock(int i) {
			return getRuleContext(NestedParenthesesBlockContext.class,i);
		}
		public NestedParenthesesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedParenthesesBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterNestedParenthesesBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitNestedParenthesesBlock(this);
		}
	}

	public final NestedParenthesesBlockContext nestedParenthesesBlock() throws RecognitionException {
		NestedParenthesesBlockContext _localctx = new NestedParenthesesBlockContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen) | (1L << LeftBracket))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RightBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (RightBrace - 64)) | (1L << (Less - 64)) | (1L << (LessEqual - 64)) | (1L << (Greater - 64)) | (1L << (GreaterEqual - 64)) | (1L << (LeftShift - 64)) | (1L << (RightShift - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Comma - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
				{
				setState(860);
				switch (_input.LA(1)) {
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
				case 12:
				case 13:
				case 14:
				case 15:
				case 16:
				case Auto:
				case Break:
				case Case:
				case Char:
				case Const:
				case Continue:
				case Default:
				case Do:
				case Double:
				case Else:
				case Enum:
				case Extern:
				case Float:
				case For:
				case Goto:
				case If:
				case Inline:
				case Int:
				case Long:
				case Register:
				case Restrict:
				case Return:
				case Short:
				case Signed:
				case Sizeof:
				case Static:
				case Struct:
				case Switch:
				case Typedef:
				case Union:
				case Unsigned:
				case Void:
				case Volatile:
				case While:
				case Alignas:
				case Alignof:
				case Atomic:
				case Bool:
				case Complex:
				case Generic:
				case Imaginary:
				case Noreturn:
				case StaticAssert:
				case ThreadLocal:
				case LeftBracket:
				case RightBracket:
				case LeftBrace:
				case RightBrace:
				case Less:
				case LessEqual:
				case Greater:
				case GreaterEqual:
				case LeftShift:
				case RightShift:
				case Plus:
				case PlusPlus:
				case Minus:
				case MinusMinus:
				case Star:
				case Div:
				case Mod:
				case And:
				case Or:
				case AndAnd:
				case OrOr:
				case Caret:
				case Not:
				case Tilde:
				case Question:
				case Colon:
				case Semi:
				case Comma:
				case Assign:
				case StarAssign:
				case DivAssign:
				case ModAssign:
				case PlusAssign:
				case MinusAssign:
				case LeftShiftAssign:
				case RightShiftAssign:
				case AndAssign:
				case XorAssign:
				case OrAssign:
				case Equal:
				case NotEqual:
				case Arrow:
				case Dot:
				case Ellipsis:
				case Identifier:
				case Constant:
				case StringLiteral:
				case Whitespace:
				case Newline:
				case BlockComment:
				case LineComment:
					{
					setState(855);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LeftParen || _la==RightParen) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				case LeftParen:
					{
					setState(856); match(LeftParen);
					setState(857); nestedParenthesesBlock();
					setState(858); match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(864);
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

	public static class PointerContext extends ParserRuleContext {
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitPointer(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_pointer);
		int _la;
		try {
			setState(883);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(865); match(Star);
				setState(867);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(866); typeQualifierList(0);
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(869); match(Star);
				setState(871);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(870); typeQualifierList(0);
					}
				}

				setState(873); pointer();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(874); match(Caret);
				setState(876);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(875); typeQualifierList(0);
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(878); match(Caret);
				setState(880);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(879); typeQualifierList(0);
					}
				}

				setState(882); pointer();
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

	public static class TypeQualifierListContext extends ParserRuleContext {
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public TypeQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterTypeQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitTypeQualifierList(this);
		}
	}

	public final TypeQualifierListContext typeQualifierList() throws RecognitionException {
		return typeQualifierList(0);
	}

	private TypeQualifierListContext typeQualifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeQualifierListContext _localctx = new TypeQualifierListContext(_ctx, _parentState);
		TypeQualifierListContext _prevctx = _localctx;
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_typeQualifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(886); typeQualifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(892);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeQualifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeQualifierList);
					setState(888);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(889); typeQualifier();
					}
					} 
				}
				setState(894);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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

	public static class ParameterTypeListContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterParameterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitParameterTypeList(this);
		}
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_parameterTypeList);
		try {
			setState(900);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(895); parameterList(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(896); parameterList(0);
				setState(897); match(Comma);
				setState(898); match(Ellipsis);
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

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		return parameterList(0);
	}

	private ParameterListContext parameterList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterListContext _localctx = new ParameterListContext(_ctx, _parentState);
		ParameterListContext _prevctx = _localctx;
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_parameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(903); parameterDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(910);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterList);
					setState(905);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(906); match(Comma);
					setState(907); parameterDeclaration();
					}
					} 
				}
				setState(912);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
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

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiers2Context declarationSpecifiers2() {
			return getRuleContext(DeclarationSpecifiers2Context.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitParameterDeclaration(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_parameterDeclaration);
		try {
			setState(920);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(913); declarationSpecifiers();
				setState(914); declarator();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(916); declarationSpecifiers2();
				setState(918);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(917); abstractDeclarator();
					}
					break;
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

	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		return identifierList(0);
	}

	private IdentifierListContext identifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, _parentState);
		IdentifierListContext _prevctx = _localctx;
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_identifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(923); match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(930);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identifierList);
					setState(925);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(926); match(Comma);
					setState(927); match(Identifier);
					}
					} 
				}
				setState(932);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
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

	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933); specifierQualifierList();
			setState(935);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (LeftParen - 61)) | (1L << (LeftBracket - 61)) | (1L << (Star - 61)) | (1L << (Caret - 61)))) != 0)) {
				{
				setState(934); abstractDeclarator();
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

	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAbstractDeclarator(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_abstractDeclarator);
		int _la;
		try {
			int _alt;
			setState(948);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(937); pointer();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(939);
				_la = _input.LA(1);
				if (_la==Star || _la==Caret) {
					{
					setState(938); pointer();
					}
				}

				setState(941); directAbstractDeclarator(0);
				setState(945);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(942); gccDeclaratorExtension();
						}
						} 
					}
					setState(947);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
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

	public static class DirectAbstractDeclaratorContext extends ParserRuleContext {
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directAbstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDirectAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDirectAbstractDeclarator(this);
		}
	}

	public final DirectAbstractDeclaratorContext directAbstractDeclarator() throws RecognitionException {
		return directAbstractDeclarator(0);
	}

	private DirectAbstractDeclaratorContext directAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectAbstractDeclaratorContext _localctx = new DirectAbstractDeclaratorContext(_ctx, _parentState);
		DirectAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_directAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(951); match(LeftParen);
				setState(952); abstractDeclarator();
				setState(953); match(RightParen);
				setState(957);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(954); gccDeclaratorExtension();
						}
						} 
					}
					setState(959);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				}
				}
				break;

			case 2:
				{
				setState(960); match(LeftBracket);
				setState(962);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(961); typeQualifierList(0);
					}
				}

				setState(965);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 12) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(964); assignmentExpression();
					}
				}

				setState(967); match(RightBracket);
				}
				break;

			case 3:
				{
				setState(968); match(LeftBracket);
				setState(969); match(Static);
				setState(971);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(970); typeQualifierList(0);
					}
				}

				setState(973); assignmentExpression();
				setState(974); match(RightBracket);
				}
				break;

			case 4:
				{
				setState(976); match(LeftBracket);
				setState(977); typeQualifierList(0);
				setState(978); match(Static);
				setState(979); assignmentExpression();
				setState(980); match(RightBracket);
				}
				break;

			case 5:
				{
				setState(982); match(LeftBracket);
				setState(983); match(Star);
				setState(984); match(RightBracket);
				}
				break;

			case 6:
				{
				setState(985); match(LeftParen);
				setState(987);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 4) | (1L << 6) | (1L << 8) | (1L << 10) | (1L << 13) | (1L << 14) | (1L << 16) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
					{
					setState(986); parameterTypeList();
					}
				}

				setState(989); match(RightParen);
				setState(993);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(990); gccDeclaratorExtension();
						}
						} 
					}
					setState(995);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1041);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1039);
					switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(998);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(999); match(LeftBracket);
						setState(1001);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(1000); typeQualifierList(0);
							}
						}

						setState(1004);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 12) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
							{
							setState(1003); assignmentExpression();
							}
						}

						setState(1006); match(RightBracket);
						}
						break;

					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1007);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1008); match(LeftBracket);
						setState(1009); match(Static);
						setState(1011);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(1010); typeQualifierList(0);
							}
						}

						setState(1013); assignmentExpression();
						setState(1014); match(RightBracket);
						}
						break;

					case 3:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1016);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1017); match(LeftBracket);
						setState(1018); typeQualifierList(0);
						setState(1019); match(Static);
						setState(1020); assignmentExpression();
						setState(1021); match(RightBracket);
						}
						break;

					case 4:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1023);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1024); match(LeftBracket);
						setState(1025); match(Star);
						setState(1026); match(RightBracket);
						}
						break;

					case 5:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1027);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1028); match(LeftParen);
						setState(1030);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 4) | (1L << 6) | (1L << 8) | (1L << 10) | (1L << 13) | (1L << 14) | (1L << 16) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
							{
							setState(1029); parameterTypeList();
							}
						}

						setState(1032); match(RightParen);
						setState(1036);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
						while ( _alt!=2 && _alt!=-1 ) {
							if ( _alt==1 ) {
								{
								{
								setState(1033); gccDeclaratorExtension();
								}
								} 
							}
							setState(1038);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(1043);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
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

	public static class TypedefNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterTypedefName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitTypedefName(this);
		}
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044); match(Identifier);
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

	public static class InitializerContext extends ParserRuleContext {
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_initializer);
		try {
			setState(1056);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1046); assignmentExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1047); match(LeftBrace);
				setState(1048); initializerList(0);
				setState(1049); match(RightBrace);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1051); match(LeftBrace);
				setState(1052); initializerList(0);
				setState(1053); match(Comma);
				setState(1054); match(RightBrace);
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

	public static class InitializerListContext extends ParserRuleContext {
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public DesignationContext designation() {
			return getRuleContext(DesignationContext.class,0);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitInitializerList(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		return initializerList(0);
	}

	private InitializerListContext initializerList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerListContext _localctx = new InitializerListContext(_ctx, _parentState);
		InitializerListContext _prevctx = _localctx;
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_initializerList, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1060);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Dot) {
				{
				setState(1059); designation();
				}
			}

			setState(1062); initializer();
			}
			_ctx.stop = _input.LT(-1);
			setState(1072);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerList);
					setState(1064);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1065); match(Comma);
					setState(1067);
					_la = _input.LA(1);
					if (_la==LeftBracket || _la==Dot) {
						{
						setState(1066); designation();
						}
					}

					setState(1069); initializer();
					}
					} 
				}
				setState(1074);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
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

	public static class DesignationContext extends ParserRuleContext {
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDesignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDesignation(this);
		}
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075); designatorList(0);
			setState(1076); match(Assign);
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

	public static class DesignatorListContext extends ParserRuleContext {
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public DesignatorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designatorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDesignatorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDesignatorList(this);
		}
	}

	public final DesignatorListContext designatorList() throws RecognitionException {
		return designatorList(0);
	}

	private DesignatorListContext designatorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DesignatorListContext _localctx = new DesignatorListContext(_ctx, _parentState);
		DesignatorListContext _prevctx = _localctx;
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_designatorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1079); designator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1085);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DesignatorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_designatorList);
					setState(1081);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1082); designator();
					}
					} 
				}
				setState(1087);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
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

	public static class DesignatorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDesignator(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_designator);
		try {
			setState(1094);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1088); match(LeftBracket);
				setState(1089); constantExpression();
				setState(1090); match(RightBracket);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(1092); match(Dot);
				setState(1093); match(Identifier);
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

	public static class StaticAssertDeclarationContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(CParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CParser.StringLiteral, i);
		}
		public StaticAssertDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticAssertDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStaticAssertDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStaticAssertDeclaration(this);
		}
	}

	public final StaticAssertDeclarationContext staticAssertDeclaration() throws RecognitionException {
		StaticAssertDeclarationContext _localctx = new StaticAssertDeclarationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_staticAssertDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1096); match(StaticAssert);
			setState(1097); match(LeftParen);
			setState(1098); constantExpression();
			setState(1099); match(Comma);
			setState(1101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1100); match(StringLiteral);
				}
				}
				setState(1103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(1105); match(RightParen);
			setState(1106); match(Semi);
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

	public static class StatementContext extends ParserRuleContext {
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public List<LogicalOrExpressionContext> logicalOrExpression() {
			return getRuleContexts(LogicalOrExpressionContext.class);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public LogicalOrExpressionContext logicalOrExpression(int i) {
			return getRuleContext(LogicalOrExpressionContext.class,i);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_statement);
		int _la;
		try {
			setState(1145);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1108); labeledStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1109); compoundStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1110); expressionStatement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1111); selectionStatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1112); iterationStatement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1113); jumpStatement();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1114);
				_la = _input.LA(1);
				if ( !(_la==5 || _la==7) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1115);
				_la = _input.LA(1);
				if ( !(_la==15 || _la==Volatile) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1116); match(LeftParen);
				setState(1125);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 12) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(1117); logicalOrExpression(0);
					setState(1122);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(1118); match(Comma);
						setState(1119); logicalOrExpression(0);
						}
						}
						setState(1124);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(1127); match(Colon);
					setState(1136);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 12) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
						{
						setState(1128); logicalOrExpression(0);
						setState(1133);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(1129); match(Comma);
							setState(1130); logicalOrExpression(0);
							}
							}
							setState(1135);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					}
					setState(1142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1143); match(RightParen);
				setState(1144); match(Semi);
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_labeledStatement);
		try {
			setState(1158);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1147); match(Identifier);
				setState(1148); match(Colon);
				setState(1149); statement();
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 2);
				{
				setState(1150); match(Case);
				setState(1151); constantExpression();
				setState(1152); match(Colon);
				setState(1153); statement();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 3);
				{
				setState(1155); match(Default);
				setState(1156); match(Colon);
				setState(1157); statement();
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitCompoundStatement(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160); match(LeftBrace);
			setState(1162);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 16) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (AndAnd - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Semi - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
				{
				setState(1161); blockItemList(0);
				}
			}

			setState(1164); match(RightBrace);
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

	public static class BlockItemListContext extends ParserRuleContext {
		public BlockItemContext blockItem() {
			return getRuleContext(BlockItemContext.class,0);
		}
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterBlockItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitBlockItemList(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		return blockItemList(0);
	}

	private BlockItemListContext blockItemList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, _parentState);
		BlockItemListContext _prevctx = _localctx;
		int _startState = 154;
		enterRecursionRule(_localctx, 154, RULE_blockItemList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			declarationOfArray=false;
			setState(1168); blockItem();
			}
			_ctx.stop = _input.LT(-1);
			setState(1174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockItemListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_blockItemList);
					setState(1170);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1171); blockItem();
					}
					} 
				}
				setState(1176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
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

	public static class BlockItemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitBlockItem(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_blockItem);
		try {
			setState(1180);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				isInit=false; errorInit=false; declarationOfArray=false;
				setState(1178); declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1179); statement();
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 12) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
				{
				setState(1182); expression(0);
				}
			}

			setState(1185); match(Semi);
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

	public static class IfGoodContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfGoodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifGood; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterIfGood(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitIfGood(this);
		}
	}

	public final IfGoodContext ifGood() throws RecognitionException {
		IfGoodContext _localctx = new IfGoodContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_ifGood);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1187); expression(0);

				

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

	public static class TestExpresstionContext extends ParserRuleContext {
		public IfGoodContext ifGood() {
			return getRuleContext(IfGoodContext.class,0);
		}
		public TestExpresstionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testExpresstion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterTestExpresstion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitTestExpresstion(this);
		}
	}

	public final TestExpresstionContext testExpresstion() throws RecognitionException {
		TestExpresstionContext _localctx = new TestExpresstionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_testExpresstion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190); ifGood();
			 isFirst=false; declarationOfArray=false;
				endExp=false;

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

	public static class InitStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public InitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterInitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitInitStatement(this);
		}
	}

	public final InitStatementContext initStatement() throws RecognitionException {
		InitStatementContext _localctx = new InitStatementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_initStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193); statement();
			ifUp=false; declarationOfArray=false;
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

	public static class SelectionStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TestExpresstionContext testExpresstion() {
			return getRuleContext(TestExpresstionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<InitStatementContext> initStatement() {
			return getRuleContexts(InitStatementContext.class);
		}
		public InitStatementContext initStatement(int i) {
			return getRuleContext(InitStatementContext.class,i);
		}
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitSelectionStatement(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_selectionStatement);
		try {
			setState(1213);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(1196); match(If);
				setState(1197); match(LeftParen);
				setState(1198); testExpresstion();
				setState(1199); match(RightParen);
				setState(1200); initStatement();
				setState(1203);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1201); match(Else);
					setState(1202); initStatement();
					}
					break;
				}
				ifUp=true; declarationOfArray=false; 
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(1207); match(Switch);
				setState(1208); match(LeftParen);
				setState(1209); expression(0);
				setState(1210); match(RightParen);
				setState(1211); statement();
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

	public static class IterationStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitIterationStatement(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_iterationStatement);
		int _la;
		try {
			setState(1257);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1215); match(While);
				setState(1216); match(LeftParen);
				setState(1217); expression(0);
				setState(1218); match(RightParen);
				setState(1219); statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1221); match(Do);
				setState(1222); statement();
				setState(1223); match(While);
				setState(1224); match(LeftParen);
				setState(1225); expression(0);
				setState(1226); match(RightParen);
				setState(1227); match(Semi);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1229); match(For);
				setState(1230); match(LeftParen);
				setState(1232);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 12) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(1231); expression(0);
					}
				}

				setState(1234); match(Semi);
				setState(1236);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 12) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(1235); expression(0);
					}
				}

				setState(1238); match(Semi);
				setState(1240);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 12) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(1239); expression(0);
					}
				}

				setState(1242); match(RightParen);
				setState(1243); statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1244); match(For);
				setState(1245); match(LeftParen);
				setState(1246); declaration();
				setState(1248);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 12) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(1247); expression(0);
					}
				}

				setState(1250); match(Semi);
				setState(1252);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 12) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(1251); expression(0);
					}
				}

				setState(1254); match(RightParen);
				setState(1255); statement();
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

	public static class JumpStatementContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitJumpStatement(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_jumpStatement);
		int _la;
		try {
			setState(1276);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1259); match(Goto);
				setState(1260); match(Identifier);
				setState(1261); match(Semi);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1262); match(Continue);
				setState(1263); match(Semi);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1264); match(Break);
				setState(1265); match(Semi);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1266); match(Return);
				declarationOfArray=false;
				setState(1269);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 12) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(1268); expression(0);
					}
				}

				setState(1271); match(Semi);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1272); match(Goto);
				setState(1273); unaryExpression();
				setState(1274); match(Semi);
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

	public static class CompilationUnitContext extends ParserRuleContext {
		public ArrayList<ArrayList<String>>resultLists;
		public TerminalNode EOF() { return getToken(CParser.EOF, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_compilationUnit);

			ArrayList<ArrayList<String>>resultLists=new ArrayList<ArrayList<String>>();
			
			globalLists.add(listOfErrorsGlobal);
			globalLists.add(setOfFields);
			
			((CompilationUnitContext)_localctx).resultLists = globalLists;	

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 4) | (1L << 6) | (1L << 8) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 14) | (1L << 16) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Star - 77)) | (1L << (Caret - 77)) | (1L << (Semi - 77)) | (1L << (Identifier - 77)))) != 0)) {
				{
				setState(1278); translationUnit(0);
				}
			}

			setState(1281); match(EOF);
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

	public static class TranslationUnitContext extends ParserRuleContext {
		public IncludeDefContext includeDef(int i) {
			return getRuleContext(IncludeDefContext.class,i);
		}
		public ExternalDeclarationContext externalDeclaration() {
			return getRuleContext(ExternalDeclarationContext.class,0);
		}
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public List<IncludeDefContext> includeDef() {
			return getRuleContexts(IncludeDefContext.class);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitTranslationUnit(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		return translationUnit(0);
	}

	private TranslationUnitContext translationUnit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, _parentState);
		TranslationUnitContext _prevctx = _localctx;
		int _startState = 174;
		enterRecursionRule(_localctx, 174, RULE_translationUnit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			switch (_input.LA(1)) {
			case 11:
				{
				setState(1285); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1284); includeDef();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1287); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;
			case 2:
			case 3:
			case 4:
			case 6:
			case 8:
			case 10:
			case 13:
			case 14:
			case 16:
			case Auto:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Extern:
			case Float:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Typedef:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Alignas:
			case Atomic:
			case Bool:
			case Complex:
			case Noreturn:
			case StaticAssert:
			case ThreadLocal:
			case LeftParen:
			case Star:
			case Caret:
			case Semi:
			case Identifier:
				{
				setState(1289); externalDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TranslationUnitContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_translationUnit);
					setState(1292);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1293); externalDeclaration();
					}
					} 
				}
				setState(1298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
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

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterExternalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitExternalDeclaration(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_externalDeclaration);
		try {
			setState(1302);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1299); functionDefinition();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1300); declaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1301); match(Semi);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1304); declarationSpecifiers();
				}
				break;
			}
			setState(1307); declarator();
			setState(1309);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 4) | (1L << 6) | (1L << 8) | (1L << 10) | (1L << 13) | (1L << 14) | (1L << 16) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
				{
				setState(1308); declarationList(0);
				}
			}

			setState(1311); compoundStatement();
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

	public static class DeclarationListContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDeclarationList(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		return declarationList(0);
	}

	private DeclarationListContext declarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, _parentState);
		DeclarationListContext _prevctx = _localctx;
		int _startState = 180;
		enterRecursionRule(_localctx, 180, RULE_declarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1314); declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationList);
					setState(1316);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1317); declaration();
					}
					} 
				}
				setState(1322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3: return genericAssocList_sempred((GenericAssocListContext)_localctx, predIndex);

		case 5: return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);

		case 6: return argumentExpressionList_sempred((ArgumentExpressionListContext)_localctx, predIndex);

		case 13: return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);

		case 14: return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);

		case 15: return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);

		case 16: return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);

		case 17: return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);

		case 18: return andExpression_sempred((AndExpressionContext)_localctx, predIndex);

		case 19: return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);

		case 20: return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);

		case 21: return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);

		case 22: return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);

		case 26: return expression_sempred((ExpressionContext)_localctx, predIndex);

		case 32: return initDeclaratorList_sempred((InitDeclaratorListContext)_localctx, predIndex);

		case 38: return structDeclarationList_sempred((StructDeclarationListContext)_localctx, predIndex);

		case 41: return structDeclaratorList_sempred((StructDeclaratorListContext)_localctx, predIndex);

		case 44: return enumeratorList_sempred((EnumeratorListContext)_localctx, predIndex);

		case 52: return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);

		case 59: return typeQualifierList_sempred((TypeQualifierListContext)_localctx, predIndex);

		case 61: return parameterList_sempred((ParameterListContext)_localctx, predIndex);

		case 63: return identifierList_sempred((IdentifierListContext)_localctx, predIndex);

		case 66: return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);

		case 69: return initializerList_sempred((InitializerListContext)_localctx, predIndex);

		case 71: return designatorList_sempred((DesignatorListContext)_localctx, predIndex);

		case 77: return blockItemList_sempred((BlockItemListContext)_localctx, predIndex);

		case 87: return translationUnit_sempred((TranslationUnitContext)_localctx, predIndex);

		case 90: return declarationList_sempred((DeclarationListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34: return precpred(_ctx, 2);

		case 35: return precpred(_ctx, 1);

		case 32: return precpred(_ctx, 4);

		case 33: return precpred(_ctx, 3);

		case 31: return precpred(_ctx, 5);

		case 30: return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean identifierList_sempred(IdentifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39: return precpred(_ctx, 5);

		case 42: return precpred(_ctx, 2);

		case 43: return precpred(_ctx, 1);

		case 40: return precpred(_ctx, 4);

		case 41: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean translationUnit_sempred(TranslationUnitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeQualifierList_sempred(TypeQualifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17: return precpred(_ctx, 1);

		case 16: return precpred(_ctx, 2);

		case 14: return precpred(_ctx, 4);

		case 15: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean parameterList_sempred(ParameterListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationList_sempred(DeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12: return precpred(_ctx, 2);

		case 13: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean blockItemList_sempred(BlockItemListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorList_sempred(EnumeratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean designatorList_sempred(DesignatorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10: return precpred(_ctx, 2);

		case 11: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean argumentExpressionList_sempred(ArgumentExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 9);

		case 2: return precpred(_ctx, 8);

		case 3: return precpred(_ctx, 7);

		case 4: return precpred(_ctx, 6);

		case 5: return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean genericAssocList_sempred(GenericAssocListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19: return precpred(_ctx, 1);

		case 18: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean structDeclaratorList_sempred(StructDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structDeclarationList_sempred(StructDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializerList_sempred(InitializerListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 44: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7: return precpred(_ctx, 3);

		case 8: return precpred(_ctx, 2);

		case 9: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initDeclaratorList_sempred(InitDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3s\u052e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\6\3\u00c0\n\3\r\3\16\3\u00c1\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00ca"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\u00de\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5\u00ed\n\5\f\5\16\5\u00f0\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00f9"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u011d\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7\u012e\n\7\f\7\16\7\u0131\13\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0139"+
		"\n\b\f\b\16\b\u013c\13\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u014d\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u0167\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0179\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0189\n\17\f\17\16\17\u018c\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7"+
		"\20\u019b\n\20\f\20\16\20\u019e\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\7\21\u01a9\n\21\f\21\16\21\u01ac\13\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u01bd"+
		"\n\22\f\22\16\22\u01c0\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\7\23\u01cb\n\23\f\23\16\23\u01ce\13\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\7\24\u01d6\n\24\f\24\16\24\u01d9\13\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\7\25\u01e1\n\25\f\25\16\25\u01e4\13\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\7\26\u01ed\n\26\f\26\16\26\u01f0\13\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\7\27\u01fb\n\27\f\27\16\27\u01fe\13\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\7\30\u0206\n\30\f\30\16\30\u0209\13\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\5\31\u0211\n\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u021a\n\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34"+
		"\u0225\n\34\f\34\16\34\u0228\13\34\3\35\3\35\3\36\3\36\5\36\u022e\n\36"+
		"\3\36\3\36\3\36\5\36\u0233\n\36\3\37\6\37\u0236\n\37\r\37\16\37\u0237"+
		"\3 \6 \u023b\n \r \16 \u023c\3!\3!\3!\3!\3!\5!\u0244\n!\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\7\"\u024d\n\"\f\"\16\"\u0250\13\"\3#\3#\3#\3#\3#\3#\5#"+
		"\u0258\n#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u026a\n%"+
		"\3&\3&\5&\u026e\n&\3&\3&\3&\3&\3&\3&\3&\5&\u0277\n&\3\'\3\'\3(\3(\3(\3"+
		"(\3(\7(\u0280\n(\f(\16(\u0283\13(\3)\3)\5)\u0287\n)\3)\3)\3)\5)\u028c"+
		"\n)\3*\3*\5*\u0290\n*\3*\3*\5*\u0294\n*\5*\u0296\n*\3+\3+\3+\3+\3+\3+"+
		"\7+\u029e\n+\f+\16+\u02a1\13+\3,\3,\5,\u02a5\n,\3,\3,\5,\u02a9\n,\3-\3"+
		"-\5-\u02ad\n-\3-\3-\3-\3-\3-\3-\5-\u02b5\n-\3-\3-\3-\3-\3-\3-\3-\5-\u02be"+
		"\n-\3.\3.\3.\3.\3.\3.\7.\u02c6\n.\f.\16.\u02c9\13.\3/\3/\3/\3/\3/\5/\u02d0"+
		"\n/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\5\63\u02e1\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\5\64\u02ed\n\64\3\65\5\65\u02f0\n\65\3\65\3\65\3\65\7\65\u02f5\n"+
		"\65\f\65\16\65\u02f8\13\65\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0300\n"+
		"\66\3\66\3\66\3\66\5\66\u0305\n\66\3\66\5\66\u0308\n\66\3\66\3\66\3\66"+
		"\3\66\3\66\5\66\u030f\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\5\66\u031e\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\5\66\u032a\n\66\3\66\7\66\u032d\n\66\f\66\16\66\u0330"+
		"\13\66\3\67\3\67\3\67\6\67\u0335\n\67\r\67\16\67\u0336\3\67\3\67\5\67"+
		"\u033b\n\67\38\38\38\38\38\38\38\39\39\39\79\u0347\n9\f9\169\u034a\13"+
		"9\39\59\u034d\n9\3:\3:\3:\5:\u0352\n:\3:\5:\u0355\n:\3:\5:\u0358\n:\3"+
		";\3;\3;\3;\3;\7;\u035f\n;\f;\16;\u0362\13;\3<\3<\5<\u0366\n<\3<\3<\5<"+
		"\u036a\n<\3<\3<\3<\5<\u036f\n<\3<\3<\5<\u0373\n<\3<\5<\u0376\n<\3=\3="+
		"\3=\3=\3=\7=\u037d\n=\f=\16=\u0380\13=\3>\3>\3>\3>\3>\5>\u0387\n>\3?\3"+
		"?\3?\3?\3?\3?\7?\u038f\n?\f?\16?\u0392\13?\3@\3@\3@\3@\3@\5@\u0399\n@"+
		"\5@\u039b\n@\3A\3A\3A\3A\3A\3A\7A\u03a3\nA\fA\16A\u03a6\13A\3B\3B\5B\u03aa"+
		"\nB\3C\3C\5C\u03ae\nC\3C\3C\7C\u03b2\nC\fC\16C\u03b5\13C\5C\u03b7\nC\3"+
		"D\3D\3D\3D\3D\7D\u03be\nD\fD\16D\u03c1\13D\3D\3D\5D\u03c5\nD\3D\5D\u03c8"+
		"\nD\3D\3D\3D\3D\5D\u03ce\nD\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\5D\u03de\nD\3D\3D\7D\u03e2\nD\fD\16D\u03e5\13D\5D\u03e7\nD\3D\3D\3D\5"+
		"D\u03ec\nD\3D\5D\u03ef\nD\3D\3D\3D\3D\3D\5D\u03f6\nD\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u0409\nD\3D\3D\7D\u040d\nD\fD\16"+
		"D\u0410\13D\7D\u0412\nD\fD\16D\u0415\13D\3E\3E\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\5F\u0423\nF\3G\3G\5G\u0427\nG\3G\3G\3G\3G\3G\5G\u042e\nG\3G\7"+
		"G\u0431\nG\fG\16G\u0434\13G\3H\3H\3H\3I\3I\3I\3I\3I\7I\u043e\nI\fI\16"+
		"I\u0441\13I\3J\3J\3J\3J\3J\3J\5J\u0449\nJ\3K\3K\3K\3K\3K\6K\u0450\nK\r"+
		"K\16K\u0451\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\7L\u0463\nL\f"+
		"L\16L\u0466\13L\5L\u0468\nL\3L\3L\3L\3L\7L\u046e\nL\fL\16L\u0471\13L\5"+
		"L\u0473\nL\7L\u0475\nL\fL\16L\u0478\13L\3L\3L\5L\u047c\nL\3M\3M\3M\3M"+
		"\3M\3M\3M\3M\3M\3M\3M\5M\u0489\nM\3N\3N\5N\u048d\nN\3N\3N\3O\3O\3O\3O"+
		"\3O\3O\7O\u0497\nO\fO\16O\u049a\13O\3P\3P\3P\5P\u049f\nP\3Q\5Q\u04a2\n"+
		"Q\3Q\3Q\3R\3R\3R\3S\3S\3S\3T\3T\3T\3U\3U\3U\3U\3U\3U\3U\5U\u04b6\nU\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\5U\u04c0\nU\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3"+
		"V\3V\3V\3V\3V\3V\5V\u04d3\nV\3V\3V\5V\u04d7\nV\3V\3V\5V\u04db\nV\3V\3"+
		"V\3V\3V\3V\3V\5V\u04e3\nV\3V\3V\5V\u04e7\nV\3V\3V\3V\5V\u04ec\nV\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u04f8\nW\3W\3W\3W\3W\3W\5W\u04ff\nW\3X\5"+
		"X\u0502\nX\3X\3X\3Y\3Y\6Y\u0508\nY\rY\16Y\u0509\3Y\5Y\u050d\nY\3Y\3Y\7"+
		"Y\u0511\nY\fY\16Y\u0514\13Y\3Z\3Z\3Z\5Z\u0519\nZ\3[\5[\u051c\n[\3[\3["+
		"\5[\u0520\n[\3[\3[\3\\\3\\\3\\\3\\\3\\\7\\\u0529\n\\\f\\\16\\\u052c\13"+
		"\\\3\\\2\36\b\f\16\34\36 \"$&(*,.\66BNTZjx|\u0080\u0086\u008c\u0090\u009c"+
		"\u00b0\u00b6]\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\2\16"+
		"\7\2KKMMOORRWX\3\2]g\b\2\23\23\36\36&&,,//>>\f\2\4\4\f\f\22\22\26\26\33"+
		"\33\37\37$%)*\61\6289\5\2\4\4\f\f\22\22\4\2--\60\60\6\2\27\27\'\'\63\63"+
		"\67\67\6\2\6\6\n\n##<<\4\2?@\\\\\3\2?@\4\2\7\7\t\t\4\2\21\21\63\63\u0599"+
		"\2\u00b8\3\2\2\2\4\u00dd\3\2\2\2\6\u00df\3\2\2\2\b\u00e6\3\2\2\2\n\u00f8"+
		"\3\2\2\2\f\u011c\3\2\2\2\16\u0132\3\2\2\2\20\u013d\3\2\2\2\22\u013f\3"+
		"\2\2\2\24\u014c\3\2\2\2\26\u0166\3\2\2\2\30\u0168\3\2\2\2\32\u0178\3\2"+
		"\2\2\34\u017a\3\2\2\2\36\u018d\3\2\2\2 \u019f\3\2\2\2\"\u01ad\3\2\2\2"+
		"$\u01c1\3\2\2\2&\u01cf\3\2\2\2(\u01da\3\2\2\2*\u01e5\3\2\2\2,\u01f1\3"+
		"\2\2\2.\u01ff\3\2\2\2\60\u020a\3\2\2\2\62\u0219\3\2\2\2\64\u021b\3\2\2"+
		"\2\66\u021d\3\2\2\28\u0229\3\2\2\2:\u0232\3\2\2\2<\u0235\3\2\2\2>\u023a"+
		"\3\2\2\2@\u0243\3\2\2\2B\u0245\3\2\2\2D\u0257\3\2\2\2F\u0259\3\2\2\2H"+
		"\u0269\3\2\2\2J\u0276\3\2\2\2L\u0278\3\2\2\2N\u027a\3\2\2\2P\u028b\3\2"+
		"\2\2R\u0295\3\2\2\2T\u0297\3\2\2\2V\u02a8\3\2\2\2X\u02bd\3\2\2\2Z\u02bf"+
		"\3\2\2\2\\\u02cf\3\2\2\2^\u02d1\3\2\2\2`\u02d3\3\2\2\2b\u02d8\3\2\2\2"+
		"d\u02e0\3\2\2\2f\u02ec\3\2\2\2h\u02ef\3\2\2\2j\u02ff\3\2\2\2l\u033a\3"+
		"\2\2\2n\u033c\3\2\2\2p\u034c\3\2\2\2r\u0357\3\2\2\2t\u0360\3\2\2\2v\u0375"+
		"\3\2\2\2x\u0377\3\2\2\2z\u0386\3\2\2\2|\u0388\3\2\2\2~\u039a\3\2\2\2\u0080"+
		"\u039c\3\2\2\2\u0082\u03a7\3\2\2\2\u0084\u03b6\3\2\2\2\u0086\u03e6\3\2"+
		"\2\2\u0088\u0416\3\2\2\2\u008a\u0422\3\2\2\2\u008c\u0424\3\2\2\2\u008e"+
		"\u0435\3\2\2\2\u0090\u0438\3\2\2\2\u0092\u0448\3\2\2\2\u0094\u044a\3\2"+
		"\2\2\u0096\u047b\3\2\2\2\u0098\u0488\3\2\2\2\u009a\u048a\3\2\2\2\u009c"+
		"\u0490\3\2\2\2\u009e\u049e\3\2\2\2\u00a0\u04a1\3\2\2\2\u00a2\u04a5\3\2"+
		"\2\2\u00a4\u04a8\3\2\2\2\u00a6\u04ab\3\2\2\2\u00a8\u04bf\3\2\2\2\u00aa"+
		"\u04eb\3\2\2\2\u00ac\u04fe\3\2\2\2\u00ae\u0501\3\2\2\2\u00b0\u050c\3\2"+
		"\2\2\u00b2\u0518\3\2\2\2\u00b4\u051b\3\2\2\2\u00b6\u0523\3\2\2\2\u00b8"+
		"\u00b9\7\r\2\2\u00b9\u00ba\7m\2\2\u00ba\u00bb\7\3\2\2\u00bb\3\3\2\2\2"+
		"\u00bc\u00de\7m\2\2\u00bd\u00de\7n\2\2\u00be\u00c0\7o\2\2\u00bf\u00be"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00de\3\2\2\2\u00c3\u00c4\7?\2\2\u00c4\u00c5\5\66\34\2\u00c5\u00c6\7"+
		"@\2\2\u00c6\u00de\3\2\2\2\u00c7\u00de\5\6\4\2\u00c8\u00ca\7\5\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7?"+
		"\2\2\u00cc\u00cd\5\u009aN\2\u00cd\u00ce\7@\2\2\u00ce\u00de\3\2\2\2\u00cf"+
		"\u00d0\7\13\2\2\u00d0\u00d1\7?\2\2\u00d1\u00d2\5\26\f\2\u00d2\u00d3\7"+
		"\\\2\2\u00d3\u00d4\5\u0082B\2\u00d4\u00d5\7@\2\2\u00d5\u00de\3\2\2\2\u00d6"+
		"\u00d7\7\16\2\2\u00d7\u00d8\7?\2\2\u00d8\u00d9\5\u0082B\2\u00d9\u00da"+
		"\7\\\2\2\u00da\u00db\5\26\f\2\u00db\u00dc\7@\2\2\u00dc\u00de\3\2\2\2\u00dd"+
		"\u00bc\3\2\2\2\u00dd\u00bd\3\2\2\2\u00dd\u00bf\3\2\2\2\u00dd\u00c3\3\2"+
		"\2\2\u00dd\u00c7\3\2\2\2\u00dd\u00c9\3\2\2\2\u00dd\u00cf\3\2\2\2\u00dd"+
		"\u00d6\3\2\2\2\u00de\5\3\2\2\2\u00df\u00e0\7:\2\2\u00e0\u00e1\7?\2\2\u00e1"+
		"\u00e2\5\62\32\2\u00e2\u00e3\7\\\2\2\u00e3\u00e4\5\b\5\2\u00e4\u00e5\7"+
		"@\2\2\u00e5\7\3\2\2\2\u00e6\u00e7\b\5\1\2\u00e7\u00e8\5\n\6\2\u00e8\u00ee"+
		"\3\2\2\2\u00e9\u00ea\f\3\2\2\u00ea\u00eb\7\\\2\2\u00eb\u00ed\5\n\6\2\u00ec"+
		"\u00e9\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\t\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\5\u0082B\2\u00f2"+
		"\u00f3\7Z\2\2\u00f3\u00f4\5\62\32\2\u00f4\u00f9\3\2\2\2\u00f5\u00f6\7"+
		"\31\2\2\u00f6\u00f7\7Z\2\2\u00f7\u00f9\5\62\32\2\u00f8\u00f1\3\2\2\2\u00f8"+
		"\u00f5\3\2\2\2\u00f9\13\3\2\2\2\u00fa\u00fb\b\7\1\2\u00fb\u011d\5\4\3"+
		"\2\u00fc\u00fd\7?\2\2\u00fd\u00fe\5\u0082B\2\u00fe\u00ff\7@\2\2\u00ff"+
		"\u0100\7C\2\2\u0100\u0101\5\u008cG\2\u0101\u0102\7D\2\2\u0102\u011d\3"+
		"\2\2\2\u0103\u0104\7?\2\2\u0104\u0105\5\u0082B\2\u0105\u0106\7@\2\2\u0106"+
		"\u0107\7C\2\2\u0107\u0108\5\u008cG\2\u0108\u0109\7\\\2\2\u0109\u010a\7"+
		"D\2\2\u010a\u011d\3\2\2\2\u010b\u010c\7\5\2\2\u010c\u010d\7?\2\2\u010d"+
		"\u010e\5\u0082B\2\u010e\u010f\7@\2\2\u010f\u0110\7C\2\2\u0110\u0111\5"+
		"\u008cG\2\u0111\u0112\7D\2\2\u0112\u011d\3\2\2\2\u0113\u0114\7\5\2\2\u0114"+
		"\u0115\7?\2\2\u0115\u0116\5\u0082B\2\u0116\u0117\7@\2\2\u0117\u0118\7"+
		"C\2\2\u0118\u0119\5\u008cG\2\u0119\u011a\7\\\2\2\u011a\u011b\7D\2\2\u011b"+
		"\u011d\3\2\2\2\u011c\u00fa\3\2\2\2\u011c\u00fc\3\2\2\2\u011c\u0103\3\2"+
		"\2\2\u011c\u010b\3\2\2\2\u011c\u0113\3\2\2\2\u011d\u012f\3\2\2\2\u011e"+
		"\u011f\f\13\2\2\u011f\u0120\7A\2\2\u0120\u0121\5\66\34\2\u0121\u0122\7"+
		"B\2\2\u0122\u012e\3\2\2\2\u0123\u0124\f\n\2\2\u0124\u0125\7k\2\2\u0125"+
		"\u012e\7m\2\2\u0126\u0127\f\t\2\2\u0127\u0128\7j\2\2\u0128\u012e\7m\2"+
		"\2\u0129\u012a\f\b\2\2\u012a\u012e\7L\2\2\u012b\u012c\f\7\2\2\u012c\u012e"+
		"\7N\2\2\u012d\u011e\3\2\2\2\u012d\u0123\3\2\2\2\u012d\u0126\3\2\2\2\u012d"+
		"\u0129\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u0130\r\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133"+
		"\b\b\1\2\u0133\u0134\5\62\32\2\u0134\u013a\3\2\2\2\u0135\u0136\f\3\2\2"+
		"\u0136\u0137\7\\\2\2\u0137\u0139\5\62\32\2\u0138\u0135\3\2\2\2\u0139\u013c"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\17\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013d\u013e\5\22\n\2\u013e\21\3\2\2\2\u013f\u0140\5\24"+
		"\13\2\u0140\23\3\2\2\2\u0141\u0142\5\4\3\2\u0142\u0143\7?\2\2\u0143\u0144"+
		"\5\16\b\2\u0144\u0145\7@\2\2\u0145\u0146\b\13\1\2\u0146\u014d\3\2\2\2"+
		"\u0147\u0148\5\4\3\2\u0148\u0149\7?\2\2\u0149\u014a\7@\2\2\u014a\u014b"+
		"\b\13\1\2\u014b\u014d\3\2\2\2\u014c\u0141\3\2\2\2\u014c\u0147\3\2\2\2"+
		"\u014d\25\3\2\2\2\u014e\u014f\b\f\1\2\u014f\u0167\5\f\7\2\u0150\u0167"+
		"\5\20\t\2\u0151\u0152\7L\2\2\u0152\u0167\5\26\f\2\u0153\u0154\7N\2\2\u0154"+
		"\u0167\5\26\f\2\u0155\u0156\5\30\r\2\u0156\u0157\5\32\16\2\u0157\u0167"+
		"\3\2\2\2\u0158\u0159\7+\2\2\u0159\u0167\5\26\f\2\u015a\u015b\7+\2\2\u015b"+
		"\u015c\7?\2\2\u015c\u015d\5\u0082B\2\u015d\u015e\7@\2\2\u015e\u0167\3"+
		"\2\2\2\u015f\u0160\7\66\2\2\u0160\u0161\7?\2\2\u0161\u0162\5\u0082B\2"+
		"\u0162\u0163\7@\2\2\u0163\u0167\3\2\2\2\u0164\u0165\7T\2\2\u0165\u0167"+
		"\7m\2\2\u0166\u014e\3\2\2\2\u0166\u0150\3\2\2\2\u0166\u0151\3\2\2\2\u0166"+
		"\u0153\3\2\2\2\u0166\u0155\3\2\2\2\u0166\u0158\3\2\2\2\u0166\u015a\3\2"+
		"\2\2\u0166\u015f\3\2\2\2\u0166\u0164\3\2\2\2\u0167\27\3\2\2\2\u0168\u0169"+
		"\t\2\2\2\u0169\31\3\2\2\2\u016a\u016b\5\26\f\2\u016b\u016c\b\16\1\2\u016c"+
		"\u0179\3\2\2\2\u016d\u016e\7?\2\2\u016e\u016f\5\u0082B\2\u016f\u0170\7"+
		"@\2\2\u0170\u0171\5\32\16\2\u0171\u0179\3\2\2\2\u0172\u0173\7\5\2\2\u0173"+
		"\u0174\7?\2\2\u0174\u0175\5\u0082B\2\u0175\u0176\7@\2\2\u0176\u0177\5"+
		"\32\16\2\u0177\u0179\3\2\2\2\u0178\u016a\3\2\2\2\u0178\u016d\3\2\2\2\u0178"+
		"\u0172\3\2\2\2\u0179\33\3\2\2\2\u017a\u017b\b\17\1\2\u017b\u017c\5\32"+
		"\16\2\u017c\u017d\b\17\1\2\u017d\u018a\3\2\2\2\u017e\u017f\f\5\2\2\u017f"+
		"\u0180\7O\2\2\u0180\u0181\b\17\1\2\u0181\u0189\5\32\16\2\u0182\u0183\f"+
		"\4\2\2\u0183\u0184\7P\2\2\u0184\u0189\5\32\16\2\u0185\u0186\f\3\2\2\u0186"+
		"\u0187\7Q\2\2\u0187\u0189\5\32\16\2\u0188\u017e\3\2\2\2\u0188\u0182\3"+
		"\2\2\2\u0188\u0185\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\35\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018e\b\20\1"+
		"\2\u018e\u018f\5\34\17\2\u018f\u019c\3\2\2\2\u0190\u0191\f\4\2\2\u0191"+
		"\u0192\7K\2\2\u0192\u0193\5\34\17\2\u0193\u0194\b\20\1\2\u0194\u019b\3"+
		"\2\2\2\u0195\u0196\f\3\2\2\u0196\u0197\7M\2\2\u0197\u0198\5\34\17\2\u0198"+
		"\u0199\b\20\1\2\u0199\u019b\3\2\2\2\u019a\u0190\3\2\2\2\u019a\u0195\3"+
		"\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\37\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a0\b\21\1\2\u01a0\u01a1\5\36"+
		"\20\2\u01a1\u01aa\3\2\2\2\u01a2\u01a3\f\4\2\2\u01a3\u01a4\7I\2\2\u01a4"+
		"\u01a9\5\36\20\2\u01a5\u01a6\f\3\2\2\u01a6\u01a7\7J\2\2\u01a7\u01a9\5"+
		"\36\20\2\u01a8\u01a2\3\2\2\2\u01a8\u01a5\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab!\3\2\2\2\u01ac\u01aa\3\2\2\2"+
		"\u01ad\u01ae\b\22\1\2\u01ae\u01af\5 \21\2\u01af\u01be\3\2\2\2\u01b0\u01b1"+
		"\f\6\2\2\u01b1\u01b2\7E\2\2\u01b2\u01bd\5 \21\2\u01b3\u01b4\f\5\2\2\u01b4"+
		"\u01b5\7G\2\2\u01b5\u01bd\5 \21\2\u01b6\u01b7\f\4\2\2\u01b7\u01b8\7F\2"+
		"\2\u01b8\u01bd\5 \21\2\u01b9\u01ba\f\3\2\2\u01ba\u01bb\7H\2\2\u01bb\u01bd"+
		"\5 \21\2\u01bc\u01b0\3\2\2\2\u01bc\u01b3\3\2\2\2\u01bc\u01b6\3\2\2\2\u01bc"+
		"\u01b9\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2"+
		"\2\2\u01bf#\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c2\b\23\1\2\u01c2\u01c3"+
		"\5\"\22\2\u01c3\u01cc\3\2\2\2\u01c4\u01c5\f\4\2\2\u01c5\u01c6\7h\2\2\u01c6"+
		"\u01cb\5\"\22\2\u01c7\u01c8\f\3\2\2\u01c8\u01c9\7i\2\2\u01c9\u01cb\5\""+
		"\22\2\u01ca\u01c4\3\2\2\2\u01ca\u01c7\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd%\3\2\2\2\u01ce\u01cc\3\2\2\2"+
		"\u01cf\u01d0\b\24\1\2\u01d0\u01d1\5$\23\2\u01d1\u01d7\3\2\2\2\u01d2\u01d3"+
		"\f\3\2\2\u01d3\u01d4\7R\2\2\u01d4\u01d6\5$\23\2\u01d5\u01d2\3\2\2\2\u01d6"+
		"\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\'\3\2\2\2"+
		"\u01d9\u01d7\3\2\2\2\u01da\u01db\b\25\1\2\u01db\u01dc\5&\24\2\u01dc\u01e2"+
		"\3\2\2\2\u01dd\u01de\f\3\2\2\u01de\u01df\7V\2\2\u01df\u01e1\5&\24\2\u01e0"+
		"\u01dd\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2"+
		"\2\2\u01e3)\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e6\b\26\1\2\u01e6\u01e7"+
		"\5(\25\2\u01e7\u01e8\b\26\1\2\u01e8\u01ee\3\2\2\2\u01e9\u01ea\f\3\2\2"+
		"\u01ea\u01eb\7S\2\2\u01eb\u01ed\5(\25\2\u01ec\u01e9\3\2\2\2\u01ed\u01f0"+
		"\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef+\3\2\2\2\u01f0"+
		"\u01ee\3\2\2\2\u01f1\u01f2\b\27\1\2\u01f2\u01f3\5*\26\2\u01f3\u01f4\b"+
		"\27\1\2\u01f4\u01fc\3\2\2\2\u01f5\u01f6\f\3\2\2\u01f6\u01f7\7T\2\2\u01f7"+
		"\u01f8\5*\26\2\u01f8\u01f9\b\27\1\2\u01f9\u01fb\3\2\2\2\u01fa\u01f5\3"+
		"\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"-\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\b\30\1\2\u0200\u0201\5,\27\2"+
		"\u0201\u0207\3\2\2\2\u0202\u0203\f\3\2\2\u0203\u0204\7U\2\2\u0204\u0206"+
		"\5,\27\2\u0205\u0202\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207"+
		"\u0208\3\2\2\2\u0208/\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u0210\5.\30\2"+
		"\u020b\u020c\7Y\2\2\u020c\u020d\5\66\34\2\u020d\u020e\7Z\2\2\u020e\u020f"+
		"\5\60\31\2\u020f\u0211\3\2\2\2\u0210\u020b\3\2\2\2\u0210\u0211\3\2\2\2"+
		"\u0211\61\3\2\2\2\u0212\u0213\5\60\31\2\u0213\u0214\b\32\1\2\u0214\u021a"+
		"\3\2\2\2\u0215\u0216\5\26\f\2\u0216\u0217\5\64\33\2\u0217\u0218\5\62\32"+
		"\2\u0218\u021a\3\2\2\2\u0219\u0212\3\2\2\2\u0219\u0215\3\2\2\2\u021a\63"+
		"\3\2\2\2\u021b\u021c\t\3\2\2\u021c\65\3\2\2\2\u021d\u021e\b\34\1\2\u021e"+
		"\u021f\5\62\32\2\u021f\u0220\b\34\1\2\u0220\u0226\3\2\2\2\u0221\u0222"+
		"\f\3\2\2\u0222\u0223\7\\\2\2\u0223\u0225\5\62\32\2\u0224\u0221\3\2\2\2"+
		"\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\67"+
		"\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022a\5\60\31\2\u022a9\3\2\2\2\u022b"+
		"\u022d\5<\37\2\u022c\u022e\5B\"\2\u022d\u022c\3\2\2\2\u022d\u022e\3\2"+
		"\2\2\u022e\u022f\3\2\2\2\u022f\u0230\7[\2\2\u0230\u0233\3\2\2\2\u0231"+
		"\u0233\5\u0094K\2\u0232\u022b\3\2\2\2\u0232\u0231\3\2\2\2\u0233;\3\2\2"+
		"\2\u0234\u0236\5@!\2\u0235\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0235"+
		"\3\2\2\2\u0237\u0238\3\2\2\2\u0238=\3\2\2\2\u0239\u023b\5@!\2\u023a\u0239"+
		"\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d"+
		"?\3\2\2\2\u023e\u0244\5F$\2\u023f\u0244\5H%\2\u0240\u0244\5b\62\2\u0241"+
		"\u0244\5d\63\2\u0242\u0244\5f\64\2\u0243\u023e\3\2\2\2\u0243\u023f\3\2"+
		"\2\2\u0243\u0240\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0242\3\2\2\2\u0244"+
		"A\3\2\2\2\u0245\u0246\b\"\1\2\u0246\u0247\b\"\1\2\u0247\u0248\5D#\2\u0248"+
		"\u024e\3\2\2\2\u0249\u024a\f\3\2\2\u024a\u024b\7\\\2\2\u024b\u024d\5D"+
		"#\2\u024c\u0249\3\2\2\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024fC\3\2\2\2\u0250\u024e\3\2\2\2\u0251\u0258\5h\65\2"+
		"\u0252\u0253\5h\65\2\u0253\u0254\7]\2\2\u0254\u0255\b#\1\2\u0255\u0256"+
		"\5\u008aF\2\u0256\u0258\3\2\2\2\u0257\u0251\3\2\2\2\u0257\u0252\3\2\2"+
		"\2\u0258E\3\2\2\2\u0259\u025a\t\4\2\2\u025aG\3\2\2\2\u025b\u026a\t\5\2"+
		"\2\u025c\u025d\7\5\2\2\u025d\u025e\7?\2\2\u025e\u025f\t\6\2\2\u025f\u026a"+
		"\7@\2\2\u0260\u026a\5`\61\2\u0261\u026a\5J&\2\u0262\u026a\5X-\2\u0263"+
		"\u026a\5\u0088E\2\u0264\u0265\7\20\2\2\u0265\u0266\7?\2\2\u0266\u0267"+
		"\58\35\2\u0267\u0268\7@\2\2\u0268\u026a\3\2\2\2\u0269\u025b\3\2\2\2\u0269"+
		"\u025c\3\2\2\2\u0269\u0260\3\2\2\2\u0269\u0261\3\2\2\2\u0269\u0262\3\2"+
		"\2\2\u0269\u0263\3\2\2\2\u0269\u0264\3\2\2\2\u026aI\3\2\2\2\u026b\u026d"+
		"\5L\'\2\u026c\u026e\7m\2\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2\2\2\u026e"+
		"\u026f\3\2\2\2\u026f\u0270\7C\2\2\u0270\u0271\5N(\2\u0271\u0272\7D\2\2"+
		"\u0272\u0277\3\2\2\2\u0273\u0274\5L\'\2\u0274\u0275\7m\2\2\u0275\u0277"+
		"\3\2\2\2\u0276\u026b\3\2\2\2\u0276\u0273\3\2\2\2\u0277K\3\2\2\2\u0278"+
		"\u0279\t\7\2\2\u0279M\3\2\2\2\u027a\u027b\b(\1\2\u027b\u027c\5P)\2\u027c"+
		"\u0281\3\2\2\2\u027d\u027e\f\3\2\2\u027e\u0280\5P)\2\u027f\u027d\3\2\2"+
		"\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282O"+
		"\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u0286\5R*\2\u0285\u0287\5T+\2\u0286"+
		"\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0289\7["+
		"\2\2\u0289\u028c\3\2\2\2\u028a\u028c\5\u0094K\2\u028b\u0284\3\2\2\2\u028b"+
		"\u028a\3\2\2\2\u028cQ\3\2\2\2\u028d\u028f\5H%\2\u028e\u0290\5R*\2\u028f"+
		"\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0296\3\2\2\2\u0291\u0293\5b"+
		"\62\2\u0292\u0294\5R*\2\u0293\u0292\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
		"\u0296\3\2\2\2\u0295\u028d\3\2\2\2\u0295\u0291\3\2\2\2\u0296S\3\2\2\2"+
		"\u0297\u0298\b+\1\2\u0298\u0299\5V,\2\u0299\u029f\3\2\2\2\u029a\u029b"+
		"\f\3\2\2\u029b\u029c\7\\\2\2\u029c\u029e\5V,\2\u029d\u029a\3\2\2\2\u029e"+
		"\u02a1\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0U\3\2\2\2"+
		"\u02a1\u029f\3\2\2\2\u02a2\u02a9\5h\65\2\u02a3\u02a5\5h\65\2\u02a4\u02a3"+
		"\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\7Z\2\2\u02a7"+
		"\u02a9\58\35\2\u02a8\u02a2\3\2\2\2\u02a8\u02a4\3\2\2\2\u02a9W\3\2\2\2"+
		"\u02aa\u02ac\7\35\2\2\u02ab\u02ad\7m\2\2\u02ac\u02ab\3\2\2\2\u02ac\u02ad"+
		"\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\7C\2\2\u02af\u02b0\5Z.\2\u02b0"+
		"\u02b1\7D\2\2\u02b1\u02be\3\2\2\2\u02b2\u02b4\7\35\2\2\u02b3\u02b5\7m"+
		"\2\2\u02b4\u02b3\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6"+
		"\u02b7\7C\2\2\u02b7\u02b8\5Z.\2\u02b8\u02b9\7\\\2\2\u02b9\u02ba\7D\2\2"+
		"\u02ba\u02be\3\2\2\2\u02bb\u02bc\7\35\2\2\u02bc\u02be\7m\2\2\u02bd\u02aa"+
		"\3\2\2\2\u02bd\u02b2\3\2\2\2\u02bd\u02bb\3\2\2\2\u02beY\3\2\2\2\u02bf"+
		"\u02c0\b.\1\2\u02c0\u02c1\5\\/\2\u02c1\u02c7\3\2\2\2\u02c2\u02c3\f\3\2"+
		"\2\u02c3\u02c4\7\\\2\2\u02c4\u02c6\5\\/\2\u02c5\u02c2\3\2\2\2\u02c6\u02c9"+
		"\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8[\3\2\2\2\u02c9"+
		"\u02c7\3\2\2\2\u02ca\u02d0\5^\60\2\u02cb\u02cc\5^\60\2\u02cc\u02cd\7]"+
		"\2\2\u02cd\u02ce\58\35\2\u02ce\u02d0\3\2\2\2\u02cf\u02ca\3\2\2\2\u02cf"+
		"\u02cb\3\2\2\2\u02d0]\3\2\2\2\u02d1\u02d2\7m\2\2\u02d2_\3\2\2\2\u02d3"+
		"\u02d4\7\67\2\2\u02d4\u02d5\7?\2\2\u02d5\u02d6\5\u0082B\2\u02d6\u02d7"+
		"\7@\2\2\u02d7a\3\2\2\2\u02d8\u02d9\t\b\2\2\u02d9c\3\2\2\2\u02da\u02e1"+
		"\t\t\2\2\u02db\u02e1\5n8\2\u02dc\u02dd\7\b\2\2\u02dd\u02de\7?\2\2\u02de"+
		"\u02df\7m\2\2\u02df\u02e1\7@\2\2\u02e0\u02da\3\2\2\2\u02e0\u02db\3\2\2"+
		"\2\u02e0\u02dc\3\2\2\2\u02e1e\3\2\2\2\u02e2\u02e3\7\65\2\2\u02e3\u02e4"+
		"\7?\2\2\u02e4\u02e5\5\u0082B\2\u02e5\u02e6\7@\2\2\u02e6\u02ed\3\2\2\2"+
		"\u02e7\u02e8\7\65\2\2\u02e8\u02e9\7?\2\2\u02e9\u02ea\58\35\2\u02ea\u02eb"+
		"\7@\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02e2\3\2\2\2\u02ec\u02e7\3\2\2\2\u02ed"+
		"g\3\2\2\2\u02ee\u02f0\5v<\2\u02ef\u02ee\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0"+
		"\u02f1\3\2\2\2\u02f1\u02f2\5j\66\2\u02f2\u02f6\b\65\1\2\u02f3\u02f5\5"+
		"l\67\2\u02f4\u02f3\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6"+
		"\u02f7\3\2\2\2\u02f7i\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9\u02fa\b\66\1\2"+
		"\u02fa\u0300\7m\2\2\u02fb\u02fc\7?\2\2\u02fc\u02fd\5h\65\2\u02fd\u02fe"+
		"\7@\2\2\u02fe\u0300\3\2\2\2\u02ff\u02f9\3\2\2\2\u02ff\u02fb\3\2\2\2\u0300"+
		"\u032e\3\2\2\2\u0301\u0302\f\b\2\2\u0302\u0304\7A\2\2\u0303\u0305\5x="+
		"\2\u0304\u0303\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0307\3\2\2\2\u0306\u0308"+
		"\5\62\32\2\u0307\u0306\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0309\3\2\2\2"+
		"\u0309\u032d\7B\2\2\u030a\u030b\f\7\2\2\u030b\u030c\7A\2\2\u030c\u030e"+
		"\7,\2\2\u030d\u030f\5x=\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u0311\5\62\32\2\u0311\u0312\7B\2\2\u0312\u032d\3"+
		"\2\2\2\u0313\u0314\f\6\2\2\u0314\u0315\7A\2\2\u0315\u0316\5x=\2\u0316"+
		"\u0317\7,\2\2\u0317\u0318\5\62\32\2\u0318\u0319\7B\2\2\u0319\u032d\3\2"+
		"\2\2\u031a\u031b\f\5\2\2\u031b\u031d\7A\2\2\u031c\u031e\5x=\2\u031d\u031c"+
		"\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\7O\2\2\u0320"+
		"\u032d\7B\2\2\u0321\u0322\f\4\2\2\u0322\u0323\7?\2\2\u0323\u0324\5z>\2"+
		"\u0324\u0325\7@\2\2\u0325\u032d\3\2\2\2\u0326\u0327\f\3\2\2\u0327\u0329"+
		"\7?\2\2\u0328\u032a\5\u0080A\2\u0329\u0328\3\2\2\2\u0329\u032a\3\2\2\2"+
		"\u032a\u032b\3\2\2\2\u032b\u032d\7@\2\2\u032c\u0301\3\2\2\2\u032c\u030a"+
		"\3\2\2\2\u032c\u0313\3\2\2\2\u032c\u031a\3\2\2\2\u032c\u0321\3\2\2\2\u032c"+
		"\u0326\3\2\2\2\u032d\u0330\3\2\2\2\u032e\u032c\3\2\2\2\u032e\u032f\3\2"+
		"\2\2\u032fk\3\2\2\2\u0330\u032e\3\2\2\2\u0331\u0332\7\t\2\2\u0332\u0334"+
		"\7?\2\2\u0333\u0335\7o\2\2\u0334\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336"+
		"\u0334\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u033b\7@"+
		"\2\2\u0339\u033b\5n8\2\u033a\u0331\3\2\2\2\u033a\u0339\3\2\2\2\u033bm"+
		"\3\2\2\2\u033c\u033d\7\17\2\2\u033d\u033e\7?\2\2\u033e\u033f\7?\2\2\u033f"+
		"\u0340\5p9\2\u0340\u0341\7@\2\2\u0341\u0342\7@\2\2\u0342o\3\2\2\2\u0343"+
		"\u0348\5r:\2\u0344\u0345\7\\\2\2\u0345\u0347\5r:\2\u0346\u0344\3\2\2\2"+
		"\u0347\u034a\3\2\2\2\u0348\u0346\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034d"+
		"\3\2\2\2\u034a\u0348\3\2\2\2\u034b\u034d\3\2\2\2\u034c\u0343\3\2\2\2\u034c"+
		"\u034b\3\2\2\2\u034dq\3\2\2\2\u034e\u0354\n\n\2\2\u034f\u0351\7?\2\2\u0350"+
		"\u0352\5\16\b\2\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353\3"+
		"\2\2\2\u0353\u0355\7@\2\2\u0354\u034f\3\2\2\2\u0354\u0355\3\2\2\2\u0355"+
		"\u0358\3\2\2\2\u0356\u0358\3\2\2\2\u0357\u034e\3\2\2\2\u0357\u0356\3\2"+
		"\2\2\u0358s\3\2\2\2\u0359\u035f\n\13\2\2\u035a\u035b\7?\2\2\u035b\u035c"+
		"\5t;\2\u035c\u035d\7@\2\2\u035d\u035f\3\2\2\2\u035e\u0359\3\2\2\2\u035e"+
		"\u035a\3\2\2\2\u035f\u0362\3\2\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2"+
		"\2\2\u0361u\3\2\2\2\u0362\u0360\3\2\2\2\u0363\u0365\7O\2\2\u0364\u0366"+
		"\5x=\2\u0365\u0364\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0376\3\2\2\2\u0367"+
		"\u0369\7O\2\2\u0368\u036a\5x=\2\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2"+
		"\2\u036a\u036b\3\2\2\2\u036b\u0376\5v<\2\u036c\u036e\7V\2\2\u036d\u036f"+
		"\5x=\2\u036e\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0376\3\2\2\2\u0370"+
		"\u0372\7V\2\2\u0371\u0373\5x=\2\u0372\u0371\3\2\2\2\u0372\u0373\3\2\2"+
		"\2\u0373\u0374\3\2\2\2\u0374\u0376\5v<\2\u0375\u0363\3\2\2\2\u0375\u0367"+
		"\3\2\2\2\u0375\u036c\3\2\2\2\u0375\u0370\3\2\2\2\u0376w\3\2\2\2\u0377"+
		"\u0378\b=\1\2\u0378\u0379\5b\62\2\u0379\u037e\3\2\2\2\u037a\u037b\f\3"+
		"\2\2\u037b\u037d\5b\62\2\u037c\u037a\3\2\2\2\u037d\u0380\3\2\2\2\u037e"+
		"\u037c\3\2\2\2\u037e\u037f\3\2\2\2\u037fy\3\2\2\2\u0380\u037e\3\2\2\2"+
		"\u0381\u0387\5|?\2\u0382\u0383\5|?\2\u0383\u0384\7\\\2\2\u0384\u0385\7"+
		"l\2\2\u0385\u0387\3\2\2\2\u0386\u0381\3\2\2\2\u0386\u0382\3\2\2\2\u0387"+
		"{\3\2\2\2\u0388\u0389\b?\1\2\u0389\u038a\5~@\2\u038a\u0390\3\2\2\2\u038b"+
		"\u038c\f\3\2\2\u038c\u038d\7\\\2\2\u038d\u038f\5~@\2\u038e\u038b\3\2\2"+
		"\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391}"+
		"\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u0394\5<\37\2\u0394\u0395\5h\65\2\u0395"+
		"\u039b\3\2\2\2\u0396\u0398\5> \2\u0397\u0399\5\u0084C\2\u0398\u0397\3"+
		"\2\2\2\u0398\u0399\3\2\2\2\u0399\u039b\3\2\2\2\u039a\u0393\3\2\2\2\u039a"+
		"\u0396\3\2\2\2\u039b\177\3\2\2\2\u039c\u039d\bA\1\2\u039d\u039e\7m\2\2"+
		"\u039e\u03a4\3\2\2\2\u039f\u03a0\f\3\2\2\u03a0\u03a1\7\\\2\2\u03a1\u03a3"+
		"\7m\2\2\u03a2\u039f\3\2\2\2\u03a3\u03a6\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a4"+
		"\u03a5\3\2\2\2\u03a5\u0081\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a7\u03a9\5R"+
		"*\2\u03a8\u03aa\5\u0084C\2\u03a9\u03a8\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa"+
		"\u0083\3\2\2\2\u03ab\u03b7\5v<\2\u03ac\u03ae\5v<\2\u03ad\u03ac\3\2\2\2"+
		"\u03ad\u03ae\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b3\5\u0086D\2\u03b0"+
		"\u03b2\5l\67\2\u03b1\u03b0\3\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2"+
		"\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b7\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b6"+
		"\u03ab\3\2\2\2\u03b6\u03ad\3\2\2\2\u03b7\u0085\3\2\2\2\u03b8\u03b9\bD"+
		"\1\2\u03b9\u03ba\7?\2\2\u03ba\u03bb\5\u0084C\2\u03bb\u03bf\7@\2\2\u03bc"+
		"\u03be\5l\67\2\u03bd\u03bc\3\2\2\2\u03be\u03c1\3\2\2\2\u03bf\u03bd\3\2"+
		"\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03e7\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c2"+
		"\u03c4\7A\2\2\u03c3\u03c5\5x=\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2\2"+
		"\2\u03c5\u03c7\3\2\2\2\u03c6\u03c8\5\62\32\2\u03c7\u03c6\3\2\2\2\u03c7"+
		"\u03c8\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03e7\7B\2\2\u03ca\u03cb\7A\2"+
		"\2\u03cb\u03cd\7,\2\2\u03cc\u03ce\5x=\2\u03cd\u03cc\3\2\2\2\u03cd\u03ce"+
		"\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\5\62\32\2\u03d0\u03d1\7B\2\2"+
		"\u03d1\u03e7\3\2\2\2\u03d2\u03d3\7A\2\2\u03d3\u03d4\5x=\2\u03d4\u03d5"+
		"\7,\2\2\u03d5\u03d6\5\62\32\2\u03d6\u03d7\7B\2\2\u03d7\u03e7\3\2\2\2\u03d8"+
		"\u03d9\7A\2\2\u03d9\u03da\7O\2\2\u03da\u03e7\7B\2\2\u03db\u03dd\7?\2\2"+
		"\u03dc\u03de\5z>\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df"+
		"\3\2\2\2\u03df\u03e3\7@\2\2\u03e0\u03e2\5l\67\2\u03e1\u03e0\3\2\2\2\u03e2"+
		"\u03e5\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e7\3\2"+
		"\2\2\u03e5\u03e3\3\2\2\2\u03e6\u03b8\3\2\2\2\u03e6\u03c2\3\2\2\2\u03e6"+
		"\u03ca\3\2\2\2\u03e6\u03d2\3\2\2\2\u03e6\u03d8\3\2\2\2\u03e6\u03db\3\2"+
		"\2\2\u03e7\u0413\3\2\2\2\u03e8\u03e9\f\7\2\2\u03e9\u03eb\7A\2\2\u03ea"+
		"\u03ec\5x=\2\u03eb\u03ea\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ee\3\2\2"+
		"\2\u03ed\u03ef\5\62\32\2\u03ee\u03ed\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef"+
		"\u03f0\3\2\2\2\u03f0\u0412\7B\2\2\u03f1\u03f2\f\6\2\2\u03f2\u03f3\7A\2"+
		"\2\u03f3\u03f5\7,\2\2\u03f4\u03f6\5x=\2\u03f5\u03f4\3\2\2\2\u03f5\u03f6"+
		"\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\5\62\32\2\u03f8\u03f9\7B\2\2"+
		"\u03f9\u0412\3\2\2\2\u03fa\u03fb\f\5\2\2\u03fb\u03fc\7A\2\2\u03fc\u03fd"+
		"\5x=\2\u03fd\u03fe\7,\2\2\u03fe\u03ff\5\62\32\2\u03ff\u0400\7B\2\2\u0400"+
		"\u0412\3\2\2\2\u0401\u0402\f\4\2\2\u0402\u0403\7A\2\2\u0403\u0404\7O\2"+
		"\2\u0404\u0412\7B\2\2\u0405\u0406\f\3\2\2\u0406\u0408\7?\2\2\u0407\u0409"+
		"\5z>\2\u0408\u0407\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040a\3\2\2\2\u040a"+
		"\u040e\7@\2\2\u040b\u040d\5l\67\2\u040c\u040b\3\2\2\2\u040d\u0410\3\2"+
		"\2\2\u040e\u040c\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0412\3\2\2\2\u0410"+
		"\u040e\3\2\2\2\u0411\u03e8\3\2\2\2\u0411\u03f1\3\2\2\2\u0411\u03fa\3\2"+
		"\2\2\u0411\u0401\3\2\2\2\u0411\u0405\3\2\2\2\u0412\u0415\3\2\2\2\u0413"+
		"\u0411\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0087\3\2\2\2\u0415\u0413\3\2"+
		"\2\2\u0416\u0417\7m\2\2\u0417\u0089\3\2\2\2\u0418\u0423\5\62\32\2\u0419"+
		"\u041a\7C\2\2\u041a\u041b\5\u008cG\2\u041b\u041c\7D\2\2\u041c\u0423\3"+
		"\2\2\2\u041d\u041e\7C\2\2\u041e\u041f\5\u008cG\2\u041f\u0420\7\\\2\2\u0420"+
		"\u0421\7D\2\2\u0421\u0423\3\2\2\2\u0422\u0418\3\2\2\2\u0422\u0419\3\2"+
		"\2\2\u0422\u041d\3\2\2\2\u0423\u008b\3\2\2\2\u0424\u0426\bG\1\2\u0425"+
		"\u0427\5\u008eH\2\u0426\u0425\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0428"+
		"\3\2\2\2\u0428\u0429\5\u008aF\2\u0429\u0432\3\2\2\2\u042a\u042b\f\3\2"+
		"\2\u042b\u042d\7\\\2\2\u042c\u042e\5\u008eH\2\u042d\u042c\3\2\2\2\u042d"+
		"\u042e\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0431\5\u008aF\2\u0430\u042a"+
		"\3\2\2\2\u0431\u0434\3\2\2\2\u0432\u0430\3\2\2\2\u0432\u0433\3\2\2\2\u0433"+
		"\u008d\3\2\2\2\u0434\u0432\3\2\2\2\u0435\u0436\5\u0090I\2\u0436\u0437"+
		"\7]\2\2\u0437\u008f\3\2\2\2\u0438\u0439\bI\1\2\u0439\u043a\5\u0092J\2"+
		"\u043a\u043f\3\2\2\2\u043b\u043c\f\3\2\2\u043c\u043e\5\u0092J\2\u043d"+
		"\u043b\3\2\2\2\u043e\u0441\3\2\2\2\u043f\u043d\3\2\2\2\u043f\u0440\3\2"+
		"\2\2\u0440\u0091\3\2\2\2\u0441\u043f\3\2\2\2\u0442\u0443\7A\2\2\u0443"+
		"\u0444\58\35\2\u0444\u0445\7B\2\2\u0445\u0449\3\2\2\2\u0446\u0447\7k\2"+
		"\2\u0447\u0449\7m\2\2\u0448\u0442\3\2\2\2\u0448\u0446\3\2\2\2\u0449\u0093"+
		"\3\2\2\2\u044a\u044b\7=\2\2\u044b\u044c\7?\2\2\u044c\u044d\58\35\2\u044d"+
		"\u044f\7\\\2\2\u044e\u0450\7o\2\2\u044f\u044e\3\2\2\2\u0450\u0451\3\2"+
		"\2\2\u0451\u044f\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0453\3\2\2\2\u0453"+
		"\u0454\7@\2\2\u0454\u0455\7[\2\2\u0455\u0095\3\2\2\2\u0456\u047c\5\u0098"+
		"M\2\u0457\u047c\5\u009aN\2\u0458\u047c\5\u00a0Q\2\u0459\u047c\5\u00a8"+
		"U\2\u045a\u047c\5\u00aaV\2\u045b\u047c\5\u00acW\2\u045c\u045d\t\f\2\2"+
		"\u045d\u045e\t\r\2\2\u045e\u0467\7?\2\2\u045f\u0464\5.\30\2\u0460\u0461"+
		"\7\\\2\2\u0461\u0463\5.\30\2\u0462\u0460\3\2\2\2\u0463\u0466\3\2\2\2\u0464"+
		"\u0462\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0468\3\2\2\2\u0466\u0464\3\2"+
		"\2\2\u0467\u045f\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0476\3\2\2\2\u0469"+
		"\u0472\7Z\2\2\u046a\u046f\5.\30\2\u046b\u046c\7\\\2\2\u046c\u046e\5.\30"+
		"\2\u046d\u046b\3\2\2\2\u046e\u0471\3\2\2\2\u046f\u046d\3\2\2\2\u046f\u0470"+
		"\3\2\2\2\u0470\u0473\3\2\2\2\u0471\u046f\3\2\2\2\u0472\u046a\3\2\2\2\u0472"+
		"\u0473\3\2\2\2\u0473\u0475\3\2\2\2\u0474\u0469\3\2\2\2\u0475\u0478\3\2"+
		"\2\2\u0476\u0474\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0479\3\2\2\2\u0478"+
		"\u0476\3\2\2\2\u0479\u047a\7@\2\2\u047a\u047c\7[\2\2\u047b\u0456\3\2\2"+
		"\2\u047b\u0457\3\2\2\2\u047b\u0458\3\2\2\2\u047b\u0459\3\2\2\2\u047b\u045a"+
		"\3\2\2\2\u047b\u045b\3\2\2\2\u047b\u045c\3\2\2\2\u047c\u0097\3\2\2\2\u047d"+
		"\u047e\7m\2\2\u047e\u047f\7Z\2\2\u047f\u0489\5\u0096L\2\u0480\u0481\7"+
		"\25\2\2\u0481\u0482\58\35\2\u0482\u0483\7Z\2\2\u0483\u0484\5\u0096L\2"+
		"\u0484\u0489\3\2\2\2\u0485\u0486\7\31\2\2\u0486\u0487\7Z\2\2\u0487\u0489"+
		"\5\u0096L\2\u0488\u047d\3\2\2\2\u0488\u0480\3\2\2\2\u0488\u0485\3\2\2"+
		"\2\u0489\u0099\3\2\2\2\u048a\u048c\7C\2\2\u048b\u048d\5\u009cO\2\u048c"+
		"\u048b\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u048f\7D"+
		"\2\2\u048f\u009b\3\2\2\2\u0490\u0491\bO\1\2\u0491\u0492\bO\1\2\u0492\u0493"+
		"\5\u009eP\2\u0493\u0498\3\2\2\2\u0494\u0495\f\3\2\2\u0495\u0497\5\u009e"+
		"P\2\u0496\u0494\3\2\2\2\u0497\u049a\3\2\2\2\u0498\u0496\3\2\2\2\u0498"+
		"\u0499\3\2\2\2\u0499\u009d\3\2\2\2\u049a\u0498\3\2\2\2\u049b\u049c\bP"+
		"\1\2\u049c\u049f\5:\36\2\u049d\u049f\5\u0096L\2\u049e\u049b\3\2\2\2\u049e"+
		"\u049d\3\2\2\2\u049f\u009f\3\2\2\2\u04a0\u04a2\5\66\34\2\u04a1\u04a0\3"+
		"\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a4\7[\2\2\u04a4"+
		"\u00a1\3\2\2\2\u04a5\u04a6\5\66\34\2\u04a6\u04a7\bR\1\2\u04a7\u00a3\3"+
		"\2\2\2\u04a8\u04a9\5\u00a2R\2\u04a9\u04aa\bS\1\2\u04aa\u00a5\3\2\2\2\u04ab"+
		"\u04ac\5\u0096L\2\u04ac\u04ad\bT\1\2\u04ad\u00a7\3\2\2\2\u04ae\u04af\7"+
		"\"\2\2\u04af\u04b0\7?\2\2\u04b0\u04b1\5\u00a4S\2\u04b1\u04b2\7@\2\2\u04b2"+
		"\u04b5\5\u00a6T\2\u04b3\u04b4\7\34\2\2\u04b4\u04b6\5\u00a6T\2\u04b5\u04b3"+
		"\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\bU\1\2\u04b8"+
		"\u04c0\3\2\2\2\u04b9\u04ba\7.\2\2\u04ba\u04bb\7?\2\2\u04bb\u04bc\5\66"+
		"\34\2\u04bc\u04bd\7@\2\2\u04bd\u04be\5\u0096L\2\u04be\u04c0\3\2\2\2\u04bf"+
		"\u04ae\3\2\2\2\u04bf\u04b9\3\2\2\2\u04c0\u00a9\3\2\2\2\u04c1\u04c2\7\64"+
		"\2\2\u04c2\u04c3\7?\2\2\u04c3\u04c4\5\66\34\2\u04c4\u04c5\7@\2\2\u04c5"+
		"\u04c6\5\u0096L\2\u04c6\u04ec\3\2\2\2\u04c7\u04c8\7\32\2\2\u04c8\u04c9"+
		"\5\u0096L\2\u04c9\u04ca\7\64\2\2\u04ca\u04cb\7?\2\2\u04cb\u04cc\5\66\34"+
		"\2\u04cc\u04cd\7@\2\2\u04cd\u04ce\7[\2\2\u04ce\u04ec\3\2\2\2\u04cf\u04d0"+
		"\7 \2\2\u04d0\u04d2\7?\2\2\u04d1\u04d3\5\66\34\2\u04d2\u04d1\3\2\2\2\u04d2"+
		"\u04d3\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d6\7[\2\2\u04d5\u04d7\5\66"+
		"\34\2\u04d6\u04d5\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8"+
		"\u04da\7[\2\2\u04d9\u04db\5\66\34\2\u04da\u04d9\3\2\2\2\u04da\u04db\3"+
		"\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u04dd\7@\2\2\u04dd\u04ec\5\u0096L\2\u04de"+
		"\u04df\7 \2\2\u04df\u04e0\7?\2\2\u04e0\u04e2\5:\36\2\u04e1\u04e3\5\66"+
		"\34\2\u04e2\u04e1\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4"+
		"\u04e6\7[\2\2\u04e5\u04e7\5\66\34\2\u04e6\u04e5\3\2\2\2\u04e6\u04e7\3"+
		"\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04e9\7@\2\2\u04e9\u04ea\5\u0096L\2\u04ea"+
		"\u04ec\3\2\2\2\u04eb\u04c1\3\2\2\2\u04eb\u04c7\3\2\2\2\u04eb\u04cf\3\2"+
		"\2\2\u04eb\u04de\3\2\2\2\u04ec\u00ab\3\2\2\2\u04ed\u04ee\7!\2\2\u04ee"+
		"\u04ef\7m\2\2\u04ef\u04ff\7[\2\2\u04f0\u04f1\7\30\2\2\u04f1\u04ff\7[\2"+
		"\2\u04f2\u04f3\7\24\2\2\u04f3\u04ff\7[\2\2\u04f4\u04f5\7(\2\2\u04f5\u04f7"+
		"\bW\1\2\u04f6\u04f8\5\66\34\2\u04f7\u04f6\3\2\2\2\u04f7\u04f8\3\2\2\2"+
		"\u04f8\u04f9\3\2\2\2\u04f9\u04ff\7[\2\2\u04fa\u04fb\7!\2\2\u04fb\u04fc"+
		"\5\26\f\2\u04fc\u04fd\7[\2\2\u04fd\u04ff\3\2\2\2\u04fe\u04ed\3\2\2\2\u04fe"+
		"\u04f0\3\2\2\2\u04fe\u04f2\3\2\2\2\u04fe\u04f4\3\2\2\2\u04fe\u04fa\3\2"+
		"\2\2\u04ff\u00ad\3\2\2\2\u0500\u0502\5\u00b0Y\2\u0501\u0500\3\2\2\2\u0501"+
		"\u0502\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0504\7\2\2\3\u0504\u00af\3\2"+
		"\2\2\u0505\u0507\bY\1\2\u0506\u0508\5\2\2\2\u0507\u0506\3\2\2\2\u0508"+
		"\u0509\3\2\2\2\u0509\u0507\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050d\3\2"+
		"\2\2\u050b\u050d\5\u00b2Z\2\u050c\u0505\3\2\2\2\u050c\u050b\3\2\2\2\u050d"+
		"\u0512\3\2\2\2\u050e\u050f\f\3\2\2\u050f\u0511\5\u00b2Z\2\u0510\u050e"+
		"\3\2\2\2\u0511\u0514\3\2\2\2\u0512\u0510\3\2\2\2\u0512\u0513\3\2\2\2\u0513"+
		"\u00b1\3\2\2\2\u0514\u0512\3\2\2\2\u0515\u0519\5\u00b4[\2\u0516\u0519"+
		"\5:\36\2\u0517\u0519\7[\2\2\u0518\u0515\3\2\2\2\u0518\u0516\3\2\2\2\u0518"+
		"\u0517\3\2\2\2\u0519\u00b3\3\2\2\2\u051a\u051c\5<\37\2\u051b\u051a\3\2"+
		"\2\2\u051b\u051c\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051f\5h\65\2\u051e"+
		"\u0520\5\u00b6\\\2\u051f\u051e\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u0521"+
		"\3\2\2\2\u0521\u0522\5\u009aN\2\u0522\u00b5\3\2\2\2\u0523\u0524\b\\\1"+
		"\2\u0524\u0525\5:\36\2\u0525\u052a\3\2\2\2\u0526\u0527\f\3\2\2\u0527\u0529"+
		"\5:\36\2\u0528\u0526\3\2\2\2\u0529\u052c\3\2\2\2\u052a\u0528\3\2\2\2\u052a"+
		"\u052b\3\2\2\2\u052b\u00b7\3\2\2\2\u052c\u052a\3\2\2\2\u008e\u00c1\u00c9"+
		"\u00dd\u00ee\u00f8\u011c\u012d\u012f\u013a\u014c\u0166\u0178\u0188\u018a"+
		"\u019a\u019c\u01a8\u01aa\u01bc\u01be\u01ca\u01cc\u01d7\u01e2\u01ee\u01fc"+
		"\u0207\u0210\u0219\u0226\u022d\u0232\u0237\u023c\u0243\u024e\u0257\u0269"+
		"\u026d\u0276\u0281\u0286\u028b\u028f\u0293\u0295\u029f\u02a4\u02a8\u02ac"+
		"\u02b4\u02bd\u02c7\u02cf\u02e0\u02ec\u02ef\u02f6\u02ff\u0304\u0307\u030e"+
		"\u031d\u0329\u032c\u032e\u0336\u033a\u0348\u034c\u0351\u0354\u0357\u035e"+
		"\u0360\u0365\u0369\u036e\u0372\u0375\u037e\u0386\u0390\u0398\u039a\u03a4"+
		"\u03a9\u03ad\u03b3\u03b6\u03bf\u03c4\u03c7\u03cd\u03dd\u03e3\u03e6\u03eb"+
		"\u03ee\u03f5\u0408\u040e\u0411\u0413\u0422\u0426\u042d\u0432\u043f\u0448"+
		"\u0451\u0464\u0467\u046f\u0472\u0476\u047b\u0488\u048c\u0498\u049e\u04a1"+
		"\u04b5\u04bf\u04d2\u04d6\u04da\u04e2\u04e6\u04eb\u04f7\u04fe\u0501\u0509"+
		"\u050c\u0512\u0518\u051b\u051f\u052a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}