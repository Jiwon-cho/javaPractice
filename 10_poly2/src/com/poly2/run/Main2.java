package com.poly2.run;

import com.poly2.common.AnimalBarkAble;
import com.poly2.common.FlyAble;
import com.poly2.controller.AnimalController;
import com.poly2.model.vo.Cat;
import com.poly2.model.vo.Chicken;
import com.poly2.model.vo.Dog;
import com.poly2.model.vo.Lion;

public class Main2 {

	public static void main(String[] args) {
		// 인터페이스도 변수의 자료형으로 사용이 가능하다.
		//자체생성은 안됨.
		AnimalBarkAble animal;
		
		//인터페이스 참조형 변수에는 인터페이스를 구현한 객체 전체!
		//animal=new Animal(); <- implements 안해서 안됌
		//animal
		
		animal=new Dog();
		animal.bark();
		animal.move();
		animal=new Cat();
		animal.bark();
//		
//		
		
		AnimalController ac=new AnimalController();
		
		ac.bark(new Lion());
		ac.bark(new Dog());
		ac.bark(new Chicken());
		
		ac.fly(new Chicken());
		
		//animal=new Chicken();
		FlyAble f= new Chicken();
		ac.fly(f);
		animal.move();
		//공통 작업에서 능률을 향상
		
		int age=animal.age;
		System.out.println(age);
		
		
		
		
		
	}

}
