package org.jnit.annotations;

import org.springframework.stereotype.Component;

@Component("triangle")
public class Triangle implements Shape{

	@Override
	public void drawShape() {
		System.out.println("Drawing Triangle...");
	}
}
