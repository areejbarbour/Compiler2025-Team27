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
		JINJA_EXPR_START=1, JINJA_STMT_START=2, JINJA_COMMENT_START=3, HTML_STYLE_OPEN=4, 
		HTML_TAG_IMG_OPEN=5, HTML_TAG_INPUT_OPEN=6, HTML_TAG_DIV_OPEN=7, HTML_TAG_SPAN_OPEN=8, 
		HTML_TAG_P_OPEN=9, HTML_TAG_H1_OPEN=10, HTML_TAG_H2_OPEN=11, HTML_TAG_BUTTON_OPEN=12, 
		HTML_TAG_CLOSE=13, HTML_SELF_CLOSING_TAG=14, HTML_TAG_END=15, HTML_ATTR_EQ=16, 
		HTML_ATTR_ID=17, HTML_ATTR_CLASS=18, HTML_ATTR_SRC=19, HTML_ATTR_HREF=20, 
		HTML_ATTR_ALT=21, HTML_ATTR_NAME=22, HTML_ATTR_VALUE=23, HTML_ATTR_TITLE=24, 
		HTML_ATTR_STYLE=25, HTML_ATTR_DATA=26, HTML_TEXT=27, HTML_WS=28, HTML_COMMENT=29, 
		TAG_WS=30, HTML_ATTR_NAME_KEY=31, HTML_ATTR_EQ_MODE=32, HTML_SELF_CLOSE=33, 
		HTML_TAG_END_MODE=34, HTML_TAG_TEXT=35, HTML_ATTR_VALUE_DOUBLE=36, HTML_ATTR_VALUE_SINGLE=37, 
		HTML_ATTR_VALUE_UNQUOTED=38, CSS_STYLE_CLOSE=39, CSS_WS=40, CSS_COMMENT=41, 
		CSS_OPEN_BRACE=42, CSS_CLOSE_BRACE=43, CSS_COLON=44, CSS_SEMI=45, CSS_COMMA=46, 
		CSS_PAREN_OPEN=47, CSS_PAREN_CLOSE=48, CSS_COMBINATOR=49, CSS_SEL_ID=50, 
		CSS_SEL_CLASS=51, CSS_ATTRIBUTE_SELECTOR=52, CSS_PSEUDO=53, CSS_AT_RULE=54, 
		CSS_NUMBER=55, CSS_PERCENTAGE=56, CSS_DIMENSION=57, CSS_STRING_DOUBLE=58, 
		CSS_STRING_SINGLE=59, CSS_URL=60, CSS_FUNCTION=61, CSS_IDENT=62, CSS_OTHER=63, 
		JINJA_COMMENT_CONTENT=64, JEXPR_END=65, JEXPR_WS=66, JINJA_EXPR_CONTENT=67, 
		JSTMT_IF=68, JSTMT_ELIF=69, JSTMT_ELSE=70, JSTMT_ENDIF=71, JSTMT_FOR=72, 
		JSTMT_ENDFOR=73, JSTMT_IN=74, JSTMT_END=75, JSTMT_WS=76, JINJA_STMT_CONTENT=77, 
		CSS_HASH_COLOR=78;
	public static final int
		RULE_document = 0, RULE_element = 1, RULE_htmlElement = 2, RULE_htmlOpenTag = 3, 
		RULE_htmlSelfClose = 4, RULE_htmlCloseTag = 5, RULE_attribute = 6, RULE_attrValue = 7, 
		RULE_cssBlock = 8, RULE_cssContent = 9, RULE_jinjaBlock = 10, RULE_jinjaIf = 11, 
		RULE_jinjaElif = 12, RULE_jinjaElse = 13, RULE_jinjaFor = 14, RULE_genericJinjaStmt = 15, 
		RULE_jinjaExpr = 16, RULE_jinjaComment = 17, RULE_textNode = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "element", "htmlElement", "htmlOpenTag", "htmlSelfClose", 
			"htmlCloseTag", "attribute", "attrValue", "cssBlock", "cssContent", "jinjaBlock", 
			"jinjaIf", "jinjaElif", "jinjaElse", "jinjaFor", "genericJinjaStmt", 
			"jinjaExpr", "jinjaComment", "textNode"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{{'", "'{%'", "'{#'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'{'", "'}'", "':'", "';'", 
			"','", "'('", "')'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'}}'", null, null, null, 
			null, null, "'endif'", null, "'endfor'", null, "'%}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "JINJA_EXPR_START", "JINJA_STMT_START", "JINJA_COMMENT_START", 
			"HTML_STYLE_OPEN", "HTML_TAG_IMG_OPEN", "HTML_TAG_INPUT_OPEN", "HTML_TAG_DIV_OPEN", 
			"HTML_TAG_SPAN_OPEN", "HTML_TAG_P_OPEN", "HTML_TAG_H1_OPEN", "HTML_TAG_H2_OPEN", 
			"HTML_TAG_BUTTON_OPEN", "HTML_TAG_CLOSE", "HTML_SELF_CLOSING_TAG", "HTML_TAG_END", 
			"HTML_ATTR_EQ", "HTML_ATTR_ID", "HTML_ATTR_CLASS", "HTML_ATTR_SRC", "HTML_ATTR_HREF", 
			"HTML_ATTR_ALT", "HTML_ATTR_NAME", "HTML_ATTR_VALUE", "HTML_ATTR_TITLE", 
			"HTML_ATTR_STYLE", "HTML_ATTR_DATA", "HTML_TEXT", "HTML_WS", "HTML_COMMENT", 
			"TAG_WS", "HTML_ATTR_NAME_KEY", "HTML_ATTR_EQ_MODE", "HTML_SELF_CLOSE", 
			"HTML_TAG_END_MODE", "HTML_TAG_TEXT", "HTML_ATTR_VALUE_DOUBLE", "HTML_ATTR_VALUE_SINGLE", 
			"HTML_ATTR_VALUE_UNQUOTED", "CSS_STYLE_CLOSE", "CSS_WS", "CSS_COMMENT", 
			"CSS_OPEN_BRACE", "CSS_CLOSE_BRACE", "CSS_COLON", "CSS_SEMI", "CSS_COMMA", 
			"CSS_PAREN_OPEN", "CSS_PAREN_CLOSE", "CSS_COMBINATOR", "CSS_SEL_ID", 
			"CSS_SEL_CLASS", "CSS_ATTRIBUTE_SELECTOR", "CSS_PSEUDO", "CSS_AT_RULE", 
			"CSS_NUMBER", "CSS_PERCENTAGE", "CSS_DIMENSION", "CSS_STRING_DOUBLE", 
			"CSS_STRING_SINGLE", "CSS_URL", "CSS_FUNCTION", "CSS_IDENT", "CSS_OTHER", 
			"JINJA_COMMENT_CONTENT", "JEXPR_END", "JEXPR_WS", "JINJA_EXPR_CONTENT", 
			"JSTMT_IF", "JSTMT_ELIF", "JSTMT_ELSE", "JSTMT_ENDIF", "JSTMT_FOR", "JSTMT_ENDFOR", 
			"JSTMT_IN", "JSTMT_END", "JSTMT_WS", "JINJA_STMT_CONTENT", "CSS_HASH_COLOR"
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
	public static class DocumentRootNodeContext extends DocumentContext {
		public TerminalNode EOF() { return getToken(WebTemplateParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public DocumentRootNodeContext(DocumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterDocumentRootNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitDocumentRootNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitDocumentRootNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			_localctx = new DocumentRootNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 134225918L) != 0)) {
				{
				{
				setState(38);
				element();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
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
	public static class ElementJinjaNodeContext extends ElementContext {
		public JinjaBlockContext jinjaBlock() {
			return getRuleContext(JinjaBlockContext.class,0);
		}
		public ElementJinjaNodeContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterElementJinjaNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitElementJinjaNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitElementJinjaNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementTextNodeContext extends ElementContext {
		public TextNodeContext textNode() {
			return getRuleContext(TextNodeContext.class,0);
		}
		public ElementTextNodeContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterElementTextNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitElementTextNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitElementTextNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementHtmlNodeContext extends ElementContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public ElementHtmlNodeContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterElementHtmlNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitElementHtmlNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitElementHtmlNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementCssNodeContext extends ElementContext {
		public CssBlockContext cssBlock() {
			return getRuleContext(CssBlockContext.class,0);
		}
		public ElementCssNodeContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterElementCssNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitElementCssNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitElementCssNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_TAG_IMG_OPEN:
			case HTML_TAG_INPUT_OPEN:
			case HTML_TAG_DIV_OPEN:
			case HTML_TAG_SPAN_OPEN:
			case HTML_TAG_P_OPEN:
			case HTML_TAG_H1_OPEN:
			case HTML_TAG_H2_OPEN:
			case HTML_TAG_BUTTON_OPEN:
				_localctx = new ElementHtmlNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				htmlElement();
				}
				break;
			case HTML_STYLE_OPEN:
				_localctx = new ElementCssNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				cssBlock();
				}
				break;
			case JINJA_EXPR_START:
			case JINJA_STMT_START:
			case JINJA_COMMENT_START:
				_localctx = new ElementJinjaNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				jinjaBlock();
				}
				break;
			case HTML_TEXT:
				_localctx = new ElementTextNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
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
	public static class HtmlElementNodeContext extends HtmlElementContext {
		public HtmlOpenTagContext htmlOpenTag() {
			return getRuleContext(HtmlOpenTagContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public HtmlCloseTagContext htmlCloseTag() {
			return getRuleContext(HtmlCloseTagContext.class,0);
		}
		public HtmlElementNodeContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterHtmlElementNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitHtmlElementNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitHtmlElementNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlSelfClosingNodeContext extends HtmlElementContext {
		public HtmlSelfCloseContext htmlSelfClose() {
			return getRuleContext(HtmlSelfCloseContext.class,0);
		}
		public HtmlSelfClosingNodeContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterHtmlSelfClosingNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitHtmlSelfClosingNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitHtmlSelfClosingNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		try {
			int _alt;
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_TAG_DIV_OPEN:
			case HTML_TAG_SPAN_OPEN:
			case HTML_TAG_P_OPEN:
			case HTML_TAG_H1_OPEN:
			case HTML_TAG_H2_OPEN:
			case HTML_TAG_BUTTON_OPEN:
				_localctx = new HtmlElementNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				htmlOpenTag();
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(53);
						element();
						}
						} 
					}
					setState(58);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(60);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(59);
					htmlCloseTag();
					}
					break;
				}
				}
				break;
			case HTML_TAG_IMG_OPEN:
			case HTML_TAG_INPUT_OPEN:
				_localctx = new HtmlSelfClosingNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				htmlSelfClose();
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
	public static class HtmlOpenPNodeContext extends HtmlOpenTagContext {
		public TerminalNode HTML_TAG_P_OPEN() { return getToken(WebTemplateParser.HTML_TAG_P_OPEN, 0); }
		public TerminalNode HTML_TAG_END_MODE() { return getToken(WebTemplateParser.HTML_TAG_END_MODE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public HtmlOpenPNodeContext(HtmlOpenTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterHtmlOpenPNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitHtmlOpenPNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitHtmlOpenPNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlOpenButtonNodeContext extends HtmlOpenTagContext {
		public TerminalNode HTML_TAG_BUTTON_OPEN() { return getToken(WebTemplateParser.HTML_TAG_BUTTON_OPEN, 0); }
		public TerminalNode HTML_TAG_END_MODE() { return getToken(WebTemplateParser.HTML_TAG_END_MODE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public HtmlOpenButtonNodeContext(HtmlOpenTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterHtmlOpenButtonNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitHtmlOpenButtonNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitHtmlOpenButtonNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlOpenDivNodeContext extends HtmlOpenTagContext {
		public TerminalNode HTML_TAG_DIV_OPEN() { return getToken(WebTemplateParser.HTML_TAG_DIV_OPEN, 0); }
		public TerminalNode HTML_TAG_END_MODE() { return getToken(WebTemplateParser.HTML_TAG_END_MODE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public HtmlOpenDivNodeContext(HtmlOpenTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterHtmlOpenDivNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitHtmlOpenDivNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitHtmlOpenDivNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlOpenH1NodeContext extends HtmlOpenTagContext {
		public TerminalNode HTML_TAG_H1_OPEN() { return getToken(WebTemplateParser.HTML_TAG_H1_OPEN, 0); }
		public TerminalNode HTML_TAG_END_MODE() { return getToken(WebTemplateParser.HTML_TAG_END_MODE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public HtmlOpenH1NodeContext(HtmlOpenTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterHtmlOpenH1Node(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitHtmlOpenH1Node(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitHtmlOpenH1Node(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlOpenH2NodeContext extends HtmlOpenTagContext {
		public TerminalNode HTML_TAG_H2_OPEN() { return getToken(WebTemplateParser.HTML_TAG_H2_OPEN, 0); }
		public TerminalNode HTML_TAG_END_MODE() { return getToken(WebTemplateParser.HTML_TAG_END_MODE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public HtmlOpenH2NodeContext(HtmlOpenTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterHtmlOpenH2Node(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitHtmlOpenH2Node(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitHtmlOpenH2Node(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlOpenSpanNodeContext extends HtmlOpenTagContext {
		public TerminalNode HTML_TAG_SPAN_OPEN() { return getToken(WebTemplateParser.HTML_TAG_SPAN_OPEN, 0); }
		public TerminalNode HTML_TAG_END_MODE() { return getToken(WebTemplateParser.HTML_TAG_END_MODE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public HtmlOpenSpanNodeContext(HtmlOpenTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterHtmlOpenSpanNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitHtmlOpenSpanNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitHtmlOpenSpanNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlOpenTagContext htmlOpenTag() throws RecognitionException {
		HtmlOpenTagContext _localctx = new HtmlOpenTagContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlOpenTag);
		int _la;
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_TAG_DIV_OPEN:
				_localctx = new HtmlOpenDivNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(HTML_TAG_DIV_OPEN);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==HTML_ATTR_NAME_KEY || _la==HTML_TAG_TEXT) {
					{
					{
					setState(66);
					attribute();
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				match(HTML_TAG_END_MODE);
				}
				break;
			case HTML_TAG_SPAN_OPEN:
				_localctx = new HtmlOpenSpanNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(HTML_TAG_SPAN_OPEN);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==HTML_ATTR_NAME_KEY || _la==HTML_TAG_TEXT) {
					{
					{
					setState(74);
					attribute();
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(80);
				match(HTML_TAG_END_MODE);
				}
				break;
			case HTML_TAG_P_OPEN:
				_localctx = new HtmlOpenPNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(HTML_TAG_P_OPEN);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==HTML_ATTR_NAME_KEY || _la==HTML_TAG_TEXT) {
					{
					{
					setState(82);
					attribute();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(88);
				match(HTML_TAG_END_MODE);
				}
				break;
			case HTML_TAG_H1_OPEN:
				_localctx = new HtmlOpenH1NodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(HTML_TAG_H1_OPEN);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==HTML_ATTR_NAME_KEY || _la==HTML_TAG_TEXT) {
					{
					{
					setState(90);
					attribute();
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(96);
				match(HTML_TAG_END_MODE);
				}
				break;
			case HTML_TAG_H2_OPEN:
				_localctx = new HtmlOpenH2NodeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				match(HTML_TAG_H2_OPEN);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==HTML_ATTR_NAME_KEY || _la==HTML_TAG_TEXT) {
					{
					{
					setState(98);
					attribute();
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104);
				match(HTML_TAG_END_MODE);
				}
				break;
			case HTML_TAG_BUTTON_OPEN:
				_localctx = new HtmlOpenButtonNodeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
				match(HTML_TAG_BUTTON_OPEN);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==HTML_ATTR_NAME_KEY || _la==HTML_TAG_TEXT) {
					{
					{
					setState(106);
					attribute();
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				match(HTML_TAG_END_MODE);
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
	public static class HtmlSelfCloseContext extends ParserRuleContext {
		public HtmlSelfCloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlSelfClose; }
	 
		public HtmlSelfCloseContext() { }
		public void copyFrom(HtmlSelfCloseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlSelfCloseInputNodeContext extends HtmlSelfCloseContext {
		public TerminalNode HTML_TAG_INPUT_OPEN() { return getToken(WebTemplateParser.HTML_TAG_INPUT_OPEN, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode HTML_SELF_CLOSE() { return getToken(WebTemplateParser.HTML_SELF_CLOSE, 0); }
		public HtmlSelfCloseInputNodeContext(HtmlSelfCloseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterHtmlSelfCloseInputNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitHtmlSelfCloseInputNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitHtmlSelfCloseInputNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlSelfCloseImgNodeContext extends HtmlSelfCloseContext {
		public TerminalNode HTML_TAG_IMG_OPEN() { return getToken(WebTemplateParser.HTML_TAG_IMG_OPEN, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode HTML_SELF_CLOSE() { return getToken(WebTemplateParser.HTML_SELF_CLOSE, 0); }
		public HtmlSelfCloseImgNodeContext(HtmlSelfCloseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterHtmlSelfCloseImgNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitHtmlSelfCloseImgNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitHtmlSelfCloseImgNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlSelfCloseContext htmlSelfClose() throws RecognitionException {
		HtmlSelfCloseContext _localctx = new HtmlSelfCloseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlSelfClose);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_TAG_IMG_OPEN:
				_localctx = new HtmlSelfCloseImgNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(HTML_TAG_IMG_OPEN);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==HTML_ATTR_NAME_KEY || _la==HTML_TAG_TEXT) {
					{
					{
					setState(116);
					attribute();
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HTML_SELF_CLOSE) {
					{
					setState(122);
					match(HTML_SELF_CLOSE);
					}
				}

				}
				break;
			case HTML_TAG_INPUT_OPEN:
				_localctx = new HtmlSelfCloseInputNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(HTML_TAG_INPUT_OPEN);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==HTML_ATTR_NAME_KEY || _la==HTML_TAG_TEXT) {
					{
					{
					setState(126);
					attribute();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HTML_SELF_CLOSE) {
					{
					setState(132);
					match(HTML_SELF_CLOSE);
					}
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
	public static class HtmlCloseTagNodeContext extends HtmlCloseTagContext {
		public TerminalNode HTML_TAG_CLOSE() { return getToken(WebTemplateParser.HTML_TAG_CLOSE, 0); }
		public HtmlCloseTagNodeContext(HtmlCloseTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterHtmlCloseTagNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitHtmlCloseTagNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitHtmlCloseTagNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCloseTagContext htmlCloseTag() throws RecognitionException {
		HtmlCloseTagContext _localctx = new HtmlCloseTagContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlCloseTag);
		try {
			_localctx = new HtmlCloseTagNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(HTML_TAG_CLOSE);
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
	public static class AttributeContext extends ParserRuleContext {
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	 
		public AttributeContext() { }
		public void copyFrom(AttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrNamedNodeContext extends AttributeContext {
		public TerminalNode HTML_ATTR_NAME_KEY() { return getToken(WebTemplateParser.HTML_ATTR_NAME_KEY, 0); }
		public TerminalNode HTML_ATTR_EQ_MODE() { return getToken(WebTemplateParser.HTML_ATTR_EQ_MODE, 0); }
		public AttrValueContext attrValue() {
			return getRuleContext(AttrValueContext.class,0);
		}
		public AttrNamedNodeContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterAttrNamedNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitAttrNamedNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitAttrNamedNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrTextNodeContext extends AttributeContext {
		public TerminalNode HTML_TAG_TEXT() { return getToken(WebTemplateParser.HTML_TAG_TEXT, 0); }
		public AttrTextNodeContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterAttrTextNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitAttrTextNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitAttrTextNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attribute);
		int _la;
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_ATTR_NAME_KEY:
				_localctx = new AttrNamedNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(HTML_ATTR_NAME_KEY);
				setState(140);
				match(HTML_ATTR_EQ_MODE);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 481036337152L) != 0)) {
					{
					setState(141);
					attrValue();
					}
				}

				}
				break;
			case HTML_TAG_TEXT:
				_localctx = new AttrTextNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(HTML_TAG_TEXT);
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
	public static class AttrValueUnquotedNodeContext extends AttrValueContext {
		public TerminalNode HTML_ATTR_VALUE_UNQUOTED() { return getToken(WebTemplateParser.HTML_ATTR_VALUE_UNQUOTED, 0); }
		public AttrValueUnquotedNodeContext(AttrValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterAttrValueUnquotedNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitAttrValueUnquotedNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitAttrValueUnquotedNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrValueDoubleQuotedNodeContext extends AttrValueContext {
		public TerminalNode HTML_ATTR_VALUE_DOUBLE() { return getToken(WebTemplateParser.HTML_ATTR_VALUE_DOUBLE, 0); }
		public AttrValueDoubleQuotedNodeContext(AttrValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterAttrValueDoubleQuotedNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitAttrValueDoubleQuotedNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitAttrValueDoubleQuotedNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrValueSingleQuotedNodeContext extends AttrValueContext {
		public TerminalNode HTML_ATTR_VALUE_SINGLE() { return getToken(WebTemplateParser.HTML_ATTR_VALUE_SINGLE, 0); }
		public AttrValueSingleQuotedNodeContext(AttrValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterAttrValueSingleQuotedNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitAttrValueSingleQuotedNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitAttrValueSingleQuotedNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrValueContext attrValue() throws RecognitionException {
		AttrValueContext _localctx = new AttrValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attrValue);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_ATTR_VALUE_DOUBLE:
				_localctx = new AttrValueDoubleQuotedNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(HTML_ATTR_VALUE_DOUBLE);
				}
				break;
			case HTML_ATTR_VALUE_SINGLE:
				_localctx = new AttrValueSingleQuotedNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(HTML_ATTR_VALUE_SINGLE);
				}
				break;
			case HTML_ATTR_VALUE_UNQUOTED:
				_localctx = new AttrValueUnquotedNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(HTML_ATTR_VALUE_UNQUOTED);
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
	public static class CssBlockNodeContext extends CssBlockContext {
		public TerminalNode HTML_STYLE_OPEN() { return getToken(WebTemplateParser.HTML_STYLE_OPEN, 0); }
		public TerminalNode CSS_STYLE_CLOSE() { return getToken(WebTemplateParser.CSS_STYLE_CLOSE, 0); }
		public List<CssContentContext> cssContent() {
			return getRuleContexts(CssContentContext.class);
		}
		public CssContentContext cssContent(int i) {
			return getRuleContext(CssContentContext.class,i);
		}
		public CssBlockNodeContext(CssBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssBlockNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssBlockNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssBlockNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssBlockContext cssBlock() throws RecognitionException {
		CssBlockContext _localctx = new CssBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cssBlock);
		int _la;
		try {
			_localctx = new CssBlockNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(HTML_STYLE_OPEN);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & 68723671039L) != 0)) {
				{
				{
				setState(153);
				cssContent();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			match(CSS_STYLE_CLOSE);
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
	public static class CssContentContext extends ParserRuleContext {
		public CssContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssContent; }
	 
		public CssContentContext() { }
		public void copyFrom(CssContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssParenCloseNodeContext extends CssContentContext {
		public TerminalNode CSS_PAREN_CLOSE() { return getToken(WebTemplateParser.CSS_PAREN_CLOSE, 0); }
		public CssParenCloseNodeContext(CssContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssParenCloseNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssParenCloseNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssParenCloseNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssUrlNodeContext extends CssContentContext {
		public TerminalNode CSS_URL() { return getToken(WebTemplateParser.CSS_URL, 0); }
		public CssUrlNodeContext(CssContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssUrlNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssUrlNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssUrlNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssAtRuleNodeContext extends CssContentContext {
		public TerminalNode CSS_AT_RULE() { return getToken(WebTemplateParser.CSS_AT_RULE, 0); }
		public CssAtRuleNodeContext(CssContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssAtRuleNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssAtRuleNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssAtRuleNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssFunctionNodeContext extends CssContentContext {
		public TerminalNode CSS_FUNCTION() { return getToken(WebTemplateParser.CSS_FUNCTION, 0); }
		public CssFunctionNodeContext(CssContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssFunctionNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssFunctionNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssFunctionNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssOtherNodeContext extends CssContentContext {
		public TerminalNode CSS_OTHER() { return getToken(WebTemplateParser.CSS_OTHER, 0); }
		public CssOtherNodeContext(CssContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssOtherNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssOtherNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssOtherNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssCloseBraceNodeContext extends CssContentContext {
		public TerminalNode CSS_CLOSE_BRACE() { return getToken(WebTemplateParser.CSS_CLOSE_BRACE, 0); }
		public CssCloseBraceNodeContext(CssContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssCloseBraceNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssCloseBraceNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssCloseBraceNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssPercentageNodeContext extends CssContentContext {
		public TerminalNode CSS_PERCENTAGE() { return getToken(WebTemplateParser.CSS_PERCENTAGE, 0); }
		public CssPercentageNodeContext(CssContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssPercentageNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssPercentageNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssPercentageNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssSemiNodeContext extends CssContentContext {
		public TerminalNode CSS_SEMI() { return getToken(WebTemplateParser.CSS_SEMI, 0); }
		public CssSemiNodeContext(CssContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssSemiNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssSemiNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssSemiNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssHashColorNodeContext extends CssContentContext {
		public TerminalNode CSS_HASH_COLOR() { return getToken(WebTemplateParser.CSS_HASH_COLOR, 0); }
		public CssHashColorNodeContext(CssContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssHashColorNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssHashColorNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssHashColorNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssSelIdNodeContext extends CssContentContext {
		public TerminalNode CSS_SEL_ID() { return getToken(WebTemplateParser.CSS_SEL_ID, 0); }
		public CssSelIdNodeContext(CssContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssSelIdNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssSelIdNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssSelIdNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssIdentNodeContext extends CssContentContext {
		public TerminalNode CSS_IDENT() { return getToken(WebTemplateParser.CSS_IDENT, 0); }
		public CssIdentNodeContext(CssContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssIdentNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssIdentNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssIdentNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssNumberNodeContext extends CssContentContext {
		public TerminalNode CSS_NUMBER() { return getToken(WebTemplateParser.CSS_NUMBER, 0); }
		public CssNumberNodeContext(CssContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssNumberNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssNumberNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssNumberNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssParenOpenNodeContext extends CssContentContext {
		public TerminalNode CSS_PAREN_OPEN() { return getToken(WebTemplateParser.CSS_PAREN_OPEN, 0); }
		public CssParenOpenNodeContext(CssContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssParenOpenNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssParenOpenNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssParenOpenNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssOpenBraceNodeContext extends CssContentContext {
		public TerminalNode CSS_OPEN_BRACE() { return getToken(WebTemplateParser.CSS_OPEN_BRACE, 0); }
		public CssOpenBraceNodeContext(CssContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssOpenBraceNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssOpenBraceNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssOpenBraceNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssCommaNodeContext extends CssContentContext {
		public TerminalNode CSS_COMMA() { return getToken(WebTemplateParser.CSS_COMMA, 0); }
		public CssCommaNodeContext(CssContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssCommaNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssCommaNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssCommaNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssSelClassNodeContext extends CssContentContext {
		public TerminalNode CSS_SEL_CLASS() { return getToken(WebTemplateParser.CSS_SEL_CLASS, 0); }
		public CssSelClassNodeContext(CssContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssSelClassNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssSelClassNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssSelClassNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssCombinatorNodeContext extends CssContentContext {
		public TerminalNode CSS_COMBINATOR() { return getToken(WebTemplateParser.CSS_COMBINATOR, 0); }
		public CssCombinatorNodeContext(CssContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssCombinatorNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssCombinatorNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssCombinatorNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssPseudoNodeContext extends CssContentContext {
		public TerminalNode CSS_PSEUDO() { return getToken(WebTemplateParser.CSS_PSEUDO, 0); }
		public CssPseudoNodeContext(CssContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssPseudoNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssPseudoNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssPseudoNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssDimensionNodeContext extends CssContentContext {
		public TerminalNode CSS_DIMENSION() { return getToken(WebTemplateParser.CSS_DIMENSION, 0); }
		public CssDimensionNodeContext(CssContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssDimensionNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssDimensionNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssDimensionNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssStringSingleNodeContext extends CssContentContext {
		public TerminalNode CSS_STRING_SINGLE() { return getToken(WebTemplateParser.CSS_STRING_SINGLE, 0); }
		public CssStringSingleNodeContext(CssContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssStringSingleNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssStringSingleNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssStringSingleNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssColonNodeContext extends CssContentContext {
		public TerminalNode CSS_COLON() { return getToken(WebTemplateParser.CSS_COLON, 0); }
		public CssColonNodeContext(CssContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssColonNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssColonNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssColonNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssAttrSelectorNodeContext extends CssContentContext {
		public TerminalNode CSS_ATTRIBUTE_SELECTOR() { return getToken(WebTemplateParser.CSS_ATTRIBUTE_SELECTOR, 0); }
		public CssAttrSelectorNodeContext(CssContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssAttrSelectorNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssAttrSelectorNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssAttrSelectorNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssStringDoubleNodeContext extends CssContentContext {
		public TerminalNode CSS_STRING_DOUBLE() { return getToken(WebTemplateParser.CSS_STRING_DOUBLE, 0); }
		public CssStringDoubleNodeContext(CssContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterCssStringDoubleNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitCssStringDoubleNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitCssStringDoubleNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssContentContext cssContent() throws RecognitionException {
		CssContentContext _localctx = new CssContentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cssContent);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_OPEN_BRACE:
				_localctx = new CssOpenBraceNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(CSS_OPEN_BRACE);
				}
				break;
			case CSS_CLOSE_BRACE:
				_localctx = new CssCloseBraceNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(CSS_CLOSE_BRACE);
				}
				break;
			case CSS_COLON:
				_localctx = new CssColonNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				match(CSS_COLON);
				}
				break;
			case CSS_SEMI:
				_localctx = new CssSemiNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				match(CSS_SEMI);
				}
				break;
			case CSS_COMMA:
				_localctx = new CssCommaNodeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				match(CSS_COMMA);
				}
				break;
			case CSS_PAREN_OPEN:
				_localctx = new CssParenOpenNodeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(166);
				match(CSS_PAREN_OPEN);
				}
				break;
			case CSS_PAREN_CLOSE:
				_localctx = new CssParenCloseNodeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(167);
				match(CSS_PAREN_CLOSE);
				}
				break;
			case CSS_COMBINATOR:
				_localctx = new CssCombinatorNodeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(168);
				match(CSS_COMBINATOR);
				}
				break;
			case CSS_SEL_ID:
				_localctx = new CssSelIdNodeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(169);
				match(CSS_SEL_ID);
				}
				break;
			case CSS_SEL_CLASS:
				_localctx = new CssSelClassNodeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(170);
				match(CSS_SEL_CLASS);
				}
				break;
			case CSS_ATTRIBUTE_SELECTOR:
				_localctx = new CssAttrSelectorNodeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(171);
				match(CSS_ATTRIBUTE_SELECTOR);
				}
				break;
			case CSS_PSEUDO:
				_localctx = new CssPseudoNodeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(172);
				match(CSS_PSEUDO);
				}
				break;
			case CSS_AT_RULE:
				_localctx = new CssAtRuleNodeContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(173);
				match(CSS_AT_RULE);
				}
				break;
			case CSS_IDENT:
				_localctx = new CssIdentNodeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(174);
				match(CSS_IDENT);
				}
				break;
			case CSS_NUMBER:
				_localctx = new CssNumberNodeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(175);
				match(CSS_NUMBER);
				}
				break;
			case CSS_PERCENTAGE:
				_localctx = new CssPercentageNodeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(176);
				match(CSS_PERCENTAGE);
				}
				break;
			case CSS_DIMENSION:
				_localctx = new CssDimensionNodeContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(177);
				match(CSS_DIMENSION);
				}
				break;
			case CSS_HASH_COLOR:
				_localctx = new CssHashColorNodeContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(178);
				match(CSS_HASH_COLOR);
				}
				break;
			case CSS_STRING_DOUBLE:
				_localctx = new CssStringDoubleNodeContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(179);
				match(CSS_STRING_DOUBLE);
				}
				break;
			case CSS_STRING_SINGLE:
				_localctx = new CssStringSingleNodeContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(180);
				match(CSS_STRING_SINGLE);
				}
				break;
			case CSS_URL:
				_localctx = new CssUrlNodeContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(181);
				match(CSS_URL);
				}
				break;
			case CSS_FUNCTION:
				_localctx = new CssFunctionNodeContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(182);
				match(CSS_FUNCTION);
				}
				break;
			case CSS_OTHER:
				_localctx = new CssOtherNodeContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(183);
				match(CSS_OTHER);
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
	public static class JinjaIfBlockNodeContext extends JinjaBlockContext {
		public JinjaIfContext jinjaIf() {
			return getRuleContext(JinjaIfContext.class,0);
		}
		public JinjaIfBlockNodeContext(JinjaBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaIfBlockNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaIfBlockNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaIfBlockNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExprBlockNodeContext extends JinjaBlockContext {
		public JinjaExprContext jinjaExpr() {
			return getRuleContext(JinjaExprContext.class,0);
		}
		public JinjaExprBlockNodeContext(JinjaBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaExprBlockNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaExprBlockNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaExprBlockNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaGenericBlockNodeContext extends JinjaBlockContext {
		public GenericJinjaStmtContext genericJinjaStmt() {
			return getRuleContext(GenericJinjaStmtContext.class,0);
		}
		public JinjaGenericBlockNodeContext(JinjaBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaGenericBlockNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaGenericBlockNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaGenericBlockNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaCommentBlockNodeContext extends JinjaBlockContext {
		public JinjaCommentContext jinjaComment() {
			return getRuleContext(JinjaCommentContext.class,0);
		}
		public JinjaCommentBlockNodeContext(JinjaBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaCommentBlockNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaCommentBlockNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaCommentBlockNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaForBlockNodeContext extends JinjaBlockContext {
		public JinjaForContext jinjaFor() {
			return getRuleContext(JinjaForContext.class,0);
		}
		public JinjaForBlockNodeContext(JinjaBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaForBlockNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaForBlockNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaForBlockNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaBlockContext jinjaBlock() throws RecognitionException {
		JinjaBlockContext _localctx = new JinjaBlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_jinjaBlock);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new JinjaIfBlockNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				jinjaIf();
				}
				break;
			case 2:
				_localctx = new JinjaForBlockNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				jinjaFor();
				}
				break;
			case 3:
				_localctx = new JinjaGenericBlockNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				genericJinjaStmt();
				}
				break;
			case 4:
				_localctx = new JinjaExprBlockNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				jinjaExpr();
				}
				break;
			case 5:
				_localctx = new JinjaCommentBlockNodeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
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
	public static class JinjaIfNodeContext extends JinjaIfContext {
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(WebTemplateParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(WebTemplateParser.JINJA_STMT_START, i);
		}
		public TerminalNode JSTMT_IF() { return getToken(WebTemplateParser.JSTMT_IF, 0); }
		public TerminalNode JINJA_STMT_CONTENT() { return getToken(WebTemplateParser.JINJA_STMT_CONTENT, 0); }
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
		public JinjaIfNodeContext(JinjaIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaIfNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaIfNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaIfNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaIfContext jinjaIf() throws RecognitionException {
		JinjaIfContext _localctx = new JinjaIfContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jinjaIf);
		try {
			int _alt;
			_localctx = new JinjaIfNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(JINJA_STMT_START);
			setState(194);
			match(JSTMT_IF);
			setState(195);
			match(JINJA_STMT_CONTENT);
			setState(196);
			match(JSTMT_END);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197);
					element();
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(203);
					jinjaElif();
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(209);
				jinjaElse();
				}
				break;
			}
			setState(212);
			match(JINJA_STMT_START);
			setState(213);
			match(JSTMT_ENDIF);
			setState(214);
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
	public static class JinjaElifNodeContext extends JinjaElifContext {
		public TerminalNode JINJA_STMT_START() { return getToken(WebTemplateParser.JINJA_STMT_START, 0); }
		public TerminalNode JSTMT_ELIF() { return getToken(WebTemplateParser.JSTMT_ELIF, 0); }
		public TerminalNode JINJA_STMT_CONTENT() { return getToken(WebTemplateParser.JINJA_STMT_CONTENT, 0); }
		public TerminalNode JSTMT_END() { return getToken(WebTemplateParser.JSTMT_END, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public JinjaElifNodeContext(JinjaElifContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaElifNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaElifNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaElifNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaElifContext jinjaElif() throws RecognitionException {
		JinjaElifContext _localctx = new JinjaElifContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jinjaElif);
		try {
			int _alt;
			_localctx = new JinjaElifNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(JINJA_STMT_START);
			setState(217);
			match(JSTMT_ELIF);
			setState(218);
			match(JINJA_STMT_CONTENT);
			setState(219);
			match(JSTMT_END);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(220);
					element();
					}
					} 
				}
				setState(225);
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
	public static class JinjaElseNodeContext extends JinjaElseContext {
		public TerminalNode JINJA_STMT_START() { return getToken(WebTemplateParser.JINJA_STMT_START, 0); }
		public TerminalNode JSTMT_ELSE() { return getToken(WebTemplateParser.JSTMT_ELSE, 0); }
		public TerminalNode JSTMT_END() { return getToken(WebTemplateParser.JSTMT_END, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public JinjaElseNodeContext(JinjaElseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaElseNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaElseNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaElseNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaElseContext jinjaElse() throws RecognitionException {
		JinjaElseContext _localctx = new JinjaElseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_jinjaElse);
		try {
			int _alt;
			_localctx = new JinjaElseNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(JINJA_STMT_START);
			setState(227);
			match(JSTMT_ELSE);
			setState(228);
			match(JSTMT_END);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(229);
					element();
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
	public static class JinjaForNodeContext extends JinjaForContext {
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(WebTemplateParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(WebTemplateParser.JINJA_STMT_START, i);
		}
		public TerminalNode JSTMT_FOR() { return getToken(WebTemplateParser.JSTMT_FOR, 0); }
		public TerminalNode JINJA_STMT_CONTENT() { return getToken(WebTemplateParser.JINJA_STMT_CONTENT, 0); }
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
		public JinjaForNodeContext(JinjaForContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaForNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaForNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaForNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaForContext jinjaFor() throws RecognitionException {
		JinjaForContext _localctx = new JinjaForContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jinjaFor);
		try {
			int _alt;
			_localctx = new JinjaForNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(JINJA_STMT_START);
			setState(236);
			match(JSTMT_FOR);
			setState(237);
			match(JINJA_STMT_CONTENT);
			setState(238);
			match(JSTMT_END);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(239);
					element();
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(245);
			match(JINJA_STMT_START);
			setState(246);
			match(JSTMT_ENDFOR);
			setState(247);
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
	public static class GenericJinjaStmtContext extends ParserRuleContext {
		public GenericJinjaStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericJinjaStmt; }
	 
		public GenericJinjaStmtContext() { }
		public void copyFrom(GenericJinjaStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaGenericStmtNodeContext extends GenericJinjaStmtContext {
		public TerminalNode JINJA_STMT_START() { return getToken(WebTemplateParser.JINJA_STMT_START, 0); }
		public TerminalNode JINJA_STMT_CONTENT() { return getToken(WebTemplateParser.JINJA_STMT_CONTENT, 0); }
		public TerminalNode JSTMT_END() { return getToken(WebTemplateParser.JSTMT_END, 0); }
		public JinjaGenericStmtNodeContext(GenericJinjaStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaGenericStmtNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaGenericStmtNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaGenericStmtNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericJinjaStmtContext genericJinjaStmt() throws RecognitionException {
		GenericJinjaStmtContext _localctx = new GenericJinjaStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_genericJinjaStmt);
		try {
			_localctx = new JinjaGenericStmtNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(JINJA_STMT_START);
			setState(250);
			match(JINJA_STMT_CONTENT);
			setState(251);
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
	public static class JinjaExprNodeContext extends JinjaExprContext {
		public TerminalNode JINJA_EXPR_START() { return getToken(WebTemplateParser.JINJA_EXPR_START, 0); }
		public TerminalNode JINJA_EXPR_CONTENT() { return getToken(WebTemplateParser.JINJA_EXPR_CONTENT, 0); }
		public TerminalNode JEXPR_END() { return getToken(WebTemplateParser.JEXPR_END, 0); }
		public JinjaExprNodeContext(JinjaExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaExprNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaExprNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaExprNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExprContext jinjaExpr() throws RecognitionException {
		JinjaExprContext _localctx = new JinjaExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jinjaExpr);
		try {
			_localctx = new JinjaExprNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(JINJA_EXPR_START);
			setState(254);
			match(JINJA_EXPR_CONTENT);
			setState(255);
			match(JEXPR_END);
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
	public static class JinjaCommentNodeContext extends JinjaCommentContext {
		public TerminalNode JINJA_COMMENT_START() { return getToken(WebTemplateParser.JINJA_COMMENT_START, 0); }
		public TerminalNode JINJA_COMMENT_CONTENT() { return getToken(WebTemplateParser.JINJA_COMMENT_CONTENT, 0); }
		public JinjaCommentNodeContext(JinjaCommentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterJinjaCommentNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitJinjaCommentNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitJinjaCommentNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaCommentContext jinjaComment() throws RecognitionException {
		JinjaCommentContext _localctx = new JinjaCommentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_jinjaComment);
		int _la;
		try {
			_localctx = new JinjaCommentNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(JINJA_COMMENT_START);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_COMMENT_CONTENT) {
				{
				setState(258);
				match(JINJA_COMMENT_CONTENT);
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
	public static class TextContentNodeContext extends TextNodeContext {
		public TerminalNode HTML_TEXT() { return getToken(WebTemplateParser.HTML_TEXT, 0); }
		public TextContentNodeContext(TextNodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).enterTextContentNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebTemplateParserListener ) ((WebTemplateParserListener)listener).exitTextContentNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebTemplateParserVisitor ) return ((WebTemplateParserVisitor<? extends T>)visitor).visitTextContentNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextNodeContext textNode() throws RecognitionException {
		TextNodeContext _localctx = new TextNodeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_textNode);
		try {
			_localctx = new TextContentNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(HTML_TEXT);
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
		"\u0004\u0001N\u0108\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"3\b\u0001\u0001\u0002\u0001\u0002\u0005\u00027\b\u0002\n\u0002\f\u0002"+
		":\t\u0002\u0001\u0002\u0003\u0002=\b\u0002\u0001\u0002\u0003\u0002@\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0005\u0003D\b\u0003\n\u0003\f\u0003G\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003L\b\u0003\n\u0003"+
		"\f\u0003O\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003T\b\u0003"+
		"\n\u0003\f\u0003W\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"\\\b\u0003\n\u0003\f\u0003_\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003d\b\u0003\n\u0003\f\u0003g\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003l\b\u0003\n\u0003\f\u0003o\t\u0003\u0001\u0003"+
		"\u0003\u0003r\b\u0003\u0001\u0004\u0001\u0004\u0005\u0004v\b\u0004\n\u0004"+
		"\f\u0004y\t\u0004\u0001\u0004\u0003\u0004|\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u0080\b\u0004\n\u0004\f\u0004\u0083\t\u0004\u0001\u0004\u0003"+
		"\u0004\u0086\b\u0004\u0003\u0004\u0088\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u008f\b\u0006\u0001\u0006"+
		"\u0003\u0006\u0092\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0097\b\u0007\u0001\b\u0001\b\u0005\b\u009b\b\b\n\b\f\b\u009e\t\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00b9\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00c0\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00c7\b\u000b\n"+
		"\u000b\f\u000b\u00ca\t\u000b\u0001\u000b\u0005\u000b\u00cd\b\u000b\n\u000b"+
		"\f\u000b\u00d0\t\u000b\u0001\u000b\u0003\u000b\u00d3\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u00de\b\f\n\f\f\f\u00e1\t\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0005\r\u00e7\b\r\n\r\f\r\u00ea\t\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u00f1\b\u000e\n\u000e\f\u000e\u00f4"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u0104\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0000\u0000\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0000\u0131"+
		"\u0000)\u0001\u0000\u0000\u0000\u00022\u0001\u0000\u0000\u0000\u0004?"+
		"\u0001\u0000\u0000\u0000\u0006q\u0001\u0000\u0000\u0000\b\u0087\u0001"+
		"\u0000\u0000\u0000\n\u0089\u0001\u0000\u0000\u0000\f\u0091\u0001\u0000"+
		"\u0000\u0000\u000e\u0096\u0001\u0000\u0000\u0000\u0010\u0098\u0001\u0000"+
		"\u0000\u0000\u0012\u00b8\u0001\u0000\u0000\u0000\u0014\u00bf\u0001\u0000"+
		"\u0000\u0000\u0016\u00c1\u0001\u0000\u0000\u0000\u0018\u00d8\u0001\u0000"+
		"\u0000\u0000\u001a\u00e2\u0001\u0000\u0000\u0000\u001c\u00eb\u0001\u0000"+
		"\u0000\u0000\u001e\u00f9\u0001\u0000\u0000\u0000 \u00fd\u0001\u0000\u0000"+
		"\u0000\"\u0101\u0001\u0000\u0000\u0000$\u0105\u0001\u0000\u0000\u0000"+
		"&(\u0003\u0002\u0001\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000,-\u0005\u0000\u0000\u0001-\u0001"+
		"\u0001\u0000\u0000\u0000.3\u0003\u0004\u0002\u0000/3\u0003\u0010\b\u0000"+
		"03\u0003\u0014\n\u000013\u0003$\u0012\u00002.\u0001\u0000\u0000\u0000"+
		"2/\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000021\u0001\u0000\u0000"+
		"\u00003\u0003\u0001\u0000\u0000\u000048\u0003\u0006\u0003\u000057\u0003"+
		"\u0002\u0001\u000065\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u0000"+
		"86\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009<\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000;=\u0003\n\u0005\u0000<;\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000>@\u0003\b\u0004"+
		"\u0000?4\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@\u0005\u0001"+
		"\u0000\u0000\u0000AE\u0005\u0007\u0000\u0000BD\u0003\f\u0006\u0000CB\u0001"+
		"\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000Hr\u0005\"\u0000\u0000IM\u0005\b\u0000\u0000JL\u0003\f\u0006\u0000"+
		"KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000Pr\u0005\"\u0000\u0000QU\u0005\t\u0000\u0000RT\u0003\f\u0006"+
		"\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000"+
		"\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000WU\u0001"+
		"\u0000\u0000\u0000Xr\u0005\"\u0000\u0000Y]\u0005\n\u0000\u0000Z\\\u0003"+
		"\f\u0006\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000]["+
		"\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000`r\u0005\"\u0000\u0000ae\u0005\u000b\u0000"+
		"\u0000bd\u0003\f\u0006\u0000cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000hr\u0005\"\u0000\u0000im\u0005\f"+
		"\u0000\u0000jl\u0003\f\u0006\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pr\u0005\"\u0000\u0000qA\u0001"+
		"\u0000\u0000\u0000qI\u0001\u0000\u0000\u0000qQ\u0001\u0000\u0000\u0000"+
		"qY\u0001\u0000\u0000\u0000qa\u0001\u0000\u0000\u0000qi\u0001\u0000\u0000"+
		"\u0000r\u0007\u0001\u0000\u0000\u0000sw\u0005\u0005\u0000\u0000tv\u0003"+
		"\f\u0006\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000z|\u0005!\u0000\u0000{z\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|\u0088\u0001\u0000\u0000\u0000}\u0081\u0005"+
		"\u0006\u0000\u0000~\u0080\u0003\f\u0006\u0000\u007f~\u0001\u0000\u0000"+
		"\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0086\u0005!\u0000\u0000"+
		"\u0085\u0084\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000"+
		"\u0086\u0088\u0001\u0000\u0000\u0000\u0087s\u0001\u0000\u0000\u0000\u0087"+
		"}\u0001\u0000\u0000\u0000\u0088\t\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005\r\u0000\u0000\u008a\u000b\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		"\u001f\u0000\u0000\u008c\u008e\u0005 \u0000\u0000\u008d\u008f\u0003\u000e"+
		"\u0007\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u0092\u0005#\u0000"+
		"\u0000\u0091\u008b\u0001\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\r\u0001\u0000\u0000\u0000\u0093\u0097\u0005$\u0000\u0000"+
		"\u0094\u0097\u0005%\u0000\u0000\u0095\u0097\u0005&\u0000\u0000\u0096\u0093"+
		"\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0095"+
		"\u0001\u0000\u0000\u0000\u0097\u000f\u0001\u0000\u0000\u0000\u0098\u009c"+
		"\u0005\u0004\u0000\u0000\u0099\u009b\u0003\u0012\t\u0000\u009a\u0099\u0001"+
		"\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0001"+
		"\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0005"+
		"\'\u0000\u0000\u00a0\u0011\u0001\u0000\u0000\u0000\u00a1\u00b9\u0005*"+
		"\u0000\u0000\u00a2\u00b9\u0005+\u0000\u0000\u00a3\u00b9\u0005,\u0000\u0000"+
		"\u00a4\u00b9\u0005-\u0000\u0000\u00a5\u00b9\u0005.\u0000\u0000\u00a6\u00b9"+
		"\u0005/\u0000\u0000\u00a7\u00b9\u00050\u0000\u0000\u00a8\u00b9\u00051"+
		"\u0000\u0000\u00a9\u00b9\u00052\u0000\u0000\u00aa\u00b9\u00053\u0000\u0000"+
		"\u00ab\u00b9\u00054\u0000\u0000\u00ac\u00b9\u00055\u0000\u0000\u00ad\u00b9"+
		"\u00056\u0000\u0000\u00ae\u00b9\u0005>\u0000\u0000\u00af\u00b9\u00057"+
		"\u0000\u0000\u00b0\u00b9\u00058\u0000\u0000\u00b1\u00b9\u00059\u0000\u0000"+
		"\u00b2\u00b9\u0005N\u0000\u0000\u00b3\u00b9\u0005:\u0000\u0000\u00b4\u00b9"+
		"\u0005;\u0000\u0000\u00b5\u00b9\u0005<\u0000\u0000\u00b6\u00b9\u0005="+
		"\u0000\u0000\u00b7\u00b9\u0005?\u0000\u0000\u00b8\u00a1\u0001\u0000\u0000"+
		"\u0000\u00b8\u00a2\u0001\u0000\u0000\u0000\u00b8\u00a3\u0001\u0000\u0000"+
		"\u0000\u00b8\u00a4\u0001\u0000\u0000\u0000\u00b8\u00a5\u0001\u0000\u0000"+
		"\u0000\u00b8\u00a6\u0001\u0000\u0000\u0000\u00b8\u00a7\u0001\u0000\u0000"+
		"\u0000\u00b8\u00a8\u0001\u0000\u0000\u0000\u00b8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00b8\u00aa\u0001\u0000\u0000\u0000\u00b8\u00ab\u0001\u0000\u0000"+
		"\u0000\u00b8\u00ac\u0001\u0000\u0000\u0000\u00b8\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b8\u00ae\u0001\u0000\u0000\u0000\u00b8\u00af\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b0\u0001\u0000\u0000\u0000\u00b8\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b2\u0001\u0000\u0000\u0000\u00b8\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b4\u0001\u0000\u0000\u0000\u00b8\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b9\u0013\u0001\u0000\u0000\u0000\u00ba\u00c0\u0003\u0016\u000b"+
		"\u0000\u00bb\u00c0\u0003\u001c\u000e\u0000\u00bc\u00c0\u0003\u001e\u000f"+
		"\u0000\u00bd\u00c0\u0003 \u0010\u0000\u00be\u00c0\u0003\"\u0011\u0000"+
		"\u00bf\u00ba\u0001\u0000\u0000\u0000\u00bf\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bf\u00bc\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u0015\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0005\u0002\u0000\u0000\u00c2\u00c3\u0005D\u0000\u0000\u00c3"+
		"\u00c4\u0005M\u0000\u0000\u00c4\u00c8\u0005K\u0000\u0000\u00c5\u00c7\u0003"+
		"\u0002\u0001\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ce\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cd\u0003\u0018\f\u0000\u00cc\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d3\u0003\u001a"+
		"\r\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u0002\u0000"+
		"\u0000\u00d5\u00d6\u0005G\u0000\u0000\u00d6\u00d7\u0005K\u0000\u0000\u00d7"+
		"\u0017\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u0002\u0000\u0000\u00d9"+
		"\u00da\u0005E\u0000\u0000\u00da\u00db\u0005M\u0000\u0000\u00db\u00df\u0005"+
		"K\u0000\u0000\u00dc\u00de\u0003\u0002\u0001\u0000\u00dd\u00dc\u0001\u0000"+
		"\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u0019\u0001\u0000"+
		"\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u0002"+
		"\u0000\u0000\u00e3\u00e4\u0005F\u0000\u0000\u00e4\u00e8\u0005K\u0000\u0000"+
		"\u00e5\u00e7\u0003\u0002\u0001\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u001b\u0001\u0000\u0000\u0000"+
		"\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u0002\u0000\u0000"+
		"\u00ec\u00ed\u0005H\u0000\u0000\u00ed\u00ee\u0005M\u0000\u0000\u00ee\u00f2"+
		"\u0005K\u0000\u0000\u00ef\u00f1\u0003\u0002\u0001\u0000\u00f0\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005"+
		"\u0002\u0000\u0000\u00f6\u00f7\u0005I\u0000\u0000\u00f7\u00f8\u0005K\u0000"+
		"\u0000\u00f8\u001d\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u0002\u0000"+
		"\u0000\u00fa\u00fb\u0005M\u0000\u0000\u00fb\u00fc\u0005K\u0000\u0000\u00fc"+
		"\u001f\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u0001\u0000\u0000\u00fe"+
		"\u00ff\u0005C\u0000\u0000\u00ff\u0100\u0005A\u0000\u0000\u0100!\u0001"+
		"\u0000\u0000\u0000\u0101\u0103\u0005\u0003\u0000\u0000\u0102\u0104\u0005"+
		"@\u0000\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000"+
		"\u0000\u0000\u0104#\u0001\u0000\u0000\u0000\u0105\u0106\u0005\u001b\u0000"+
		"\u0000\u0106%\u0001\u0000\u0000\u0000\u001e)28<?EMU]emqw{\u0081\u0085"+
		"\u0087\u008e\u0091\u0096\u009c\u00b8\u00bf\u00c8\u00ce\u00d2\u00df\u00e8"+
		"\u00f2\u0103";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}