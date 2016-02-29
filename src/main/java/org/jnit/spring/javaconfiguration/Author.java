package org.jnit.spring.javaconfiguration;

import org.springframework.stereotype.Component;

@Component
public class Author {

	public void printName(){
		System.out.println("Printing name...");
	}
}
