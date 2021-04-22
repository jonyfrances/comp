parser grammar alg;

options{tokenVocab=algLexer;}

//number  :
 //       LITERL_INT | LITERAL_REAL
 //       ;

//soma    :
//         (number PLUS (number | soma))+ | EOF

//        ;

program : declaration* EOF ;

declaration : varDec | function ;

varDec  :
            (simpleDec | initDec) TERMINATOR
        ;

initDec :
            typeInitDec | memInitDec
        ;

typeInitDec :
            simpleDec'=' expression
            ;

memInitDec  :
             simpleDec '=' '['LITERAL_INT']'
            ;
function :VOID;

primitiveType   :
                    INT | BOOL | FLOAT | STRING
                ;
pointerType :
            '<'primitiveType'>'
            ;

simpleDec  :

             typeDec identPairs
            ;

typeDec  :

             primitiveType | pointerType
            ;

identPairs:
            IDENT (DELIMITER_COMMA identPairs)?
            ;

literal :
         literalNumber | literalPointer | literalBool | literalString
        ;

literalNumber   :
                LITERAL_INT | LITERAL_REAL
                ;

literalPointer  :
                NULL
                ;
literalBool     :
                    TRUE | FALSE
                ;
literalString   :
                    STRINGS
                ;

unaryOperators  :
                 PLUS | MINUS | TILDE | QUESTION_MARK
                ;


expression  :
             simpleExpression | evalExpression
            ;
simpleExpression    :
                    literal | function
                    ;

evalExpression  :
                binaryExpression | unaryExpression
                ;

unaryExpression :
                 unaryOperators simpleExpression | unaryOperators expression | '('expression')'
                ;
binaryExpression    :
                      (simpleExpression | unaryExpression) binaryOperators expression
                    ;


binaryOperators :
                   logicOR | logicAND | comparators | sumAndSub | mulAndDiv | expression '['expression']'
                ;

logicOR :
         OR_OPERATOR
        ;

logicAND    :
             AND_OPERATOR
            ;

comparators :
            LESS_THAN | GREATER_THAN | GREATER_OR_EQUAL_THAN | LESS_OR_EQUAL_THAN | EQUAL_TO | NOT_EQUAL_TO
            ;

sumAndSub   :
            PLUS | MINUS
            ;

mulAndDiv   :
            ASTERISK | FORWARD_SLASH | PERCENTAGE
            ;