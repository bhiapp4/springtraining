package org.jnit.tightcoupling;
//Factory design pattern
//brings instanitaion logic(object creation) into once centralized place
public class ShapeFactory {

	public static Shape getShape(String shape) {
		
		if (shape.equals("circle")) {
			return new Circlular();
		}
		if (shape.equals("triangle")) {
			return new Triangle();
		} else {
			return new Rectangle();
		}

	}
}
