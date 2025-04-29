grammar fimly;

INICIO     : 'inicio' ;
FIM        : 'fim' ;
FIM_AL     : 'fimalgoritmo' ;
ESCREVER   : 'escrever' ;
LER        : 'ler' ;
SE         : 'se' ;
ENTAO      : 'entao' ;
SENAO      : 'senao' ;
ENQUANTO   : 'enquanto' ;
FAÇA       : 'faça' ;
INTEIRO    : 'inteiro' ;
STRING     : '"' (~["\r\n])* '"';
ID         : [a-zA-Z_] [a-zA-Z_0-9]* ;
NUMERO     : [0-9]+ ;
OP_ARIT    : '+' | '-' | '*' | '/' ;
OP_LOGICO  : '&&' | '||' | '!' ;
OP_COMPARACAO : '==' | '!=' | '<' | '>' | '<=' | '>=' ;
IGUAL      : '=' ;
ABRE_PAR   : '(' ;
FECHA_PAR  : ')' ;
PONTO_VIR  : ';' ;
ASPAS      : '"' ;
ESP_BRANCO : [ \t\r\n]+ -> skip ; 

// Regras de gramática
programa
    : INICIO (comando)+ FIM_AL
    ;

comando
    : comando_ler
    | comando_escrever
    | comando_condicional
    | comando_repeticao
    | comando_atribuicao
    | comando_declaracao
    ;

comando_ler
    : LER ABRE_PAR ID FECHA_PAR PONTO_VIR
    ;

comando_escrever
    : ESCREVER ABRE_PAR (ASPAS ID ASPAS | ID) FECHA_PAR PONTO_VIR
    ;

comando_condicional
    : SE ABRE_PAR expressao FECHA_PAR ENTAO (comando)+ (SENAO (comando)+)? FIM
    ;

comando_repeticao
    : ENQUANTO ABRE_PAR expressao FECHA_PAR FAÇA (comando)+ FIM
    ;

comando_atribuicao
    : ID IGUAL expressao PONTO_VIR
    ;

comando_declaracao
    : ID IGUAL ABRE_PAR tipo FECHA_PAR PONTO_VIR
    ;

tipo
    : INTEIRO
    | STRING
    ;

expressao
    : expressao_logica
    | expressao_aritmetica
    ;


expressao_aritmetica
    : termo (OP_ARIT termo)*
    ;

termo
    : NUMERO
    | ID
    | ABRE_PAR expressao_aritmetica FECHA_PAR
    ;

expressao_logica
    : fator_logico (OP_LOGICO fator_logico)*
    ;

fator_logico
    : '!' fator_logico
    | expressao_comparacao
    | ABRE_PAR expressao_logica FECHA_PAR
    | ID
    | NUMERO
    ;

expressao_comparacao
    : expressao_aritmetica OP_COMPARACAO expressao_aritmetica
    | ID OP_COMPARACAO expressao_aritmetica
    ;