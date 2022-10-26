package org.jnit.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//shapecreator class has a dependency on shape instance(circle, triangle or rectangle)
@Component
public class ShapeCreator1 {

	
	@Autowired
	@Qualifier("triangle")
	private Shape shape;   //This class has a dependecny on Shape, calls shape and calls drawShape on shape objects. 
	
//	public ShapeCreator(Shape shape){
//		this.shape = shape;
//	}
	
	public ShapeCreator1(){
		
	}
	
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public Shape getShape() {
		return shape;
	}
}
