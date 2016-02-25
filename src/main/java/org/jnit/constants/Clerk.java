package org.jnit.constants;

import java.util.List;
import java.util.Map;

public class Clerk {
	private String name;
	private List<String>locations;
	private Map<String,String>statesMap;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getLocations() {
		return locations;
	}
	public void setLocations(List<String> locations) {
		this.locations = locations;
	}
	
	public Map<String, String> getStatesMap() {
		return statesMap;
	}
	
	public void setStatesMap(Map<String, String> statesMap) {
		this.statesMap = statesMap;
	}
	
	
}
