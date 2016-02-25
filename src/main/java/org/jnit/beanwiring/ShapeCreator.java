package org.jnit.beanwiring;

public class ShapeCreator {

	private Circle circle;
	
	public ShapeCreator(Circle circle){
		this.circle = circle;
	}
	
	public ShapeCreator(){
		
	}
	
	public Circle getCircle() {
		return circle;
	}
	
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
}
