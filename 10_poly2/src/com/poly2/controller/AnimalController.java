package com.poly2.controller;

import com.poly2.common.AnimalBarkAble;
//import com.poly2.model.vo.Cat;
//import com.poly2.model.vo.Dog;
//import com.poly2.model.vo.Lion;
import com.poly2.common.FlyAble;

public class AnimalController {
	
	//�� ���α׷��� ����� �������� ¢���ϴ� �޼ҵ�
//	public void bark(Dog d) {
//		
//	}
//	public void bark(Cat c) {
//		
//	}
//	public void bark(Lion l) {
//		
//	}
	
	public void bark(AnimalBarkAble a) {
		a.bark();
	}
	
	
	public void fly(FlyAble f) {
		f.fly();
	}
}
