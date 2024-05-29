package com.teste.java;

import java.util.Scanner;

public class Mario {

	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		int valor;
		
		do 
		{
			System.out.println("Digite um valor de 1 a 8: ");
			valor = Entrada.nextInt();
		}
		while( valor < 1 || valor > 8 );
		
		if ( valor == 1) {
			System.out.println("#");
		}
		else if  (valor == 2) {
			System.out.println(" #");
			System.out.println("##");
		}
		else if ( valor == 3) {
			System.out.println("  #");
			System.out.println(" ##");
			System.out.println("###");
		}
		else if ( valor == 4) {
			System.out.println("   #");
			System.out.println("  ##");
			System.out.println(" ###");
			System.out.println("####");
		}
		else if ( valor ==5) {
			System.out.println("    #");
			System.out.println("   ##");
			System.out.println("  ###");
			System.out.println(" ####");
			System.out.println("#####");
		}
		else if ( valor == 6) {
			System.out.println("     #");
			System.out.println("    ##");
			System.out.println("   ###");
			System.out.println("  ####");
			System.out.println(" #####");
			System.out.println("######");
		}
		else if  ( valor == 7 ) {
			System.out.println("      #");
			System.out.println("     ##");
			System.out.println("    ###");
			System.out.println("   ####");
			System.out.println("  #####");
			System.out.println(" ######");
			System.out.println("#######");
		}
		else if (valor == 8 ){
			System.out.println("       #");
			System.out.println("      ##");
			System.out.println("     ###");
			System.out.println("    ####");
			System.out.println("   #####");
			System.out.println("  ######");
			System.out.println(" #######");
			System.out.println("########");
		}
		
		Entrada.close();

	}

}
