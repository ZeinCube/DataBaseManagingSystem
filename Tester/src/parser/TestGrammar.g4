grammar  TestGrammar;

fragment A:                                     [aA];
fragment B:                                     [bB];
fragment C:                                     [cC];
fragment D:                                     [dD];
fragment E:                                     [eE];
fragment F:                                     [fF];
fragment G:                                     [gG];
fragment H:                                     [hH];
fragment I:                                     [iI];
fragment J:                                     [jJ];
fragment K:                                     [kK];
fragment L:                                     [lL];
fragment M:                                     [mM];
fragment N:                                     [nN];
fragment O:                                     [oO];
fragment P:                                     [pP];
fragment Q:                                     [qQ];
fragment R:                                     [rR];
fragment S:                                     [sS];
fragment T:                                     [tT];
fragment U:                                     [uU];
fragment V:                                     [vV];
fragment W:                                     [wW];
fragment X:                                     [xX];
fragment Y:                                     [yY];
fragment Z:                                     [zZ];
fragment COMAND:                                '@';
fragment DIGIT :                                [0-9];


fragment ENTER:                                 [\n];

K_TEST: COMAND T E S T;
K_FOR: COMAND F O R;
K_VAR: COMAND V A R;
K_RESULT: COMAND R E S U L T;


K_NOT: COMAND N O T;
K_AND: A N D;
K_OR: O R;
K_CAST: COMAND C A S T;
K_AS:  A S ;
K_INT: I N T;
K_DOUBLE: D O U B L E;
K_STRING: S T R I N G;
K_BOOL:  (B O O L E A N )|( B O O L);
K_TRUE: T R U E;
K_FALSE: F A L S E;


NUMERIC_LITERAL
 : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )?
 | '.' DIGIT+ ( E [-+]? DIGIT+ )?
 ;

STRING_LITERAL
 : '"' (~'"' | '""'|'\\"')* '"'
 ;

IDENTIFIER
 : COMAND[a-zA-Z] [a-zA-Z_0-9]*
 ;

WS: [ \u000B\t\r\n] -> skip;

id
 :  IDENTIFIER
 | '(' IDENTIFIER ')'
 ;
apropriation: id ':=' expr;

parse:parseIn|parseOut|expr;

parseIn: K_TEST STRING_LITERAL
         (K_VAR ':'id (','id)*)?
       (test_block)+  EOF;

parseOut:  result*;

result: K_RESULT STRING_LITERAL;


test_block: '{'
               (test|myfor|apropriation|test_block)*
                '}';

test: K_TEST ':' expr;

myfor: K_FOR '('id '=' expr';' expr';' apropriation ')'
        test_block;

unary_operator
 : '-'
 | '+'
 | '~'
 | K_NOT
 ;

type_name: K_INT | K_DOUBLE | K_STRING | K_BOOL;

b_expr:  '(' expr ')';

expr
 : literal_value
 | K_CAST expr K_AS type_name
 | unary_operator expr
 | expr '||' expr
 | expr ( '*' | '/' | '%' ) expr
 | expr ( '+' | '-' ) expr
 | expr ( '&' | '|' ) expr
 | expr K_AND expr
 | expr K_OR expr
 | expr ( '<' | '<=' | '>' | '>=' ) expr
 | expr ( '==' | '!=' ) expr
 | b_expr
 ;


literal_value
 : NUMERIC_LITERAL
 | STRING_LITERAL
 | K_TRUE
 | K_FALSE
 | id
 ;




