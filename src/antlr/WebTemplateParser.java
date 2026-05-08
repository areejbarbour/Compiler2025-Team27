// Generated from C:/Users/DELL/Documents/Compiler2025-Team27-main/src/antlr/WebTemplateParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class WebTemplateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOCTYPE=1, HTML_COMMENT=2, JINJA_COMMENT_START=3, JINJA_EXPR_START=4, 
		JINJA_STMT_START=5, STYLE_OPEN=6, HTML_CLOSE_TAG=7, HTML_OPEN_TAG_START=8, 
		HTML_TEXT=9, VOID_TAG_NAME=10, TAG_OPEN_WS=11, TAG_NAME=12, TAG_WS=13, 
		TAG_ATTR_NAME=14, TAG_EQ=15, TAG_SELF_CLOSE=16, TAG_END=17, ATTR_VALUE_DOUBLE=18, 
		ATTR_VALUE_SINGLE=19, ATTR_VALUE_UNQUOTED=20, STYLE_WS=21, STYLE_ATTR_NAME=22, 
		STYLE_EQ=23, STYLE_TAG_END=24, STYLE_SELF_CLOSE=25, CSS_CLOSE=26, CSS_WS=27, 
		CSS_COMMENT=28, CSS_LBRACE=29, CSS_RBRACE=30, CSS_LPAREN=31, CSS_RPAREN=32, 
		CSS_COLON=33, CSS_SEMI=34, CSS_COMMA=35, CSS_DOT=36, CSS_TILDE=37, CSS_PLUS=38, 
		CSS_STAR=39, CSS_SLASH=40, CSS_BANG=41, CSS_LBRACKET=42, CSS_RBRACKET=43, 
		CSS_GT=44, CSS_LT=45, CSS_EQ=46, CSS_HEX_COLOR=47, CSS_HASH_IDENT=48, 
		CSS_AT_RULE=49, CSS_NUMBER=50, CSS_PERCENTAGE=51, CSS_DIMENSION=52, CSS_STRING=53, 
		CSS_URL=54, CSS_IDENT=55, JINJA_COMMENT_END=56, JINJA_COMMENT_TEXT=57, 
		JINJA_EXPR_END=58, JINJA_WS=59, JINJA_NOT=60, JINJA_AND=61, JINJA_OR=62, 
		JINJA_IN=63, JINJA_IS=64, JINJA_NUMBER=65, JINJA_STRING=66, JINJA_IDENTIFIER=67, 
		JINJA_ASSIGNMENT=68, JINJA_PIPE=69, JINJA_DOT=70, JINJA_LPAREN=71, JINJA_RPAREN=72, 
		JINJA_COMMA=73, JINJA_LBRACKET=74, JINJA_RBRACKET=75, JINJA_COMPARISON=76, 
		JINJA_ADDITIVE=77, JINJA_MULTIPLICATIVE=78, JSTMT_END=79, JSTMT_WS=80, 
		JSTMT_IF=81, JSTMT_ELIF=82, JSTMT_ELSE=83, JSTMT_FOR=84, JSTMT_IN=85, 
		JSTMT_IS=86, JSTMT_ENDIF=87, JSTMT_ENDFOR=88, JSTMT_BLOCK=89, JSTMT_ENDBLOCK=90, 
		JSTMT_SET=91, JSTMT_NOT=92, JSTMT_AND=93, JSTMT_OR=94, JSTMT_IDENTIFIER=95, 
		JSTMT_NUMBER=96, JSTMT_STRING=97, JSTMT_PIPE=98, JSTMT_DOT=99, JSTMT_COMMA=100, 
		JSTMT_LPAREN=101, JSTMT_RPAREN=102, JSTMT_LBRACKET=103, JSTMT_RBRACKET=104, 
		JSTMT_COMPARISON=105, JSTMT_ASSIGNMENT=106, JSTMT_ADDITIVE=107, JSTMT_MULTIPLICATIVE=108;
	public static final int
		RULE_document = 0, RULE_element = 1, RULE_htmlElement = 2, RULE_htmlVoidTag = 3, 
		RULE_htmlOpenTag = 4, RULE_htmlSelfCloseTag = 5, RULE_htmlCloseTag = 6, 
		RULE_tagAttribute = 7, RULE_attrValue = 8, RULE_cssBlock = 9, RULE_styleAttribute = 10, 
		RULE_cssRule = 11, RULE_mediaRule = 12, RULE_mediaCondition = 13, RULE_mediaConditionPart = 14, 
		RULE_selector = 15, RULE_selectorItem = 16, RULE_compoundSelector = 17, 
		RULE_simpleSelector = 18, RULE_declaration = 19, RULE_cssValue = 20, RULE_jinjaBlock = 21, 
		RULE_jinjaIf = 22, RULE_jinjaElif = 23, RULE_jinjaElse = 24, RULE_jinjaFor = 25, 
		RULE_forTargetList = 26, RULE_jinjaSet = 27, RULE_jinjaBlockStmt = 28, 
		RULE_jinjaExpr = 29, RULE_jinjaComment = 30, RULE_expr = 31, RULE_orExpr = 32, 
		RULE_andExpr = 33, RULE_notExpr = 34, RULE_comparisonExpr = 35, RULE_comparisonOp = 36, 
		RULE_additiveExpr = 37, RULE_multiplicativeExpr = 38, RULE_unaryExpr = 39, 
		RULE_postfixExpr = 40, RULE_atom = 41, RULE_postfixSuffix = 42, RULE_argument = 43, 
		RULE_exprList = 44, RULE_textNode = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "element", "htmlElement", "htmlVoidTag", "htmlOpenTag", "htmlSelfCloseTag", 
			"htmlCloseTag", "tagAttribute", "attrValue", "cssBlock", "styleAttribute", 
			"cssRule", "mediaRule", "mediaCondition", "mediaConditionPart", "selector", 
			"selectorItem", "compoundSelector", "simpleSelector", "declaration", 
			"cssValue", "jinjaBlock", "jinjaIf", "jinjaElif", "jinjaElse", "jinjaFor", 
			"forTargetList", "jinjaSet", "jinjaBlockStmt", "jinjaExpr", "jinjaComment", 
			"expr", "orExpr", "andExpr", "notExpr", "comparisonExpr", "comparisonOp", 
			"additiveExpr", "multiplicativeExpr", "unaryExpr", "postfixExpr", "atom", 
			"postfixSuffix", "argument", "exprList", "textNode"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'{#'", "'{{'", "'{%'", "'<style'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'{'", "'}'", null, null, "':'", 
			"';'", null, null, "'~'", "'+'", "'*'", "'/'", "'!'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'#}'", 
			null, "'}}'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'%}'", null, 
			"'if'", "'elif'", "'else'", "'for'", null, null, "'endif'", "'endfor'", 
			"'block'", "'endblock'", "'set'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOCTYPE", "HTML_COMMENT", "JINJA_COMMENT_START", "JINJA_EXPR_START", 
			"JINJA_STMT_START", "STYLE_OPEN", "HTML_CLOSE_TAG", "HTML_OPEN_TAG_START", 
			"HTML_TEXT", "VOID_TAG_NAME", "TAG_OPEN_WS", "TAG_NAME", "TAG_WS", "TAG_ATTR_NAME", 
			"TAG_EQ", "TAG_SELF_CLOSE", "TAG_END", "ATTR_VALUE_DOUBLE", "ATTR_VALUE_SINGLE", 
			"ATTR_VALUE_UNQUOTED", "STYLE_WS", "STYLE_ATTR_NAME", "STYLE_EQ", "STYLE_TAG_END", 
			"STYLE_SELF_CLOSE", "CSS_CLOSE", "CSS_WS", "CSS_COMMENT", "CSS_LBRACE", 
			"CSS_RBRACE", "CSS_LPAREN", "CSS_RPAREN", "CSS_COLON", "CSS_SEMI", "CSS_COMMA", 
			"CSS_DOT", "CSS_TILDE", "CSS_PLUS", "CSS_STAR", "CSS_SLASH", "CSS_BANG", 
			"CSS_LBRACKET", "CSS_RBRACKET", "CSS_GT", "CSS_LT", "CSS_EQ", "CSS_HEX_COLOR", 
			"CSS_HASH_IDENT", "CSS_AT_RULE", "CSS_NUMBER", "CSS_PERCENTAGE", "CSS_DIMENSION", 
			"CSS_STRING", "CSS_URL", "CSS_IDENT", "JINJA_COMMENT_END", "JINJA_COMMENT_TEXT", 
			"JINJA_EXPR_END", "JINJA_WS", "JINJA_NOT", "JINJA_AND", "JINJA_OR", "JINJA_IN", 
			"JINJA_IS", "JINJA_NUMBER", "JINJA_STRING", "JINJA_IDENTIFIER", "JINJA_ASSIGNMENT", 
			"JINJA_PIPE", "JINJA_DOT", "JINJA_LPAREN", "JINJA_RPAREN", "JINJA_COMMA", 
			"JINJA_LBRACKET", "JINJA_RBRACKET", "JINJA_COMPARISON", "JINJA_ADDITIVE", 
			"JINJA_MULTIPLICATIVE", "JSTMT_END", "JSTMT_WS", "JSTMT_IF", "JSTMT_ELIF", 
			"JSTMT_ELSE", "JSTMT_FOR", "JSTMT_IN", "JSTMT_IS", "JSTMT_ENDIF", "JSTMT_ENDFOR", 
			"JSTMT_BLOCK", "JSTMT_ENDBLOCK", "JSTMT_SET", "JSTMT_NOT", "JSTMT_AND", 
			"JSTMT_OR", "JSTMT_IDENTIFIER", "JSTMT_NUMBER", "JSTMT_STRING", "JSTMT_PIPE", 
			"JSTMT_DOT", "JSTMT_COMMA", "JSTMT_LPAREN", "JSTMT_RPAREN", "JSTMT_LBRACKET", 
			"JSTMT_RBRACKET", "JSTMT_COMPARISON", "JSTMT_ASSIGNMENT", "JSTMT_ADDITIVE", 
			"JSTMT_MULTIPLICATIVE"
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
	public String getGrammarFileName() { return "WebTemplateParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WebTemplateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DocumentContext extends ParserRuleContext {
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
	 
		public DocumentContext() { }
		public void copyFrom(DocumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DocumentRootContext extends DocumentContext {
		public TerminalNode EOF() { return getToken(WebTemplateParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public DocumentRootContext(DocumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterDocumentRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitDocumentRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitDocumentRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			_localctx = new DocumentRootContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 888L) != 0)) {
				{
				{
				setState(92);
				element();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
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
	public static class ElementContext extends ParserRuleContext {
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	 
		public ElementContext() { }
		public void copyFrom(ElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementCssContext extends ElementContext {
		public CssBlockContext cssBlock() {
			return getRuleContext(CssBlockContext.class,0);
		}
		public ElementCssContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterElementCss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitElementCss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitElementCss(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementHtmlContext extends ElementContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public ElementHtmlContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterElementHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitElementHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitElementHtml(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementTextContext extends ElementContext {
		public TextNodeContext textNode() {
			return getRuleContext(TextNodeContext.class,0);
		}
		public ElementTextContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterElementText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitElementText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitElementText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementJinjaContext extends ElementContext {
		public JinjaBlockContext jinjaBlock() {
			return getRuleContext(JinjaBlockContext.class,0);
		}
		public ElementJinjaContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterElementJinja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitElementJinja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitElementJinja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_OPEN_TAG_START:
				_localctx = new ElementHtmlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				htmlElement();
				}
				break;
			case STYLE_OPEN:
				_localctx = new ElementCssContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				cssBlock();
				}
				break;
			case JINJA_COMMENT_START:
			case JINJA_EXPR_START:
			case JINJA_STMT_START:
				_localctx = new ElementJinjaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				jinjaBlock();
				}
				break;
			case HTML_TEXT:
				_localctx = new ElementTextContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				textNode();
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
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContainerContext extends HtmlElementContext {
		public HtmlOpenTagContext htmlOpenTag() {
			return getRuleContext(HtmlOpenTagContext.class,0);
		}
		public HtmlCloseTagContext htmlCloseTag() {
			return getRuleContext(HtmlCloseTagContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public HtmlElementContainerContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterHtmlElementContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitHtmlElementContainer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitHtmlElementContainer(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementVoidContext extends HtmlElementContext {
		public HtmlVoidTagContext htmlVoidTag() {
			return getRuleContext(HtmlVoidTagContext.class,0);
		}
		public HtmlElementVoidContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterHtmlElementVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitHtmlElementVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitHtmlElementVoid(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementSelfClosingContext extends HtmlElementContext {
		public HtmlSelfCloseTagContext htmlSelfCloseTag() {
			return getRuleContext(HtmlSelfCloseTagContext.class,0);
		}
		public HtmlElementSelfClosingContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterHtmlElementSelfClosing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitHtmlElementSelfClosing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitHtmlElementSelfClosing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		int _la;
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new HtmlElementVoidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				htmlVoidTag();
				}
				break;
			case 2:
				_localctx = new HtmlElementContainerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				htmlOpenTag();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 888L) != 0)) {
					{
					{
					setState(108);
					element();
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(114);
				htmlCloseTag();
				}
				break;
			case 3:
				_localctx = new HtmlElementSelfClosingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				htmlSelfCloseTag();
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
	public static class HtmlVoidTagContext extends ParserRuleContext {
		public HtmlVoidTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlVoidTag; }
	 
		public HtmlVoidTagContext() { }
		public void copyFrom(HtmlVoidTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlVoidTagFullContext extends HtmlVoidTagContext {
		public TerminalNode HTML_OPEN_TAG_START() { return getToken(WebTemplateParser.HTML_OPEN_TAG_START, 0); }
		public TerminalNode VOID_TAG_NAME() { return getToken(WebTemplateParser.VOID_TAG_NAME, 0); }
		public TerminalNode TAG_END() { return getToken(WebTemplateParser.TAG_END, 0); }
		public List<TagAttributeContext> tagAttribute() {
			return getRuleContexts(TagAttributeContext.class);
		}
		public TagAttributeContext tagAttribute(int i) {
			return getRuleContext(TagAttributeContext.class,i);
		}
		public HtmlVoidTagFullContext(HtmlVoidTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterHtmlVoidTagFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitHtmlVoidTagFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitHtmlVoidTagFull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlVoidTagContext htmlVoidTag() throws RecognitionException {
		HtmlVoidTagContext _localctx = new HtmlVoidTagContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlVoidTag);
		int _la;
		try {
			_localctx = new HtmlVoidTagFullContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(HTML_OPEN_TAG_START);
			setState(120);
			match(VOID_TAG_NAME);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_ATTR_NAME) {
				{
				{
				setState(121);
				tagAttribute();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(TAG_END);
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
	public static class HtmlOpenTagContext extends ParserRuleContext {
		public HtmlOpenTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlOpenTag; }
	 
		public HtmlOpenTagContext() { }
		public void copyFrom(HtmlOpenTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlOpenTagFullContext extends HtmlOpenTagContext {
		public TerminalNode HTML_OPEN_TAG_START() { return getToken(WebTemplateParser.HTML_OPEN_TAG_START, 0); }
		public TerminalNode TAG_NAME() { return getToken(WebTemplateParser.TAG_NAME, 0); }
		public TerminalNode TAG_END() { return getToken(WebTemplateParser.TAG_END, 0); }
		public List<TagAttributeContext> tagAttribute() {
			return getRuleContexts(TagAttributeContext.class);
		}
		public TagAttributeContext tagAttribute(int i) {
			return getRuleContext(TagAttributeContext.class,i);
		}
		public HtmlOpenTagFullContext(HtmlOpenTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterHtmlOpenTagFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitHtmlOpenTagFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitHtmlOpenTagFull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlOpenTagContext htmlOpenTag() throws RecognitionException {
		HtmlOpenTagContext _localctx = new HtmlOpenTagContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlOpenTag);
		int _la;
		try {
			_localctx = new HtmlOpenTagFullContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(HTML_OPEN_TAG_START);
			setState(130);
			match(TAG_NAME);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_ATTR_NAME) {
				{
				{
				setState(131);
				tagAttribute();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(TAG_END);
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
	public static class HtmlSelfCloseTagContext extends ParserRuleContext {
		public HtmlSelfCloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlSelfCloseTag; }
	 
		public HtmlSelfCloseTagContext() { }
		public void copyFrom(HtmlSelfCloseTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlSelfClosingTagFullContext extends HtmlSelfCloseTagContext {
		public TerminalNode HTML_OPEN_TAG_START() { return getToken(WebTemplateParser.HTML_OPEN_TAG_START, 0); }
		public TerminalNode TAG_SELF_CLOSE() { return getToken(WebTemplateParser.TAG_SELF_CLOSE, 0); }
		public TerminalNode TAG_NAME() { return getToken(WebTemplateParser.TAG_NAME, 0); }
		public TerminalNode VOID_TAG_NAME() { return getToken(WebTemplateParser.VOID_TAG_NAME, 0); }
		public List<TagAttributeContext> tagAttribute() {
			return getRuleContexts(TagAttributeContext.class);
		}
		public TagAttributeContext tagAttribute(int i) {
			return getRuleContext(TagAttributeContext.class,i);
		}
		public HtmlSelfClosingTagFullContext(HtmlSelfCloseTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterHtmlSelfClosingTagFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitHtmlSelfClosingTagFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitHtmlSelfClosingTagFull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlSelfCloseTagContext htmlSelfCloseTag() throws RecognitionException {
		HtmlSelfCloseTagContext _localctx = new HtmlSelfCloseTagContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlSelfCloseTag);
		int _la;
		try {
			_localctx = new HtmlSelfClosingTagFullContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(HTML_OPEN_TAG_START);
			setState(140);
			_la = _input.LA(1);
			if ( !(_la==VOID_TAG_NAME || _la==TAG_NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_ATTR_NAME) {
				{
				{
				setState(141);
				tagAttribute();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			match(TAG_SELF_CLOSE);
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
	public static class HtmlCloseTagContext extends ParserRuleContext {
		public HtmlCloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlCloseTag; }
	 
		public HtmlCloseTagContext() { }
		public void copyFrom(HtmlCloseTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCloseTagFullContext extends HtmlCloseTagContext {
		public TerminalNode HTML_CLOSE_TAG() { return getToken(WebTemplateParser.HTML_CLOSE_TAG, 0); }
		public HtmlCloseTagFullContext(HtmlCloseTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterHtmlCloseTagFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitHtmlCloseTagFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitHtmlCloseTagFull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCloseTagContext htmlCloseTag() throws RecognitionException {
		HtmlCloseTagContext _localctx = new HtmlCloseTagContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_htmlCloseTag);
		try {
			_localctx = new HtmlCloseTagFullContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(HTML_CLOSE_TAG);
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
	public static class TagAttributeContext extends ParserRuleContext {
		public TagAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagAttribute; }
	 
		public TagAttributeContext() { }
		public void copyFrom(TagAttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeBooleanContext extends TagAttributeContext {
		public TerminalNode TAG_ATTR_NAME() { return getToken(WebTemplateParser.TAG_ATTR_NAME, 0); }
		public HtmlAttributeBooleanContext(TagAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterHtmlAttributeBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitHtmlAttributeBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitHtmlAttributeBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeWithValueContext extends TagAttributeContext {
		public TerminalNode TAG_ATTR_NAME() { return getToken(WebTemplateParser.TAG_ATTR_NAME, 0); }
		public TerminalNode TAG_EQ() { return getToken(WebTemplateParser.TAG_EQ, 0); }
		public AttrValueContext attrValue() {
			return getRuleContext(AttrValueContext.class,0);
		}
		public HtmlAttributeWithValueContext(TagAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterHtmlAttributeWithValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitHtmlAttributeWithValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitHtmlAttributeWithValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagAttributeContext tagAttribute() throws RecognitionException {
		TagAttributeContext _localctx = new TagAttributeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tagAttribute);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new HtmlAttributeWithValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(TAG_ATTR_NAME);
				setState(152);
				match(TAG_EQ);
				setState(153);
				attrValue();
				}
				break;
			case 2:
				_localctx = new HtmlAttributeBooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(TAG_ATTR_NAME);
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
	public static class AttrValueContext extends ParserRuleContext {
		public AttrValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrValue; }
	 
		public AttrValueContext() { }
		public void copyFrom(AttrValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrValueDoubleContext extends AttrValueContext {
		public TerminalNode ATTR_VALUE_DOUBLE() { return getToken(WebTemplateParser.ATTR_VALUE_DOUBLE, 0); }
		public AttrValueDoubleContext(AttrValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterAttrValueDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitAttrValueDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitAttrValueDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrValueUnquotedContext extends AttrValueContext {
		public TerminalNode ATTR_VALUE_UNQUOTED() { return getToken(WebTemplateParser.ATTR_VALUE_UNQUOTED, 0); }
		public AttrValueUnquotedContext(AttrValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterAttrValueUnquoted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitAttrValueUnquoted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitAttrValueUnquoted(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrValueSingleContext extends AttrValueContext {
		public TerminalNode ATTR_VALUE_SINGLE() { return getToken(WebTemplateParser.ATTR_VALUE_SINGLE, 0); }
		public AttrValueSingleContext(AttrValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterAttrValueSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitAttrValueSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitAttrValueSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrValueContext attrValue() throws RecognitionException {
		AttrValueContext _localctx = new AttrValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attrValue);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTR_VALUE_DOUBLE:
				_localctx = new AttrValueDoubleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(ATTR_VALUE_DOUBLE);
				}
				break;
			case ATTR_VALUE_SINGLE:
				_localctx = new AttrValueSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(ATTR_VALUE_SINGLE);
				}
				break;
			case ATTR_VALUE_UNQUOTED:
				_localctx = new AttrValueUnquotedContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(ATTR_VALUE_UNQUOTED);
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
	public static class CssBlockContext extends ParserRuleContext {
		public CssBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssBlock; }
	 
		public CssBlockContext() { }
		public void copyFrom(CssBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssBlockSelfClosedContext extends CssBlockContext {
		public TerminalNode STYLE_OPEN() { return getToken(WebTemplateParser.STYLE_OPEN, 0); }
		public TerminalNode STYLE_SELF_CLOSE() { return getToken(WebTemplateParser.STYLE_SELF_CLOSE, 0); }
		public List<StyleAttributeContext> styleAttribute() {
			return getRuleContexts(StyleAttributeContext.class);
		}
		public StyleAttributeContext styleAttribute(int i) {
			return getRuleContext(StyleAttributeContext.class,i);
		}
		public CssBlockSelfClosedContext(CssBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssBlockSelfClosed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssBlockSelfClosed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssBlockSelfClosed(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssBlockWithContentContext extends CssBlockContext {
		public TerminalNode STYLE_OPEN() { return getToken(WebTemplateParser.STYLE_OPEN, 0); }
		public TerminalNode STYLE_TAG_END() { return getToken(WebTemplateParser.STYLE_TAG_END, 0); }
		public TerminalNode CSS_CLOSE() { return getToken(WebTemplateParser.CSS_CLOSE, 0); }
		public List<StyleAttributeContext> styleAttribute() {
			return getRuleContexts(StyleAttributeContext.class);
		}
		public StyleAttributeContext styleAttribute(int i) {
			return getRuleContext(StyleAttributeContext.class,i);
		}
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public List<MediaRuleContext> mediaRule() {
			return getRuleContexts(MediaRuleContext.class);
		}
		public MediaRuleContext mediaRule(int i) {
			return getRuleContext(MediaRuleContext.class,i);
		}
		public CssBlockWithContentContext(CssBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssBlockWithContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssBlockWithContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssBlockWithContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssBlockContext cssBlock() throws RecognitionException {
		CssBlockContext _localctx = new CssBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cssBlock);
		int _la;
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new CssBlockWithContentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(STYLE_OPEN);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STYLE_ATTR_NAME) {
					{
					{
					setState(163);
					styleAttribute();
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(STYLE_TAG_END);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36873849014321152L) != 0)) {
					{
					setState(172);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CSS_COLON:
					case CSS_DOT:
					case CSS_STAR:
					case CSS_HASH_IDENT:
					case CSS_IDENT:
						{
						setState(170);
						cssRule();
						}
						break;
					case CSS_AT_RULE:
						{
						setState(171);
						mediaRule();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				match(CSS_CLOSE);
				}
				break;
			case 2:
				_localctx = new CssBlockSelfClosedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(STYLE_OPEN);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STYLE_ATTR_NAME) {
					{
					{
					setState(179);
					styleAttribute();
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185);
				match(STYLE_SELF_CLOSE);
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
	public static class StyleAttributeContext extends ParserRuleContext {
		public StyleAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleAttribute; }
	 
		public StyleAttributeContext() { }
		public void copyFrom(StyleAttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleAttributeBooleanContext extends StyleAttributeContext {
		public TerminalNode STYLE_ATTR_NAME() { return getToken(WebTemplateParser.STYLE_ATTR_NAME, 0); }
		public StyleAttributeBooleanContext(StyleAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterStyleAttributeBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitStyleAttributeBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitStyleAttributeBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleAttributeWithValueContext extends StyleAttributeContext {
		public TerminalNode STYLE_ATTR_NAME() { return getToken(WebTemplateParser.STYLE_ATTR_NAME, 0); }
		public TerminalNode STYLE_EQ() { return getToken(WebTemplateParser.STYLE_EQ, 0); }
		public AttrValueContext attrValue() {
			return getRuleContext(AttrValueContext.class,0);
		}
		public StyleAttributeWithValueContext(StyleAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterStyleAttributeWithValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitStyleAttributeWithValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitStyleAttributeWithValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleAttributeContext styleAttribute() throws RecognitionException {
		StyleAttributeContext _localctx = new StyleAttributeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_styleAttribute);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new StyleAttributeWithValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(STYLE_ATTR_NAME);
				setState(189);
				match(STYLE_EQ);
				setState(190);
				attrValue();
				}
				break;
			case 2:
				_localctx = new StyleAttributeBooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(STYLE_ATTR_NAME);
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
	public static class CssRuleContext extends ParserRuleContext {
		public CssRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRule; }
	 
		public CssRuleContext() { }
		public void copyFrom(CssRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssRuleStandardContext extends CssRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode CSS_LBRACE() { return getToken(WebTemplateParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(WebTemplateParser.CSS_RBRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public CssRuleStandardContext(CssRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssRuleStandard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssRuleStandard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssRuleStandard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRuleContext cssRule() throws RecognitionException {
		CssRuleContext _localctx = new CssRuleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cssRule);
		int _la;
		try {
			_localctx = new CssRuleStandardContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			selector();
			setState(195);
			match(CSS_LBRACE);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_IDENT) {
				{
				{
				setState(196);
				declaration();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(CSS_RBRACE);
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
	public static class MediaRuleContext extends ParserRuleContext {
		public MediaRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaRule; }
	 
		public MediaRuleContext() { }
		public void copyFrom(MediaRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssMediaRuleFullContext extends MediaRuleContext {
		public TerminalNode CSS_AT_RULE() { return getToken(WebTemplateParser.CSS_AT_RULE, 0); }
		public MediaConditionContext mediaCondition() {
			return getRuleContext(MediaConditionContext.class,0);
		}
		public TerminalNode CSS_LBRACE() { return getToken(WebTemplateParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(WebTemplateParser.CSS_RBRACE, 0); }
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public List<MediaRuleContext> mediaRule() {
			return getRuleContexts(MediaRuleContext.class);
		}
		public MediaRuleContext mediaRule(int i) {
			return getRuleContext(MediaRuleContext.class,i);
		}
		public CssMediaRuleFullContext(MediaRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssMediaRuleFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssMediaRuleFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssMediaRuleFull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaRuleContext mediaRule() throws RecognitionException {
		MediaRuleContext _localctx = new MediaRuleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mediaRule);
		int _la;
		try {
			_localctx = new CssMediaRuleFullContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(CSS_AT_RULE);
			setState(205);
			mediaCondition();
			setState(206);
			match(CSS_LBRACE);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36873849014321152L) != 0)) {
				{
				setState(209);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_COLON:
				case CSS_DOT:
				case CSS_STAR:
				case CSS_HASH_IDENT:
				case CSS_IDENT:
					{
					setState(207);
					cssRule();
					}
					break;
				case CSS_AT_RULE:
					{
					setState(208);
					mediaRule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			match(CSS_RBRACE);
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
	public static class MediaConditionContext extends ParserRuleContext {
		public MediaConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaCondition; }
	 
		public MediaConditionContext() { }
		public void copyFrom(MediaConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssMediaConditionContext extends MediaConditionContext {
		public List<MediaConditionPartContext> mediaConditionPart() {
			return getRuleContexts(MediaConditionPartContext.class);
		}
		public MediaConditionPartContext mediaConditionPart(int i) {
			return getRuleContext(MediaConditionPartContext.class,i);
		}
		public CssMediaConditionContext(MediaConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssMediaCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssMediaCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssMediaCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaConditionContext mediaCondition() throws RecognitionException {
		MediaConditionContext _localctx = new MediaConditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mediaCondition);
		int _la;
		try {
			_localctx = new CssMediaConditionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(217); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(216);
				mediaConditionPart();
				}
				}
				setState(219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 44191689455173632L) != 0) );
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
	public static class MediaConditionPartContext extends ParserRuleContext {
		public MediaConditionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaConditionPart; }
	 
		public MediaConditionPartContext() { }
		public void copyFrom(MediaConditionPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MediaCondCommaContext extends MediaConditionPartContext {
		public TerminalNode CSS_COMMA() { return getToken(WebTemplateParser.CSS_COMMA, 0); }
		public MediaCondCommaContext(MediaConditionPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterMediaCondComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitMediaCondComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitMediaCondComma(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MediaCondIdentContext extends MediaConditionPartContext {
		public TerminalNode CSS_IDENT() { return getToken(WebTemplateParser.CSS_IDENT, 0); }
		public MediaCondIdentContext(MediaConditionPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterMediaCondIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitMediaCondIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitMediaCondIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MediaCondRParenContext extends MediaConditionPartContext {
		public TerminalNode CSS_RPAREN() { return getToken(WebTemplateParser.CSS_RPAREN, 0); }
		public MediaCondRParenContext(MediaConditionPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterMediaCondRParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitMediaCondRParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitMediaCondRParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MediaCondPercentageContext extends MediaConditionPartContext {
		public TerminalNode CSS_PERCENTAGE() { return getToken(WebTemplateParser.CSS_PERCENTAGE, 0); }
		public MediaCondPercentageContext(MediaConditionPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterMediaCondPercentage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitMediaCondPercentage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitMediaCondPercentage(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MediaCondDotContext extends MediaConditionPartContext {
		public TerminalNode CSS_DOT() { return getToken(WebTemplateParser.CSS_DOT, 0); }
		public MediaCondDotContext(MediaConditionPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterMediaCondDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitMediaCondDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitMediaCondDot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MediaCondColonContext extends MediaConditionPartContext {
		public TerminalNode CSS_COLON() { return getToken(WebTemplateParser.CSS_COLON, 0); }
		public MediaCondColonContext(MediaConditionPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterMediaCondColon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitMediaCondColon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitMediaCondColon(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MediaCondLParenContext extends MediaConditionPartContext {
		public TerminalNode CSS_LPAREN() { return getToken(WebTemplateParser.CSS_LPAREN, 0); }
		public MediaCondLParenContext(MediaConditionPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterMediaCondLParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitMediaCondLParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitMediaCondLParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MediaCondHashContext extends MediaConditionPartContext {
		public TerminalNode CSS_HASH_IDENT() { return getToken(WebTemplateParser.CSS_HASH_IDENT, 0); }
		public MediaCondHashContext(MediaConditionPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterMediaCondHash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitMediaCondHash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitMediaCondHash(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MediaCondNumberContext extends MediaConditionPartContext {
		public TerminalNode CSS_NUMBER() { return getToken(WebTemplateParser.CSS_NUMBER, 0); }
		public MediaCondNumberContext(MediaConditionPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterMediaCondNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitMediaCondNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitMediaCondNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MediaCondDimensionContext extends MediaConditionPartContext {
		public TerminalNode CSS_DIMENSION() { return getToken(WebTemplateParser.CSS_DIMENSION, 0); }
		public MediaCondDimensionContext(MediaConditionPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterMediaCondDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitMediaCondDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitMediaCondDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaConditionPartContext mediaConditionPart() throws RecognitionException {
		MediaConditionPartContext _localctx = new MediaConditionPartContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mediaConditionPart);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_IDENT:
				_localctx = new MediaCondIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(CSS_IDENT);
				}
				break;
			case CSS_NUMBER:
				_localctx = new MediaCondNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(CSS_NUMBER);
				}
				break;
			case CSS_PERCENTAGE:
				_localctx = new MediaCondPercentageContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(CSS_PERCENTAGE);
				}
				break;
			case CSS_DIMENSION:
				_localctx = new MediaCondDimensionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				match(CSS_DIMENSION);
				}
				break;
			case CSS_COLON:
				_localctx = new MediaCondColonContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(225);
				match(CSS_COLON);
				}
				break;
			case CSS_COMMA:
				_localctx = new MediaCondCommaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(226);
				match(CSS_COMMA);
				}
				break;
			case CSS_LPAREN:
				_localctx = new MediaCondLParenContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(227);
				match(CSS_LPAREN);
				}
				break;
			case CSS_RPAREN:
				_localctx = new MediaCondRParenContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(228);
				match(CSS_RPAREN);
				}
				break;
			case CSS_DOT:
				_localctx = new MediaCondDotContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(229);
				match(CSS_DOT);
				}
				break;
			case CSS_HASH_IDENT:
				_localctx = new MediaCondHashContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(230);
				match(CSS_HASH_IDENT);
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
	public static class SelectorContext extends ParserRuleContext {
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	 
		public SelectorContext() { }
		public void copyFrom(SelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorListContext extends SelectorContext {
		public List<SelectorItemContext> selectorItem() {
			return getRuleContexts(SelectorItemContext.class);
		}
		public SelectorItemContext selectorItem(int i) {
			return getRuleContext(SelectorItemContext.class,i);
		}
		public List<TerminalNode> CSS_COMMA() { return getTokens(WebTemplateParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(WebTemplateParser.CSS_COMMA, i);
		}
		public CssSelectorListContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssSelectorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssSelectorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssSelectorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_selector);
		int _la;
		try {
			_localctx = new CssSelectorListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			selectorItem();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(234);
				match(CSS_COMMA);
				setState(235);
				selectorItem();
				}
				}
				setState(240);
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
	public static class SelectorItemContext extends ParserRuleContext {
		public SelectorItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorItem; }
	 
		public SelectorItemContext() { }
		public void copyFrom(SelectorItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorSequenceContext extends SelectorItemContext {
		public List<CompoundSelectorContext> compoundSelector() {
			return getRuleContexts(CompoundSelectorContext.class);
		}
		public CompoundSelectorContext compoundSelector(int i) {
			return getRuleContext(CompoundSelectorContext.class,i);
		}
		public CssSelectorSequenceContext(SelectorItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssSelectorSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssSelectorSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssSelectorSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorItemContext selectorItem() throws RecognitionException {
		SelectorItemContext _localctx = new SelectorItemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_selectorItem);
		int _la;
		try {
			_localctx = new CssSelectorSequenceContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(242); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(241);
				compoundSelector();
				}
				}
				setState(244); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 36310899060899840L) != 0) );
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
	public static class CompoundSelectorContext extends ParserRuleContext {
		public CompoundSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundSelector; }
	 
		public CompoundSelectorContext() { }
		public void copyFrom(CompoundSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssCompoundSelectorContext extends CompoundSelectorContext {
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
		}
		public CssCompoundSelectorContext(CompoundSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssCompoundSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssCompoundSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssCompoundSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundSelectorContext compoundSelector() throws RecognitionException {
		CompoundSelectorContext _localctx = new CompoundSelectorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_compoundSelector);
		try {
			int _alt;
			_localctx = new CssCompoundSelectorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(247); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(246);
					simpleSelector();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(249); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class SimpleSelectorContext extends ParserRuleContext {
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
	 
		public SimpleSelectorContext() { }
		public void copyFrom(SimpleSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssUniversalSelectorContext extends SimpleSelectorContext {
		public TerminalNode CSS_STAR() { return getToken(WebTemplateParser.CSS_STAR, 0); }
		public CssUniversalSelectorContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssUniversalSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssUniversalSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssUniversalSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssTypeSelectorContext extends SimpleSelectorContext {
		public TerminalNode CSS_IDENT() { return getToken(WebTemplateParser.CSS_IDENT, 0); }
		public CssTypeSelectorContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssTypeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssTypeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssTypeSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssPseudoClassContext extends SimpleSelectorContext {
		public TerminalNode CSS_COLON() { return getToken(WebTemplateParser.CSS_COLON, 0); }
		public TerminalNode CSS_IDENT() { return getToken(WebTemplateParser.CSS_IDENT, 0); }
		public CssPseudoClassContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssPseudoClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssPseudoClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssPseudoClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssClassSelectorContext extends SimpleSelectorContext {
		public TerminalNode CSS_DOT() { return getToken(WebTemplateParser.CSS_DOT, 0); }
		public TerminalNode CSS_IDENT() { return getToken(WebTemplateParser.CSS_IDENT, 0); }
		public CssClassSelectorContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssIdSelectorContext extends SimpleSelectorContext {
		public TerminalNode CSS_HASH_IDENT() { return getToken(WebTemplateParser.CSS_HASH_IDENT, 0); }
		public CssIdSelectorContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssIdSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssIdSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssIdSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_simpleSelector);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_IDENT:
				_localctx = new CssTypeSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(CSS_IDENT);
				}
				break;
			case CSS_DOT:
				_localctx = new CssClassSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(CSS_DOT);
				setState(253);
				match(CSS_IDENT);
				}
				break;
			case CSS_HASH_IDENT:
				_localctx = new CssIdSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				match(CSS_HASH_IDENT);
				}
				break;
			case CSS_COLON:
				_localctx = new CssPseudoClassContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				match(CSS_COLON);
				setState(256);
				match(CSS_IDENT);
				}
				break;
			case CSS_STAR:
				_localctx = new CssUniversalSelectorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
				match(CSS_STAR);
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
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssDeclarationFullContext extends DeclarationContext {
		public TerminalNode CSS_IDENT() { return getToken(WebTemplateParser.CSS_IDENT, 0); }
		public TerminalNode CSS_COLON() { return getToken(WebTemplateParser.CSS_COLON, 0); }
		public TerminalNode CSS_SEMI() { return getToken(WebTemplateParser.CSS_SEMI, 0); }
		public List<CssValueContext> cssValue() {
			return getRuleContexts(CssValueContext.class);
		}
		public CssValueContext cssValue(int i) {
			return getRuleContext(CssValueContext.class,i);
		}
		public CssDeclarationFullContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssDeclarationFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssDeclarationFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssDeclarationFull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declaration);
		int _la;
		try {
			_localctx = new CssDeclarationFullContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(CSS_IDENT);
			setState(261);
			match(CSS_COLON);
			setState(263); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(262);
				cssValue();
				}
				}
				setState(265); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 71357314652700672L) != 0) );
			setState(267);
			match(CSS_SEMI);
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
	public static class CssValueContext extends ParserRuleContext {
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
	 
		public CssValueContext() { }
		public void copyFrom(CssValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssValueUrlContext extends CssValueContext {
		public TerminalNode CSS_URL() { return getToken(WebTemplateParser.CSS_URL, 0); }
		public CssValueUrlContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssValueUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssValueUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssValueUrl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssValueCommaContext extends CssValueContext {
		public TerminalNode CSS_COMMA() { return getToken(WebTemplateParser.CSS_COMMA, 0); }
		public CssValueCommaContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssValueComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssValueComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssValueComma(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssValueHexColorContext extends CssValueContext {
		public TerminalNode CSS_HEX_COLOR() { return getToken(WebTemplateParser.CSS_HEX_COLOR, 0); }
		public CssValueHexColorContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssValueHexColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssValueHexColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssValueHexColor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssValueDimensionContext extends CssValueContext {
		public TerminalNode CSS_DIMENSION() { return getToken(WebTemplateParser.CSS_DIMENSION, 0); }
		public CssValueDimensionContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssValueDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssValueDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssValueDimension(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssValueStringContext extends CssValueContext {
		public TerminalNode CSS_STRING() { return getToken(WebTemplateParser.CSS_STRING, 0); }
		public CssValueStringContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssValueString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssValueString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssValueString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssValueSlashContext extends CssValueContext {
		public TerminalNode CSS_SLASH() { return getToken(WebTemplateParser.CSS_SLASH, 0); }
		public CssValueSlashContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssValueSlash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssValueSlash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssValueSlash(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssValueLParenContext extends CssValueContext {
		public TerminalNode CSS_LPAREN() { return getToken(WebTemplateParser.CSS_LPAREN, 0); }
		public CssValueLParenContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssValueLParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssValueLParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssValueLParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssValueNumberContext extends CssValueContext {
		public TerminalNode CSS_NUMBER() { return getToken(WebTemplateParser.CSS_NUMBER, 0); }
		public CssValueNumberContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssValueNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssValueNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssValueNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssValueIdentContext extends CssValueContext {
		public TerminalNode CSS_IDENT() { return getToken(WebTemplateParser.CSS_IDENT, 0); }
		public CssValueIdentContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssValueIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssValueIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssValueIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssValueDotContext extends CssValueContext {
		public TerminalNode CSS_DOT() { return getToken(WebTemplateParser.CSS_DOT, 0); }
		public CssValueDotContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssValueDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssValueDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssValueDot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssValueRParenContext extends CssValueContext {
		public TerminalNode CSS_RPAREN() { return getToken(WebTemplateParser.CSS_RPAREN, 0); }
		public CssValueRParenContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssValueRParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssValueRParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssValueRParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssValuePercentageContext extends CssValueContext {
		public TerminalNode CSS_PERCENTAGE() { return getToken(WebTemplateParser.CSS_PERCENTAGE, 0); }
		public CssValuePercentageContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssValuePercentage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssValuePercentage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssValuePercentage(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssValueHashContext extends CssValueContext {
		public TerminalNode CSS_HASH_IDENT() { return getToken(WebTemplateParser.CSS_HASH_IDENT, 0); }
		public CssValueHashContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssValueHash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssValueHash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssValueHash(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssValueImportantContext extends CssValueContext {
		public TerminalNode CSS_BANG() { return getToken(WebTemplateParser.CSS_BANG, 0); }
		public CssValueImportantContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssValueImportant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssValueImportant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssValueImportant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cssValue);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_IDENT:
				_localctx = new CssValueIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(CSS_IDENT);
				}
				break;
			case CSS_NUMBER:
				_localctx = new CssValueNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(CSS_NUMBER);
				}
				break;
			case CSS_PERCENTAGE:
				_localctx = new CssValuePercentageContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				match(CSS_PERCENTAGE);
				}
				break;
			case CSS_DIMENSION:
				_localctx = new CssValueDimensionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				match(CSS_DIMENSION);
				}
				break;
			case CSS_STRING:
				_localctx = new CssValueStringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(273);
				match(CSS_STRING);
				}
				break;
			case CSS_HEX_COLOR:
				_localctx = new CssValueHexColorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(274);
				match(CSS_HEX_COLOR);
				}
				break;
			case CSS_HASH_IDENT:
				_localctx = new CssValueHashContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(275);
				match(CSS_HASH_IDENT);
				}
				break;
			case CSS_URL:
				_localctx = new CssValueUrlContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(276);
				match(CSS_URL);
				}
				break;
			case CSS_LPAREN:
				_localctx = new CssValueLParenContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(277);
				match(CSS_LPAREN);
				}
				break;
			case CSS_RPAREN:
				_localctx = new CssValueRParenContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(278);
				match(CSS_RPAREN);
				}
				break;
			case CSS_COMMA:
				_localctx = new CssValueCommaContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(279);
				match(CSS_COMMA);
				}
				break;
			case CSS_DOT:
				_localctx = new CssValueDotContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(280);
				match(CSS_DOT);
				}
				break;
			case CSS_SLASH:
				_localctx = new CssValueSlashContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(281);
				match(CSS_SLASH);
				}
				break;
			case CSS_BANG:
				_localctx = new CssValueImportantContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(282);
				match(CSS_BANG);
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
	public static class JinjaBlockContext extends ParserRuleContext {
		public JinjaBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaBlock; }
	 
		public JinjaBlockContext() { }
		public void copyFrom(JinjaBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockForContext extends JinjaBlockContext {
		public JinjaForContext jinjaFor() {
			return getRuleContext(JinjaForContext.class,0);
		}
		public JinjaBlockForContext(JinjaBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaBlockFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaBlockFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaBlockFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockDefinitionNodeContext extends JinjaBlockContext {
		public JinjaBlockStmtContext jinjaBlockStmt() {
			return getRuleContext(JinjaBlockStmtContext.class,0);
		}
		public JinjaBlockDefinitionNodeContext(JinjaBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaBlockDefinitionNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaBlockDefinitionNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaBlockDefinitionNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockIfContext extends JinjaBlockContext {
		public JinjaIfContext jinjaIf() {
			return getRuleContext(JinjaIfContext.class,0);
		}
		public JinjaBlockIfContext(JinjaBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaBlockIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaBlockIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaBlockIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockExprContext extends JinjaBlockContext {
		public JinjaExprContext jinjaExpr() {
			return getRuleContext(JinjaExprContext.class,0);
		}
		public JinjaBlockExprContext(JinjaBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaBlockExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaBlockExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaBlockExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockCommentContext extends JinjaBlockContext {
		public JinjaCommentContext jinjaComment() {
			return getRuleContext(JinjaCommentContext.class,0);
		}
		public JinjaBlockCommentContext(JinjaBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaBlockComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaBlockComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaBlockComment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockSetContext extends JinjaBlockContext {
		public JinjaSetContext jinjaSet() {
			return getRuleContext(JinjaSetContext.class,0);
		}
		public JinjaBlockSetContext(JinjaBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaBlockSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaBlockSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaBlockSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaBlockContext jinjaBlock() throws RecognitionException {
		JinjaBlockContext _localctx = new JinjaBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_jinjaBlock);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new JinjaBlockIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				jinjaIf();
				}
				break;
			case 2:
				_localctx = new JinjaBlockForContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				jinjaFor();
				}
				break;
			case 3:
				_localctx = new JinjaBlockSetContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				jinjaSet();
				}
				break;
			case 4:
				_localctx = new JinjaBlockDefinitionNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				jinjaBlockStmt();
				}
				break;
			case 5:
				_localctx = new JinjaBlockExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(289);
				jinjaExpr();
				}
				break;
			case 6:
				_localctx = new JinjaBlockCommentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(290);
				jinjaComment();
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
	public static class JinjaIfContext extends ParserRuleContext {
		public JinjaIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaIf; }
	 
		public JinjaIfContext() { }
		public void copyFrom(JinjaIfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIfFullContext extends JinjaIfContext {
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(WebTemplateParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(WebTemplateParser.JINJA_STMT_START, i);
		}
		public TerminalNode JSTMT_IF() { return getToken(WebTemplateParser.JSTMT_IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> JSTMT_END() { return getTokens(WebTemplateParser.JSTMT_END); }
		public TerminalNode JSTMT_END(int i) {
			return getToken(WebTemplateParser.JSTMT_END, i);
		}
		public TerminalNode JSTMT_ENDIF() { return getToken(WebTemplateParser.JSTMT_ENDIF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<JinjaElifContext> jinjaElif() {
			return getRuleContexts(JinjaElifContext.class);
		}
		public JinjaElifContext jinjaElif(int i) {
			return getRuleContext(JinjaElifContext.class,i);
		}
		public JinjaElseContext jinjaElse() {
			return getRuleContext(JinjaElseContext.class,0);
		}
		public JinjaIfFullContext(JinjaIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaIfFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaIfFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaIfFull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaIfContext jinjaIf() throws RecognitionException {
		JinjaIfContext _localctx = new JinjaIfContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_jinjaIf);
		try {
			int _alt;
			_localctx = new JinjaIfFullContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(JINJA_STMT_START);
			setState(294);
			match(JSTMT_IF);
			setState(295);
			expr();
			setState(296);
			match(JSTMT_END);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(297);
					element();
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(303);
					jinjaElif();
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(309);
				jinjaElse();
				}
				break;
			}
			setState(312);
			match(JINJA_STMT_START);
			setState(313);
			match(JSTMT_ENDIF);
			setState(314);
			match(JSTMT_END);
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
	public static class JinjaElifContext extends ParserRuleContext {
		public JinjaElifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaElif; }
	 
		public JinjaElifContext() { }
		public void copyFrom(JinjaElifContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaElifFullContext extends JinjaElifContext {
		public TerminalNode JINJA_STMT_START() { return getToken(WebTemplateParser.JINJA_STMT_START, 0); }
		public TerminalNode JSTMT_ELIF() { return getToken(WebTemplateParser.JSTMT_ELIF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode JSTMT_END() { return getToken(WebTemplateParser.JSTMT_END, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public JinjaElifFullContext(JinjaElifContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaElifFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaElifFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaElifFull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaElifContext jinjaElif() throws RecognitionException {
		JinjaElifContext _localctx = new JinjaElifContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_jinjaElif);
		try {
			int _alt;
			_localctx = new JinjaElifFullContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(JINJA_STMT_START);
			setState(317);
			match(JSTMT_ELIF);
			setState(318);
			expr();
			setState(319);
			match(JSTMT_END);
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(320);
					element();
					}
					} 
				}
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
	public static class JinjaElseContext extends ParserRuleContext {
		public JinjaElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaElse; }
	 
		public JinjaElseContext() { }
		public void copyFrom(JinjaElseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaElseFullContext extends JinjaElseContext {
		public TerminalNode JINJA_STMT_START() { return getToken(WebTemplateParser.JINJA_STMT_START, 0); }
		public TerminalNode JSTMT_ELSE() { return getToken(WebTemplateParser.JSTMT_ELSE, 0); }
		public TerminalNode JSTMT_END() { return getToken(WebTemplateParser.JSTMT_END, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public JinjaElseFullContext(JinjaElseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaElseFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaElseFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaElseFull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaElseContext jinjaElse() throws RecognitionException {
		JinjaElseContext _localctx = new JinjaElseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_jinjaElse);
		try {
			int _alt;
			_localctx = new JinjaElseFullContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(JINJA_STMT_START);
			setState(327);
			match(JSTMT_ELSE);
			setState(328);
			match(JSTMT_END);
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(329);
					element();
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
	public static class JinjaForContext extends ParserRuleContext {
		public JinjaForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaFor; }
	 
		public JinjaForContext() { }
		public void copyFrom(JinjaForContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaForFullContext extends JinjaForContext {
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(WebTemplateParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(WebTemplateParser.JINJA_STMT_START, i);
		}
		public TerminalNode JSTMT_FOR() { return getToken(WebTemplateParser.JSTMT_FOR, 0); }
		public ForTargetListContext forTargetList() {
			return getRuleContext(ForTargetListContext.class,0);
		}
		public TerminalNode JSTMT_IN() { return getToken(WebTemplateParser.JSTMT_IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> JSTMT_END() { return getTokens(WebTemplateParser.JSTMT_END); }
		public TerminalNode JSTMT_END(int i) {
			return getToken(WebTemplateParser.JSTMT_END, i);
		}
		public TerminalNode JSTMT_ENDFOR() { return getToken(WebTemplateParser.JSTMT_ENDFOR, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public JinjaForFullContext(JinjaForContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaForFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaForFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaForFull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaForContext jinjaFor() throws RecognitionException {
		JinjaForContext _localctx = new JinjaForContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_jinjaFor);
		try {
			int _alt;
			_localctx = new JinjaForFullContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(JINJA_STMT_START);
			setState(336);
			match(JSTMT_FOR);
			setState(337);
			forTargetList();
			setState(338);
			match(JSTMT_IN);
			setState(339);
			expr();
			setState(340);
			match(JSTMT_END);
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(341);
					element();
					}
					} 
				}
				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(347);
			match(JINJA_STMT_START);
			setState(348);
			match(JSTMT_ENDFOR);
			setState(349);
			match(JSTMT_END);
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
	public static class ForTargetListContext extends ParserRuleContext {
		public ForTargetListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forTargetList; }
	 
		public ForTargetListContext() { }
		public void copyFrom(ForTargetListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaForTargetListContext extends ForTargetListContext {
		public List<TerminalNode> JSTMT_IDENTIFIER() { return getTokens(WebTemplateParser.JSTMT_IDENTIFIER); }
		public TerminalNode JSTMT_IDENTIFIER(int i) {
			return getToken(WebTemplateParser.JSTMT_IDENTIFIER, i);
		}
		public List<TerminalNode> JSTMT_COMMA() { return getTokens(WebTemplateParser.JSTMT_COMMA); }
		public TerminalNode JSTMT_COMMA(int i) {
			return getToken(WebTemplateParser.JSTMT_COMMA, i);
		}
		public JinjaForTargetListContext(ForTargetListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaForTargetList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaForTargetList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaForTargetList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForTargetListContext forTargetList() throws RecognitionException {
		ForTargetListContext _localctx = new ForTargetListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forTargetList);
		int _la;
		try {
			_localctx = new JinjaForTargetListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(JSTMT_IDENTIFIER);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JSTMT_COMMA) {
				{
				{
				setState(352);
				match(JSTMT_COMMA);
				setState(353);
				match(JSTMT_IDENTIFIER);
				}
				}
				setState(358);
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
	public static class JinjaSetContext extends ParserRuleContext {
		public JinjaSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaSet; }
	 
		public JinjaSetContext() { }
		public void copyFrom(JinjaSetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaSetFullContext extends JinjaSetContext {
		public TerminalNode JINJA_STMT_START() { return getToken(WebTemplateParser.JINJA_STMT_START, 0); }
		public TerminalNode JSTMT_SET() { return getToken(WebTemplateParser.JSTMT_SET, 0); }
		public TerminalNode JSTMT_IDENTIFIER() { return getToken(WebTemplateParser.JSTMT_IDENTIFIER, 0); }
		public TerminalNode JSTMT_ASSIGNMENT() { return getToken(WebTemplateParser.JSTMT_ASSIGNMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode JSTMT_END() { return getToken(WebTemplateParser.JSTMT_END, 0); }
		public JinjaSetFullContext(JinjaSetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaSetFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaSetFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaSetFull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaSetContext jinjaSet() throws RecognitionException {
		JinjaSetContext _localctx = new JinjaSetContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_jinjaSet);
		try {
			_localctx = new JinjaSetFullContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(JINJA_STMT_START);
			setState(360);
			match(JSTMT_SET);
			setState(361);
			match(JSTMT_IDENTIFIER);
			setState(362);
			match(JSTMT_ASSIGNMENT);
			setState(363);
			expr();
			setState(364);
			match(JSTMT_END);
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
	public static class JinjaBlockStmtContext extends ParserRuleContext {
		public JinjaBlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaBlockStmt; }
	 
		public JinjaBlockStmtContext() { }
		public void copyFrom(JinjaBlockStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockFullContext extends JinjaBlockStmtContext {
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(WebTemplateParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(WebTemplateParser.JINJA_STMT_START, i);
		}
		public TerminalNode JSTMT_BLOCK() { return getToken(WebTemplateParser.JSTMT_BLOCK, 0); }
		public TerminalNode JSTMT_IDENTIFIER() { return getToken(WebTemplateParser.JSTMT_IDENTIFIER, 0); }
		public List<TerminalNode> JSTMT_END() { return getTokens(WebTemplateParser.JSTMT_END); }
		public TerminalNode JSTMT_END(int i) {
			return getToken(WebTemplateParser.JSTMT_END, i);
		}
		public TerminalNode JSTMT_ENDBLOCK() { return getToken(WebTemplateParser.JSTMT_ENDBLOCK, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public JinjaBlockFullContext(JinjaBlockStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaBlockFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaBlockFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaBlockFull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaBlockStmtContext jinjaBlockStmt() throws RecognitionException {
		JinjaBlockStmtContext _localctx = new JinjaBlockStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_jinjaBlockStmt);
		try {
			int _alt;
			_localctx = new JinjaBlockFullContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(JINJA_STMT_START);
			setState(367);
			match(JSTMT_BLOCK);
			setState(368);
			match(JSTMT_IDENTIFIER);
			setState(369);
			match(JSTMT_END);
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(370);
					element();
					}
					} 
				}
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(376);
			match(JINJA_STMT_START);
			setState(377);
			match(JSTMT_ENDBLOCK);
			setState(378);
			match(JSTMT_END);
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
	public static class JinjaExprContext extends ParserRuleContext {
		public JinjaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExpr; }
	 
		public JinjaExprContext() { }
		public void copyFrom(JinjaExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExpressionFullContext extends JinjaExprContext {
		public TerminalNode JINJA_EXPR_START() { return getToken(WebTemplateParser.JINJA_EXPR_START, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode JINJA_EXPR_END() { return getToken(WebTemplateParser.JINJA_EXPR_END, 0); }
		public JinjaExpressionFullContext(JinjaExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaExpressionFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaExpressionFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaExpressionFull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExprContext jinjaExpr() throws RecognitionException {
		JinjaExprContext _localctx = new JinjaExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_jinjaExpr);
		try {
			_localctx = new JinjaExpressionFullContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(JINJA_EXPR_START);
			setState(381);
			expr();
			setState(382);
			match(JINJA_EXPR_END);
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
	public static class JinjaCommentContext extends ParserRuleContext {
		public JinjaCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaComment; }
	 
		public JinjaCommentContext() { }
		public void copyFrom(JinjaCommentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaCommentFullContext extends JinjaCommentContext {
		public TerminalNode JINJA_COMMENT_START() { return getToken(WebTemplateParser.JINJA_COMMENT_START, 0); }
		public TerminalNode JINJA_COMMENT_END() { return getToken(WebTemplateParser.JINJA_COMMENT_END, 0); }
		public List<TerminalNode> JINJA_COMMENT_TEXT() { return getTokens(WebTemplateParser.JINJA_COMMENT_TEXT); }
		public TerminalNode JINJA_COMMENT_TEXT(int i) {
			return getToken(WebTemplateParser.JINJA_COMMENT_TEXT, i);
		}
		public JinjaCommentFullContext(JinjaCommentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaCommentFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaCommentFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaCommentFull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaCommentContext jinjaComment() throws RecognitionException {
		JinjaCommentContext _localctx = new JinjaCommentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_jinjaComment);
		int _la;
		try {
			_localctx = new JinjaCommentFullContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(JINJA_COMMENT_START);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_COMMENT_TEXT) {
				{
				{
				setState(385);
				match(JINJA_COMMENT_TEXT);
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(391);
			match(JINJA_COMMENT_END);
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
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRootContext extends ExprContext {
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public ExprRootContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterExprRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitExprRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitExprRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expr);
		try {
			_localctx = new ExprRootContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			orExpr();
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
	public static class OrExprContext extends ParserRuleContext {
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
	 
		public OrExprContext() { }
		public void copyFrom(OrExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprOrContext extends OrExprContext {
		public List<AndExprContext> andExpr() {
			return getRuleContexts(AndExprContext.class);
		}
		public AndExprContext andExpr(int i) {
			return getRuleContext(AndExprContext.class,i);
		}
		public List<TerminalNode> JINJA_OR() { return getTokens(WebTemplateParser.JINJA_OR); }
		public TerminalNode JINJA_OR(int i) {
			return getToken(WebTemplateParser.JINJA_OR, i);
		}
		public List<TerminalNode> JSTMT_OR() { return getTokens(WebTemplateParser.JSTMT_OR); }
		public TerminalNode JSTMT_OR(int i) {
			return getToken(WebTemplateParser.JSTMT_OR, i);
		}
		public ExprOrContext(OrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterExprOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitExprOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitExprOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExprContext orExpr() throws RecognitionException {
		OrExprContext _localctx = new OrExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_orExpr);
		int _la;
		try {
			_localctx = new ExprOrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			andExpr();
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_OR || _la==JSTMT_OR) {
				{
				{
				setState(396);
				_la = _input.LA(1);
				if ( !(_la==JINJA_OR || _la==JSTMT_OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(397);
				andExpr();
				}
				}
				setState(402);
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
	public static class AndExprContext extends ParserRuleContext {
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
	 
		public AndExprContext() { }
		public void copyFrom(AndExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAndContext extends AndExprContext {
		public List<NotExprContext> notExpr() {
			return getRuleContexts(NotExprContext.class);
		}
		public NotExprContext notExpr(int i) {
			return getRuleContext(NotExprContext.class,i);
		}
		public List<TerminalNode> JINJA_AND() { return getTokens(WebTemplateParser.JINJA_AND); }
		public TerminalNode JINJA_AND(int i) {
			return getToken(WebTemplateParser.JINJA_AND, i);
		}
		public List<TerminalNode> JSTMT_AND() { return getTokens(WebTemplateParser.JSTMT_AND); }
		public TerminalNode JSTMT_AND(int i) {
			return getToken(WebTemplateParser.JSTMT_AND, i);
		}
		public ExprAndContext(AndExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterExprAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitExprAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitExprAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_andExpr);
		int _la;
		try {
			_localctx = new ExprAndContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			notExpr();
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_AND || _la==JSTMT_AND) {
				{
				{
				setState(404);
				_la = _input.LA(1);
				if ( !(_la==JINJA_AND || _la==JSTMT_AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(405);
				notExpr();
				}
				}
				setState(410);
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
	public static class NotExprContext extends ParserRuleContext {
		public NotExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpr; }
	 
		public NotExprContext() { }
		public void copyFrom(NotExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprComparisonRootContext extends NotExprContext {
		public ComparisonExprContext comparisonExpr() {
			return getRuleContext(ComparisonExprContext.class,0);
		}
		public ExprComparisonRootContext(NotExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterExprComparisonRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitExprComparisonRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitExprComparisonRoot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNotContext extends NotExprContext {
		public NotExprContext notExpr() {
			return getRuleContext(NotExprContext.class,0);
		}
		public TerminalNode JINJA_NOT() { return getToken(WebTemplateParser.JINJA_NOT, 0); }
		public TerminalNode JSTMT_NOT() { return getToken(WebTemplateParser.JSTMT_NOT, 0); }
		public ExprNotContext(NotExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitExprNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitExprNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExprContext notExpr() throws RecognitionException {
		NotExprContext _localctx = new NotExprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_notExpr);
		int _la;
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_NOT:
			case JSTMT_NOT:
				_localctx = new ExprNotContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				_la = _input.LA(1);
				if ( !(_la==JINJA_NOT || _la==JSTMT_NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(412);
				notExpr();
				}
				break;
			case JINJA_NUMBER:
			case JINJA_STRING:
			case JINJA_IDENTIFIER:
			case JINJA_LPAREN:
			case JINJA_ADDITIVE:
			case JSTMT_IDENTIFIER:
			case JSTMT_NUMBER:
			case JSTMT_STRING:
			case JSTMT_LPAREN:
			case JSTMT_ADDITIVE:
				_localctx = new ExprComparisonRootContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				comparisonExpr();
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
	public static class ComparisonExprContext extends ParserRuleContext {
		public ComparisonExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpr; }
	 
		public ComparisonExprContext() { }
		public void copyFrom(ComparisonExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprComparisonContext extends ComparisonExprContext {
		public List<AdditiveExprContext> additiveExpr() {
			return getRuleContexts(AdditiveExprContext.class);
		}
		public AdditiveExprContext additiveExpr(int i) {
			return getRuleContext(AdditiveExprContext.class,i);
		}
		public List<ComparisonOpContext> comparisonOp() {
			return getRuleContexts(ComparisonOpContext.class);
		}
		public ComparisonOpContext comparisonOp(int i) {
			return getRuleContext(ComparisonOpContext.class,i);
		}
		public ExprComparisonContext(ComparisonExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterExprComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitExprComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitExprComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExprContext comparisonExpr() throws RecognitionException {
		ComparisonExprContext _localctx = new ComparisonExprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_comparisonExpr);
		int _la;
		try {
			_localctx = new ExprComparisonContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			additiveExpr();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 35188767784985L) != 0)) {
				{
				{
				setState(417);
				comparisonOp();
				setState(418);
				additiveExpr();
				}
				}
				setState(424);
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
	public static class ComparisonOpContext extends ParserRuleContext {
		public ComparisonOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOp; }
	 
		public ComparisonOpContext() { }
		public void copyFrom(ComparisonOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpCompareStmtContext extends ComparisonOpContext {
		public TerminalNode JSTMT_COMPARISON() { return getToken(WebTemplateParser.JSTMT_COMPARISON, 0); }
		public OpCompareStmtContext(ComparisonOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterOpCompareStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitOpCompareStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitOpCompareStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpInStmtContext extends ComparisonOpContext {
		public TerminalNode JSTMT_IN() { return getToken(WebTemplateParser.JSTMT_IN, 0); }
		public OpInStmtContext(ComparisonOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterOpInStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitOpInStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitOpInStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpInJinjaContext extends ComparisonOpContext {
		public TerminalNode JINJA_IN() { return getToken(WebTemplateParser.JINJA_IN, 0); }
		public OpInJinjaContext(ComparisonOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterOpInJinja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitOpInJinja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitOpInJinja(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpCompareJinjaContext extends ComparisonOpContext {
		public TerminalNode JINJA_COMPARISON() { return getToken(WebTemplateParser.JINJA_COMPARISON, 0); }
		public OpCompareJinjaContext(ComparisonOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterOpCompareJinja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitOpCompareJinja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitOpCompareJinja(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpNotInContext extends ComparisonOpContext {
		public TerminalNode JINJA_NOT() { return getToken(WebTemplateParser.JINJA_NOT, 0); }
		public TerminalNode JSTMT_NOT() { return getToken(WebTemplateParser.JSTMT_NOT, 0); }
		public TerminalNode JINJA_IN() { return getToken(WebTemplateParser.JINJA_IN, 0); }
		public TerminalNode JSTMT_IN() { return getToken(WebTemplateParser.JSTMT_IN, 0); }
		public OpNotInContext(ComparisonOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterOpNotIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitOpNotIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitOpNotIn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpIsContext extends ComparisonOpContext {
		public TerminalNode JINJA_IS() { return getToken(WebTemplateParser.JINJA_IS, 0); }
		public TerminalNode JSTMT_IS() { return getToken(WebTemplateParser.JSTMT_IS, 0); }
		public TerminalNode JINJA_NOT() { return getToken(WebTemplateParser.JINJA_NOT, 0); }
		public TerminalNode JSTMT_NOT() { return getToken(WebTemplateParser.JSTMT_NOT, 0); }
		public OpIsContext(ComparisonOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterOpIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitOpIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitOpIs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOpContext comparisonOp() throws RecognitionException {
		ComparisonOpContext _localctx = new ComparisonOpContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_comparisonOp);
		int _la;
		try {
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_COMPARISON:
				_localctx = new OpCompareJinjaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(JINJA_COMPARISON);
				}
				break;
			case JSTMT_COMPARISON:
				_localctx = new OpCompareStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				match(JSTMT_COMPARISON);
				}
				break;
			case JINJA_IN:
				_localctx = new OpInJinjaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(427);
				match(JINJA_IN);
				}
				break;
			case JSTMT_IN:
				_localctx = new OpInStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(428);
				match(JSTMT_IN);
				}
				break;
			case JINJA_IS:
			case JSTMT_IS:
				_localctx = new OpIsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(429);
				_la = _input.LA(1);
				if ( !(_la==JINJA_IS || _la==JSTMT_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==JINJA_NOT || _la==JSTMT_NOT) {
					{
					setState(430);
					_la = _input.LA(1);
					if ( !(_la==JINJA_NOT || _la==JSTMT_NOT) ) {
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
				break;
			case JINJA_NOT:
			case JSTMT_NOT:
				_localctx = new OpNotInContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(433);
				_la = _input.LA(1);
				if ( !(_la==JINJA_NOT || _la==JSTMT_NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(434);
				_la = _input.LA(1);
				if ( !(_la==JINJA_IN || _la==JSTMT_IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
	public static class AdditiveExprContext extends ParserRuleContext {
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
	 
		public AdditiveExprContext() { }
		public void copyFrom(AdditiveExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAddContext extends AdditiveExprContext {
		public List<MultiplicativeExprContext> multiplicativeExpr() {
			return getRuleContexts(MultiplicativeExprContext.class);
		}
		public MultiplicativeExprContext multiplicativeExpr(int i) {
			return getRuleContext(MultiplicativeExprContext.class,i);
		}
		public List<TerminalNode> JINJA_ADDITIVE() { return getTokens(WebTemplateParser.JINJA_ADDITIVE); }
		public TerminalNode JINJA_ADDITIVE(int i) {
			return getToken(WebTemplateParser.JINJA_ADDITIVE, i);
		}
		public List<TerminalNode> JSTMT_ADDITIVE() { return getTokens(WebTemplateParser.JSTMT_ADDITIVE); }
		public TerminalNode JSTMT_ADDITIVE(int i) {
			return getToken(WebTemplateParser.JSTMT_ADDITIVE, i);
		}
		public ExprAddContext(AdditiveExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterExprAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitExprAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitExprAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_additiveExpr);
		int _la;
		try {
			_localctx = new ExprAddContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			multiplicativeExpr();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_ADDITIVE || _la==JSTMT_ADDITIVE) {
				{
				{
				setState(438);
				_la = _input.LA(1);
				if ( !(_la==JINJA_ADDITIVE || _la==JSTMT_ADDITIVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(439);
				multiplicativeExpr();
				}
				}
				setState(444);
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
	public static class MultiplicativeExprContext extends ParserRuleContext {
		public MultiplicativeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpr; }
	 
		public MultiplicativeExprContext() { }
		public void copyFrom(MultiplicativeExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMulContext extends MultiplicativeExprContext {
		public List<UnaryExprContext> unaryExpr() {
			return getRuleContexts(UnaryExprContext.class);
		}
		public UnaryExprContext unaryExpr(int i) {
			return getRuleContext(UnaryExprContext.class,i);
		}
		public List<TerminalNode> JINJA_MULTIPLICATIVE() { return getTokens(WebTemplateParser.JINJA_MULTIPLICATIVE); }
		public TerminalNode JINJA_MULTIPLICATIVE(int i) {
			return getToken(WebTemplateParser.JINJA_MULTIPLICATIVE, i);
		}
		public List<TerminalNode> JSTMT_MULTIPLICATIVE() { return getTokens(WebTemplateParser.JSTMT_MULTIPLICATIVE); }
		public TerminalNode JSTMT_MULTIPLICATIVE(int i) {
			return getToken(WebTemplateParser.JSTMT_MULTIPLICATIVE, i);
		}
		public ExprMulContext(MultiplicativeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterExprMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitExprMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitExprMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExprContext multiplicativeExpr() throws RecognitionException {
		MultiplicativeExprContext _localctx = new MultiplicativeExprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_multiplicativeExpr);
		int _la;
		try {
			_localctx = new ExprMulContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			unaryExpr();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_MULTIPLICATIVE || _la==JSTMT_MULTIPLICATIVE) {
				{
				{
				setState(446);
				_la = _input.LA(1);
				if ( !(_la==JINJA_MULTIPLICATIVE || _la==JSTMT_MULTIPLICATIVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(447);
				unaryExpr();
				}
				}
				setState(452);
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
	public static class UnaryExprContext extends ParserRuleContext {
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
	 
		public UnaryExprContext() { }
		public void copyFrom(UnaryExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprUnaryContext extends UnaryExprContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode JINJA_ADDITIVE() { return getToken(WebTemplateParser.JINJA_ADDITIVE, 0); }
		public TerminalNode JSTMT_ADDITIVE() { return getToken(WebTemplateParser.JSTMT_ADDITIVE, 0); }
		public ExprUnaryContext(UnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterExprUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitExprUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitExprUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPostfixRootContext extends UnaryExprContext {
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public ExprPostfixRootContext(UnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterExprPostfixRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitExprPostfixRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitExprPostfixRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_unaryExpr);
		int _la;
		try {
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_ADDITIVE:
			case JSTMT_ADDITIVE:
				_localctx = new ExprUnaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				_la = _input.LA(1);
				if ( !(_la==JINJA_ADDITIVE || _la==JSTMT_ADDITIVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(454);
				unaryExpr();
				}
				break;
			case JINJA_NUMBER:
			case JINJA_STRING:
			case JINJA_IDENTIFIER:
			case JINJA_LPAREN:
			case JSTMT_IDENTIFIER:
			case JSTMT_NUMBER:
			case JSTMT_STRING:
			case JSTMT_LPAREN:
				_localctx = new ExprPostfixRootContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				postfixExpr();
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
	public static class PostfixExprContext extends ParserRuleContext {
		public PostfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpr; }
	 
		public PostfixExprContext() { }
		public void copyFrom(PostfixExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPostfixContext extends PostfixExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<PostfixSuffixContext> postfixSuffix() {
			return getRuleContexts(PostfixSuffixContext.class);
		}
		public PostfixSuffixContext postfixSuffix(int i) {
			return getRuleContext(PostfixSuffixContext.class,i);
		}
		public ExprPostfixContext(PostfixExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterExprPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitExprPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitExprPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExprContext postfixExpr() throws RecognitionException {
		PostfixExprContext _localctx = new PostfixExprContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_postfixExpr);
		int _la;
		try {
			_localctx = new ExprPostfixContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			atom();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 23085449255L) != 0)) {
				{
				{
				setState(459);
				postfixSuffix();
				}
				}
				setState(464);
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
	@SuppressWarnings("CheckReturnValue")
	public static class AtomNumberStmtContext extends AtomContext {
		public TerminalNode JSTMT_NUMBER() { return getToken(WebTemplateParser.JSTMT_NUMBER, 0); }
		public AtomNumberStmtContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterAtomNumberStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitAtomNumberStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitAtomNumberStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomIdStmtContext extends AtomContext {
		public TerminalNode JSTMT_IDENTIFIER() { return getToken(WebTemplateParser.JSTMT_IDENTIFIER, 0); }
		public AtomIdStmtContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterAtomIdStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitAtomIdStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitAtomIdStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomParenContext extends AtomContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode JINJA_LPAREN() { return getToken(WebTemplateParser.JINJA_LPAREN, 0); }
		public TerminalNode JSTMT_LPAREN() { return getToken(WebTemplateParser.JSTMT_LPAREN, 0); }
		public TerminalNode JINJA_RPAREN() { return getToken(WebTemplateParser.JINJA_RPAREN, 0); }
		public TerminalNode JSTMT_RPAREN() { return getToken(WebTemplateParser.JSTMT_RPAREN, 0); }
		public AtomParenContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterAtomParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitAtomParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitAtomParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomStringJinjaContext extends AtomContext {
		public TerminalNode JINJA_STRING() { return getToken(WebTemplateParser.JINJA_STRING, 0); }
		public AtomStringJinjaContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterAtomStringJinja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitAtomStringJinja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitAtomStringJinja(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomNumberJinjaContext extends AtomContext {
		public TerminalNode JINJA_NUMBER() { return getToken(WebTemplateParser.JINJA_NUMBER, 0); }
		public AtomNumberJinjaContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterAtomNumberJinja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitAtomNumberJinja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitAtomNumberJinja(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomStringStmtContext extends AtomContext {
		public TerminalNode JSTMT_STRING() { return getToken(WebTemplateParser.JSTMT_STRING, 0); }
		public AtomStringStmtContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterAtomStringStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitAtomStringStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitAtomStringStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomIdJinjaContext extends AtomContext {
		public TerminalNode JINJA_IDENTIFIER() { return getToken(WebTemplateParser.JINJA_IDENTIFIER, 0); }
		public AtomIdJinjaContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterAtomIdJinja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitAtomIdJinja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitAtomIdJinja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_atom);
		int _la;
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_NUMBER:
				_localctx = new AtomNumberJinjaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				match(JINJA_NUMBER);
				}
				break;
			case JSTMT_NUMBER:
				_localctx = new AtomNumberStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				match(JSTMT_NUMBER);
				}
				break;
			case JINJA_STRING:
				_localctx = new AtomStringJinjaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				match(JINJA_STRING);
				}
				break;
			case JSTMT_STRING:
				_localctx = new AtomStringStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(468);
				match(JSTMT_STRING);
				}
				break;
			case JINJA_IDENTIFIER:
				_localctx = new AtomIdJinjaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(469);
				match(JINJA_IDENTIFIER);
				}
				break;
			case JSTMT_IDENTIFIER:
				_localctx = new AtomIdStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(470);
				match(JSTMT_IDENTIFIER);
				}
				break;
			case JINJA_LPAREN:
			case JSTMT_LPAREN:
				_localctx = new AtomParenContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(471);
				_la = _input.LA(1);
				if ( !(_la==JINJA_LPAREN || _la==JSTMT_LPAREN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(472);
				expr();
				setState(473);
				_la = _input.LA(1);
				if ( !(_la==JINJA_RPAREN || _la==JSTMT_RPAREN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
	public static class PostfixSuffixContext extends ParserRuleContext {
		public PostfixSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixSuffix; }
	 
		public PostfixSuffixContext() { }
		public void copyFrom(PostfixSuffixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SuffixFilterContext extends PostfixSuffixContext {
		public TerminalNode JINJA_PIPE() { return getToken(WebTemplateParser.JINJA_PIPE, 0); }
		public TerminalNode JSTMT_PIPE() { return getToken(WebTemplateParser.JSTMT_PIPE, 0); }
		public TerminalNode JINJA_IDENTIFIER() { return getToken(WebTemplateParser.JINJA_IDENTIFIER, 0); }
		public TerminalNode JSTMT_IDENTIFIER() { return getToken(WebTemplateParser.JSTMT_IDENTIFIER, 0); }
		public TerminalNode JINJA_LPAREN() { return getToken(WebTemplateParser.JINJA_LPAREN, 0); }
		public TerminalNode JSTMT_LPAREN() { return getToken(WebTemplateParser.JSTMT_LPAREN, 0); }
		public TerminalNode JINJA_RPAREN() { return getToken(WebTemplateParser.JINJA_RPAREN, 0); }
		public TerminalNode JSTMT_RPAREN() { return getToken(WebTemplateParser.JSTMT_RPAREN, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public SuffixFilterContext(PostfixSuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterSuffixFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitSuffixFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitSuffixFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SuffixAttributeContext extends PostfixSuffixContext {
		public TerminalNode JINJA_DOT() { return getToken(WebTemplateParser.JINJA_DOT, 0); }
		public TerminalNode JSTMT_DOT() { return getToken(WebTemplateParser.JSTMT_DOT, 0); }
		public TerminalNode JINJA_IDENTIFIER() { return getToken(WebTemplateParser.JINJA_IDENTIFIER, 0); }
		public TerminalNode JSTMT_IDENTIFIER() { return getToken(WebTemplateParser.JSTMT_IDENTIFIER, 0); }
		public SuffixAttributeContext(PostfixSuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterSuffixAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitSuffixAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitSuffixAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SuffixCallContext extends PostfixSuffixContext {
		public TerminalNode JINJA_LPAREN() { return getToken(WebTemplateParser.JINJA_LPAREN, 0); }
		public TerminalNode JSTMT_LPAREN() { return getToken(WebTemplateParser.JSTMT_LPAREN, 0); }
		public TerminalNode JINJA_RPAREN() { return getToken(WebTemplateParser.JINJA_RPAREN, 0); }
		public TerminalNode JSTMT_RPAREN() { return getToken(WebTemplateParser.JSTMT_RPAREN, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public SuffixCallContext(PostfixSuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterSuffixCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitSuffixCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitSuffixCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SuffixIndexContext extends PostfixSuffixContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode JINJA_LBRACKET() { return getToken(WebTemplateParser.JINJA_LBRACKET, 0); }
		public TerminalNode JSTMT_LBRACKET() { return getToken(WebTemplateParser.JSTMT_LBRACKET, 0); }
		public TerminalNode JINJA_RBRACKET() { return getToken(WebTemplateParser.JINJA_RBRACKET, 0); }
		public TerminalNode JSTMT_RBRACKET() { return getToken(WebTemplateParser.JSTMT_RBRACKET, 0); }
		public SuffixIndexContext(PostfixSuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterSuffixIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitSuffixIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitSuffixIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixSuffixContext postfixSuffix() throws RecognitionException {
		PostfixSuffixContext _localctx = new PostfixSuffixContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_postfixSuffix);
		int _la;
		try {
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_DOT:
			case JSTMT_DOT:
				_localctx = new SuffixAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				_la = _input.LA(1);
				if ( !(_la==JINJA_DOT || _la==JSTMT_DOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(478);
				_la = _input.LA(1);
				if ( !(_la==JINJA_IDENTIFIER || _la==JSTMT_IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case JINJA_LBRACKET:
			case JSTMT_LBRACKET:
				_localctx = new SuffixIndexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				_la = _input.LA(1);
				if ( !(_la==JINJA_LBRACKET || _la==JSTMT_LBRACKET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(480);
				expr();
				setState(481);
				_la = _input.LA(1);
				if ( !(_la==JINJA_RBRACKET || _la==JSTMT_RBRACKET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case JINJA_LPAREN:
			case JSTMT_LPAREN:
				_localctx = new SuffixCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				_la = _input.LA(1);
				if ( !(_la==JINJA_LPAREN || _la==JSTMT_LPAREN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 143181324880097L) != 0)) {
					{
					setState(484);
					exprList();
					}
				}

				setState(487);
				_la = _input.LA(1);
				if ( !(_la==JINJA_RPAREN || _la==JSTMT_RPAREN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case JINJA_PIPE:
			case JSTMT_PIPE:
				_localctx = new SuffixFilterContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(488);
				_la = _input.LA(1);
				if ( !(_la==JINJA_PIPE || _la==JSTMT_PIPE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(489);
				_la = _input.LA(1);
				if ( !(_la==JINJA_IDENTIFIER || _la==JSTMT_IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(495);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(490);
					_la = _input.LA(1);
					if ( !(_la==JINJA_LPAREN || _la==JSTMT_LPAREN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(492);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 143181324880097L) != 0)) {
						{
						setState(491);
						exprList();
						}
					}

					setState(494);
					_la = _input.LA(1);
					if ( !(_la==JINJA_RPAREN || _la==JSTMT_RPAREN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
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
	public static class ArgumentContext extends ParserRuleContext {
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	 
		public ArgumentContext() { }
		public void copyFrom(ArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgNamedJinjaContext extends ArgumentContext {
		public TerminalNode JINJA_IDENTIFIER() { return getToken(WebTemplateParser.JINJA_IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode JINJA_ASSIGNMENT() { return getToken(WebTemplateParser.JINJA_ASSIGNMENT, 0); }
		public TerminalNode JSTMT_ASSIGNMENT() { return getToken(WebTemplateParser.JSTMT_ASSIGNMENT, 0); }
		public ArgNamedJinjaContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterArgNamedJinja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitArgNamedJinja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitArgNamedJinja(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgPositionalContext extends ArgumentContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgPositionalContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterArgPositional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitArgPositional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitArgPositional(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgNamedStmtContext extends ArgumentContext {
		public TerminalNode JSTMT_IDENTIFIER() { return getToken(WebTemplateParser.JSTMT_IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode JINJA_ASSIGNMENT() { return getToken(WebTemplateParser.JINJA_ASSIGNMENT, 0); }
		public TerminalNode JSTMT_ASSIGNMENT() { return getToken(WebTemplateParser.JSTMT_ASSIGNMENT, 0); }
		public ArgNamedStmtContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterArgNamedStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitArgNamedStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitArgNamedStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_argument);
		int _la;
		try {
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				_localctx = new ArgNamedJinjaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				match(JINJA_IDENTIFIER);
				setState(500);
				_la = _input.LA(1);
				if ( !(_la==JINJA_ASSIGNMENT || _la==JSTMT_ASSIGNMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(501);
				expr();
				}
				break;
			case 2:
				_localctx = new ArgNamedStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				match(JSTMT_IDENTIFIER);
				setState(503);
				_la = _input.LA(1);
				if ( !(_la==JINJA_ASSIGNMENT || _la==JSTMT_ASSIGNMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(504);
				expr();
				}
				break;
			case 3:
				_localctx = new ArgPositionalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(505);
				expr();
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
	public static class ExprListContext extends ParserRuleContext {
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	 
		public ExprListContext() { }
		public void copyFrom(ExprListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprListFullContext extends ExprListContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> JINJA_COMMA() { return getTokens(WebTemplateParser.JINJA_COMMA); }
		public TerminalNode JINJA_COMMA(int i) {
			return getToken(WebTemplateParser.JINJA_COMMA, i);
		}
		public List<TerminalNode> JSTMT_COMMA() { return getTokens(WebTemplateParser.JSTMT_COMMA); }
		public TerminalNode JSTMT_COMMA(int i) {
			return getToken(WebTemplateParser.JSTMT_COMMA, i);
		}
		public ExprListFullContext(ExprListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterExprListFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitExprListFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitExprListFull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_exprList);
		int _la;
		try {
			_localctx = new ExprListFullContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			argument();
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_COMMA || _la==JSTMT_COMMA) {
				{
				{
				setState(509);
				_la = _input.LA(1);
				if ( !(_la==JINJA_COMMA || _la==JSTMT_COMMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(510);
				argument();
				}
				}
				setState(515);
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
	public static class TextNodeContext extends ParserRuleContext {
		public TextNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textNode; }
	 
		public TextNodeContext() { }
		public void copyFrom(TextNodeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextNodeFullContext extends TextNodeContext {
		public List<TerminalNode> HTML_TEXT() { return getTokens(WebTemplateParser.HTML_TEXT); }
		public TerminalNode HTML_TEXT(int i) {
			return getToken(WebTemplateParser.HTML_TEXT, i);
		}
		public TextNodeFullContext(TextNodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterTextNodeFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitTextNodeFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitTextNodeFull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextNodeContext textNode() throws RecognitionException {
		TextNodeContext _localctx = new TextNodeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_textNode);
		try {
			int _alt;
			_localctx = new TextNodeFullContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(517); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(516);
					match(HTML_TEXT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(519); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		"\u0004\u0001l\u020a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0001\u0000\u0005\u0000^\b\u0000\n\u0000\f\u0000a\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001i\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002n\b\u0002"+
		"\n\u0002\f\u0002q\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"v\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003{\b\u0003\n\u0003"+
		"\f\u0003~\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u0085\b\u0004\n\u0004\f\u0004\u0088\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u008f\b\u0005"+
		"\n\u0005\f\u0005\u0092\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u009c"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u00a1\b\b\u0001\t\u0001\t\u0005"+
		"\t\u00a5\b\t\n\t\f\t\u00a8\t\t\u0001\t\u0001\t\u0001\t\u0005\t\u00ad\b"+
		"\t\n\t\f\t\u00b0\t\t\u0001\t\u0001\t\u0001\t\u0005\t\u00b5\b\t\n\t\f\t"+
		"\u00b8\t\t\u0001\t\u0003\t\u00bb\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00c1\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00c6\b\u000b"+
		"\n\u000b\f\u000b\u00c9\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u00d2\b\f\n\f\f\f\u00d5\t\f\u0001\f\u0001"+
		"\f\u0001\r\u0004\r\u00da\b\r\u000b\r\f\r\u00db\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00e8\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00ed\b\u000f\n\u000f\f\u000f\u00f0\t\u000f\u0001"+
		"\u0010\u0004\u0010\u00f3\b\u0010\u000b\u0010\f\u0010\u00f4\u0001\u0011"+
		"\u0004\u0011\u00f8\b\u0011\u000b\u0011\f\u0011\u00f9\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0103\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0004\u0013\u0108"+
		"\b\u0013\u000b\u0013\f\u0013\u0109\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u011c\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0124\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u012b\b\u0016"+
		"\n\u0016\f\u0016\u012e\t\u0016\u0001\u0016\u0005\u0016\u0131\b\u0016\n"+
		"\u0016\f\u0016\u0134\t\u0016\u0001\u0016\u0003\u0016\u0137\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0142\b\u0017\n\u0017\f\u0017"+
		"\u0145\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u014b\b\u0018\n\u0018\f\u0018\u014e\t\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0157"+
		"\b\u0019\n\u0019\f\u0019\u015a\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0163\b\u001a"+
		"\n\u001a\f\u001a\u0166\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0174\b\u001c\n\u001c\f\u001c"+
		"\u0177\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u0183\b\u001e\n\u001e\f\u001e\u0186\t\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0005 \u018f\b \n \f \u0192\t"+
		" \u0001!\u0001!\u0001!\u0005!\u0197\b!\n!\f!\u019a\t!\u0001\"\u0001\""+
		"\u0001\"\u0003\"\u019f\b\"\u0001#\u0001#\u0001#\u0001#\u0005#\u01a5\b"+
		"#\n#\f#\u01a8\t#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u01b0"+
		"\b$\u0001$\u0001$\u0003$\u01b4\b$\u0001%\u0001%\u0001%\u0005%\u01b9\b"+
		"%\n%\f%\u01bc\t%\u0001&\u0001&\u0001&\u0005&\u01c1\b&\n&\f&\u01c4\t&\u0001"+
		"\'\u0001\'\u0001\'\u0003\'\u01c9\b\'\u0001(\u0001(\u0005(\u01cd\b(\n("+
		"\f(\u01d0\t(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u01dc\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0003*\u01e6\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u01ed"+
		"\b*\u0001*\u0003*\u01f0\b*\u0003*\u01f2\b*\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0003+\u01fb\b+\u0001,\u0001,\u0001,\u0005,\u0200"+
		"\b,\n,\f,\u0203\t,\u0001-\u0004-\u0206\b-\u000b-\f-\u0207\u0001-\u0000"+
		"\u0000.\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\u0000\u0011\u0002\u0000"+
		"\n\n\f\f\u0002\u0000>>^^\u0002\u0000==]]\u0002\u0000<<\\\\\u0002\u0000"+
		"@@VV\u0002\u0000??UU\u0002\u0000MMkk\u0002\u0000NNll\u0002\u0000GGee\u0002"+
		"\u0000HHff\u0002\u0000FFcc\u0002\u0000CC__\u0002\u0000JJgg\u0002\u0000"+
		"KKhh\u0002\u0000EEbb\u0002\u0000DDjj\u0002\u0000IIdd\u023c\u0000_\u0001"+
		"\u0000\u0000\u0000\u0002h\u0001\u0000\u0000\u0000\u0004u\u0001\u0000\u0000"+
		"\u0000\u0006w\u0001\u0000\u0000\u0000\b\u0081\u0001\u0000\u0000\u0000"+
		"\n\u008b\u0001\u0000\u0000\u0000\f\u0095\u0001\u0000\u0000\u0000\u000e"+
		"\u009b\u0001\u0000\u0000\u0000\u0010\u00a0\u0001\u0000\u0000\u0000\u0012"+
		"\u00ba\u0001\u0000\u0000\u0000\u0014\u00c0\u0001\u0000\u0000\u0000\u0016"+
		"\u00c2\u0001\u0000\u0000\u0000\u0018\u00cc\u0001\u0000\u0000\u0000\u001a"+
		"\u00d9\u0001\u0000\u0000\u0000\u001c\u00e7\u0001\u0000\u0000\u0000\u001e"+
		"\u00e9\u0001\u0000\u0000\u0000 \u00f2\u0001\u0000\u0000\u0000\"\u00f7"+
		"\u0001\u0000\u0000\u0000$\u0102\u0001\u0000\u0000\u0000&\u0104\u0001\u0000"+
		"\u0000\u0000(\u011b\u0001\u0000\u0000\u0000*\u0123\u0001\u0000\u0000\u0000"+
		",\u0125\u0001\u0000\u0000\u0000.\u013c\u0001\u0000\u0000\u00000\u0146"+
		"\u0001\u0000\u0000\u00002\u014f\u0001\u0000\u0000\u00004\u015f\u0001\u0000"+
		"\u0000\u00006\u0167\u0001\u0000\u0000\u00008\u016e\u0001\u0000\u0000\u0000"+
		":\u017c\u0001\u0000\u0000\u0000<\u0180\u0001\u0000\u0000\u0000>\u0189"+
		"\u0001\u0000\u0000\u0000@\u018b\u0001\u0000\u0000\u0000B\u0193\u0001\u0000"+
		"\u0000\u0000D\u019e\u0001\u0000\u0000\u0000F\u01a0\u0001\u0000\u0000\u0000"+
		"H\u01b3\u0001\u0000\u0000\u0000J\u01b5\u0001\u0000\u0000\u0000L\u01bd"+
		"\u0001\u0000\u0000\u0000N\u01c8\u0001\u0000\u0000\u0000P\u01ca\u0001\u0000"+
		"\u0000\u0000R\u01db\u0001\u0000\u0000\u0000T\u01f1\u0001\u0000\u0000\u0000"+
		"V\u01fa\u0001\u0000\u0000\u0000X\u01fc\u0001\u0000\u0000\u0000Z\u0205"+
		"\u0001\u0000\u0000\u0000\\^\u0003\u0002\u0001\u0000]\\\u0001\u0000\u0000"+
		"\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u0005"+
		"\u0000\u0000\u0001c\u0001\u0001\u0000\u0000\u0000di\u0003\u0004\u0002"+
		"\u0000ei\u0003\u0012\t\u0000fi\u0003*\u0015\u0000gi\u0003Z-\u0000hd\u0001"+
		"\u0000\u0000\u0000he\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000"+
		"hg\u0001\u0000\u0000\u0000i\u0003\u0001\u0000\u0000\u0000jv\u0003\u0006"+
		"\u0003\u0000ko\u0003\b\u0004\u0000ln\u0003\u0002\u0001\u0000ml\u0001\u0000"+
		"\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000"+
		"rs\u0003\f\u0006\u0000sv\u0001\u0000\u0000\u0000tv\u0003\n\u0005\u0000"+
		"uj\u0001\u0000\u0000\u0000uk\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000"+
		"\u0000v\u0005\u0001\u0000\u0000\u0000wx\u0005\b\u0000\u0000x|\u0005\n"+
		"\u0000\u0000y{\u0003\u000e\u0007\u0000zy\u0001\u0000\u0000\u0000{~\u0001"+
		"\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005\u0011\u0000\u0000\u0080\u0007\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005\b\u0000\u0000\u0082\u0086\u0005\f\u0000\u0000\u0083\u0085\u0003"+
		"\u000e\u0007\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001"+
		"\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005\u0011\u0000\u0000\u008a\t\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005\b\u0000\u0000\u008c\u0090\u0007\u0000\u0000"+
		"\u0000\u008d\u008f\u0003\u000e\u0007\u0000\u008e\u008d\u0001\u0000\u0000"+
		"\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0010\u0000"+
		"\u0000\u0094\u000b\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0007\u0000"+
		"\u0000\u0096\r\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u000e\u0000\u0000"+
		"\u0098\u0099\u0005\u000f\u0000\u0000\u0099\u009c\u0003\u0010\b\u0000\u009a"+
		"\u009c\u0005\u000e\u0000\u0000\u009b\u0097\u0001\u0000\u0000\u0000\u009b"+
		"\u009a\u0001\u0000\u0000\u0000\u009c\u000f\u0001\u0000\u0000\u0000\u009d"+
		"\u00a1\u0005\u0012\u0000\u0000\u009e\u00a1\u0005\u0013\u0000\u0000\u009f"+
		"\u00a1\u0005\u0014\u0000\u0000\u00a0\u009d\u0001\u0000\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u0011\u0001\u0000\u0000\u0000\u00a2\u00a6\u0005\u0006\u0000\u0000\u00a3"+
		"\u00a5\u0003\u0014\n\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ae\u0005\u0018\u0000\u0000\u00aa\u00ad"+
		"\u0003\u0016\u000b\u0000\u00ab\u00ad\u0003\u0018\f\u0000\u00ac\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001"+
		"\u0000\u0000\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b1\u00bb\u0005\u001a\u0000\u0000\u00b2\u00b6\u0005"+
		"\u0006\u0000\u0000\u00b3\u00b5\u0003\u0014\n\u0000\u00b4\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00bb\u0005\u0019"+
		"\u0000\u0000\u00ba\u00a2\u0001\u0000\u0000\u0000\u00ba\u00b2\u0001\u0000"+
		"\u0000\u0000\u00bb\u0013\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0016"+
		"\u0000\u0000\u00bd\u00be\u0005\u0017\u0000\u0000\u00be\u00c1\u0003\u0010"+
		"\b\u0000\u00bf\u00c1\u0005\u0016\u0000\u0000\u00c0\u00bc\u0001\u0000\u0000"+
		"\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u0015\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0003\u001e\u000f\u0000\u00c3\u00c7\u0005\u001d\u0000"+
		"\u0000\u00c4\u00c6\u0003&\u0013\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000"+
		"\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u001e\u0000\u0000"+
		"\u00cb\u0017\u0001\u0000\u0000\u0000\u00cc\u00cd\u00051\u0000\u0000\u00cd"+
		"\u00ce\u0003\u001a\r\u0000\u00ce\u00d3\u0005\u001d\u0000\u0000\u00cf\u00d2"+
		"\u0003\u0016\u000b\u0000\u00d0\u00d2\u0003\u0018\f\u0000\u00d1\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0005\u001e\u0000\u0000\u00d7\u0019\u0001"+
		"\u0000\u0000\u0000\u00d8\u00da\u0003\u001c\u000e\u0000\u00d9\u00d8\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00d9\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u001b\u0001"+
		"\u0000\u0000\u0000\u00dd\u00e8\u00057\u0000\u0000\u00de\u00e8\u00052\u0000"+
		"\u0000\u00df\u00e8\u00053\u0000\u0000\u00e0\u00e8\u00054\u0000\u0000\u00e1"+
		"\u00e8\u0005!\u0000\u0000\u00e2\u00e8\u0005#\u0000\u0000\u00e3\u00e8\u0005"+
		"\u001f\u0000\u0000\u00e4\u00e8\u0005 \u0000\u0000\u00e5\u00e8\u0005$\u0000"+
		"\u0000\u00e6\u00e8\u00050\u0000\u0000\u00e7\u00dd\u0001\u0000\u0000\u0000"+
		"\u00e7\u00de\u0001\u0000\u0000\u0000\u00e7\u00df\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e0\u0001\u0000\u0000\u0000\u00e7\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e2\u0001\u0000\u0000\u0000\u00e7\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u001d\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ee\u0003 \u0010\u0000\u00ea\u00eb\u0005#\u0000\u0000\u00eb\u00ed"+
		"\u0003 \u0010\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ef\u001f\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f3\u0003\"\u0011\u0000\u00f2\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5!\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f8\u0003$\u0012\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa#\u0001\u0000\u0000\u0000\u00fb"+
		"\u0103\u00057\u0000\u0000\u00fc\u00fd\u0005$\u0000\u0000\u00fd\u0103\u0005"+
		"7\u0000\u0000\u00fe\u0103\u00050\u0000\u0000\u00ff\u0100\u0005!\u0000"+
		"\u0000\u0100\u0103\u00057\u0000\u0000\u0101\u0103\u0005\'\u0000\u0000"+
		"\u0102\u00fb\u0001\u0000\u0000\u0000\u0102\u00fc\u0001\u0000\u0000\u0000"+
		"\u0102\u00fe\u0001\u0000\u0000\u0000\u0102\u00ff\u0001\u0000\u0000\u0000"+
		"\u0102\u0101\u0001\u0000\u0000\u0000\u0103%\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u00057\u0000\u0000\u0105\u0107\u0005!\u0000\u0000\u0106\u0108\u0003"+
		"(\u0014\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000"+
		"\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0005\"\u0000"+
		"\u0000\u010c\'\u0001\u0000\u0000\u0000\u010d\u011c\u00057\u0000\u0000"+
		"\u010e\u011c\u00052\u0000\u0000\u010f\u011c\u00053\u0000\u0000\u0110\u011c"+
		"\u00054\u0000\u0000\u0111\u011c\u00055\u0000\u0000\u0112\u011c\u0005/"+
		"\u0000\u0000\u0113\u011c\u00050\u0000\u0000\u0114\u011c\u00056\u0000\u0000"+
		"\u0115\u011c\u0005\u001f\u0000\u0000\u0116\u011c\u0005 \u0000\u0000\u0117"+
		"\u011c\u0005#\u0000\u0000\u0118\u011c\u0005$\u0000\u0000\u0119\u011c\u0005"+
		"(\u0000\u0000\u011a\u011c\u0005)\u0000\u0000\u011b\u010d\u0001\u0000\u0000"+
		"\u0000\u011b\u010e\u0001\u0000\u0000\u0000\u011b\u010f\u0001\u0000\u0000"+
		"\u0000\u011b\u0110\u0001\u0000\u0000\u0000\u011b\u0111\u0001\u0000\u0000"+
		"\u0000\u011b\u0112\u0001\u0000\u0000\u0000\u011b\u0113\u0001\u0000\u0000"+
		"\u0000\u011b\u0114\u0001\u0000\u0000\u0000\u011b\u0115\u0001\u0000\u0000"+
		"\u0000\u011b\u0116\u0001\u0000\u0000\u0000\u011b\u0117\u0001\u0000\u0000"+
		"\u0000\u011b\u0118\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000"+
		"\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c)\u0001\u0000\u0000\u0000"+
		"\u011d\u0124\u0003,\u0016\u0000\u011e\u0124\u00032\u0019\u0000\u011f\u0124"+
		"\u00036\u001b\u0000\u0120\u0124\u00038\u001c\u0000\u0121\u0124\u0003:"+
		"\u001d\u0000\u0122\u0124\u0003<\u001e\u0000\u0123\u011d\u0001\u0000\u0000"+
		"\u0000\u0123\u011e\u0001\u0000\u0000\u0000\u0123\u011f\u0001\u0000\u0000"+
		"\u0000\u0123\u0120\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000"+
		"\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0124+\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0005\u0005\u0000\u0000\u0126\u0127\u0005Q\u0000\u0000\u0127"+
		"\u0128\u0003>\u001f\u0000\u0128\u012c\u0005O\u0000\u0000\u0129\u012b\u0003"+
		"\u0002\u0001\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012b\u012e\u0001"+
		"\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001"+
		"\u0000\u0000\u0000\u012d\u0132\u0001\u0000\u0000\u0000\u012e\u012c\u0001"+
		"\u0000\u0000\u0000\u012f\u0131\u0003.\u0017\u0000\u0130\u012f\u0001\u0000"+
		"\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0136\u0001\u0000"+
		"\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0137\u00030\u0018"+
		"\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0139\u0005\u0005\u0000"+
		"\u0000\u0139\u013a\u0005W\u0000\u0000\u013a\u013b\u0005O\u0000\u0000\u013b"+
		"-\u0001\u0000\u0000\u0000\u013c\u013d\u0005\u0005\u0000\u0000\u013d\u013e"+
		"\u0005R\u0000\u0000\u013e\u013f\u0003>\u001f\u0000\u013f\u0143\u0005O"+
		"\u0000\u0000\u0140\u0142\u0003\u0002\u0001\u0000\u0141\u0140\u0001\u0000"+
		"\u0000\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144/\u0001\u0000\u0000"+
		"\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u0147\u0005\u0005\u0000"+
		"\u0000\u0147\u0148\u0005S\u0000\u0000\u0148\u014c\u0005O\u0000\u0000\u0149"+
		"\u014b\u0003\u0002\u0001\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014b"+
		"\u014e\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u0001\u0000\u0000\u0000\u014d1\u0001\u0000\u0000\u0000\u014e\u014c"+
		"\u0001\u0000\u0000\u0000\u014f\u0150\u0005\u0005\u0000\u0000\u0150\u0151"+
		"\u0005T\u0000\u0000\u0151\u0152\u00034\u001a\u0000\u0152\u0153\u0005U"+
		"\u0000\u0000\u0153\u0154\u0003>\u001f\u0000\u0154\u0158\u0005O\u0000\u0000"+
		"\u0155\u0157\u0003\u0002\u0001\u0000\u0156\u0155\u0001\u0000\u0000\u0000"+
		"\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000"+
		"\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015b\u0001\u0000\u0000\u0000"+
		"\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u015c\u0005\u0005\u0000\u0000"+
		"\u015c\u015d\u0005X\u0000\u0000\u015d\u015e\u0005O\u0000\u0000\u015e3"+
		"\u0001\u0000\u0000\u0000\u015f\u0164\u0005_\u0000\u0000\u0160\u0161\u0005"+
		"d\u0000\u0000\u0161\u0163\u0005_\u0000\u0000\u0162\u0160\u0001\u0000\u0000"+
		"\u0000\u0163\u0166\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u01655\u0001\u0000\u0000\u0000"+
		"\u0166\u0164\u0001\u0000\u0000\u0000\u0167\u0168\u0005\u0005\u0000\u0000"+
		"\u0168\u0169\u0005[\u0000\u0000\u0169\u016a\u0005_\u0000\u0000\u016a\u016b"+
		"\u0005j\u0000\u0000\u016b\u016c\u0003>\u001f\u0000\u016c\u016d\u0005O"+
		"\u0000\u0000\u016d7\u0001\u0000\u0000\u0000\u016e\u016f\u0005\u0005\u0000"+
		"\u0000\u016f\u0170\u0005Y\u0000\u0000\u0170\u0171\u0005_\u0000\u0000\u0171"+
		"\u0175\u0005O\u0000\u0000\u0172\u0174\u0003\u0002\u0001\u0000\u0173\u0172"+
		"\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000\u0000\u0000\u0175\u0173"+
		"\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0178"+
		"\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0178\u0179"+
		"\u0005\u0005\u0000\u0000\u0179\u017a\u0005Z\u0000\u0000\u017a\u017b\u0005"+
		"O\u0000\u0000\u017b9\u0001\u0000\u0000\u0000\u017c\u017d\u0005\u0004\u0000"+
		"\u0000\u017d\u017e\u0003>\u001f\u0000\u017e\u017f\u0005:\u0000\u0000\u017f"+
		";\u0001\u0000\u0000\u0000\u0180\u0184\u0005\u0003\u0000\u0000\u0181\u0183"+
		"\u00059\u0000\u0000\u0182\u0181\u0001\u0000\u0000\u0000\u0183\u0186\u0001"+
		"\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001"+
		"\u0000\u0000\u0000\u0185\u0187\u0001\u0000\u0000\u0000\u0186\u0184\u0001"+
		"\u0000\u0000\u0000\u0187\u0188\u00058\u0000\u0000\u0188=\u0001\u0000\u0000"+
		"\u0000\u0189\u018a\u0003@ \u0000\u018a?\u0001\u0000\u0000\u0000\u018b"+
		"\u0190\u0003B!\u0000\u018c\u018d\u0007\u0001\u0000\u0000\u018d\u018f\u0003"+
		"B!\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0192\u0001\u0000\u0000"+
		"\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000"+
		"\u0000\u0191A\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000"+
		"\u0193\u0198\u0003D\"\u0000\u0194\u0195\u0007\u0002\u0000\u0000\u0195"+
		"\u0197\u0003D\"\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0197\u019a"+
		"\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0198\u0199"+
		"\u0001\u0000\u0000\u0000\u0199C\u0001\u0000\u0000\u0000\u019a\u0198\u0001"+
		"\u0000\u0000\u0000\u019b\u019c\u0007\u0003\u0000\u0000\u019c\u019f\u0003"+
		"D\"\u0000\u019d\u019f\u0003F#\u0000\u019e\u019b\u0001\u0000\u0000\u0000"+
		"\u019e\u019d\u0001\u0000\u0000\u0000\u019fE\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a6\u0003J%\u0000\u01a1\u01a2\u0003H$\u0000\u01a2\u01a3\u0003J%\u0000"+
		"\u01a3\u01a5\u0001\u0000\u0000\u0000\u01a4\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a8\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7G\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a9\u01b4\u0005L\u0000\u0000\u01aa\u01b4"+
		"\u0005i\u0000\u0000\u01ab\u01b4\u0005?\u0000\u0000\u01ac\u01b4\u0005U"+
		"\u0000\u0000\u01ad\u01af\u0007\u0004\u0000\u0000\u01ae\u01b0\u0007\u0003"+
		"\u0000\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b4\u0001\u0000\u0000\u0000\u01b1\u01b2\u0007\u0003"+
		"\u0000\u0000\u01b2\u01b4\u0007\u0005\u0000\u0000\u01b3\u01a9\u0001\u0000"+
		"\u0000\u0000\u01b3\u01aa\u0001\u0000\u0000\u0000\u01b3\u01ab\u0001\u0000"+
		"\u0000\u0000\u01b3\u01ac\u0001\u0000\u0000\u0000\u01b3\u01ad\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b4I\u0001\u0000\u0000"+
		"\u0000\u01b5\u01ba\u0003L&\u0000\u01b6\u01b7\u0007\u0006\u0000\u0000\u01b7"+
		"\u01b9\u0003L&\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b9\u01bc\u0001"+
		"\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001"+
		"\u0000\u0000\u0000\u01bbK\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000"+
		"\u0000\u0000\u01bd\u01c2\u0003N\'\u0000\u01be\u01bf\u0007\u0007\u0000"+
		"\u0000\u01bf\u01c1\u0003N\'\u0000\u01c0\u01be\u0001\u0000\u0000\u0000"+
		"\u01c1\u01c4\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3M\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c5\u01c6\u0007\u0006\u0000\u0000\u01c6"+
		"\u01c9\u0003N\'\u0000\u01c7\u01c9\u0003P(\u0000\u01c8\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c9O\u0001\u0000\u0000"+
		"\u0000\u01ca\u01ce\u0003R)\u0000\u01cb\u01cd\u0003T*\u0000\u01cc\u01cb"+
		"\u0001\u0000\u0000\u0000\u01cd\u01d0\u0001\u0000\u0000\u0000\u01ce\u01cc"+
		"\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cfQ\u0001"+
		"\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d1\u01dc\u0005"+
		"A\u0000\u0000\u01d2\u01dc\u0005`\u0000\u0000\u01d3\u01dc\u0005B\u0000"+
		"\u0000\u01d4\u01dc\u0005a\u0000\u0000\u01d5\u01dc\u0005C\u0000\u0000\u01d6"+
		"\u01dc\u0005_\u0000\u0000\u01d7\u01d8\u0007\b\u0000\u0000\u01d8\u01d9"+
		"\u0003>\u001f\u0000\u01d9\u01da\u0007\t\u0000\u0000\u01da\u01dc\u0001"+
		"\u0000\u0000\u0000\u01db\u01d1\u0001\u0000\u0000\u0000\u01db\u01d2\u0001"+
		"\u0000\u0000\u0000\u01db\u01d3\u0001\u0000\u0000\u0000\u01db\u01d4\u0001"+
		"\u0000\u0000\u0000\u01db\u01d5\u0001\u0000\u0000\u0000\u01db\u01d6\u0001"+
		"\u0000\u0000\u0000\u01db\u01d7\u0001\u0000\u0000\u0000\u01dcS\u0001\u0000"+
		"\u0000\u0000\u01dd\u01de\u0007\n\u0000\u0000\u01de\u01f2\u0007\u000b\u0000"+
		"\u0000\u01df\u01e0\u0007\f\u0000\u0000\u01e0\u01e1\u0003>\u001f\u0000"+
		"\u01e1\u01e2\u0007\r\u0000\u0000\u01e2\u01f2\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e5\u0007\b\u0000\u0000\u01e4\u01e6\u0003X,\u0000\u01e5\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e7\u01f2\u0007\t\u0000\u0000\u01e8\u01e9\u0007\u000e"+
		"\u0000\u0000\u01e9\u01ef\u0007\u000b\u0000\u0000\u01ea\u01ec\u0007\b\u0000"+
		"\u0000\u01eb\u01ed\u0003X,\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ed\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee"+
		"\u01f0\u0007\t\u0000\u0000\u01ef\u01ea\u0001\u0000\u0000\u0000\u01ef\u01f0"+
		"\u0001\u0000\u0000\u0000\u01f0\u01f2\u0001\u0000\u0000\u0000\u01f1\u01dd"+
		"\u0001\u0000\u0000\u0000\u01f1\u01df\u0001\u0000\u0000\u0000\u01f1\u01e3"+
		"\u0001\u0000\u0000\u0000\u01f1\u01e8\u0001\u0000\u0000\u0000\u01f2U\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f4\u0005C\u0000\u0000\u01f4\u01f5\u0007\u000f"+
		"\u0000\u0000\u01f5\u01fb\u0003>\u001f\u0000\u01f6\u01f7\u0005_\u0000\u0000"+
		"\u01f7\u01f8\u0007\u000f\u0000\u0000\u01f8\u01fb\u0003>\u001f\u0000\u01f9"+
		"\u01fb\u0003>\u001f\u0000\u01fa\u01f3\u0001\u0000\u0000\u0000\u01fa\u01f6"+
		"\u0001\u0000\u0000\u0000\u01fa\u01f9\u0001\u0000\u0000\u0000\u01fbW\u0001"+
		"\u0000\u0000\u0000\u01fc\u0201\u0003V+\u0000\u01fd\u01fe\u0007\u0010\u0000"+
		"\u0000\u01fe\u0200\u0003V+\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u0200"+
		"\u0203\u0001\u0000\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0201"+
		"\u0202\u0001\u0000\u0000\u0000\u0202Y\u0001\u0000\u0000\u0000\u0203\u0201"+
		"\u0001\u0000\u0000\u0000\u0204\u0206\u0005\t\u0000\u0000\u0205\u0204\u0001"+
		"\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u0205\u0001"+
		"\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208[\u0001\u0000"+
		"\u0000\u00006_hou|\u0086\u0090\u009b\u00a0\u00a6\u00ac\u00ae\u00b6\u00ba"+
		"\u00c0\u00c7\u00d1\u00d3\u00db\u00e7\u00ee\u00f4\u00f9\u0102\u0109\u011b"+
		"\u0123\u012c\u0132\u0136\u0143\u014c\u0158\u0164\u0175\u0184\u0190\u0198"+
		"\u019e\u01a6\u01af\u01b3\u01ba\u01c2\u01c8\u01ce\u01db\u01e5\u01ec\u01ef"+
		"\u01f1\u01fa\u0201\u0207";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}