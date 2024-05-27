grammar Ejemplo;

// Definir tokens básicos
INT: 'int';
DOUBLE: 'double';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
RETURN: 'return';
PUNTOCOMA: ';';
COMA: ',';
IGUAL: '=';
PARENIZQ: '(';
PARENDER: ')';
LLAVEIZQ: '{';
LLAVEDER: '}';
ID: [a-zA-Z_][a-zA-Z_0-9]*;
NUMERO: [0-9]+ ('.' [0-9]+)?;
MAS: '+';
MENOS: '-';
MULT: '*';
DIV: '/';
WS: [ \t\r\n]+ -> skip;
COMPARACION: '<' | '>' | '==' | '!=' | '<=' | '>=';

programa: (instruccion)+;

instruccion: declaracion
    | asignacion;

declaracion: tipo listaDeclaradores PUNTOCOMA;

tipo: INT | DOUBLE;

listaDeclaradores: declarador (COMA declarador)*;

declarador: ID (IGUAL expresion)?;

asignacion: ID IGUAL expresion PUNTOCOMA;

expresion: expresionUnaria (operadorBinario expresionUnaria)*;

expresionUnaria: operadorUnario? termino;

operadorBinario: MAS | MENOS | MULT | DIV | COMPARACION;

operadorUnario: MENOS;

termino: ID
    | NUMERO
    | llamadaFuncion
    | PARENIZQ expresion PARENDER;