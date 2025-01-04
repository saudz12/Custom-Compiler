grammar CustomLanguage;

/* Parser rules */

base_structure: global func_decl;

global: (func_decl | global_var)*;

global_var: var_decl SEMICOLON;

func_decl: return_type NAME OPENPTHS param_decl CLOSEPTHS body;

body:
	openedblock (loop | if_statement | code_line)* closedblock;

openedblock: OPENEDBLOCK;

closedblock: CLOSEDBLOCK;

if_statement:
	IF OPENPTHS instruction CLOSEPTHS body other_statements;

other_statements: else_if_statement* else_statement?;

else_if_statement: ELSE_IF OPENPTHS instruction CLOSEPTHS body;

else_statement: ELSE body;

loop:
	(
		(
			FOR_LOOP OPENPTHS (attribution | var_decl?) SEMICOLON instruction? SEMICOLON (
				instruction?
				| attribution
			) CLOSEPTHS
		)
		| (WHILE_LOOP OPENPTHS instruction CLOSEPTHS)
	) body;

code_line:
	(attribution | instruction | return | var_decl) SEMICOLON;

return: RETURN instruction?;

attribution:
	name EQADD instruction		# aditionThenEqExp
	| name EQSUB instruction	# subtractThenEqExp
	| name EQMUL instruction	# multiplyThenEqExp
	| name EQDIV instruction	# divideThenEqExp
	| name EQMOD instruction	# moduloThenEqExp
	| name EQUAL instruction	# equalExp;

param_decl: (init_param other_param*)?;
other_param: COMMA init_param;
init_param: data_type name;

var_decl: data_type init_var other_var*;
other_var: COMMA init_var;
init_var: name (EQUAL instruction)?;

instruction:
	name										# variableAtomExp
	| data_value								# valueAtomEXp
	| OPENPTHS instruction CLOSEPTHS			# paranhesisExp
	| name OPENPTHS instruction_list? CLOSEPTHS	# functionCallExp
	| NOT instruction							# logicNotExp
	| INCREMENT instruction						# preincrementExp
	| instruction INCREMENT						# postincrementExp
	| DECREMENT instruction						# predecrementExp
	| instruction DECREMENT						# postdecrementExp
	| instruction ADD instruction				# aditionExp
	| instruction SUB instruction				# subtractExp
	| instruction MUL instruction				# multiplyExp
	| instruction DIV instruction				# divideExp
	| instruction MOD instruction				# moduloExp
	| instruction SMALLER_EQ instruction		# smallerEqExp
	| instruction GREATER_EQ instruction		# greaterEqExp
	| instruction SMALLER instruction			# smallerExp
	| instruction GREATER instruction			# greaterExp
	| instruction SAME instruction				# sameValueExp
	| instruction DIFF instruction				# diffValueExp
	| instruction AND instruction				# logicAndExp
	| instruction OR instruction				# logicOrExp;

instruction_list: instruction other_instructions*;

other_instructions: COMMA instruction;

return_type:
	VOID_TYPE
	| INTEGER_TYPE
	| FLOAT_TYPE
	| DOUBLE_TYPE
	| STRING_TYPE;

data_type:
	INTEGER_TYPE
	| FLOAT_TYPE
	| DOUBLE_TYPE
	| STRING_TYPE;

data_value: FLOAT_VALUE | INTEGER_VALUE | STRING_VALUE;

name: NAME;

/* Lexer rules */

OPENPTHS: '(';
CLOSEPTHS: ')';
OPENEDBLOCK: '{';
CLOSEDBLOCK: '}';
COMMA: ',';
SEMICOLON: ';';

INTEGER_TYPE: 'int';
FLOAT_TYPE: 'float';
DOUBLE_TYPE: 'double';
STRING_TYPE: 'string';
VOID_TYPE: 'void';
RETURN: 'return';

FOR_LOOP: 'for';
WHILE_LOOP: 'while';
ELSE_IF: 'else if';
IF: 'if';
ELSE: 'else';

INCREMENT: '++';
DECREMENT: '--';

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

MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
MOD: '%';

NAME: [a-zA-Z][a-zA-Z0-9]*;

INTEGER_VALUE: [-+]? [0-9]+;
FLOAT_VALUE: [-+]? [0-9]+ '.' [0-9]+;
STRING_VALUE: '""' | '"' .+? '"';

BLOCK_COMMENTARY: '/*' .+? '*/'+ -> skip;
LINE_COMMENTARY: '//' .+? [\n] -> skip;
WS: [ \t\r\n]+ -> skip;