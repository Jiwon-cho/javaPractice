package com.poly2.model.vo;

import com.poly2.common.AnimalBarkAble;

public class Lion extends Animal implements AnimalBarkAble {

	public Lion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lion(String category, String name, int age, char gender) {
		super(category, name, age, gender);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void bark() {
		System.out.println("æÓ»Ô");
	}
}
