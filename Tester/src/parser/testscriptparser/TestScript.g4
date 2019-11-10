grammar  TestScript;

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
fragment DIGIT:                                 [0-9];
fragment ENTER:                                 [\n];

K_TEST: COMAND T E S T;
K_SQL: COMAND S Q L;
K_CHECK: COMAND C H E C K;
K_FOR: COMAND F O R;
K_IF: COMAND I F;
K_ELSE: COMAND E L S E;
K_VAR: COMAND V A R;
K_SKIP: COMAND S K I P;


K_CAST: COMAND C A S T;
K_ERROR: COMAND E R R O R;
K_CSTRING:COMAND S T R I N G;
K_TABLE: COMAND T A B L E;

K_NOT: N O T;
K_AND: A N D;
K_OR: O R;
K_AS:  A S ;
K_INT: I N T;
K_DOUBLE: D O U B L E;
K_STRING: S T R I N G;
K_BOOL:  (B O O L E A N)|(B O O L);
K_TRUE: T R U E;
K_FALSE: F A L S E;

NUMBER: DIGIT+;
NUMERIC_LITERAL
 : NUMBER '.' DIGIT*  ( E [-+]? NUMBER )?
 | '.' DIGIT+ ( E [-+]? NUMBER )?
 ;

STRING_LITERAL
 : '"' (~'"' | '""'|'\\"')* '"'
 ;

IDENTIFIER
 : COMAND[a-zA-Z] [a-zA-Z_0-9]*
 ;

WS: [ \u000B\t\r\n] -> skip;


parse: K_TEST testName
       (code_block)+  EOF;



assignment: id ':=' expr;

testName:myString;

open_block:'{';
close_block:'}';

code_block: open_block
               (test
               |myFor
               |assignment
               |code_block
               |myIf
               |sql)*
            close_block;

test: K_TEST ':' expr;
sql: K_SQL ':' expr;

myFor: K_FOR '('(assignment)?';' expr ';' assignment ')'
        code_block;
myIf: K_IF '('expr')' code_block (K_ELSE code_block)?;


b_expr:  '(' expr ')';
cast_operation: K_CAST expr K_AS type_name;

expr
 : literal_value
 | id
 | cast_operation
 | unary_operator expr
 | b_expr
 | left_op=expr op='||' right_op=expr
 | left_op=expr op=( '*' | '/' | '%' ) right_op=expr
 | left_op=expr op=( '+' | '-' ) right_op=expr
 | left_op=expr op=( '<' | '<=' | '>' | '>=' ) right_op=expr
 | left_op=expr op=( '==' | '!=' ) right_op=expr
 | left_op=expr op=( '&' | '|' ) right_op=expr
 | left_op=expr op=K_AND right_op=expr
 | left_op=expr op=K_OR right_op=expr
 ;

literal_value
 : myDouble
 | myInt
 | myString
 | myBool
 ;

id:  IDENTIFIER;
myString returns [String val]: r=STRING_LITERAL  {$val = ($r.text.substring(0, $r.text.length()-1).replace("\\\"", "\""));};
myDouble  returns [Double val]: r=NUMERIC_LITERAL{$val = Double.valueOf($r.text);};
myInt  returns [Integer val]: r=NUMBER               {$val = Integer.valueOf($r.text);};
myBool  returns [Boolean val]: r=(K_TRUE|K_FALSE)          {$val = Boolean.valueOf($r.text);};
type_name: K_INT | K_DOUBLE | K_STRING | K_BOOL;

unary_operator
 : '-'
 | '+'
 | '~'
 | K_NOT
 ;



