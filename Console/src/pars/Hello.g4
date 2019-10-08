grammar Hello;

parse:                                               ( sql_stmt_list | error )* EOF;

error:                                               UNEXPECTED;
sql_stmt_list:                                       sql_stmt ';'*;
sql_stmt:                                          ( create_table
                                                   );

create_table:                                        K_CREATE
                                                     K_TABLE
                                                   ( database_name '.' )?
                                                     table_name
                                                   ( '(' column_def
                                                     ')'
                                                   );

// Whitespace
    SPACE:                                           [\t\r\n]+;

//Keywords
    K_CREATE:                                        C R E A T E;
    K_DROP:                                          D R O P;
    K_TABLE:                                         T A B L E;

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

//definition
    any_name:                                       IDENTIFIER
                                                   | keyword
                                                   | '(' any_name ')';

    column_def:                                     column_name
                                                    column_constraint*;

    column_constraint:                            ( K_PRIMARY
                                                    K_KEY
                                                  | K_UNIQUE
                                                  );

    column_name:                                    any_name;
    database_name:                                  any_name;

    keyword:                                        K_CREATE
                                                   |K_TABLE
                                                   |K_DROP;

//    name:                                           any_name;
    table_name:                                     any_name;
    K_PRIMARY:                                      P R I M A R Y;
    K_KEY:                                          K E Y;
    K_UNIQUE:                                       U N I Q U E;

    IDENTIFIER:                                     '"' (~'"' | '""')* '"'
                                                   |[a-zA-Z_] [a-zA-Z_0-9]* ;

    UNEXPECTED:                                     '.';
