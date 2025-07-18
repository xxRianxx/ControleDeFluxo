# 🧠 Controle de Fluxo - Bootcamp Java Santander / DIO

Este é um projeto desenvolvido como parte do **Bootcamp Java Santander** promovido pela **DIO (Digital Innovation One)**.

## 📌 Descrição

O exercício propõe a criação de um sistema simples para simular uma etapa de **Controle de Fluxo**, onde o usuário deve informar dois números inteiros. O segundo número **deve ser maior que o primeiro**, caso contrário, uma exceção personalizada será lançada.

## 💡 Incremento Pessoal

Como forma de aprofundar o aprendizado, **adicionei um laço `while` com tratamento de exceções** para garantir que:

- O usuário digite apenas **números inteiros**;
- Os valores respeitem a regra de validação (segundo número maior que o primeiro);
- O programa continue pedindo os valores até que estejam corretos.

## 🛠️ Tecnologias utilizadas

- Java 17+
- IntelliJ IDEA (ou qualquer IDE Java)
- Terminal/Console

## 📂 Estrutura do Projeto

```bash
ControleDeFluxo/
├── .idea/
├── out/
├── src/
│   ├── Contador.java
│   └── ParametrosInvalidosException.java
├── .gitignore
├── ControleDeFluxo.iml
└── README.md
▶️ Como executar
Abra o projeto na sua IDE (como IntelliJ).

Certifique-se de que os arquivos Contador.java e ParametrosInvalidosException.java estão dentro da pasta src.

Rode o arquivo Contador.java como aplicação Java.

Siga as instruções no terminal para digitar dois valores inteiros válidos.

📸 Exemplo de uso
Digite um valor:
3
Digite outro valor:
7
imprimindo o numero1
imprimindo o numero2
imprimindo o numero3
imprimindo o numero4

Se o usuário digitar algo que não seja um número inteiro:
Digite um valor:
abc
Digite um valor que seja um número inteiro

Se o segundo número for menor ou igual ao primeiro:
Digite um valor:
5
Digite outro valor:
2
O segundo número deve ser maior que o primeiro.

📚 Aprendizados
Estrutura de controle de fluxo em Java

Blocos try-catch com múltiplas exceções

Criação e uso de exceções personalizadas

Estrutura de repetição com validação (while)

🧑‍💻 Autor
Rian Silva
Bootcamp Santander Java Backend – DIO
2025
