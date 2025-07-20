package com.spring;

public class Car {
	int cid;
	String make;
	int price;
	//car needs engine so we take eng field it needs getter and setters
	Engine eng;
	 
	
	public Engine getEng() {
		return eng;
	}
	public void setEng(Engine eng) {
		this.eng = eng;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int cid, String make, int price, Engine eng) {
		super();
		this.cid = cid;
		this.make = make;
		this.price = price;
		this.eng = eng;
	}
	

}
