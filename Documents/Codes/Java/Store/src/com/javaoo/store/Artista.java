package com.javaoo.store;

public class Artista {
    // Atributos específicos da classe Artista
    private String name;                          // Nome do artista ou banda
    private String[] memberNames = new String[20];  // Nomes dos membros do artista/banda (até 20 membros)
    private String[] memberInstruments = new String[20];  // Instrumentos tocados pelos membros (correspondente aos membros)

    /**
     * Construtor para inicializar um objeto da classe Artista.
     * @param name Nome do artista ou banda
     */
    public Artista(String name) {
        super();
        this.setName(name);  // Inicializa o nome do artista/banda
    }

    // Métodos getter e setter para o atributo name

    public String getName() {
        return name;
    }

    /**
     * Define o nome do artista ou banda.
     * @param name Nome a ser atribuído ao artista/banda
     */
    public void setName(String name) {
        this.name = name;
    }
}
