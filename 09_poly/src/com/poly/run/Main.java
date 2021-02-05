package com.poly.run;

import com.poly.controller.AnimalFunction;
import com.poly.model.vo.Animal;
import com.poly.model.vo.Cat;
import com.poly.model.vo.Dog;
import com.poly.model.vo.Rabbit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�������� ��Ӱ��迡 �մ� ��ü�鿡�� ����Ǵ� ���
		//��Ӱ��迡 �մ� ��ü�� �θ�Ŭ���� Ÿ���� ������ �ڽİ�ü��
		//�����Ҽ��մ� ���� �ǹ��Ѵ�.
		
		Animal al=new Animal();
		Animal a2=new Dog(); //�ڷ����� �޶� �Ұ�����.
		//auto up casting //�θ� ������ �ִ°� �θ�ó�� �ϰ� ��
		
		//�ڽİ�ü�� �θ�Ŭ������ �ڷ��� ������ ���ԵǸ�
		//�θ��� ���� Ȯ���� �� �ְ� �ȴ�. -> �ڽ��� ������ �̿��� �Ұ�����.
		
		//�θ� Ŭ���� �ڷ��� ������ �ڽİ�ü�� �����ϰ� �ڽĿ� �ִ�
		//���뿡 �����Ϸ��� ������ �� ��ȯ�� �ؼ� �̿��� ��.
		//(Dog)a2. <- �̷��� �ϸ� ���� �����ڰ� �ֿ켱 �����ڶ� ���� ���ٺ��� �ؼ� �ȹٲ�
		((Dog)a2).barkDog();
		
		//�ΰ�ü�� ��Ӱ��踦 ������ �ϸ� ������ ���� ->������.
		a2=new Cat();
		((Cat)a2).barkCat();
		a2=new Rabbit();
		((Rabbit)a2).barkRabbit();
		
		
		
		AnimalFunction af=new AnimalFunction();
		af.bark(new Cat());
		af.bark(new Dog());
		
		//�Ѱ�Ÿ������ ���� Ÿ���� ���� �� ����
		//�迭 ��ü�迭! -> �Ѱ�����(type) ����� ����!
		//�θ��� Ÿ������ �����ϸ� 4���� �ڽ� Ÿ���� �Ѱ��� �迭�� �� ����!
		Animal[] animals=new Animal[3];
		animals[0]=new Dog("������","������",32,22.2,'m',"�ѱ�");
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
		System.out.println("����: "+dogCount);
		System.out.println("�����"
				+ "��: "+catCount);
		System.out.println("�䳢��: "+rabbitCount);
		
		for(int i=0;i<animals.length;i++) {
			if(animals[i]instanceof Dog) {
			System.out.println(animals[i].getName());
		}
		}
		
	
		
		
		
		
		
	}
	
	
	
	
}
