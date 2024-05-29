/**
 * 
 */
package com.lq.exercises;

/**
 * 
 */
public class Box extends Shape implements TwoDimensional {
	
		private double altura = 1;
		private double largura =1;
		private double comprimento =1;
		
		
		public Box(double comprimento, double largura, double altura) {
			super();
			//super();
			if(comprimento > 0)
				this.comprimento = comprimento;
			if( largura > 0)
				this.largura = largura;
			if( altura > 0)
				this.altura = altura;
			
		}
		
		Box (double lado) {
			this(lado, lado, lado);
		}	
		public Box( double comprimento, double largura, double altura, String color, String name) {
		this(comprimento, largura, altura);
		setColor(color);
		setName(name);
		
			
		}
		/**
		 * @return the altura
		 */
		public double getAltura() {
			return altura;
		}
		/**
		 * @param altura the altura to set
		 */
		public void setAltura(double altura) {
			this.altura = altura;
		}
		/**
		 * @return the largura
		 */
		public double getLargura() {
			return largura;
		}
		/**
		 * @param largura the largura to set
		 */
		public void setLargura(double largura) {
			this.largura = largura;
		}
		/**
		 * @return the comprimento
		 */
		public double getComprimento() {
			return comprimento;
		}
		/**
		 * @param comprimento the comprimento to set
		 */
		public void setComprimento(double comprimento) {
			this.comprimento = comprimento;
		}
		
	public double getVolume() {
		return (altura * largura * comprimento);
	}
	
	public double  getSurfaceArea() {
		return ((largura * comprimento + comprimento * altura + altura * largura) * 2);
	}
	
	public void printBox(){
		if ( largura <= 0 || comprimento <= 0 || altura <= 0) {
			System.out.println("Os parâmetros desta caixa são inválidos");
		}
		else {
			System.out.println("Comprimento = " + comprimento);
			System.out.println("Altura = " + altura);
			System.out.println("Largura = " + largura);
			System.out.println("Volume = " + getVolume());
			System.out.println("Área da Superfície = " +  getSurfaceArea());
		}
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Box [comprimento=");
		builder.append(comprimento);
		builder.append(" , largura=");
		builder.append(largura);
		builder.append(" , altura=");
		builder.append(altura);
		builder.append(" , getColor()=");
		builder.append(getColor());
		builder.append(" , getName()=");
		builder.append(getName());
		builder.append("]");
		return builder.toString();
	
	}

	
}

