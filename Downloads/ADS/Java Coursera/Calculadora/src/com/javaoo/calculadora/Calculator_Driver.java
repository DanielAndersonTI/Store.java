/**
 * 
 */
package com.javaoo.calculadora;

/**
 * 
 */
public class Calculator_Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculadoraBasica cb = new CalculadoraBasica();
		System.out.println("7 + 7 = " + cb.adicao(7, 7));
		System.out.println("7 - 7 = " + cb.subtrair(7, 7));
		System.out.println("7 * 7 = " + cb.multiplicar(7, 7));
		System.out.println("7 / 7 = " + cb.dividir(7, 7));
		
		CalculadoraCientfica cc = new CalculadoraCientfica();
		System.out.println("Expoente de 20 é: " + cc.exp(20));
		System.out.println("Lorarítimo de 100 é: " + cc.log(100));
		cc.putvaluenamemoria(23.5);
		System.out.println("O valor na memoria é: " + cc.getvalueforadamemoria());
		
		CalculadoraTrigonometrica ct = new CalculadoraTrigonometrica();
		System.out.println("Seno de .523 é: " + ct.seno(.523));
		System.out.println("Cosseno de .523 é: " + ct.cosseno(.523));
		System.out.println("Tangente de .523 é: " + ct.tangent(.523));
		System.out.println("Arco-Seno de .523 é: " + ct.arcoseno(.523));
		System.out.println(" Arco-Cosseno de .523 é: " + ct.arcocosseno(.523));
		System.out.println("Aeco-Tangente de .523 é: " + ct.arcotangent(523));
		
		
		
		
		
		

	}

}
