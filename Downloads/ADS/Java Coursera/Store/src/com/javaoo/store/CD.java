package com.javaoo.store;

import java.util.Date;

public class CD extends Item {
	private Artista artista;
	private Date releaseDate;
	/**
	 * @return the artista
	 */
	public CD(String titulo, double preco, int quantidade, Artista artista, Date releaseDate) {
		super(titulo, preco, quantidade);
		this.setArtista(artista);
		this.setReleaseDate(releaseDate);
	}
	
	public Artista getArtista() {
		return artista;
	}
	/**
	 * @param artista the artista to set
	 */
	public void setArtista(Artista artista) {
		this.artista = artista;
	}
	/**
	 * @return the releaseDate
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}
	/**
	 * @param releaseDate the releaseDate to set
	 */
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	
}
