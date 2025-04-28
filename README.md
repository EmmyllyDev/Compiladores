# Compilador - Minha Linguagem

Este repositório contém o desenvolvimento de um compilador para uma linguagem fictícia, com base em uma gramática que eu e Filomena Soares criamos e definimos no arquivo "Minha Linguagem". O compilador é implementado utilizando a biblioteca ANTLR, e o objetivo é processar código-fonte, gerar tokens e relatar erros léxicos. A linguagem suportada neste compilador inclui estruturas como comandos condicionais, repetição e leitura/saída.

## Funcionalidades

- **Leitura de código-fonte:** O compilador processa arquivos-fonte e gera tokens no formato `<Tipo do Token, Lexema, Linha, Coluna>`.
- **Log de erros:** Logs detalhados de erros são registrados em arquivo texto e/ou na tela, com mensagens de erro léxico detalhadas.
- **Erros léxicos:** O compilador reporta erros léxicos no formato:
