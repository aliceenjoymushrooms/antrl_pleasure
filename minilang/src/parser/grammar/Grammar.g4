grammar Grammar;

@header {
package compiler.parser;
}

progr   : (line EOL)+
        ;
line    : read          #lineRead
        | write         #lineWrite
        | atr           #lineAtr
        | ifstm         #lineIfStm
        ;
read    : READ VAR
        ;
write   : WRITE STR     #writeStr
        | WRITE expr    #writeExpr
        ;
atr     : VAR '=' expr
        ;
ifstm   : IF '('boolExpr')' block
        | IF '('boolExpr')' block ELSE block
        ;
expr    : term '+'? expr #exprSum
        | term '-' expr #exprMinus
        | term          #exprSingle
        ;
term    : left=fact '*' term #termMul
        | left=fact '/' term #termDiv
        | left=fact '%' term #termMod
        | fact          #termSingle
        ;
fact    : VAR            #factVar
        | NUM            #factNum
        | '('val=expr')' #factExpr
        ;
boolExpr: fact
        | '!'boolExpr
        | fact relop fact
        | TRUE
        | FALSE
        ;
relop   : '>'
        | '<'
        | '=='
        | '>='
        | '<='
        | '!='
        ;
block   : line
        | '{' progr '}'
        ;

TRUE        : 'true';
FALSE       : 'false';
READ        : 'read';
WRITE       : 'write';
IF          : 'if';
ELSE        : 'else';
STR         : '"'(~["\\\r\n])*'"';
VAR         : [a-zA-Z][a-zA-Z0-9_]*;
GR          : '>';
LS          : '<';
EQ          : '==';
GRT          : '>=';
LST          : '<=';
NEQ          : '!=';
ATR          : '=';
OEX         : '(';
CEX         : ')';
OBL         : '{';
CBL         : '}';
NOT         : '!'|'NOT';
ADD         : '+';
SUB         : '-';
MUL         : '*';
DIV         : '/';
MOD         : '%';
NUM         : [+-]?[0-9]+('.'[0-9]+)?;
EOL         : ';';
COMMENT     : '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
WS          : [ \t\r\n]+ -> skip;
