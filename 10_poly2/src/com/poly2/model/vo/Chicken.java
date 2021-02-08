package com.poly2.model.vo;

import com.poly2.common.AnimalBarkAble;
import com.poly2.common.FlyAble;

public class Chicken extends Animal implements AnimalBarkAble, FlyAble {
	
	
	
	
	public Chicken() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void fly() {
		System.out.println("Çª´Ù´ß");
	}
	
	
	public void bark() {
		System.out.println("²¿³¢¿À");
	}
	
	
}
