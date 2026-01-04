lexer grammar WebTemplateLexer;

@header {
  import org.antlr.v4.runtime.Token;
}
fragment LETTER  : [a-zA-Z_] ;
fragment DIGIT   : [0-9] ;
fragment WS_CHAR : [ \t\r\n] ;

JINJA_EXPR_START    : '{{' -> pushMode(JINJA_EXPR) ;
JINJA_STMT_START    : '{%' -> pushMode(JINJA_STMT) ;
JINJA_COMMENT_START : '{#' -> pushMode(JINJA_COMMENT) ;

HTML_STYLE_OPEN
    : '<' [sS][tT][yY][lL][eE] ( [ \t\r\n]+ [^>]* )? '>'
      -> pushMode(CSS_MODE)
    ;


HTML_TAG_IMG_OPEN    : '<' [iI][mM][gG] ( [ \t\r\n/>] )? -> pushMode(HTML_TAG_MODE) ;
HTML_TAG_INPUT_OPEN  : '<' [iI][nN][pP][uU][tT] ( [ \t\r\n/>] )? -> pushMode(HTML_TAG_MODE) ;

HTML_TAG_DIV_OPEN      : '<' [dD][iI][vV] ( [ \t\r\n/>] )? -> pushMode(HTML_TAG_MODE) ;
HTML_TAG_SPAN_OPEN     : '<' [sS][pP][aA][nN] ( [ \t\r\n/>] )? -> pushMode(HTML_TAG_MODE) ;
HTML_TAG_P_OPEN        : '<' [pP] ( [ \t\r\n/>] )? -> pushMode(HTML_TAG_MODE) ;
HTML_TAG_H1_OPEN       : '<' [hH][1] ( [ \t\r\n/>] )? -> pushMode(HTML_TAG_MODE) ;
HTML_TAG_H2_OPEN       : '<' [hH][2] ( [ \t\r\n/>] )? -> pushMode(HTML_TAG_MODE) ;
HTML_TAG_BUTTON_OPEN   : '<' [bB][uU][tT][tT][oO][nN] ( [ \t\r\n/>] )? -> pushMode(HTML_TAG_MODE) ;

HTML_TAG_CLOSE        : '</' [a-zA-Z][a-zA-Z0-9-]* [ \t\r\n]* '>' ;
HTML_SELF_CLOSING_TAG : '/>' ;
HTML_TAG_END          : '>' ;
HTML_ATTR_EQ          : '=' -> pushMode(HTML_ATTR_VALUE_MODE) ;

HTML_ATTR_ID      : [iI][dD];
HTML_ATTR_CLASS   : [cC][lL][aA][sS][sS];
HTML_ATTR_SRC     : [sS][rR][cC];
HTML_ATTR_HREF    : [hH][rR][eE][fF];
HTML_ATTR_ALT     : [aA][lL][tT];
HTML_ATTR_NAME    : [nN][aA][mM][eE];
HTML_ATTR_VALUE   : [vV][aA][lL][uU][eE];
HTML_ATTR_TITLE   : [tT][iI][tT][lL][eE];
HTML_ATTR_STYLE   : [sS][tT][yY][lL][eE];
HTML_ATTR_DATA    : 'data-' [a-zA-Z0-9_-]+ ;

HTML_TEXT         : (~[{<])+ ;
HTML_WS           : WS_CHAR+ -> skip ;
HTML_COMMENT      : '<!--' .*? '-->' -> skip ;

mode HTML_TAG_MODE;

TAG_WS             : WS_CHAR+ -> skip ;
HTML_ATTR_NAME_KEY  : HTML_ATTR_ID | HTML_ATTR_CLASS | HTML_ATTR_SRC | HTML_ATTR_HREF
                   | HTML_ATTR_ALT | HTML_ATTR_TITLE | HTML_ATTR_STYLE | HTML_ATTR_NAME
                   | HTML_ATTR_DATA ;
HTML_ATTR_EQ_MODE   : '=' -> pushMode(HTML_ATTR_VALUE_MODE) ;
HTML_SELF_CLOSE     : '/>' -> popMode ;
HTML_TAG_END_MODE   : '>' -> popMode ;
HTML_TAG_TEXT       : ~[ \t\r\n>]+ ;


mode HTML_ATTR_VALUE_MODE;

HTML_ATTR_VALUE_DOUBLE
  : '"' ( '\\' . | ~["\\\r\n] )* '"' -> popMode ;

HTML_ATTR_VALUE_SINGLE
  : '\'' ( '\\' . | ~['\\\r\n] )* '\'' -> popMode ;

HTML_ATTR_VALUE_UNQUOTED
  : [^ \t\r\n"'=<>`]+ -> popMode ;


mode CSS_MODE;

CSS_STYLE_CLOSE : '</' [sS][tT][yY][lL][eE] '>' -> popMode ;

CSS_WS      : WS_CHAR+ -> skip ;
CSS_COMMENT : '/*' .*? '*/' -> skip ;

CSS_OPEN_BRACE    : '{' ;
CSS_CLOSE_BRACE   : '}' ;
CSS_COLON         : ':' ;
CSS_SEMI          : ';' ;
CSS_COMMA         : ',' ;
CSS_PAREN_OPEN    : '(' ;
CSS_PAREN_CLOSE   : ')' ;
CSS_COMBINATOR    : '>' | '+' | '~' ;

CSS_SEL_ID              : '#' [a-zA-Z_][a-zA-Z0-9_-]* ;
CSS_SEL_CLASS           : '.' [a-zA-Z_][a-zA-Z0-9_-]* ;
CSS_ATTRIBUTE_SELECTOR  : '[' (~[\]] )* ']' ;
CSS_PSEUDO              : ':' ':'? [a-zA-Z_][a-zA-Z0-9_-]* ;
CSS_AT_RULE             : '@' [a-zA-Z_-]+ ;

CSS_NUMBER              : [0-9]+ ('.' [0-9]+)? ;
CSS_PERCENTAGE          : [0-9]+ ('.' [0-9]+)? '%' ;
CSS_DIMENSION           : [0-9]+ ('.' [0-9]+)? [a-zA-Z]+ ;

CSS_STRING_DOUBLE       : '"' ( '\\' . | ~["\\\r\n] )* '"' ;
CSS_STRING_SINGLE       : '\'' ( '\\' . | ~['\\\r\n] )* '\'' ;

CSS_URL
    : 'url' WS_CHAR* '(' WS_CHAR* (CSS_STRING_DOUBLE | CSS_STRING_SINGLE | (~[)\r\n])+ ) WS_CHAR* ')' ;

CSS_FUNCTION : [a-zA-Z_-][a-zA-Z0-9_-]* '(' ;

CSS_IDENT : [a-zA-Z_-][a-zA-Z0-9_-]* ;

CSS_OTHER : . ;

mode JINJA_COMMENT;
JINJA_COMMENT_CONTENT : .*? '#}' -> popMode, skip ;


mode JINJA_EXPR;
JEXPR_END             : '}}' -> popMode ;
JEXPR_WS              : WS_CHAR+ -> skip ;
JINJA_EXPR_CONTENT    : (~('}'))+ ;

mode JINJA_STMT;

JSTMT_IF      : 'if' WS_CHAR+ ;
JSTMT_ELIF    : 'elif' WS_CHAR+ ;
JSTMT_ELSE    : 'else' WS_CHAR* ;
JSTMT_ENDIF   : 'endif' ;
JSTMT_FOR     : 'for' WS_CHAR+ ;
JSTMT_ENDFOR  : 'endfor' ;
JSTMT_IN      : 'in' WS_CHAR+ ;
JSTMT_END     : '%}' -> popMode ;
JSTMT_WS      : WS_CHAR+ -> skip ;
JINJA_STMT_CONTENT : (~('%'))+ ;
