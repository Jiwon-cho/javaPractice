package com.poly.model.vo;

public class Mouse extends Animal {
	
	public Mouse() {}

	public Mouse(String name, String category, int age, double weight, char gender, String habitat) {
		super(name, category, age, weight, gender, habitat);
		// TODO Auto-generated constructor stub
	}
	
	public void barkMouse() {
		System.out.println("Âï©");
	}

}
