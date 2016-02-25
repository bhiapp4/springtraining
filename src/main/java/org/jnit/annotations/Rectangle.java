package org.jnit.annotations;

import org.springframework.stereotype.Component;

@Component("rectangle")
public class Rectangle implements Shape{

	@Override
	public void drawShape() {
		System.out.println("Drawing Rectangle..");
	}

}
