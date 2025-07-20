package com.spring;

public class Engine {
	int id;
	String make;
	String capacity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engine(int id, String make, String capacity) {
		super();
		this.id = id;
		this.make = make;
		this.capacity = capacity;
	}
	
	

}
