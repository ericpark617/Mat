grammar math;
prog: action* EOF;
action
    : displayAction
    | assignAction
    ;
displayAction: DISPLAY func WS;
assignAction: ID EQ func WS;
func: ID LPAREN (NUM | ID) RPAREN EQ expr WS;
expr
    : expr (PLUS|MINUS) expr
    | expr (MULT|DIV) expr
    | <assoc=right> expr POW expr
    | SQRT LPAREN expr RPAREN 
    | LOG LPAREN expr RPAREN 
    | LN LPAREN expr RPAREN 
    | SIN LPAREN expr RPAREN 
    | ASIN LPAREN expr RPAREN 
    | COS LPAREN expr RPAREN 	
    | ACOS LPAREN expr RPAREN 
    | TAN LPAREN expr RPAREN 
    | ATAN LPAREN expr RPAREN 
    | atom
    ;
atom
    : NUM
    | ID
    | LPAREN expr RPAREN
    ;

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
ID: [a-zA-Z];
NUM: [0-9.]+;