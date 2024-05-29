package com.javaoo.store;

public class Item {
	private String titulo;
	private double preco;
	private int quantidade;
	/**
	 * @return the titulo
	 */
	public Item () {
		
	}
	public Item (String titulo, double preco, int quantidade) {
		super();
		this.setTitulo(titulo);
		this.setPreco(preco);
		this.setQuantidade(quantidade);
	}
	
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the preco
	 */
	public double getPreco() {
		return preco;
	}
	/**
	 * @param preco the preco to set
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}
	/**
	 * @return the quantidade
	 */
	public int getQuantidade() {
		return quantidade;
	}
	/**
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
