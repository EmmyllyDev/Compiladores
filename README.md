# Criação de um Mini Compilador

Este repositório contém o desenvolvimento de um compilador para uma linguagem fictícia, com base em uma gramática que eu e Filomena Soares criamos e definimos no arquivo `fimly.g4`. O compilador é implementado utilizando a biblioteca **ANTLR**, e o objetivo é processar código-fonte, gerar tokens e relatar erros léxicos.

## 🧠 Minha Linguagem

O nome da linguagem é **Fimly**, uma junção dos nomes **Filomena** e **Emmylly**.

## ✨ Funcionalidades

- **Leitura de código-fonte:** O compilador processa arquivos `.fonte` e gera tokens no formato:
- **Log de erros:** Erros léxicos e outros problemas são registrados em arquivo de log ou exibidos no terminal.
- **Erros léxicos:** O compilador identifica e reporta erros no seguinte formato:

## 🛠 Tecnologias Utilizadas

- [Python 3.x](https://www.python.org/downloads/)
- [ANTLR4](https://www.antlr.org/)
- Biblioteca `antlr4-python3-runtime`

## 🚀 Como Executar
Com as ferramentas já instaladas (Python e ANTLR4):
1. **Instale as dependências:**
   ```bash
   pip install antlr4-python3-runtime
2. Gere o parser e lexer com ANTLR:
   ```bash
   antlr4 -Dlanguage=Python3 fimly.g4
3. Execute o compilador:
   ```bash
    python testar_linguagem.py
## 👩‍💻 Autoras
- [Emmylly](https://github.com/EmmyllyDev)
- [Filomena Soares](https://github.com/FilomenaSoares)


