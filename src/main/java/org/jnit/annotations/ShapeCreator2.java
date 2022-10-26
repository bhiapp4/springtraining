package org.jnit.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ShapeCreator2 {
	
	@Autowired
	@Qualifier("rectangle")
	private Shape shape;
		
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public Shape getShape() {
		return shape;
	}
}
