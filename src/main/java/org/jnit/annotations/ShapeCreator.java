package org.jnit.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//shapecreator class has a dependency on shape instance(circle, triangle or rectangle)
@Component
public class ShapeCreator {

	
	@Autowired
	@Qualifier("triangle")
	private Shape shape;
	
//	public ShapeCreator(Shape shape){
//		this.shape = shape;
//	}
	
	public ShapeCreator(){
		
	}
	
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public Shape getShape() {
		return shape;
	}
}
