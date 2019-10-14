grammar Hello;

K_CREATE:                                        C R E A T E;
K_DROP:                                          D R O P;
K_TABLE:                                         T A B L E;
K_SHOW:                                          S H O W;
K_SELECT:                                        S E L E C T;
K_FROM:                                          F R O M;

SPACE:                                           [ \t\r\n]+  -> skip;
K_PRIMARY_KEY:                                   P R I M A R Y SPACE K E Y;
K_UNIQUE:                                        U N I Q U E;

//types
T_CHAR:                                          C H A R;
T_INT:                                           I N T;
T_FLOAT:                                         F L O A T;

DIGIT:                                           [0-9];
NUMBER:                                          DIGIT+;
NUMERIC_LITERAL:                                 DIGIT+ ( '.' DIGIT* )?;

IDENTIFIER:                                      '"' (~'"' | '""')* '"'
                                                |[a-zA-Z_] [a-zA-Z_0-9]* ;

UNEXPECTED:                                      '.';

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

fragment A:                                      [aA];
fragment B:                                      [bB];
fragment C:                                      [cC];
fragment D:                                      [dD];
fragment E:                                      [eE];
fragment F:                                      [fF];
fragment G:                                      [gG];
fragment H:                                      [hH];
fragment I:                                      [iI];
fragment J:                                      [jJ];
fragment K:                                      [kK];
fragment L:                                      [lL];
fragment M:                                      [mM];
fragment N:                                      [nN];
fragment O:                                      [oO];
fragment P:                                      [pP];
fragment Q:                                      [qQ];
fragment R:                                      [rR];
fragment S:                                      [sS];
fragment T:                                      [tT];
fragment U:                                      [uU];
fragment V:                                      [vV];
fragment W:                                      [wW];
fragment X:                                      [xX];
fragment Y:                                      [yY];
fragment Z:                                      [zZ];

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

parse:                                           sql_query (';')? EOF;
signed_number:                                   ( '+' | '-' )? NUMERIC_LITERAL;

mychar:                                          T_CHAR('['NUMBER ']')?;
type:                                            T_INT | T_FLOAT | mychar;

select_idef:                                     ('*' | IDENTIFIER);
select_list:                                     select_idef (',' select_idef)*;
select_table_list:                               IDENTIFIER;
select:                                          K_SELECT select_list K_FROM select_table_list;

sql_query:                                       create
                                               | drop
                                               | show_create
                                               | select;
                                               
show_create:                                     K_SHOW K_CREATE K_TABLE name;
create:                                          K_CREATE table;
drop:                                            K_DROP K_TABLE name_list;
name_list:                                       name ( ',' name )*;
table:                                           K_TABLE table_definition;

table_definition:                                name
                                                 '('
                                                 columns_def
                                                 ')';

columns_def :                                    column_def ( ',' column_def )*;
name:                                            IDENTIFIER;

column_def:                                      IDENTIFIER
                                                 type
                                                 column_constraint?;

column_constraint:                               K_PRIMARY_KEY
                                               | K_UNIQUE;