package com.lq.exercises;

public class CuboDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cubo cubo1 = new Cubo(5);
		Cubo cubo2 = new Cubo(8);
		
		System.out.println("Cubo 1 Altura é + " + cubo1.getAltura());
		System.out.println("Cubo 1 Largura é + " + cubo1.getLargura());
		System.out.println("Cubo 1 Comprimentoa é + " + cubo1.getComprimento());
		System.out.println( );
		System.out.println("Cubo 2 Altura é + " + cubo2.getAltura());
		System.out.println("Cubo 2 Largura é + " + cubo2.getLargura());
		System.out.println("Cubo 2 Comprimento é + " + cubo2.getComprimento());
		System.out.println( );
		System.out.println("_________________________________________________________" );
		System.out.println( );
		
		cubo1.setComprimento(20);
		cubo1.printBox();
		System.out.println( );
		System.out.println("_________________________________________________________" );
		
		cubo1.setLados(40);
		cubo1.printBox();
		System.out.println( );
		System.out.println("_________________________________________________________" );
		
		cubo2.setLargura(-5);
		cubo2.printBox();
	}

}
