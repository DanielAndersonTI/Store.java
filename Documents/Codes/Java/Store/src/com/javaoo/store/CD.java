package com.javaoo.store;

import java.util.Date;

public class CD extends Item {
    // Atributos específicos da classe CD
    private Artista artista;         // O artista do CD
    private Date releaseDate;        // Data de lançamento do CD

    /**
     * Construtor para inicializar um objeto da classe CD.
     * @param titulo Título do CD
     * @param preco Preço do CD
     * @param quantidade Quantidade disponível do CD
     * @param artista Artista do CD
     * @param releaseDate Data de lançamento do CD
     */
    public CD(String titulo, double preco, int quantidade, Artista artista, Date releaseDate) {
        // Chama o construtor da classe pai (Item) para inicializar os atributos comuns
        super(titulo, preco, quantidade);
        
        // Inicializa os atributos específicos da classe CD
        this.setArtista(artista);
        this.setReleaseDate(releaseDate);
    }

    // Métodos getter e setter para os atributos da classe

    public Artista getArtista() {
        return artista;
    }

    /**
     * Define o artista do CD.
     * @param artista Artista a ser atribuído ao CD
     */
    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    /**
     * Define a data de lançamento do CD.
     * @param releaseDate Data de lançamento a ser atribuída
     */
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}

