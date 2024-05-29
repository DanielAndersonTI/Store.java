package com.teste.java;

import java.util.Scanner;
//import java.util.Random;


public class Teste_Entrada {
	public static final double EXATA = 74.5;
	public static void main(String[] args) {
		//Random teste = new Random ();
		Scanner texto = new Scanner(System.in);
		
		System.out.println("Adicione um nome: ");
		String letra = texto.nextLine();
		System.out.println("Bem vindo! "  + letra);
		
		System.out.println("Digite um valor inteiro: ");
		int valor = texto.nextInt();
		System.out.println("O numero digitado foi: " + valor);
		
		System.out.println("Digite um valor flutuante: ");
		float valor_1 = texto.nextFloat();
		System.out.println("O numero digitado foi: " + valor_1);
;		
		System.out.println("Entre com o Comprimento: ");
		double comprimento = texto.nextDouble();
		double area = calculoArea( EXATA, comprimento );
		System.out.println("A área é: "  + area);
		
		
		texto.close();	
	
	}
	
	public static final double calculoArea(double exata, double comprimento) 
	{
		return exata * comprimento;
	}
}
