grammar fimly;

// Tokens
INICIO     : 'inicio';
LEIA       : 'leia';
ESCREVA    : 'escreva';
VAR        : 'var' ;
FIM_AL     : 'fimalgoritmo';
SE         : 'se' ;
ENTAO      : 'entao' ;
SENAO      : 'senao' ;
FIM_SE     : 'fimse' ;
ENQUANTO   : 'enquanto' ;
FACA       : 'faca' ;
FIM_ENQ    : 'fimenquanto' ;

// Tipos de dados
INT       : 'inteiro' ;                      
FLOAT     : 'float' ;
STRING    : 'string' ;

// Literais e identificadores
ID        : [a-zA-Z_] [a-zA-Z_0-9]*;         
NUMERO_INTEIRO   : [+-]? ('0' | [1-9] [0-9]*);
NUMERO_FLOAT     : ('0'..'9')+ '.' ('0'..'9')*;
CADEIA           : '"' ~["\r\n]* '"' ;

// Operadores
OP_ARIT       : '+' | '-' | '*' | '/' ;   
OP_LOGICO     : '&&' | '||' | '!' ;
OP_COMPARACAO : '!=' | '==' | '<' | '<=' | '>' | '>=' ;

// Símbolos
IGUAL      : '=' ;                      
ABRE_PAR   : '(' ;
DOIS_PONTOS: ':' ;
FECHA_PAR  : ')' ;
PONTO_VIR  : ';' ;
ASPAS      : '"' ;
VIRG       : ',' ;

// Reconhece espaço em branco
WS         : [ \t\n\r\f]+ -> skip ;


// Regras de gramática
fimly
    : declaracoes INICIO comandos FIM_AL EOF
    ;

declaracoes
    : VAR (declaracao_var)*
    ;

declaracao_var
    : ID DOIS_PONTOS tipo PONTO_VIR
    ;

tipo
    : INT
    | FLOAT
    | STRING
    ;

comandos 
    : (comando)*
    ;

comando
    : comando_ler
    | comando_escrever
    | comando_condicional
    | comando_repeticao
    | comando_atribuicao
    ;

comando_ler
    : LEIA ABRE_PAR ID FECHA_PAR PONTO_VIR
    ;

comando_escrever
    : ESCREVA ABRE_PAR lista_expressao? FECHA_PAR PONTO_VIR
    ;

lista_expressao
    : expressao (expressao)*
    | CADEIA
    ;

comando_condicional
    : SE ABRE_PAR expressao FECHA_PAR ENTAO comandos (SENAO comandos)? FIM_SE
    ;

comando_repeticao
    : ENQUANTO ABRE_PAR expressao FECHA_PAR FACA comandos FIM_ENQ
    ;

comando_atribuicao
    : ID IGUAL expressao PONTO_VIR
    ;

expressao
    : expressao_logica
    | expressao_aritmetica
    ;

expressao_aritmetica
    : termo ((OP_ARIT termo)*) // Adiciona a precedência correta para os termos
    ;

termo
    : NUMERO_INTEIRO
    | NUMERO_FLOAT
    | ID
    | CADEIA
    | ABRE_PAR expressao_aritmetica FECHA_PAR
    ;

expressao_logica
    : expressao_comparacao (OP_LOGICO expressao_comparacao)*    
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