package org.jnit.annotations;

import org.springframework.stereotype.Component;

@Component("circle")
public class Circle implements Shape{

	@Override
	public void drawShape() {
		System.out.println("Drawing Circle...");
	}

}
