package com.poly.run;

import com.poly.controller.AnimalFunction;
import com.poly.model.vo.Animal;
import com.poly.model.vo.Cat;
import com.poly.model.vo.Dog;
import com.poly.model.vo.Rabbit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//다형성은 상속관계에 잇는 객체들에게 적용되는 기술
		//상속관계에 잇는 객체중 부모클래스 타입의 변수는 자식객체를
		//저장할수잇는 것을 의미한다.
		
		Animal al=new Animal();
		Animal a2=new Dog(); //자료형이 달라서 불가능함.
		//auto up casting //부모꺼 가지고 있는걸 부모처럼 하고 들어감
		
		//자식객체가 부모클래스의 자료형 변수에 대입되면
		//부모의 내용 확인할 수 있게 된다. -> 자식의 내용은 이용이 불가능함.
		
		//부모 클래스 자료형 변수에 자식객체를 대입하고 자식에 있는
		//내용에 접근하려면 강제적 형 변환을 해서 이용을 함.
		//(Dog)a2. <- 이렇게 하면 접근 연산자가 최우선 연산자라 먼저 접근부터 해서 안바뀜
		((Dog)a2).barkDog();
		
		//두객체에 상속관계를 설정을 하면 가능해 진다 ->다형성.
		a2=new Cat();
		((Cat)a2).barkCat();
		a2=new Rabbit();
		((Rabbit)a2).barkRabbit();
		
		
		
		AnimalFunction af=new AnimalFunction();
		af.bark(new Cat());
		af.bark(new Dog());
		
		//한개타입으로 여러 타입을 받을 수 있음
		//배열 객체배열! -> 한가지만(type) 사용이 가능!
		//부모의 타입으로 선언하면 4개의 자식 타입을 한개의 배열로 다 관리!
		Animal[] animals=new Animal[3];
		animals[0]=new Dog("느그자","진돗개",32,22.2,'m',"한국");
		animals[1]=new Cat();
		animals[2]=new Rabbit();
		
		int dogCount=0;
		int catCount=0;
		int rabbitCount=0;
		for(int i=0;i<animals.length;i++) {
			if(animals[i] instanceof Dog) {
				dogCount++;
				((Dog)animals[i]).barkDog();
			}else if(animals[i] instanceof Cat) {
				catCount++;
				((Cat)animals[i]).barkCat();
			}else if(animals[i] instanceof Rabbit) {
				rabbitCount++;
				((Rabbit)animals[i]).barkRabbit();
			}
		}
		System.out.println("개는: "+dogCount);
		System.out.println("고양이"
				+ "는: "+catCount);
		System.out.println("토끼는: "+rabbitCount);
		
		for(int i=0;i<animals.length;i++) {
			if(animals[i]instanceof Dog) {
			System.out.println(animals[i].getName());
		}
		}
		
	
		
		
		
		
		
	}
	
	
	
	
}
