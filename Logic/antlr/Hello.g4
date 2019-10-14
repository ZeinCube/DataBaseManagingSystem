grammar Hello;

K_CREATE:                                        C R E A T E;
K_DROP:                                          D R O P;
K_TABLE:                                         T A B L E;
K_SHOW:                                          S H O W;
K_WHERE:                                         W H E R E;
K_SELECT:                                        S E L E C T;
K_UPDATE:                                        U P D A T E;
K_FROM:                                          F R O M;
K_NULL:                                          N U L L;
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';

AND:                                             A N D;
OR:                                                 O R;
NOT:                                             N O T;
TRUE:                                           T R U E;
FALSE:                                           F A L S E;


SPACE:                                          [ \t\r]+  -> skip;
ENTER:                                          [\n];
K_PRIMARY_KEY:                                  P R I M A R Y SPACE K E Y;
K_UNIQUE:                                       U N I Q U E;
//types
T_CHAR:                                           C H A R;
T_INT:                                            I N T;
T_FLOAT:                                          F L O A T;

NUMBER:                                         DIGIT+;
NUMERIC_LITERAL:                                DIGIT+ ( '.' DIGIT* )?;

IDENTIFIER:                                     '"' (~'"' | '""')* '"'
                                               |[a-zA-Z_] [a-zA-Z_0-9]* ;

UNEXPECTED:                                     '.';



fragment DIGIT: [0-9];
fragment LETTER: [a-zA-Z];
//fragments
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


parse:                                               (sql_query (';')?)(ENTER sql_query(';')?)* EOF;


signed_number:                                       ( '+' | '-' )? NUMERIC_LITERAL;


mychar:                                                T_CHAR('['NUMBER ']')?;
myint:                                                T_INT;
myfloat:                                              T_FLOAT;


type:                                              myint | myfloat | mychar;

sql_query:                                           create
                                                     |drop
                                                     |show_create
                                                     |select
                                                     |update
                                                     |arifm_expr
                                                     |logic_expr;

select_idef:                                     ('*' | IDENTIFIER);
select_list:                                     select_idef (',' select_idef)*;
select_table_list:                               select | name;
select:                                          K_SELECT select_list K_FROM select_table_list (K_WHERE logic_expr)?;

update_operand:                                  name|signed_number;
update_idef:                                     name '=' logic_expr;
update:                                          K_UPDATE name K_SET update_idef;



show_create:                                         K_SHOW K_CREATE K_TABLE table_name_list;

create:                                              K_CREATE table;

drop:                                                K_DROP K_TABLE table_name_list;

table_name_list:                                     name ( ',' name )*;

table:                                               K_TABLE table_definition;

table_definition:                                     name
                                                      '('
                                                      columns_def
                                                      ')';

columns_def :                                         (column_def ( ',' column_def )*)?;

create_constr: K_CREATE K_TABLE;

name:                                           IDENTIFIER;

column_def:                                     name
                                                type
                                                column_constraint?;

column_constraint:                              K_PRIMARY_KEY
                                               |K_UNIQUE;




// Disable compiler warnings

mynumber: NUMBER | NUMERIC_LITERAL;

arifm_expr:
    arifm_expr op=(MUL | DIV) arifm_expr         #mull
    | arifm_expr op=(ADD | SUB) arifm_expr      #summ
    | mynumber                                    #num
    | '(' arifm_expr ')'                         #spades
    | name                                        #nm
    | K_NULL                                       #null
    ;

compare_expr: logic_expr AND logic_expr
                     |logic_expr OR logic_expr
                     | logic_literal
                     | '('logic_expr')'
                     | arifm_expr;

logic_literal:(TRUE | FALSE);
logic_expr:
        logic_expr AND logic_expr
        |logic_expr OR logic_expr
        | logic_literal
        | '('logic_expr')'
        | arifm_expr;