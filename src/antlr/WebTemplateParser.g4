parser grammar WebTemplateParser;

options { tokenVocab = WebTemplateLexer; }

/* =========================   ROOT   ========================= */

document
    : element* EOF                   # DocumentRoot
    ;

/* =========================   ELEMENTS   ========================= */

element
    : htmlElement                    # ElementHtml
    | cssBlock                       # ElementCss
    | jinjaBlock                     # ElementJinja
    | textNode                       # ElementText
    ;

/* =========================   HTML   ========================= */

htmlElement
    : htmlVoidTag                    # HtmlElementVoid
    | htmlOpenTag element* htmlCloseTag    # HtmlElementContainer
    | htmlSelfCloseTag               # HtmlElementSelfClosing
    ;

htmlVoidTag
    : HTML_OPEN_TAG_START VOID_TAG_NAME tagAttribute* TAG_END   # HtmlVoidTagFull
    ;

htmlOpenTag
    : HTML_OPEN_TAG_START TAG_NAME tagAttribute* TAG_END        # HtmlOpenTagFull
    ;

htmlSelfCloseTag
    : HTML_OPEN_TAG_START (TAG_NAME | VOID_TAG_NAME) tagAttribute* TAG_SELF_CLOSE   # HtmlSelfClosingTagFull
    ;

htmlCloseTag
    : HTML_CLOSE_TAG                       # HtmlCloseTagFull
    ;

tagAttribute
    : TAG_ATTR_NAME TAG_EQ attrValue       # HtmlAttributeWithValue
    | TAG_ATTR_NAME                        # HtmlAttributeBoolean
    ;

attrValue
    : ATTR_VALUE_DOUBLE                    # AttrValueDouble
    | ATTR_VALUE_SINGLE                    # AttrValueSingle
    | ATTR_VALUE_UNQUOTED                  # AttrValueUnquoted
    ;

/* =========================   CSS   ========================= */

cssBlock
    : STYLE_OPEN styleAttribute* STYLE_TAG_END (cssRule | mediaRule)* CSS_CLOSE    # CssBlockWithContent
    | STYLE_OPEN styleAttribute* STYLE_SELF_CLOSE                                  # CssBlockSelfClosed
    ;

styleAttribute
    : STYLE_ATTR_NAME STYLE_EQ attrValue    # StyleAttributeWithValue
    | STYLE_ATTR_NAME                       # StyleAttributeBoolean
    ;

cssRule
    : selector CSS_LBRACE declaration* CSS_RBRACE   # CssRuleStandard
    ;

mediaRule
    : CSS_AT_RULE mediaCondition CSS_LBRACE (cssRule | mediaRule)* CSS_RBRACE   # CssMediaRuleFull
    ;

mediaCondition
    : mediaConditionPart+    # CssMediaCondition
    ;

mediaConditionPart
    : CSS_IDENT         # MediaCondIdent
    | CSS_NUMBER        # MediaCondNumber
    | CSS_PERCENTAGE    # MediaCondPercentage
    | CSS_DIMENSION     # MediaCondDimension
    | CSS_COLON         # MediaCondColon
    | CSS_COMMA         # MediaCondComma
    | CSS_LPAREN        # MediaCondLParen
    | CSS_RPAREN        # MediaCondRParen
    | CSS_DOT           # MediaCondDot
    | CSS_HASH_IDENT    # MediaCondHash
    ;

selector
    : selectorItem (CSS_COMMA selectorItem)*    # CssSelectorList
    ;

selectorItem
    : compoundSelector+                         # CssSelectorSequence
    ;

compoundSelector
    : simpleSelector+                           # CssCompoundSelector
    ;

simpleSelector
    : CSS_IDENT             # CssTypeSelector
    | CSS_DOT CSS_IDENT     # CssClassSelector
    | CSS_HASH_IDENT        # CssIdSelector
    | CSS_COLON CSS_IDENT   # CssPseudoClass
    | CSS_STAR              # CssUniversalSelector
    ;

declaration
    : CSS_IDENT CSS_COLON cssValue+ CSS_SEMI    # CssDeclarationFull
    ;

cssValue
    : CSS_IDENT         # CssValueIdent
    | CSS_NUMBER        # CssValueNumber
    | CSS_PERCENTAGE    # CssValuePercentage
    | CSS_DIMENSION     # CssValueDimension
    | CSS_STRING        # CssValueString
    | CSS_HEX_COLOR     # CssValueHexColor
    | CSS_HASH_IDENT    # CssValueHash
    | CSS_URL           # CssValueUrl
    | CSS_LPAREN        # CssValueLParen
    | CSS_RPAREN        # CssValueRParen
    | CSS_COMMA         # CssValueComma
    | CSS_DOT           # CssValueDot
    | CSS_SLASH         # CssValueSlash
    | CSS_BANG          # CssValueImportant
    ;

/* =========================   JINJA   ========================= */

jinjaBlock
    : jinjaIf           # JinjaBlockIf
    | jinjaFor          # JinjaBlockFor
    | jinjaSet          # JinjaBlockSet
    | jinjaBlockStmt    # JinjaBlockDefinitionNode
    | jinjaExpr         # JinjaBlockExpr
    | jinjaComment      # JinjaBlockComment
    ;

jinjaIf
    : JINJA_STMT_START JSTMT_IF expr JSTMT_END
      element*
      jinjaElif*
      jinjaElse?
      JINJA_STMT_START JSTMT_ENDIF JSTMT_END    # JinjaIfFull
    ;

jinjaElif
    : JINJA_STMT_START JSTMT_ELIF expr JSTMT_END element*   # JinjaElifFull
    ;

jinjaElse
    : JINJA_STMT_START JSTMT_ELSE JSTMT_END element*        # JinjaElseFull
    ;

jinjaFor
    : JINJA_STMT_START JSTMT_FOR forTargetList JSTMT_IN expr JSTMT_END
      element*
      JINJA_STMT_START JSTMT_ENDFOR JSTMT_END   # JinjaForFull
    ;

forTargetList
    : JSTMT_IDENTIFIER (JSTMT_COMMA JSTMT_IDENTIFIER)*    # JinjaForTargetList
    ;

jinjaSet
    : JINJA_STMT_START JSTMT_SET JSTMT_IDENTIFIER JSTMT_ASSIGNMENT expr JSTMT_END    # JinjaSetFull
    ;

jinjaBlockStmt
    : JINJA_STMT_START JSTMT_BLOCK JSTMT_IDENTIFIER JSTMT_END
      element*
      JINJA_STMT_START JSTMT_ENDBLOCK JSTMT_END   # JinjaBlockFull
    ;

jinjaExpr
    : JINJA_EXPR_START expr JINJA_EXPR_END    # JinjaExpressionFull
    ;

jinjaComment
    : JINJA_COMMENT_START JINJA_COMMENT_TEXT* JINJA_COMMENT_END    # JinjaCommentFull
    ;

/* =========================   EXPRESSIONS   ========================= */

expr
    : orExpr   # ExprRoot
    ;

orExpr
    : andExpr ((JINJA_OR | JSTMT_OR) andExpr)*    # ExprOr
    ;

andExpr
    : notExpr ((JINJA_AND | JSTMT_AND) notExpr)*  # ExprAnd
    ;

notExpr
    : (JINJA_NOT | JSTMT_NOT) notExpr   # ExprNot
    | comparisonExpr                   # ExprComparisonRoot
    ;

comparisonExpr
    : additiveExpr (comparisonOp additiveExpr)*    # ExprComparison
    ;

comparisonOp
    : JINJA_COMPARISON                        # OpCompareJinja
    | JSTMT_COMPARISON                        # OpCompareStmt
    | JINJA_IN                                # OpInJinja
    | JSTMT_IN                                # OpInStmt
    | (JINJA_IS | JSTMT_IS) (JINJA_NOT | JSTMT_NOT)?    # OpIs
    | (JINJA_NOT | JSTMT_NOT) (JINJA_IN | JSTMT_IN)     # OpNotIn
    ;

additiveExpr
    : multiplicativeExpr ((JINJA_ADDITIVE | JSTMT_ADDITIVE) multiplicativeExpr)*    # ExprAdd
    ;

multiplicativeExpr
    : unaryExpr ((JINJA_MULTIPLICATIVE | JSTMT_MULTIPLICATIVE) unaryExpr)*    # ExprMul
    ;

unaryExpr
    : (JINJA_ADDITIVE | JSTMT_ADDITIVE) unaryExpr    # ExprUnary
    | postfixExpr                                   # ExprPostfixRoot
    ;

postfixExpr
    : atom postfixSuffix*                     # ExprPostfix
    ;

atom
    : JINJA_NUMBER        # AtomNumberJinja
    | JSTMT_NUMBER        # AtomNumberStmt
    | JINJA_STRING        # AtomStringJinja
    | JSTMT_STRING        # AtomStringStmt
    | JINJA_IDENTIFIER    # AtomIdJinja
    | JSTMT_IDENTIFIER    # AtomIdStmt
    | (JINJA_LPAREN | JSTMT_LPAREN) expr (JINJA_RPAREN | JSTMT_RPAREN)    # AtomParen
    ;

postfixSuffix
    : (JINJA_DOT | JSTMT_DOT) (JINJA_IDENTIFIER | JSTMT_IDENTIFIER)    # SuffixAttribute
    | (JINJA_LBRACKET | JSTMT_LBRACKET) expr (JINJA_RBRACKET | JSTMT_RBRACKET)    # SuffixIndex
    | (JINJA_LPAREN | JSTMT_LPAREN) exprList? (JINJA_RPAREN | JSTMT_RPAREN)    # SuffixCall
    | (JINJA_PIPE | JSTMT_PIPE) (JINJA_IDENTIFIER | JSTMT_IDENTIFIER)
      ((JINJA_LPAREN | JSTMT_LPAREN) exprList? (JINJA_RPAREN | JSTMT_RPAREN))?    # SuffixFilter
    ;

argument
    : JINJA_IDENTIFIER (JINJA_ASSIGNMENT | JSTMT_ASSIGNMENT) expr   # ArgNamedJinja
    | JSTMT_IDENTIFIER (JINJA_ASSIGNMENT | JSTMT_ASSIGNMENT) expr   # ArgNamedStmt
    | expr                                                         # ArgPositional
    ;

exprList
    : argument ((JINJA_COMMA | JSTMT_COMMA) argument)*   # ExprListFull
    ;

/* =========================   TEXT   ========================= */

textNode
    : HTML_TEXT+   # TextNodeFull
    ;