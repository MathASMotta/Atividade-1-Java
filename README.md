# Atividade-1-Java

- Matheus Augusto Silva Motta - RM 550352
___
## Descrição do Projeto - Vetores Primitivos

Este projeto em Java explora a manipulação de vetores utilizando tipos primitivos. Ele demonstra operações básicas como criação, inicialização, iteração e cálculo de médias de valores armazenados em um vetor.
___
## Estrutura do Projeto

- src: Contém os arquivos de código-fonte em Java.
  - package: Contendo as classes "Filme" e "ListaFilmes"
  - Main.java: Classe principal para o teste das implementações desenvolvidas.
___
## Como Executar

1- Clone o repositório usando o comando:
  - git clone https://github.com/MathASMotta/Atividade-1-Java

2- Navegue até o diretório do projeto:
  - cd Atividade-1-Java

3- Compile os arquivos .java:
  - javac src/Main.java

4- Execute o programa:
  - java src/Main
___
## Questões e Respostas

1- Caso seja necessário alterar o tamanho do vetor, como isso pode ser feito? Se o código entregue não suporte essa alteração, liste as melhorias necessárias para que a alteração seja possível.
  - Para alterar o tamanho do vetor, crie um novo vetor maior e copie os elementos do original. Uma melhoria seria redimensionar automaticamente o vetor quando necessário.

2- O que acontecerá caso o usuário tente incluir uma quantidade de itens maior do que o tamanho do vetor? Existe algo que possa ser feito para mitigar esse risco?
  - Se tentar adicionar mais itens do que o vetor suporta, uma mensagem de aviso aparecerá no prompt. Além de fazer um tratamento no código, o vetor pode ser redimensionado.

3- O que acontecerá caso o usuário tente excluir um item que não existe no vetor?
  - Aparecerá uma mensagem de aviso no prompt, falando "Este indice é inválido!".
