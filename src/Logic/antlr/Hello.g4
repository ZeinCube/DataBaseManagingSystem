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
K_SET:                                           S E T;
K_INSERT:                                        I N S E R T;
K_INTO:                                          I N T O;
K_VALUES:                                        V A L U E S;

AND:                                             A N D;
OR:                                              O R;
NOT:                                             N O T;
TRUE:                                            T R U E;
FALSE:                                           F A L S E;





SPACE:                                          [ \t\r\n]+  -> skip;
ENTER:                                          [\n];
K_PRIMARY_KEY:                                  P R I M A R Y SPACE K E Y;
K_UNIQUE:                                       U N I Q U E;
//types
T_CHAR:                                         C H A R;
T_INT:                                          I N T;
T_FLOAT:                                        F L O A T;

NUMBER:                                         DIGIT+;
NUMERIC_LITERAL:                                DIGIT+ ( '.' DIGIT* )?;

STRING:                                         '"' (~'"' | '""')* '"';

IDENTIFIER:                                     [a-zA-Z_] [a-zA-Z_0-9]*;

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

mynumber:                                       NUMBER | NUMERIC_LITERAL;
mystring:                                       STRING;

parse:                                          sql_query (';')? EOF;


signed_number:                                  ( '+' | '-' )? NUMERIC_LITERAL;

name:                                            IDENTIFIER;

mychar:                                         T_CHAR('['NUMBER ']')?;
myint:                                          T_INT;
myfloat:                                        T_FLOAT;

type:                                           myint | myfloat | mychar;

sql_query:                                      create
                                                |drop
                                                |show_create
                                                |select
                                                |update
                                                |const_expr;

value:                                          name| mynumber| logic_expr;
insert_value:                                    '('value (',' value)*')';
insert_values:                                   '(' insert_value (','insert_value)*')';
insert_colums:                                   name (',' name)*;
insert:                                          K_INSERT K_INTO name
                                                 ('(' insert_colums ')')?
                                                 K_VALUES  insert_values ;

select_idef:                                     ('*' | IDENTIFIER);
select_list:                                     select_idef (',' select_idef)*;
select_table_list:                                name
                                                 |select
                                                 |'('select')';

select:                                          K_SELECT select_list K_FROM select_table_list (K_WHERE expr)?;

update_operand:                                  name|signed_number;
update_idef:                                     name '=' expr;
update:                                          K_UPDATE name K_SET update_idef (K_WHERE logic_expr)?;

show_create:                                     K_SHOW K_CREATE K_TABLE table_name_list;

create:                                          K_CREATE table;

drop:                                            K_DROP K_TABLE table_name_list;

table_name_list:                                 name ( ',' name )*;

table:                                           K_TABLE table_definition;

table_definition:                                name
                                                 '('
                                                 columns_def
                                                 ')';

columns_def :                                    (column_def ( ',' column_def )*)?;

column_def:                                      name
                                                 type
                                                 column_constraint?;

column_constraint:                               K_PRIMARY_KEY
                                                |K_UNIQUE;










sub_const_arifm_expr:                           SUB const_arifm_expr;

b_const_arifm_expr:                             '(' const_arifm_expr ')';

mul:                                            '*';
div:                                            '/';
add:                                            '+';
sub:                                            '-';
concate:                                        '|';
mynull:                                         K_NULL;
const_arifm_expr:                               const_arifm_expr concate const_arifm_expr
                                                |const_arifm_expr (mul| div) const_arifm_expr
                                                | const_arifm_expr (add |sub) const_arifm_expr
                                                | mystring
                                                | mynumber
                                                | sub_const_arifm_expr
                                                | b_const_arifm_expr
                                                | mynull;

sub_arifm_expr:                                 SUB arifm_expr;
b_arifm_expr:                                   '(' arifm_expr ')';

arifm_expr:                                     arifm_expr concate arifm_expr
                                               |arifm_expr (mul|div) arifm_expr
                                               | arifm_expr (add|sub) arifm_expr
                                               | b_arifm_expr
                                               | name
                                               | const_arifm_expr
                                               | sub_arifm_expr;

eq:                                             '==';
neq:                                            '!=';
moreeq:                                         '>='|'=>';
more:                                           '>';
less:                                           '<';
lesseq:                                         '<='|'=<';

comp_op1 :                                      eq|neq;
comp_op2 :                                      moreeq|more|less|lesseq;

b_const_compare_expr:                           '('const_compare_expr')';

const_compare_expr:                             const_arifm_expr comp_op1 const_arifm_expr
                                                |const_arifm_expr comp_op2 const_arifm_expr
                                                | b_const_compare_expr;

b_compare_expr:                                 '('compare_expr')';

compare_expr:                                    compare_expr comp_op1 compare_expr
                                                 |compare_expr comp_op2 compare_expr
                                                 | b_compare_expr
                                                 | const_compare_expr
                                                 | arifm_expr;

mytrue:                                          TRUE;
myfalse:                                         FALSE;

logic_literal:                                   (mytrue | myfalse);

not_const_logic_expr:                            (NOT|'!') const_logic_expr;

and:                                             AND;
or:                                              OR;

b_const_logic_expr:                              '('const_logic_expr')';

const_logic_expr:                                const_logic_expr or const_logic_expr
                                                 |const_logic_expr and const_logic_expr
                                                 | logic_literal
                                                 | b_const_logic_expr
                                                 | not_const_logic_expr
                                                 | const_compare_expr
                                                 | const_arifm_expr;

not_logic_expr:                                 NOT logic_expr;
b_logic_expr:                                   '('logic_expr')';

logic_expr:                                     logic_expr or logic_expr
                                               |logic_expr and logic_expr
                                               | b_logic_expr
                                               | not_logic_expr
                                               | const_logic_expr
                                               | compare_expr
                                               | arifm_expr;

const_expr:                                    const_arifm_expr|const_compare_expr|const_logic_expr;
expr:                                          const_expr|compare_expr|arifm_expr|logic_expr;