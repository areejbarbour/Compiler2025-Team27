lexer grammar WebTemplateLexer;

/* =========================================================
   DEFAULT MODE
========================================================= */

DOCTYPE
    : '<!' [dD] [oO] [cC] [tT] [yY] [pP] [eE]
      [ \t\r\n]+ [hH] [tT] [mM] [lL]
      [ \t\r\n]* '>' -> skip
    ;

HTML_COMMENT
    : '<!--' .*? '-->' -> skip
    ;

JINJA_COMMENT_START
    : '{#' -> pushMode(JINJA_COMMENT)
    ;

JINJA_EXPR_START
    : '{{' -> pushMode(JINJA_EXPR)
    ;

JINJA_STMT_START
    : '{%' -> pushMode(JINJA_STMT)
    ;


STYLE_OPEN
    : '<style' -> pushMode(HTML_STYLE_OPEN_MODE)
    ;


HTML_CLOSE_TAG
    : '</' [a-zA-Z][a-zA-Z0-9-]* [ \t\r\n]* '>'
    ;


HTML_OPEN_TAG_START
    : '<' -> pushMode(HTML_TAG_OPEN_MODE)
    ;


HTML_TEXT
    : ~[<{]+
    ;

/* =========================================================
   HTML TAG NAME MODE
========================================================= */

mode HTML_TAG_OPEN_MODE;


VOID_TAG_NAME
    : 'area'   { pushMode(HTML_TAG_MODE); }
    | 'base'   { pushMode(HTML_TAG_MODE); }
    | 'br'     { pushMode(HTML_TAG_MODE); }
    | 'col'    { pushMode(HTML_TAG_MODE); }
    | 'embed'  { pushMode(HTML_TAG_MODE); }
    | 'hr'     { pushMode(HTML_TAG_MODE); }
    | 'img'    { pushMode(HTML_TAG_MODE); }
    | 'input'  { pushMode(HTML_TAG_MODE); }
    | 'link'   { pushMode(HTML_TAG_MODE); }
    | 'meta'   { pushMode(HTML_TAG_MODE); }
    | 'param'  { pushMode(HTML_TAG_MODE); }
    | 'source' { pushMode(HTML_TAG_MODE); }
    | 'track'  { pushMode(HTML_TAG_MODE); }
    | 'wbr'    { pushMode(HTML_TAG_MODE); }
    ;

TAG_OPEN_WS
    : [ \t\r\n]+ -> skip
    ;

TAG_NAME
    : [a-zA-Z][a-zA-Z0-9-]* -> pushMode(HTML_TAG_MODE)
    ;

/* =========================================================
   HTML TAG BODY MODE
========================================================= */

mode HTML_TAG_MODE;

TAG_WS
    : [ \t\r\n]+ -> skip
    ;

TAG_ATTR_NAME
    : [a-zA-Z_:][a-zA-Z0-9:._-]*
    ;

TAG_EQ
    : '=' -> pushMode(HTML_ATTR_VALUE_MODE)
    ;


TAG_SELF_CLOSE
    : '/>' -> popMode, popMode
    ;

TAG_END
    : '>' -> popMode, popMode
    ;

/* =========================================================
   HTML ATTRIBUTE VALUE MODE
========================================================= */

mode HTML_ATTR_VALUE_MODE;

ATTR_VALUE_DOUBLE
    : '"' ( '\\' . | ~["\\\r\n] )* '"' -> popMode
    ;

ATTR_VALUE_SINGLE
    : '\'' ( '\\' . | ~['\\\r\n] )* '\'' -> popMode
    ;

ATTR_VALUE_UNQUOTED
    : ~[ \t\r\n"'=<>`]+ -> popMode
    ;

/* =========================================================
   STYLE OPEN MODE
========================================================= */

mode HTML_STYLE_OPEN_MODE;

STYLE_WS
    : [ \t\r\n]+ -> skip
    ;

STYLE_ATTR_NAME
    : [a-zA-Z_:][a-zA-Z0-9:._-]*
    ;

STYLE_EQ
    : '=' -> pushMode(HTML_ATTR_VALUE_MODE)
    ;

STYLE_TAG_END
    : '>' -> pushMode(CSS_MODE)
    ;

STYLE_SELF_CLOSE
    : '/>' -> popMode
    ;

/* =========================================================
   CSS MODE
========================================================= */

mode CSS_MODE;

CSS_CLOSE
    : '</style' [ \t\r\n]* '>' -> popMode, popMode
    ;

CSS_WS
    : [ \t\r\n]+ -> skip
    ;

CSS_COMMENT
    : '/*' .*? '*/' -> skip
    ;

CSS_LBRACE   : '{' ;
CSS_RBRACE   : '}' ;
CSS_LPAREN   : '(' ;
CSS_RPAREN   : ')' ;
CSS_COLON    : ':' ;
CSS_SEMI     : ';' ;
CSS_COMMA    : ',' ;
CSS_DOT      : '.' ;
CSS_TILDE    : '~' ;
CSS_PLUS     : '+' ;
CSS_STAR     : '*' ;
CSS_SLASH    : '/' ;
CSS_BANG     : '!' ;
CSS_LBRACKET : '[' ;
CSS_RBRACKET : ']' ;
CSS_GT       : '>' ;
CSS_LT       : '<' ;
CSS_EQ       : '=' ;

CSS_HEX_COLOR
    : '#' [0-9a-fA-F] [0-9a-fA-F] [0-9a-fA-F]
      ( [0-9a-fA-F] [0-9a-fA-F] [0-9a-fA-F] )?
    ;

CSS_HASH_IDENT
    : '#' [a-zA-Z_-] [a-zA-Z0-9_-]*
    ;

CSS_AT_RULE
    : '@' [a-zA-Z_-]+
    ;

CSS_NUMBER
    : [0-9]+ ('.' [0-9]+)?
    ;

CSS_PERCENTAGE
    : [0-9]+ ('.' [0-9]+)? '%'
    ;

CSS_DIMENSION
    : [0-9]+ ('.' [0-9]+)? [a-zA-Z]+
    ;

CSS_STRING
    : '"' ( '\\' . | ~["\\\r\n] )* '"'
    | '\'' ( '\\' . | ~['\\\r\n] )* '\''
    ;

CSS_URL
    : 'url(' .*? ')'
    ;

CSS_IDENT
    : [a-zA-Z_-][a-zA-Z0-9_-]*
    ;

/* =========================================================
   JINJA COMMENT MODE
========================================================= */

mode JINJA_COMMENT;

JINJA_COMMENT_END
    : '#}' -> popMode
    ;

JINJA_COMMENT_TEXT
    : ~[#}]+
    ;

/* =========================================================
   JINJA EXPRESSION MODE
========================================================= */

mode JINJA_EXPR;

JINJA_EXPR_END
    : '}}' -> popMode
    ;

JINJA_WS
    : [ \t\r\n]+ -> skip
    ;


JINJA_NOT : 'not' ;
JINJA_AND : 'and' ;
JINJA_OR  : 'or' ;
JINJA_IN  : 'in' ;
JINJA_IS  : 'is' ;

JINJA_NUMBER
    : [0-9]+ ('.' [0-9]+)?
    ;

JINJA_STRING
    : '"' ( '\\' . | ~["\\] )* '"'
    | '\'' ( '\\' . | ~['\\] )* '\''
    ;

JINJA_IDENTIFIER
    : [a-zA-Z_][a-zA-Z0-9_]*
    ;

JINJA_ASSIGNMENT
    : '='
    ;

JINJA_PIPE     : '|' ;
JINJA_DOT      : '.' ;
JINJA_LPAREN   : '(' ;
JINJA_RPAREN   : ')' ;
JINJA_COMMA    : ',' ;
JINJA_LBRACKET : '[' ;
JINJA_RBRACKET : ']' ;

JINJA_COMPARISON
    : '==' | '!=' | '>=' | '<=' | '>' | '<'
    ;

JINJA_ADDITIVE
    : '+' | '-'
    ;

JINJA_MULTIPLICATIVE
    : '*' | '/' | '%'
    ;

/* =========================================================
   JINJA STATEMENT MODE
========================================================= */

mode JINJA_STMT;

JSTMT_END
    : '%}' -> popMode
    ;

JSTMT_WS
    : [ \t\r\n]+ -> skip
    ;


JSTMT_IF       : 'if' ;
JSTMT_ELIF     : 'elif' ;
JSTMT_ELSE     : 'else' ;
JSTMT_FOR      : 'for' ;
JSTMT_IN       : 'in' ;
JSTMT_IS       : 'is' ;
JSTMT_ENDIF    : 'endif' ;
JSTMT_ENDFOR   : 'endfor' ;
JSTMT_BLOCK    : 'block' ;
JSTMT_ENDBLOCK : 'endblock' ;
JSTMT_SET      : 'set' ;
JSTMT_NOT      : 'not' ;
JSTMT_AND      : 'and' ;
JSTMT_OR       : 'or' ;

JSTMT_IDENTIFIER
    : [a-zA-Z_][a-zA-Z0-9_]*
    ;

JSTMT_NUMBER
    : [0-9]+ ('.' [0-9]+)?
    ;

JSTMT_STRING
    : '"' ( '\\' . | ~["\\] )* '"'
    | '\'' ( '\\' . | ~['\\] )* '\''
    ;

JSTMT_PIPE     : '|' ;
JSTMT_DOT      : '.' ;
JSTMT_COMMA    : ',' ;
JSTMT_LPAREN   : '(' ;
JSTMT_RPAREN   : ')' ;
JSTMT_LBRACKET : '[' ;
JSTMT_RBRACKET : ']' ;

JSTMT_COMPARISON
    : '==' | '!=' | '>=' | '<=' | '>' | '<'
    ;

JSTMT_ASSIGNMENT
    : '='
    ;

JSTMT_ADDITIVE
    : '+' | '-'
    ;

JSTMT_MULTIPLICATIVE
    : '*' | '/' | '%'
    ;