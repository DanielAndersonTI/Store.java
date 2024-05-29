package com.lq.exercises;

public class Rectangle extends Shape implements TwoDimensional {

	private double largura;
	private double comprimento;
	
	public Rectangle(double comprimento, double largura) {
		this (comprimento, largura, "Unknown", "White");
	}
	public Rectangle(double comprimento, double largura, String name, String color) {
		// TODO Auto-generated constructor stub
		super();
		setComprimento(comprimento);
		setLargura(largura);
		setName(name);
		setColor(color);
		
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
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return comprimento * largura;
	}
	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return (comprimento+largura)*2;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rectangle [comprimento=");
		builder.append(comprimento);
		builder.append(" , largura=");
		builder.append(largura);
		builder.append(" , getColor()=");
		builder.append(getColor());
		builder.append(" , getName()=");
		builder.append(getName());
		builder.append("]");
		return builder.toString();
		 
	}
	
	
}
