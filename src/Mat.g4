grammar Mat;
prog: action* EOF;
action
    : displayAction
    | assignAction
    | createAction
    | readAction
    ;
displayAction: DISPLAY expr;
assignAction: ID EQ expr;
createAction: CREATE INT 'by' INT 'matrix where' SQLPAREN matrix SQRPAREN 'to' ID;
readAction: READ matrix;

matrix: (INT|DOUBLE) (','(INT|DOUBLE))*;
expr: matrix (PLUS|MINUS) matrix        #Plusminus
    | matrix (MULT|DIV) matrix          #Multdiv
    | <assoc=right> expr POW expr   #Power
    | atom                          #Atm
    ;
atom: INT                           #Integer
    | DOUBLE                        #Double
    | ID                            #Identifier
    | matrix                        #Matr
    ;

DISPLAY: 'display';
CREATE: 'create';
READ: 'read';

POW: '^';
SQLPAREN: '[';
SQRPAREN: ']';
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
ID: [a-zA-Z] ([a-zA-Z]|INT|'_')*;
INT: [0-9]+;
DOUBLE: [0-9]+'.'[0-9]+;
