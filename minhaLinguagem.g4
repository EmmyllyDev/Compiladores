grammar minhaLinguagem;

ESCREVER   : 'escrever' ;
LER        : 'ler' ;
SE         : 'se' ;
ENTAO      : 'entao' ;
SENAO      : 'senao' ;
ENQUANTO   : 'enquanto' ;
FAÇA       : 'faça' ;
FIM        : 'fim' ;
INTEIRO    : 'inteiro' ;
STRING     : 'string' ;
ID         : [a-zA-Z_] [a-zA-Z_0-9]* ;
NUMERO     : [0-9]+ ;
OP_ARIT    : '+' | '-' | '*' | '/' ;
OP_LOGICO  : '&&' | '||' ;
OP_COMPARACAO : '==' | '!=' | '<' | '>' | '<=' | '>=' ;
ABRE_PAR   : '(' ;
FECHA_PAR  : ')' ;
FINAL      : ';' ;
ASPAS      : '"' ;
ESP_BRANCO : [ \t\r\n]+ -> skip ; 

// Regras de gramática
programa
    : comandos EOF
    ;

comandos
    : (comando_ler | comando_escrever | comando_condicional | comando_repeticao | comando_atribuicao | comando_declaracao)+
    ;

comando_ler
    : LER ABRE_PAR ID FECHA_PAR FINAL
    ;

comando_escrever
    : ESCREVER ABRE_PAR (ASPAS ID ASPAS | ID) FECHA_PAR FINAL
    ;

comando_condicional
    : SE ABRE_PAR expressao FECHA_PAR ENTAO comandos (SENAO comandos)? FIM
    ;

comando_repeticao
    : ENQUANTO ABRE_PAR expressao FECHA_PAR FAÇA comandos FIM
    ;

comando_atribuicao
    : ID '=' expressao FINAL
    ;

comando_declaracao
    : tipo ABRE_PAR ID FECHA_PAR FINAL
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
    : termo ((OP_ARIT termo)*) 
    ;

termo
    : NUMERO
    | ID
    | ABRE_PAR expressao_aritmetica FECHA_PAR
    ;

expressao_logica
    : expressao_aritmetica OP_COMPARACAO expressao_aritmetica
    | fator_logico ((OP_LOGICO fator_logico)*) 
    ;

fator_logico
    : expressao_aritmetica
    | '!' fator_logico
    | ABRE_PAR expressao_logica FECHA_PAR
    | ID
    | NUMERO
    ;
