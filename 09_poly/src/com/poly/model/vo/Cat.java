package com.poly.model.vo;

public class Cat extends Animal{
	private int ears;

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	//ALt+s+c
	public Cat(String name, String category, int age, double weight, char gender, String habitat,int ears) {
		super(name, category, age, weight, gender, habitat);
		// TODO Auto-generated constructor stub
		this.ears=ears;
	}
	
	public void barkCat() {
		System.out.println("具克具克!");
	}
	
@Override
public void bark() {
	barkCat();
}
}
