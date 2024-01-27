package com.tech;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private int id;
	
	private String name;
	
	private List<String> mobilnumber;
	
	private Set<Integer> number;
	
	private Map<Integer, String> maps;
	

	public Employee() {
		System.out.println("Inside Employee Constructor....");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMobilnumber() {
		return mobilnumber;
	}

	public void setMobilnumber(List<String> mobilnumber) {
		this.mobilnumber = mobilnumber;
	}
	
	public Set<Integer> getNumber() {
		return number;
	}

	public void setNumber(Set<Integer> number) {
		this.number = number;
	}

	public Map<Integer, String> getMaps() {
		return maps;
	}

	public void setMaps(Map<Integer, String> maps) {
		this.maps = maps;
	}

	
}
