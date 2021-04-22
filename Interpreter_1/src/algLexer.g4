// Autoria : João Francês 61246

lexer grammar algLexer;

// Keywords

INT :   'int';
BOOL    : 'bool';
FLOAT   : 'float';
STRING  : 'string';
VOID    : 'void';
SIZEOF  : 'sizeof';
NULL    : 'null';
ALG : 'alg';
TRUE    : 'true';
FALSE   : 'false';
WHILE   : 'while';
DO  : 'do';
FINALLY : 'finally';
LEAVE   : 'leave';
RESTART : 'restart';
RETURN  : 'return';
IF  : 'if';
THEN    : 'then';
ELSE    : 'else';
WRITE   : 'write';
WRITELN : 'writeln';


// Whitespaces

NEXTLINE : '\n' -> skip;
CARRIAGE_RETURN : '\r' -> skip;
SPACE : ' ' -> skip;
TAB :   '\t'-> skip;

// Comments

EXP_COMMENT :   '##'.*?'\n';
OP_COMMENT  :   '(*'.*?'*)';

// Delimiters and Terminators

DELIMITER_COMMA :   ',';
TERMINATOR  :  ';';
DELIMITER_LPAR   :   '(';
DELIMITER_RPAR   :   ')';

// Lex Rules

IDENT   :  [a-zA-Z\u0080-\u00FF][a-zA-Z\u0080-\u00FF_0-9]*;



LITERAL_INT :   [1-9][0-9]* | '0';
LITERAL_REAL   :  LITERAL_INT('.'[0-9]+)?([Ee][+-]? LITERAL_INT)?;


STRINGS  :   [']['] | [']~'\u0000'*?~'~'['];

// Operators and Symbols

SQUARE_LBRACKET :   '[';
SQUARE_RBRACKET :   ']';
PLUS    :   '+';
MINUS   :   '-';
QUESTION_MARK   :   '?';
PERCENTAGE  :   '%';
GREATER_THAN    :   '>';
LESS_THAN   :   '<';
GREATER_OR_EQUAL_THAN   :   '>=';
LESS_OR_EQUAL_THAN   :   '<=';
EQUAL_TO   :   '==';
NOT_EQUAL_TO    :   '!=';
TILDE   :   '~';
AND_OPERATOR    :   '&&';
OR_OPERATOR :   '||';
EQUAL   :   '=';
SHIFT_RIGHT :   '>>';
AT_SIGN :   '@';
ASTERISK : '*';
FORWARD_SLASH : '/';

