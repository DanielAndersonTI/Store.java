package com.teste;

// A classe PilhaVaziaException é uma exceção personalizada que estende RuntimeException.
// Ela é usada para indicar que uma operação foi tentada em uma pilha vazia, 
// ou seja, quando se tenta desempilhar um elemento de uma pilha que não contém elementos.

public class PilhaVaziaException extends RuntimeException {

	// Construtor da exceção PilhaVaziaException.
	// Ele recebe uma mensagem que será passada para o construtor da classe pai (RuntimeException).
	public PilhaVaziaException(String msg) {
		super(msg); // Chama o construtor da classe pai com a mensagem fornecida
	}
}
