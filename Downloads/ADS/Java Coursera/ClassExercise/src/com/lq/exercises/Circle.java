package com.lq.exercises;
//import java.math.*;
public class Circle extends Shape implements TwoDimensional {
	
	private static final double PI = 0;
	private double radius;
	
	public Circle (double radius) {
		this(radius, "White","Unknown");
		
	}

	public Circle(double radius, String color, String name) {
		setRadius(radius);
		setColor(color);
		setName(name);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return  PI * radius * radius;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2 * PI * radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	private void setRadius(double radius) {
		this.radius = radius;
		
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circle [radius=");
		builder.append(radius);
		builder.append(" , getColor()=");
		builder.append(getColor());
		builder.append(" , getName()=");
		builder.append(getName());
		builder.append("]");
		return builder.toString();
		 
	}
}
