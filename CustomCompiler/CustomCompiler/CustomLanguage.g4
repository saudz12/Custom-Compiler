grammar CustomLanguage;

/* Parser rules */

base_structure: (func_decl | (var_decl SEMICOLON))+? main;

main: MAIN_FUNC body;

func_decl:
	return_type NAME '(' ((var_decl (',' var_decl)+?))? ')' body;

body:
	OPEN_BLOCK (
		var_decl SEMICOLON
		| if_statement
		| loop
		| attribution SEMICOLON
		| instruction SEMICOLON
		| return SEMICOLON
	)+? CLOSED_BLOCK;

if_statement:
	IF '(' instruction ')' body (ELSE_IF '(' instruction ')')+? body (
		ELSE body
	)?;

loop:
	(
		FOR_LOOP '(' (instruction) SEMICOLON (instruction) SEMICOLON (
			instruction
		) ')'
	)
	| (WHILE_LOOP '(' instruction ')') body;

return: RETURN instruction?;

attribution:
	NAME EQADD instruction		# aditionThenEqExp
	| NAME EQSUB instruction	# subtractThenEqExp
	| NAME EQSUB instruction	# multiplyThenEqExp
	| NAME EQSUB instruction	# divideThenEqExp
	| NAME EQSUB instruction	# moduloThenEqExp
	| NAME EQUAL instruction	# equalExp;

var_decl:
	data_type NAME (EQUAL instruction)? (
		',' NAME (EQUAL instruction)
	)+?;

instruction:
	NAME											# variableAtomExp
	| data_value									# valueAtomEXp
	| NAME '(' (instruction (',' instruction)*) ')'	# functionCallExp
	| NOT instruction								# logicNotExp
	| instruction ADD instruction					# aditionExp
	| instruction SUB instruction					# subtractExp
	| instruction MUL instruction					# multiplyExp
	| instruction DIV instruction					# divideExp
	| instruction MOD instruction					# moduloExp
	| instruction SMALLER_EQ instruction			# smallerEqExp
	| instruction GREATER_EQ instruction			# greaterEqExp
	| instruction SMALLER instruction				# smallerExp
	| instruction GREATER instruction				# greaterExp
	| instruction SAME instruction					# sameValueExp
	| instruction DIFF instruction					# diffValueExp
	| instruction AND instruction					# logicAndExp
	| instruction OR instruction					# logicOrExp;

return_type: VOID_TYPE | data_type;

data_type:
	INTEGER_TYPE
	| FLOAT_TYPE
	| STRING_TYPE
	| DOUBLE_TYPE;

data_value: INTEGER_VALUE | FLOAT_VALUE | STRING_VALUE;
/* Lexer rules */

fragment NON_NULL_DIGIT: [1-9];
fragment DIGIT: [0-9];
fragment START_LETTER: [a-zA-Z_];

fragment OPEN_PTHS: '(';
fragment CLOSED_PTHS: ')';
OPEN_BLOCK: '{';
CLOSED_BLOCK: '}';

INTEGER_TYPE: 'int';
FLOAT_TYPE: 'float';
DOUBLE_TYPE: 'double';
STRING_TYPE: 'string';
VOID_TYPE: 'void';
MAIN_FUNC: 'main';
RETURN: 'return';

INCREMENT: '++';
DECREMENT: '--';

SEMICOLON: ';';

MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
MOD: '%';

SMALLER_EQ: '<=';
GREATER_EQ: '>=';
SAME: '==';
DIFF: '!=';
SMALLER: '<';
GREATER: '>';

AND: '&&';
NOT: '!';
OR: '||';

EQADD: '+=';
EQSUB: '-=';
EQMUL: '*=';
EQDIV: '/=';
EQMOD: '%=';
EQUAL: '=';

NAME: START_LETTER (START_LETTER | DIGIT)*;

INTEGER_VALUE: DIGIT+;
FLOAT_VALUE: DIGIT+ '.' DIGIT+;
STRING_VALUE: '"' .+? '"';

FOR_LOOP: 'for';
WHILE_LOOP: 'while';
IF: 'if';
ELSE_IF: 'else if';
ELSE: 'else';

BLOCK_COMMENTARY: '\\*' .+? '\\*'+ -> skip;
LINE_COMMENTARY: '\\\\' .+? [\n] -> skip;
WS: [ \t\r\n]+ -> skip;