package com.lq.exercises;

public class ExerciseShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape [] shapes = new Shape[8];
		
		shapes [0] = new Rectangle (5.0, 4.0);
		shapes [1] = new Rectangle (5.0, 5.0);
		
		shapes [2] = new Square (5.0);
		shapes [3] = new Square (8.0);
		
		shapes [4] = new Cubo (5.0);
		shapes [5] = new Cubo (12.0);
		
		shapes [6] = new Box (12.0);
		shapes [7] = new Box (3.0);
		
		/*
		for(Shape shape:shapes){shape.setColor("silver");	}
		for(Shape shape:shapes){
			TreeDimensional temp = (TreeDimensional) shape;
			System.out.println(temp.getVolume());
		}
		*/
		
		TwoDimensional [] TwoDs = new TwoDimensional[3];
		
		TwoDs[0] = new Circle(7.0);
		TwoDs[1] = new Rectangle(5.0, 4.0);
		TwoDs[2] = new Square(5.67);
		
		for(TwoDimensional temp: TwoDs) {
			System.out.println(temp.getArea());
			System.out.println(temp.getPerimetro());
		}
		
}
}
