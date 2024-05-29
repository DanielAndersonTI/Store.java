package com.javaoo.store;

public class Book extends Item {
	private String autor;
	private String editor;
	private String categoria;
	/**
	 * @return the autor
	 */
	public Book (String titulo, double preco, int quantidade, String autor, String editor, String categoria ) {
		super(titulo, preco, quantidade);
		this.setAutor(autor);
		this.setEditor(editor);
		this.setCategoria(categoria);
	}
	
	public String getAutor() {
		return autor;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * @return the editor
	 */
	public String getEditor() {
		return editor;
	}
	/**
	 * @param editor the editor to set
	 */
	public void setEditor(String editor) {
		this.editor = editor;
	}
	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
