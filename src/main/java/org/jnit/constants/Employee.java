package org.jnit.constants;

import java.util.List;

public class Employee {

	private String name;
	private int age;
	private String companyName;
	private List<String>locations;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public void setLocations(List<String> locations) {
		this.locations = locations;
	}
	
	public List<String> getLocations() {
		return locations;
	}

}
