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
		// �������̽��� ������ �ڷ������� ����� �����ϴ�.
		//��ü������ �ȵ�.
		AnimalBarkAble animal;
		
		//�������̽� ������ �������� �������̽��� ������ ��ü ��ü!
		//animal=new Animal(); <- implements ���ؼ� �ȉ�
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
		//���� �۾����� �ɷ��� ���
		
		int age=animal.age;
		System.out.println(age);
		
		
		
		
		
	}

}
