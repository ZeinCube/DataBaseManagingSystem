grammar  QueryResult;
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

ENTER:                                          [\n];

K_EXECUTED: COMAND E X E C U T E D;
K_ERROR: COMAND E R R O R;
K_CSTRING:COMAND S T R I N G;
K_TABLE: COMAND T A B L E;

K_INT: I N T;
K_DOUBLE: D O U B L E;
K_STRING: S T R I N G;
K_BOOL:  (B O O L E A N)|(B O O L);

IDENTIFIER
 : [a-zA-Z] [a-zA-Z_0-9]*
 ;

NUMBER:                                         DIGIT+;
NUMERIC_LITERAL
 : NUMBER '.' DIGIT*  ( E [-+]? NUMBER )?
 | '.' DIGIT+ ( E [-+]? NUMBER )?
 ;

STRING_LITERAL
 : '"' (~'"' | '""'|'\\"')* '"' ;



WS: [ \u000B\t\r] -> skip;

parse: query_result+ EOF;
rq_executed: K_EXECUTED;
rq_string: K_CSTRING ':' myString;

rq_table:
         K_TABLE
         (column_name_list)
         (ENTER record)+ ENTER*;

column_name_list: (column_name)+;
column_name: id type_name?;
record: literal_value+;

query_result:  (rq_executed
        |rq_string
        |rq_table
        |rq_error)
        ENTER*
        ;

rq_error: K_ERROR ':' myString myString;
literal_value
 : myDouble
 | myInt
 | myString
 ;


myString returns [String text]: r=STRING_LITERAL {$text = ($r.text.substring(0, $r.text.length()-1).replace("\\\"", "\""));};
myDouble  returns [Double val]: r=NUMERIC_LITERAL{$val = Double.valueOf($r.text);};
myInt  returns [Integer val]: r=NUMBER           {$val = Integer.valueOf($r.text);};

id:IDENTIFIER;
type_name: K_INT | K_DOUBLE | K_STRING | K_BOOL;