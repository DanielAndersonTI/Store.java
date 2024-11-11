package com.javaoo.store;

import java.util.Date;

public class ClassicalCD extends Item {
    // Atributos específicos da classe ClassicalCD
    private String compositor;                  // Compositor da obra clássica
    private String[] performaces = new String[5]; // Lista de performers (máximo de 5)
    private String recordingLocation;            // Local onde a obra foi gravada
    private Date releaseDate;                    // Data de lançamento do CD
    private int performace_count = 0;            // Contador para o número de performers registrados

    /**
     * Construtor para inicializar um objeto da classe ClassicalCD.
     * @param titulo Título do CD
     * @param preco Preço do CD
     * @param quantidade Quantidade disponível do CD
     * @param compositor Compositor da obra
     * @param performaces Array de performers para o CD
     * @param recordinglocation Local de gravação da obra
     * @param releaseDate Data de lançamento do CD
     */
    public ClassicalCD(String titulo, double preco, int quantidade, String compositor, String[] performaces, String recordinglocation, Date releaseDate) {
        // Chama o construtor da classe pai (Item) para inicializar os atributos comuns
        super(titulo, preco, quantidade);
        
        // Inicializa os atributos específicos da classe ClassicalCD
        this.setCompositor(compositor);
        this.setRecordingLocation(recordinglocation);
        this.setReleaseDate(releaseDate);
        
        // Adiciona performers ao array de performers, se não for nulo
        for (int i = 0; i < performaces.length; i++) {
            if (performaces[i] != null) {
                addPerformace(performaces[i]);
            }
        }
        
        // Atribui o array de performers à variável da classe
        this.performaces = performaces;
    }

    // Métodos getter e setter para os atributos da classe
    
    public String getCompositor() {
        return compositor;
    }
    
    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }
    
    public String getRecordingLocation() {
        return recordingLocation;
    }

    public void setRecordingLocation(String recordingLocation) {
        this.recordingLocation = recordingLocation;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * Método para adicionar um performer ao array de performers.
     * Se o array estiver cheio, ele não adiciona mais performers.
     * @param performace Nome do performer a ser adicionado
     */
    public void addPerformace(String performace) {
        if (performace_count >= performaces.length) {
            // Exibe uma mensagem se o array de performers estiver cheio
            System.out.println("The performer Array is full! Cannot add");
        } else {
            // Adiciona o performer e incrementa o contador
            performaces[performace_count] = performace;
            performace_count++;
        }
    }

    /**
     * Método para exibir todos os performers associados ao CD.
     * Se não houver performers, exibe uma mensagem indicando que o array está vazio.
     */
    public void showPerformaces() {
        // Verifica se não há performers
        if (performace_count == 0)
            System.out.println("No performers have been added for this CD");
        
        // Exibe os performers registrados
        for (int i = 0; i < performace_count; i++)
            System.out.println("Performer: " + performaces[i]);
    }
}
