grammar  QueryResult;
@header {
import com.sun.istack.internal.Nullable;
}

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
K_VOID: (COMAND V O I D)|(COMAND S K I P);
K_ORDERED: COMAND O R D E R E D;

K_INT: I N T;
K_DOUBLE: D O U B L E;
K_STRING: S T R I N G;
K_BOOL:  (B O O L E A N)|(B O O L);
K_NULL: N U L L;

IDENTIFIER
 : [a-zA-Z] [a-zA-Z_0-9]*
 ;

NUMBER
    :('+'|'-')? DIGIT+;
NUMERIC_LITERAL
   : ('+'|'-')?NUMBER '.' DIGIT*  ( E [-+]? NUMBER )?
   | ('+'|'-')?'.' DIGIT+ ( E [-+]? NUMBER )?
 ;


STRING_LITERAL
    :  '"' ( '\\'. | '""' | ~('"'| '\\') )* '"'
    ;



WS: [ \t\r] -> skip;

parse: (query_result ENTER*)* EOF;

rq_executed: K_EXECUTED;
rq_void: K_VOID;
rq_string: K_CSTRING (ENTER*) ':'? myString;
rq_table:
         K_TABLE ENTER? K_ORDERED? ENTER?
         (column_name_list)
         (ENTER+ record)+ ;
rq_error: K_ERROR ':'? ex=myString what=myString;

column_name_list: (id)+;
record: literal_value+;

query_result:
        rq_executed
        |rq_string
        |rq_table
        |rq_error
        |rq_void
        ;

literal_value
 : myDouble
 | myInt
 | myString
 | myNull
 ;


myString returns [String val]: r=STRING_LITERAL  {$val = $r.text.substring(1, $r.text.length()-1);};
myDouble  returns [Double val]: r=NUMERIC_LITERAL{$val = Double.valueOf($r.text);};
myInt  returns [Integer val]: r=NUMBER           {$val = Integer.valueOf($r.text);};
myNull returns [@Nullable Object val = null]: K_NULL;
id:IDENTIFIER;