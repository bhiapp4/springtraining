package org.jnit.beanwiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//we can apply Autowired annotation on top of a constructor, property and setter
@Component
public class ShapeCreator {
	
	//@Autowired
	private Circle circle;
	
	public Circle getCircle() {
		return circle;
	}
	
	//@Autowired
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	@Autowired
	public ShapeCreator(Circle circle){
		this.circle = circle;
	}
	
	public ShapeCreator(){
		
	}
}
