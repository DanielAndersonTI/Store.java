package com.teste.java;

import java.util.Scanner;

public class Test_de_Incrementos {

	public static void main(String[] args) {
		
	/** int x = 10;
		int result = 0;
		// Testing increments and decrements.
		System.out.println("Este é o valor inicial de result: " + result);
		result = --x;
		System.out.println("Este é o valor de x após o incremento:" + x);
		System.out.println("Este é o valor de result após o incremento:" + result);
	 */
		
		// Ternary conditional test.
		
		int y = 14;
		String b;
   /**  b = ( y == 10)? "Se sim, o valor de b será 10":"Se este valor apareceu, significa que o valor de b é diferente de 10";
		System.out.println("O valor de b é: " + b);
		b = (y < 13)? "Se este mensagem apareceu, significa que y é menor que 13, então o valor de b será 12, ou seja, o valor de y." : "Se este valor apareceu, significa que y é maior ou igual  a 13";
		System.out.println("O valor de b é: " + b);
   */

		// Testing Ternary Conditional chaining
		// y será a hora que a pessoa chegou. O valor dentro da condicional, será o horario que a pessoa deverá chegar.
		//b = ( y > 14 )? "Você está atrasado!": (y < 14)?"Você está adiantado":"Voçê está no horário ";
		//System.out.println("Seu estatus é: " + b);
		
		Scanner entrada = new Scanner (System.in);
		String nome;
		System.out.println("Digite um nome ou s para sair:");
		nome = entrada.nextLine();
		
		while(!nome.equals("s")) {
			System.out.println("Bem vindo!" + nome);
			System.out.println("Digite outro nome ou s para sair:");
			nome = entrada.nextLine();
		}
		System.out.println("Fim da execução!");
	}

}
