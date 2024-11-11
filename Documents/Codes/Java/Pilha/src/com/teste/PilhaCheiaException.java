package com.teste;

// A classe PilhaCheiaException é uma exceção personalizada que estende RuntimeException.
// Ela é usada para indicar que uma operação foi tentada em uma pilha cheia, 
// ou seja, quando se tenta empilhar mais elementos em uma pilha que já atingiu sua capacidade máxima.

public class PilhaCheiaException extends RuntimeException {

	// Construtor da exceção PilhaCheiaException.
	// Ele recebe uma mensagem que será passada para o construtor da classe pai (RuntimeException).
	public PilhaCheiaException(String message) {
		super(message); // Chama o construtor da classe pai com a mensagem fornecida
	}

}

