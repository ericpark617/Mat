grammar Mat;
prog: action* EOF;
action
    : DISPLAY expr                                                         #DisplayAction
    | ID EQ expr                                                           #AssignAction
    | CREATE INT 'by' INT 'matrix where' SQLPAREN matrix SQRPAREN 'to' ID  #CreateAction
    ;

matrix: (INT|DOUBLE) (','(INT|DOUBLE))*;
expr: matrix (PLUS|MINUS) matrix                                           #Plusminus
    | expr MULT expr                                                       #Multdiv
    | <assoc=right> expr POW expr                                          #Power
    | atom                                                                 #Atm
    ;
atom: INT                                                                  #Integer
    | DOUBLE                                                               #Double
    | ID                                                                   #Identifier
    | matrix                                                               #Matr
    ;

DISPLAY: 'display';
CREATE: 'create';

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
