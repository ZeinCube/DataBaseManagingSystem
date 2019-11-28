grammar Hello;

K_CREATE:                                        C R E A T E;
K_DROP:                                          D R O P;
K_TABLE:                                         T A B L E;
K_SHOW:                                          S H O W;
K_WHERE:                                         W H E R E;
K_WHEN:                                          W H E N;
K_SELECT:                                        S E L E C T;
K_UPDATE:                                        U P D A T E;
K_FROM:                                          F R O M;
K_NULL:                                          N U L L;
K_SET:                                           S E T;
K_INSERT:                                        I N S E R T;
K_INTO:                                          I N T O;
K_VALUES:                                        V A L U E S;
K_AND:                                           A N D;
K_OR:                                            O R;
NOT:                                             N O T;
TRUE:                                            T R U E;
FALSE:                                           F A L S E;

K_PRIMARY_KEY:                                  P R I M A R Y SPACE K E Y;
K_UNIQUE:                                       U N I Q U E;

T_CHAR:                                         C H A R A C T E R;
T_INT:                                          I N T E G E R;
T_FLOAT:                                        F L O A T;


STRING:                                         '"' (~'"' | '""')* '"';
STRING_LITERAL:                                 '\'' ( ~'\'' | '\'\'' )* '\'';

IDENTIFIER:                                     [a-zA-Z_] [a-zA-Z_0-9]*;
SPACE:                                          [ \t\r\n]+  -> skip;
ENTER:                                          [\n];
UNEXPECTED:                                     '.';

LETTER:                                         [a-zA-Z];
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

NUMBER:                                         DIGIT+;
NUMERIC_LITERAL:                                DIGIT+ ( '.' DIGIT* )?
                                              | '.' DIGIT+ ;

mynumber:                                       NUMBER | NUMERIC_LITERAL;
mystring:                                       STRING;


signed_number:                                  ( '+' | '-' )? NUMERIC_LITERAL;

name:                                            IDENTIFIER;

mychar:                                         T_CHAR('['NUMBER ']')?;
myint:                                          T_INT('('NUMBER ')')?;
myfloat:                                        T_FLOAT('('NUMBER ')')?;

type:                                           myint | myfloat | mychar;

parse:                                          sql_query (';')? EOF;

sql_query:                                      create
                                                |drop
                                                |show_create
                                                |select
                                                |insert
                                                |update;

show_create:                                     K_SHOW K_CREATE K_TABLE table_name_list;
create:                                          K_CREATE table;
drop:                                            K_DROP K_TABLE table_name_list;
table_name_list:                                 name ( ',' name )*;
table:                                           K_TABLE table_definition;

table_definition:                                name
                                                 '('
                                                 columns_sourse
                                                 ')';

columns_sourse :                                 (column_def ( ',' column_def )*)?;

column_def:                                      name
                                                 type
                                                 column_constraint?;

column_constraint:                               K_PRIMARY_KEY
                                                |K_UNIQUE;

select:                                        K_SELECT select_what
                                              ( select_from )?
                                              ( select_where)?;

select_where:                                   K_WHERE expr;

table_or_subquery:                              name
                                                | '(' select ')' ;

select_from:                                    K_FROM table_or_subquery ( ',' table_or_subquery )*;
select_what:                                    result_column ( ',' result_column )*;

result_column:                                    '*'
                                                | name
                                                | name '.' '*';

insert:                                          K_INSERT K_INTO name
                                                (insert_colums)?
                                                 insert_values;

insert_colums:                                  '(' name ( ',' name )* ')' ;

insert_values:                                  K_VALUES insert_expr;

insert_expr:                                    '(' literal_value ( ',' literal_value )* ')';

update:                                          K_UPDATE name update_set;
update_set:                                      K_SET update_idef (update_where)?;
update_idef:                                     update_expr ( ',' update_expr )*;
update_expr:                                     name '=' expr;
update_where:                                    K_WHERE expr;

expr:                                            literal_value
                                                | unary_operator expr
                                                | expr '||' expr
                                                | (name '.')? name
                                                | (name '.')? name expr
                                                | expr ( '*' | '/' | '%' ) expr
                                                | expr ( '+' | '-' ) expr
                                                | expr ( '<<' | '>>' | '&' | '|' ) expr
                                                | expr ( '<' | '<=' | '>' | '>=' ) expr
                                                | expr ( '=' | '==' | '!=' | '<>' ) expr
                                                | expr K_AND expr
                                                | expr K_OR expr
                                                | '(' expr ')'
                                                | '(' select ')';


literal_value:                                    mynumber
                                                 |STRING_LITERAL;

unary_operator:                                    '-'
                                                 | '+'
                                                 | '~';

