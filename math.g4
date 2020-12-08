grammar math;
prog: action WS;
func: funcName LPAREN mathFunc RPAREN; //change to accomodate variables in mathFunc place
funcName
    : NEWTON
    | ANON
    ;
mathFunc: expr (op=('+'|'-'|'*'|'/'|'^') expr)+;
expr
    : expr ('+'|'-') expr
    | expr ('*'|'/') expr
    | expr '^' expr
    | SQRT'('expr')'
    | LOG'('expr')'
    | LN'('expr')'
    | SIN'('expr')'
    | ASIN'('expr')'
    | COS'('expr')'	
    | ACOS'('expr')'
    | TAN'('expr')'
    | ATAN'('expr')'
    | atom
    ;
atom
    : NUM
    | ID
    | LPAREN expr RPAREN
    ;
action
    : DISPLAY mathFunc
    | CREATE
    | READ
    ;

NEWTON: 'newton';
ANON: 'anon';

DISPLAY: 'display';
CREATE: 'create';
READ: 'read';

SQRT: 'sqrt';
COS: 'cos';
SIN: 'sin';
TAN: 'tan';
ACOS: 'acos';
ASIN: 'asin';
ATAN: 'atan';
LN: 'ln';
LOG: 'log';
POW: '^';
LPAREN: '(';
RPAREN: ')';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
EQ: '=';

BLOCK_COMMENT: '/$' .*? '$/' -> skip;
LINE_COMMENT: '$$' ~[\r\n]* -> skip;
WS
   : [ \r\n\t] + -> skip
   ;
ID: [a-zA-Z]+;
NUM: [0-9]+;