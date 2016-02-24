package org.jnit.tightcoupling;

public class Main {

	public static void main(String[] args) {
//		Shape s = new Circle();
//		Shape s1 = new Rectangle();
//		Circle c1 = new Circle();
		
		Shape circle = ShapeFactory.getShape("Circle");
		Shape triangle = ShapeFactory.getShape("triangle");
	}

}
