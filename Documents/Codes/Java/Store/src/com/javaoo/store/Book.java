package com.javaoo.store;

public class Book extends Item {
    // Atributos específicos da classe Book
    private String autor;         // Autor do livro
    private String editor;        // Editora do livro
    private String categoria;     // Categoria do livro (ex: ficção, técnico, etc.)

    /**
     * Construtor para inicializar um objeto da classe Book.
     * @param titulo Título do livro
     * @param preco Preço do livro
     * @param quantidade Quantidade disponível do livro
     * @param autor Autor do livro
     * @param editor Editora do livro
     * @param categoria Categoria do livro
     */
    public Book(String titulo, double preco, int quantidade, String autor, String editor, String categoria) {
        // Chama o construtor da classe pai (Item) para inicializar os atributos comuns
        super(titulo, preco, quantidade);
        
        // Inicializa os atributos específicos da classe Book
        this.setAutor(autor);
        this.setEditor(editor);
        this.setCategoria(categoria);
    }

    // Métodos getter e setter para os atributos da classe

    public String getAutor() {
        return autor;
    }

    /**
     * Define o autor do livro.
     * @param autor Autor a ser atribuído ao livro
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditor() {
        return editor;
    }

    /**
     * Define a editora do livro.
     * @param editor Editora a ser atribuída ao livro
     */
    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getCategoria() {
        return categoria;
    }

    /**
     * Define a categoria do livro.
     * @param categoria Categoria a ser atribuída ao livro
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

