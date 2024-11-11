package com.javaoo.store;

public class Item {
    // Atributos da classe Item, que representam os dados básicos do item no inventário.
    private String titulo;  // Título do item (por exemplo, o nome de um livro ou CD)
    private double preco;   // Preço do item
    private int quantidade; // Quantidade do item no estoque

    /**
     * Construtor padrão da classe Item.
     * Este construtor não recebe parâmetros e serve para criar um objeto Item sem inicializar seus valores.
     */
    public Item () {
        // Construtor vazio, inicializa o objeto, mas sem valores atribuídos.
    }

    /**
     * Construtor da classe Item, que inicializa os atributos com os valores fornecidos.
     * @param titulo O título do item
     * @param preco O preço do item
     * @param quantidade A quantidade disponível do item
     */
    public Item (String titulo, double preco, int quantidade) {
        super(); // Chama o construtor da classe pai (Object)
        this.setTitulo(titulo);   // Define o título do item
        this.setPreco(preco);     // Define o preço do item
        this.setQuantidade(quantidade);  // Define a quantidade do item
    }

    /**
     * Método getter para o título do item.
     * @return O título do item
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Método setter para o título do item.
     * Este método permite que o título do item seja alterado.
     * @param titulo O título a ser atribuído ao item
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Método getter para o preço do item.
     * @return O preço do item
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Método setter para o preço do item.
     * Este método permite que o preço do item seja alterado.
     * @param preco O preço a ser atribuído ao item
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Método getter para a quantidade do item.
     * @return A quantidade do item
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Método setter para a quantidade do item.
     * Este método permite que a quantidade do item seja alterada.
     * @param quantidade A quantidade a ser atribuída ao item
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

