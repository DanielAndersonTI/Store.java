package com.javaoo.store.drivres;

import com.javaoo.store.Item;

public class Book extends Item {
    private String autor;
    private String editor;
    private String categoria;

    // Construtor da classe Book com todos os parâmetros necessários
    public Book(String titulo, double preco, int quantidade, String autor, String editor, String categoria) {
        super(titulo, preco, quantidade); // Chama o construtor da classe pai (Item), passando título, preço e quantidade
        this.setAutor(autor);  // Define o autor do livro
        this.setEditor(editor); // Define a editora do livro
        this.setCategoria(categoria); // Define a categoria do livro
    }

    // Construtores adicionais para diferentes cenários (caso queira flexibilidade)
    // Este construtor permite criar um livro com título e preço, definindo valores padrão para os outros campos.
    public Book(String titulo, double preco) {
        super(titulo, preco, 0); // Define a quantidade como 0 por padrão
        this.setAutor("Desconhecido"); // Autor padrão se não for fornecido
        this.setEditor("Desconhecido"); // Editora padrão se não for fornecido
        this.setCategoria("Desconhecida"); // Categoria padrão se não for fornecida
    }

    // Métodos getters e setters para acessar e modificar os atributos privados
    public String getAutor() {
        return autor;  // Retorna o autor do livro
    }

    public void setAutor(String autor) {
        this.autor = autor;  // Define o autor do livro
    }

    public String getEditor() {
        return editor;  // Retorna a editora do livro
    }

    public void setEditor(String editor) {
        this.editor = editor;  // Define a editora do livro
    }

    public String getCategoria() {
        return categoria;  // Retorna a categoria do livro
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;  // Define a categoria do livro
    }

    // Método toString para exibir as informações de forma mais legível (opcional)
    @Override
    public String toString() {
        // Retorna uma string formatada contendo as informações do livro
        return "Livro: " + getTitulo() + ", Autor: " + autor + ", Editor: " + editor + ", Categoria: " + categoria;
    }
}


