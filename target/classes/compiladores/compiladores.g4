grammar compiladores;

@header {
package compiladores;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

WS : [ \t\n\r]+ -> skip ;

PA : '(' ;
PC : ')' ;
LLA : '{' ;
LLC : '}' ;
PYC : ';' ;
IGUAL : '=' ;
SUMA : '+' ;
RESTA : '-' ;
MULT : '*' ;
DIV : '/' ;
MOD : '%' ;
INT : 'int' ;
IF : 'if' ;
FOR : 'for' ;
WHILE : 'while' ;
RETURN : 'return' ;
ELSE : 'else' ;

NUMERO : DIGITO+ ;
ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;

programa : instrucciones EOF ;

instrucciones : instruccion* ;

instruccion : bloque
            | declaracion
            | asignacion
            | estructuraC
            | llamadaFuncion PYC
            | retorno
            | expresion PYC // Permitir expresiones independientes terminadas con punto y coma
            ;

bloque : LLA instrucciones LLC ;

declaracion : INT ID PYC ;

asignacion : ID IGUAL exp PYC ;

llamadaFuncion : ID PA argumentos? PC ;

argumentos : exp (',' exp)* ;

estructuraC : ifEstructura
            | forEstructura
            | whileEstructura
            ;

ifEstructura : IF PA exp PC bloque (ELSE bloque)? ;

forEstructura : FOR PA (declaracion | asignacion | )? exp PYC (asignacion | )? PC bloque ;

whileEstructura : WHILE PA exp PC bloque ;

retorno : RETURN exp PYC ;

expresion : exp ; // Regla para permitir expresiones sueltas

exp : e ;

e : term ((SUMA | RESTA) term)* ;

term : factor ((MULT | DIV | MOD) factor)* ;

factor : NUMERO
       | ID
       | PA exp PC
       ;