grammar CustomLanguage;

/* Parser rules */

base_structure: global main;

main: data_type MAIN_FUNC '(' ')' body;

global: (func_decl | (var_decl SEMICOLON))+?;

func_decl: return_type name '(' param_decl ')' body;

body:
	'{' (
		loop
		| if_statement
		| attribution SEMICOLON
		| instruction SEMICOLON
		| return SEMICOLON
		| var_decl SEMICOLON
	)* '}';

if_statement: IF '(' instruction ')' other_statements;

other_statements: ( body else_if_statement else_statement)?;

else_if_statement: (ELSE_IF '(' instruction ')' body)*;

else_statement: (ELSE body)?;

loop:
	(
		(
			FOR_LOOP '(' var_decl? SEMICOLON instruction? SEMICOLON instruction? ')'
		)
		| (WHILE_LOOP '(' instruction ')')
	) body;

return: RETURN instruction?;

attribution:
	name EQADD instruction		# aditionThenEqExp
	| name EQSUB instruction	# subtractThenEqExp
	| name EQMUL instruction	# multiplyThenEqExp
	| name EQDIV instruction	# divideThenEqExp
	| name EQMOD instruction	# moduloThenEqExp
	| name EQUAL instruction	# equalExp;

param_decl: (data_type name (',' data_type name)*)?;

var_decl:
	data_type name (EQUAL instruction)? (
		',' name (EQUAL instruction)?
	)?;

instruction:
	name												# variableAtomExp
	| data_value										# valueAtomEXp
	| '(' instruction ')'								# paranhesisExp
	| name '(' (instruction (',' instruction)*)? ')'	# functionCallExp
	| NOT instruction									# logicNotExp
	| INCREMENT instruction								# preincrementExp
	| instruction INCREMENT								# postincrementExp
	| DECREMENT instruction								# predecrementExp
	| instruction DECREMENT								# postdecrementExp
	| instruction ADD instruction						# aditionExp
	| instruction SUB instruction						# subtractExp
	| instruction MUL instruction						# multiplyExp
	| instruction DIV instruction						# divideExp
	| instruction MOD instruction						# moduloExp
	| instruction SMALLER_EQ instruction				# smallerEqExp
	| instruction GREATER_EQ instruction				# greaterEqExp
	| instruction SMALLER instruction					# smallerExp
	| instruction GREATER instruction					# greaterExp
	| instruction SAME instruction						# sameValueExp
	| instruction DIFF instruction						# diffValueExp
	| instruction AND instruction						# logicAndExp
	| instruction OR instruction						# logicOrExp;

return_type: VOID_TYPE | data_type;

data_type:
	INTEGER_TYPE
	| FLOAT_TYPE
	| DOUBLE_TYPE
	| STRING_TYPE;

data_value: FLOAT_VALUE | INTEGER_VALUE | STRING_VALUE;

name: NAME;

/* Lexer rules */

INTEGER_TYPE: 'int';
FLOAT_TYPE: 'float';
DOUBLE_TYPE: 'double';
STRING_TYPE: 'string';
VOID_TYPE: 'void';
MAIN_FUNC: 'main';
RETURN: 'return';

FOR_LOOP: 'for';
WHILE_LOOP: 'while';
ELSE_IF: 'else if';
IF: 'if';
ELSE: 'else';

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

NAME: [a-zA-Z][a-zA-Z0-9]*;

INTEGER_VALUE: [0-9]+;
FLOAT_VALUE: [0-9]+ '.' [0-9]+;
STRING_VALUE: '""' | '"' .+? '"';

BLOCK_COMMENTARY: '/*' .+? '*/'+ -> skip;
LINE_COMMENTARY: '//' .+? [\n] -> skip;
WS: [ \t\r\n]+ -> skip;