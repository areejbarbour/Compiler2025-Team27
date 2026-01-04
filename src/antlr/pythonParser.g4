parser grammar pythonParser;

options {tokenVocab=pythonLexer;}
prog : statement* EOF ;

statement
    : assignment NEWLINE?      #AssignmentStmt
    | callFunc NEWLINE?        #CallStmt
    | defFunction NEWLINE?     #DefStmt
    | decorate NEWLINE?        #DecorateStmt
    | return NEWLINE?          #ReturnStmt
    | for                      #ForStmt
    | if                       #IfStmt
    | while                    #WhileStmt
    | NEWLINE                  #EmptyStmt
    ;


assignment
    : ID ASSIGN expr
    | ID ASSIGN request
    ;

block
    : INDENT statement+ DEDENT
    ;

list: LSB (expr (CM expr)*)? RSB;

dict: LKB (keyValue (CM keyValue)*)? RKB ;

keyValue: STRING COL expr;

callFunc: (ID DOT)? ID LPAREN (args (CM args)*)? RPAREN;

defFunction:DEF ID LPAREN  (ID (CM ID)*)? RPAREN COL
            NEWLINE block;

//decorate:AT APP (DOT ID)* LPAREN (expr (CM expr)*)? RPAREN;
decorate
    : AT APP DOT ROUTE LPAREN (expr (CM expr)*)? RPAREN
    ;


return: RETURN (args (CM args)*)? ;

args: expr | assignment;

if:IF condition COL NEWLINE block elif* else?;

elif:ELIF condition COL NEWLINE block ;

else:ELSE COL NEWLINE block;

condition:expr comparison expr       #ComparisonCondition
         |condition AND condition    #AndCondition
         |condition OR condition     #OrCondition
         |expr IS NONE               #IsNoneCondition
         |expr IS NOT NONE           #IsNotNoneCondition
         |TRUE                       #TrueCondition
         |FALSE                      #FalseCondition
;

comparison
    : GT | LT | GE | LE | EQ | NE
    ;

for:FOR ID IN expr COL NEWLINE loopBlock
   ;

while:WHILE condition COL NEWLINE loopBlock
;

loopIf
    : IF condition COL NEWLINE loopBlock (loopElif* loopElse?)
    ;

loopElif
    : ELIF condition COL loopBlock
    ;

loopElse
    : ELSE COL loopBlock
    ;
loopBlock
    : INDENT loopStmt+ DEDENT
    ;

loopStmt
    : loopIf
    |statement
    | BREAK NEWLINE?
    ;

request
   :REQUEST DOT FORM DOT GET LPAREN STRING RPAREN;

expr: DOUBLE                             #Double
     | INT                               #Integer
     | STRING                            #String
     | TRUE                              #Bool
     | FALSE                             #Bool
     | NONE                              #NONE
     | ID                                #ID
     | ID LSB expr RSB                   #IndexAccess
     | dict                              #dictValue
     | list                              #listValue
     |callFunc                           #callFunclabel
     ;


