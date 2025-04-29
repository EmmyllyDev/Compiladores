grammar fimly;

// Tokens
INICIO     : 'inicio' ;
LEIA       : 'leia';
ESCREVA    : 'escreva';
ESCREVAL : 'escreval';
FIM_AL     : 'fimalgoritmo' ;
VAR        : 'var' ;
SE         : 'se' ;
ENTAO      : 'entao' ;
SENAO      : 'senao' ;
FIM_SE     : 'fimse' ;
ENQUANTO   : 'enquanto' ;
FACA       : 'faça' ;
FIM_ENQ    : 'fimenquanto' ;
INT       : 'inteiro' ;                       // Tipos de dados
FLOAT     : 'float' ;
STRING    : 'string' ;
ID        : [a-zA-Z_] [a-zA-Z_0-9]*;         // Literais e identificadores
NUMERO_INTEIRO   : [+-]? ('0' | [1-9] [0-9]*);
NUMERO_FLOAT     : ('0'..'9')+ '.' ('0'..'9')*;
CADEIA           : '"' ~["\r\n]* '"' ;
OP_ARIT       : '+' | '-' | '*' | '/' ;     // Operadores
OP_LOGICO     : '&&' | '||' | '!' ;
OP_COMPARACAO : '!=' | '==' | '<' | '<=' | '>' | '>=' ;
IGUAL      : '=' ;                          // Símbolos
ABRE_PAR   : '(' ;
DOIS_PONTOS: ':' ;
FECHA_PAR  : ')' ;
PONTO_VIR  : ';' ;
ASPAS      : '"' ;
VIRG       : ',' ;
WS         : [ \t\n\r\f]+ -> skip ;  // Reconhece espaço em branco

// Regras de gramática
programa
    : VAR declaracoes INICIO (comando)+ FIM_AL
    ;

declaracoes
    : (declaracao_var)* 
    ;

declaracao_var
    : ID DOIS_PONTOS tipo PONTO_VIR
    ;

tipo
    : INT
    | FLOAT
    | STRING
    ;

comando
    : comando_ler
    | comando_escrever
    | comando_condicional
    | comando_repeticao
    | comando_atribuicao
    ;

comando_ler
    : LEIA ABRE_PAR ID FECHA_PAR 
    ;

comando_escrever
    : (ESCREVA | ESCREVAL) ABRE_PAR lista_expressao? FECHA_PAR PONTO_VIR
    ;

lista_expressao
    : expressao (VIRG expressao)*
    ;

comando_condicional
    : SE ABRE_PAR expressao FECHA_PAR ENTAO (comando)+ (SENAO (comando)+)? FIM_SE
    ;

comando_repeticao
    : ENQUANTO ABRE_PAR expressao FECHA_PAR FACA (comando)+ FIM_ENQ
    ;

comando_atribuicao
    : ID IGUAL expressao PONTO_VIR
    ;

expressao
    : expressao_logica
    | expressao_aritmetica
    ;


expressao_aritmetica
    : termo (OP_ARIT termo)*
    ;

termo
    : NUMERO_INTEIRO
    | NUMERO_FLOAT
    | ID
    | CADEIA
    | ABRE_PAR expressao_aritmetica FECHA_PAR
    ;

expressao_logica
    : fator_logico (OP_LOGICO fator_logico)*
    ;

fator_logico
    : OP_LOGICO fator_logico         // para '!' (negação)
    | expressao_comparacao
    | ABRE_PAR expressao_logica FECHA_PAR
     | ID
    | NUMERO_INTEIRO
    | NUMERO_FLOAT
    ;

expressao_comparacao
    : expressao_aritmetica OP_COMPARACAO expressao_aritmetica
    ;