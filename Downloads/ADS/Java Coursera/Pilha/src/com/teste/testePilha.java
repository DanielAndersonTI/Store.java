package com.teste;

import static org.junit.jupiter.api.Assertions.*; // Importa as asserções do JUnit 5 para realizar verificações
import org.junit.jupiter.api.BeforeEach; // Importa a anotação @BeforeEach para executar configurações antes de cada teste
import org.junit.jupiter.api.Test; // Importa a anotação @Test para identificar métodos de teste

import com.pilha.Pilha; // Importa a classe Pilha que será testada

public class testePilha {

	private Pilha p; // Declara uma variável do tipo Pilha para ser usada nos testes

	// Método que é executado antes de cada teste para inicializar o objeto Pilha
	@BeforeEach // Usando @BeforeEach, correto para JUnit 5
	public void inicializaPilha() {
		p = new Pilha(10); // Cria uma nova instância de Pilha com capacidade para 10 elementos
	}

	// Teste que verifica se a pilha está vazia
	@Test
	public void pilhaVazia() {
		assertTrue(p.estaVazia()); // Verifica se a pilha está vazia
		assertEquals(0, p.tamanho()); // Verifica se o tamanho da pilha é 0
	}

	// Teste que verifica o funcionamento do empilhamento de um elemento
	@Test
	public void empilhaUmElemento() {
		p.empilha("Primeiro"); // Empilha o elemento "Primeiro"
		assertFalse(p.estaVazia()); // Verifica se a pilha não está vazia após o empilhamento
		assertEquals(1, p.tamanho()); // Verifica se o tamanho da pilha é 1
		assertEquals("Primeiro", p.topo()); // Verifica se o topo da pilha é "Primeiro"
	}

	// Teste que verifica o empilhamento e desempilhamento de elementos
	@Test
	public void empilhaEDesempilha() {
		p.empilha("Primeiro"); // Empilha o elemento "Primeiro"
		p.empilha("Segundo"); // Empilha o elemento "Segundo"
		assertEquals(2, p.tamanho()); // Verifica se o tamanho da pilha é 2
		assertEquals("Segundo", p.topo()); // Verifica se o topo da pilha é "Segundo"
		Object desempilhado = p.desempilha(); // Desempilha o topo da pilha
		assertEquals(1, p.tamanho()); // Verifica se o tamanho da pilha é 1 após o desempilhamento
		assertEquals("Primeiro", p.topo()); // Verifica se o topo da pilha é "Primeiro" após o desempilhamento
		assertEquals("Segundo", desempilhado); // Verifica se o valor desempilhado é "Segundo"
	}

	// Teste que verifica o comportamento ao tentar adicionar elementos em uma pilha
	// cheia
	@Test
	public void adicionaNaPilhaCheia() {
		// Empilha até a pilha atingir a capacidade
		for (int i = 0; i < 10; i++) {
			p.empilha("elemento" + i); // Empilha 10 elementos
		}
		// Verifica se a exceção PilhaCheiaException é lançada ao tentar empilhar além
		// da capacidade
		assertThrows(PilhaCheiaException.class, () -> {
			p.empilha("boom"); // Tenta empilhar quando a pilha já está cheia
		});
	}
}
