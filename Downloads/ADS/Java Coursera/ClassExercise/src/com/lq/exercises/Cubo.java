package com.lq.exercises;

public class Cubo extends Box {
	private static double nuero;
	public Cubo(double lado) {
		super(lado);
	}
	// A partir deste ponto, irei sobrepor os lados.
	
public Cubo(double numero, String string, String String) {
		this(numero);
	}

public void setComprimento (double comprimento) {
	if (super.getComprimento() != comprimento) {
		setLados(comprimento);
	}
}

public void setLargura (double largura) {
	if (super.getLargura() != largura) {
		setLados(largura);
	}
}
public void setAltura(double altura) {
	if (super.getAltura() != altura) {
		setAltura(altura);
	}
}
// Termina aqui, a troca dos lados.
// O parâmetro dos lados será o tamanho comum de qualquer lado.

public void setLados (double lados) {
	if (lados > 0) {
		super.setComprimento(lados);
		super.setLargura(lados);
		super.setAltura(lados);
		}
	else {System.err.println("O valor passado deve ser maior que zero - Cubo inalterado");}
}
// Retorne o tamanho do lado.

public double getLados() {
	return super.getAltura();
}


}
