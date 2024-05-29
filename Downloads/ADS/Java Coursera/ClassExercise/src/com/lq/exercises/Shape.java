package com.lq.exercises;

public abstract class Shape {
	
	private String color;
	private String name;
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	public double getAreadaSuperficie() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Shape [color=");
		builder.append(color);
		builder.append(" , name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	
}
