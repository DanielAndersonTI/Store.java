# Sistema de Gerenciamento de Inventário - Loja de Músicas e Livros

Este repositório contém um sistema simples de gerenciamento de inventário de itens como livros, CDs e discos clássicos. O sistema é implementado em Java utilizando conceitos de programação orientada a objetos (POO), como herança, encapsulamento e polimorfismo.

### Estrutura do Projeto

O projeto é composto por diversas classes que representam diferentes tipos de itens no inventário de uma loja, incluindo `Item`, `Book`, `CD`, `ClassicalCD` e `Artista`. A classe `Inventario` é responsável por gerar relatórios dos itens no inventário. As classes `Driver_de_Inventario` e `Driver_de_Book` são responsáveis por testar o funcionamento do sistema.

#### Classes e Funções

1. **Item.java**: 
   - Classe base que representa um item genérico com atributos como `titulo`, `preco` e `quantidade`.
   - Possui métodos getters e setters para acessar e modificar os atributos.
   
2. **Book.java**:
   - Extende a classe `Item` e adiciona atributos específicos para livros, como `autor`, `editor` e `categoria`.
   - Contém dois construtores: um para livros com todos os atributos e outro com título e preço, utilizando valores padrão para os outros atributos.

3. **CD.java**:
   - Extende a classe `Item` e adiciona atributos relacionados a CDs, como `artista` e `releaseDate`.
   - O artista é representado pela classe `Artista`, que contém informações sobre o nome e membros da banda.

4. **ClassicalCD.java**:
   - Extende a classe `CD` e adiciona suporte para discos clássicos, com atributos como `compositor`, `performances` e `recordingLocation`.
   - Possui métodos para adicionar performances e exibir as performances associadas a cada disco.

5. **Artista.java**:
   - Representa um artista ou banda, com atributos como `name`, `memberNames` e `memberInstruments`.

6. **Inventario.java**:
   - Contém o método `produceReport` que gera um relatório do inventário com informações sobre cada item, como título, preço e quantidade.

7. **Driver_de_Inventario.java**:
   - Classe principal que simula a criação de um inventário de itens e gera um relatório com os dados dos livros, CDs e discos clássicos.

8. **Driver_de_Book.java**:
   - Um exemplo de driver que cria e exibe informações de livros específicos.
