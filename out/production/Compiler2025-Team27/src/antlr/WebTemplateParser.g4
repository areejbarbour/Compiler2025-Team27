parser grammar WebTemplateParser;

options { tokenVocab=WebTemplateLexer; }


document
    : element* EOF                                           #DocumentRootNode
    ;

element
    : htmlElement                                            #ElementHtmlNode
    | cssBlock                                               #ElementCssNode
    | jinjaBlock                                             #ElementJinjaNode
    | textNode                                               #ElementTextNode
    ;


htmlElement
    : htmlOpenTag element* htmlCloseTag?                     #HtmlElementNode
    | htmlSelfClose                                          #HtmlSelfClosingNode
    ;

htmlOpenTag
    : HTML_TAG_DIV_OPEN    attribute* HTML_TAG_END_MODE      #HtmlOpenDivNode
    | HTML_TAG_SPAN_OPEN   attribute* HTML_TAG_END_MODE      #HtmlOpenSpanNode
    | HTML_TAG_P_OPEN      attribute* HTML_TAG_END_MODE      #HtmlOpenPNode
    | HTML_TAG_H1_OPEN     attribute* HTML_TAG_END_MODE      #HtmlOpenH1Node
    | HTML_TAG_H2_OPEN     attribute* HTML_TAG_END_MODE      #HtmlOpenH2Node
    | HTML_TAG_BUTTON_OPEN attribute* HTML_TAG_END_MODE      #HtmlOpenButtonNode
    ;

htmlSelfClose
    : HTML_TAG_IMG_OPEN   attribute* HTML_SELF_CLOSE?        #HtmlSelfCloseImgNode
    | HTML_TAG_INPUT_OPEN attribute* HTML_SELF_CLOSE?        #HtmlSelfCloseInputNode
    ;

htmlCloseTag
    : HTML_TAG_CLOSE                                         #HtmlCloseTagNode
    ;

attribute
    : HTML_ATTR_NAME_KEY HTML_ATTR_EQ_MODE attrValue?       #AttrNamedNode
    | HTML_TAG_TEXT                                         #AttrTextNode
    ;

attrValue
    : HTML_ATTR_VALUE_DOUBLE                                 #AttrValueDoubleQuotedNode
    | HTML_ATTR_VALUE_SINGLE                                 #AttrValueSingleQuotedNode
    | HTML_ATTR_VALUE_UNQUOTED                               #AttrValueUnquotedNode
    ;

cssBlock
    : HTML_STYLE_OPEN cssContent* CSS_STYLE_CLOSE            #CssBlockNode
    ;

cssContent
    : CSS_OPEN_BRACE                #CssOpenBraceNode
    | CSS_CLOSE_BRACE               #CssCloseBraceNode
    | CSS_COLON                     #CssColonNode
    | CSS_SEMI                      #CssSemiNode
    | CSS_COMMA                     #CssCommaNode
    | CSS_PAREN_OPEN                #CssParenOpenNode
    | CSS_PAREN_CLOSE               #CssParenCloseNode
    | CSS_COMBINATOR                #CssCombinatorNode
    | CSS_SEL_ID                     #CssSelIdNode
    | CSS_SEL_CLASS                  #CssSelClassNode
    | CSS_ATTRIBUTE_SELECTOR         #CssAttrSelectorNode
    | CSS_PSEUDO                     #CssPseudoNode
    | CSS_AT_RULE                     #CssAtRuleNode
    | CSS_IDENT                       #CssIdentNode
    | CSS_NUMBER                      #CssNumberNode
    | CSS_PERCENTAGE                  #CssPercentageNode
    | CSS_DIMENSION                   #CssDimensionNode
    | CSS_HASH_COLOR                  #CssHashColorNode
    | CSS_STRING_DOUBLE               #CssStringDoubleNode
    | CSS_STRING_SINGLE               #CssStringSingleNode
    | CSS_URL                          #CssUrlNode
    | CSS_FUNCTION                     #CssFunctionNode
    | CSS_OTHER                        #CssOtherNode
    ;

jinjaBlock
    : jinjaIf                        #JinjaIfBlockNode
    | jinjaFor                       #JinjaForBlockNode
    | genericJinjaStmt               #JinjaGenericBlockNode
    | jinjaExpr                      #JinjaExprBlockNode
    | jinjaComment                   #JinjaCommentBlockNode
    ;

jinjaIf
    : JINJA_STMT_START JSTMT_IF JINJA_STMT_CONTENT JSTMT_END
      element*
      jinjaElif*
      jinjaElse?
      JINJA_STMT_START JSTMT_ENDIF JSTMT_END
      #JinjaIfNode
    ;

jinjaElif
    : JINJA_STMT_START JSTMT_ELIF JINJA_STMT_CONTENT JSTMT_END
      element*
      #JinjaElifNode
    ;

jinjaElse
    : JINJA_STMT_START JSTMT_ELSE JSTMT_END
      element*
      #JinjaElseNode
    ;

jinjaFor
    : JINJA_STMT_START JSTMT_FOR JINJA_STMT_CONTENT JSTMT_END
      element*
      JINJA_STMT_START JSTMT_ENDFOR JSTMT_END
      #JinjaForNode
    ;

genericJinjaStmt
    : JINJA_STMT_START JINJA_STMT_CONTENT JSTMT_END
      #JinjaGenericStmtNode
    ;

jinjaExpr
    : JINJA_EXPR_START JINJA_EXPR_CONTENT JEXPR_END
      #JinjaExprNode
    ;

jinjaComment
    : JINJA_COMMENT_START JINJA_COMMENT_CONTENT?
      #JinjaCommentNode
    ;

textNode
    : HTML_TEXT
      #TextContentNode
    ;
