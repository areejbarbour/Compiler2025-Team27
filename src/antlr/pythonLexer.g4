lexer grammar pythonLexer;

tokens {
    INDENT,
    DEDENT
}

@lexer::members {
    java.util.Queue<Token> tokenQueue = new java.util.LinkedList<Token>();
    java.util.Stack<Integer> indentLevels = new java.util.Stack<Integer>();
    {
        indentLevels.push(0);
    }

    @Override
    public void emit(Token t) {
       super.setToken(t);
        tokenQueue.add(t);
    }

    @Override
    public Token nextToken() {
        if (!tokenQueue.isEmpty()) {
            return tokenQueue.poll();
        }

        Token next = super.nextToken();

        if (next.getType() == EOF && !indentLevels.isEmpty() && indentLevels.peek() > 0) {
            while (indentLevels.size() > 1) {
                emit(new CommonToken(DEDENT, "DEDENT"));
                indentLevels.pop();
            }
            emit(next);
            return tokenQueue.poll();
        }
        if (!tokenQueue.isEmpty()) {
            return tokenQueue.poll();
        }

        return next;
    }
}

TRUE: 'True';
FALSE: 'false';
NONE: 'None';
CM: ',';
LKB: '{';
RKB: '}';
LSB: '[';
RSB: ']';
LPAREN  : '(';
RPAREN  : ')';
COL: ':';
DOT:'.';
AT:'@';
ASSIGN: '=';
PLUS: '+';
MINUS: '-';
IF     : 'if';
FOR    : 'for';
WHILE  : 'while';
DEF    : 'def';
RETURN : 'return';
ELSE   : 'else';
ELIF   : 'elif';
BREAK:'break';
AND:'&&';
OR:'||';
IS:'is';
NOT:'not';
IN:'in';
GT  : '>';
LT  : '<';
GE  : '>=';
LE  : '<=';
EQ  : '==';
NE  : '!=';
REQUEST : 'request';
FORM:'form';
GET:'get';

ID : [a-zA-Z_][a-zA-Z_0-9]* ;
STRING : '"' (~["\\] | ESC)* '"'
         | '\'' (~["\\] | ESC)*  '\'';

fragment ESC : '\\' [bfnrt"] ;

DOUBLE
    :   '-'? NUM '.' NUM EXP?
    ;

INT
    :   '-'? NUM EXP
    |   '-'? NUM
    ;


fragment NUM : '0' | [1-9] DIGIT*;
fragment EXP :   [Ee] [+\-]? INT ;
fragment DIGIT : [0-9];

NEWLINE
    : ('\r'? '\n')+
      {
          emit(new CommonToken(NEWLINE, "\n"));

          int spaces = 0;
          int c = _input.LA(1);

          while (c == ' ' || c == '\t') {
              if (c == '\t') spaces += 4;
              else spaces++;

              _input.consume();
              c = _input.LA(1);
          }

          int lastIndent = indentLevels.peek();

          if (spaces > lastIndent) {

              indentLevels.push(spaces);
              emit(new CommonToken(INDENT, "INDENT"));
          }
          else if (spaces < lastIndent) {
              while (spaces < indentLevels.peek()) {
                  indentLevels.pop();
                  emit(new CommonToken(DEDENT, "DEDENT"));
              }
          }
          skip();
      }
    ;
SP      : [ \t]+ -> skip ;
COMMENT: '#' ~('\n'|'\r')* ->skip;
