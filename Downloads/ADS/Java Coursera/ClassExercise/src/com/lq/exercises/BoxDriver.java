/**
 * 
 */
package com.lq.exercises;

/**
 * 
 */
public class BoxDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Exercício 1: Criação de objetos
		
		Box box1 = new Box (5,6,7);
		Box box2 = new Box (10);
		
		System.out.println( "O comprimento de box 1 é :" + box1.getComprimento());
		System.out.println( "A largura de  de box 1 é :" + box1.getLargura());
		System.out.println( "A altura de de box 1 é :" + box1.getAltura());
		System.out.println( "O comprimento de box 2 é :" + box2.getComprimento());
		System.out.println( "A largura de box 2 é :" + box2.getLargura());
		System.out.println( "A altura de box 2 é :" + box2.getAltura());
		
		// Exercício 2: Testar métodos de negócios
		
		box1.setComprimento(3);
		box1.setLargura(4);
		box1.setAltura(5);
		
		System.out.println( "O comprimento da caixa box1 é: " + box1.getComprimento());
		System.out.println( "A largura de box 1 é: " + box1.getLargura());
		System.out.println( "A altura de box 1 é: " + box1.getAltura());
		System.out.println( "O volume de box 1 é: " + box1.getVolume());
		System.out.println( "A área da superfície de box1 é: " + box1.getSurfaceArea());
		
		box1.printBox();
		
		box1.setComprimento(-5);
		box1.printBox();
		
		box1.setLargura(-7);
		box1.setAltura(-3);
		box1.printBox();
		
		// Exercício de desafio
		
		Box box3 = new Box (5 ,-4, 0);
		box3.printBox();
		
		

	}

}
