package org.jnit.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ShapeCreator3 implements Shape {
	
	@Autowired
	@Qualifier("circle")
	private Shape shape;

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	@Override
	public void drawShape() {
		shape.drawShape();
		
	}

		
	
}
