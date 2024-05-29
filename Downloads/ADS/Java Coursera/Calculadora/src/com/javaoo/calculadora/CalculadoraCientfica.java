package com.javaoo.calculadora;

public class CalculadoraCientfica {
	
	public static final double PI = 3.14159;
	private double valorderetencao;
	
	public final double exp( double value) {
		return (Math.exp(value));	
	}
	
	public final double log ( double value) {
		return (Math.log(value));
		}
	
	public final void putvaluenamemoria ( double value) {
		valorderetencao = value;
	}
	
	public final double getvalueforadamemoria () {
		return (valorderetencao);
	}

}
