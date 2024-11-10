package com.pilha;

import com.teste.PilhaCheiaException; // Importa a exceção personalizada PilhaCheiaException, usada quando a pilha está cheia
import com.teste.PilhaVaziaException; // Importa a exceção personalizada PilhaVaziaException, usada quando a pilha está vazia

public class Pilha {

	private Object[] elementos; // Array que armazenará os elementos da pilha
	private int quantidade = 0; // Contador para rastrear a quantidade de elementos na pilha

	// Construtor da classe Pilha que inicializa a pilha com um tamanho máximo
	public Pilha(int maximo) {
		elementos = new Object[maximo]; // Cria o array de elementos com a capacidade definida por 'maximo'
	}

	// Método que verifica se a pilha está vazia
	public boolean estaVazia() {
		return quantidade == 0; // Retorna true se a pilha não contiver elementos
	}

	// Método que retorna o número de elementos na pilha
	public int tamanho() {
		return quantidade; // Retorna a quantidade de elementos empilhados
	}

	// Método que empilha um novo elemento na pilha
	public void empilha(Object elemento) {
		// Verifica se a pilha atingiu sua capacidade máxima
		if (quantidade == elementos.length)
			throw new PilhaCheiaException("Não é possível empilhar mais elementos"); // Lança uma exceção se tentar
																						// empilhar quando a pilha está
																						// cheia
		this.elementos[quantidade] = elemento; // Empilha o elemento no próximo espaço disponível
		quantidade++; // Atualiza a quantidade de elementos na pilha
	}

	// Método que retorna o elemento no topo da pilha sem removê-lo
	public Object topo() {
		return elementos[quantidade - 1]; // Retorna o último elemento empilhado (o topo da pilha)
	}

	// Método que remove e retorna o elemento no topo da pilha
	public Object desempilha() {
		// Verifica se a pilha está vazia antes de tentar desempilhar
		if (estaVazia())
			throw new PilhaVaziaException("Não é possível desempilhar."); // Lança uma exceção se tentar desempilhar uma
																			// pilha vazia
		Object topo = topo(); // Armazena o topo da pilha para retorná-lo depois
		quantidade--; // Reduz a quantidade de elementos na pilha
		return topo; // Retorna o elemento que estava no topo da pilha
	}
}
