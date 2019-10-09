grammar Hello;
//parse: create table name ';';
//
//create: 'create';
//table: 'table';
//name: 'zhopa';

K_CREATE:                                        C R E A T E;
K_DROP:                                          D R O P;
K_TABLE:                                         T A B L E;


SPACE:                                          [\t\r\n]+;
K_PRIMARY_KEY:                                  P R I M A R Y K E Y;
K_UNIQUE:                                       U N I Q U E;

IDENTIFIER:                                     '"' (~'"' | '""')* '"'
                                               |[a-zA-Z_] [a-zA-Z_0-9]* ;

UNEXPECTED:                                     '.';

//fragments
fragment DIGIT:                                 [0-9];
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

parse:                                               sql_stmt_list EOF;

sql_stmt_list:                                       sql_stmt ';'?;
sql_stmt:                                            create_table;


create_table:                                        create_constr
                                                     table_name

                                                     column_def
                                                     ( ',' column_def )*
                                                     ( ',' )*
                                                     ')';


create_constr: K_CREATE K_TABLE;

WS : [ \t\r\n]+ -> skip;

any_name:                                       IDENTIFIER
                                                keyword
                                                '(' any_name ')';

column_def:                                     column_name
                                                column_constraint*;

column_constraint:                            ( K_PRIMARY_KEY
                                                K_UNIQUE
                                              );

column_name:                                    any_name;

keyword:                                        K_CREATE
                                                K_TABLE;

table_name:                                     any_name ;