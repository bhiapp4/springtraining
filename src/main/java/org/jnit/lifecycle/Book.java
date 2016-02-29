package org.jnit.lifecycle;

public class Book {
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void init(){
		System.out.println("I am inside custom init method for book");
	}
	
	public void destroy(){
		System.out.println("Perform something in this method before book object gets removed from the container");
	}

}
