package com.poly.model.vo;

public class Dog extends Animal{
	private String master;
	
	public Dog() {}

	public Dog(String name, String category, int age, double weight, char gender, String habitat) {
		super(name, category, age, weight, gender, habitat);
		// TODO Auto-generated constructor stub
	}
	 
	public void barkDog() {
		System.out.println("¸Û¸Û");
	}
	public void setMaster(String master) {
		this.master=master;
	}
	public String getMaster() {
		return master;
	}
	
	@Override
	public void bark() {
		barkDog();
	}
	
}
