package com.person.run;

import java.util.Scanner;

import com.person.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Person[]p=new Person[3];
		for(int i=0;i<3;i++) {
			System.out.println("�̸�: ");
			String name=sc.next();
			System.out.println("����: ");
			int age=sc.nextInt();
			System.out.println("�ּ�: ");
			String address=sc.next();
			System.out.println("��ȭ��ȣ: ");
			String phone=sc.next();
			p[i]=new Person(name,age,address,phone);
			System.out.println("�̸�:" +p[i].getName());
		}
		
		

	}

}
