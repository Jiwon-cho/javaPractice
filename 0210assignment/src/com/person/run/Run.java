package com.person.run;

import java.util.Scanner;

import com.person.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Person[]p=new Person[3];
		for(int i=0;i<3;i++) {
			System.out.println("이름: ");
			String name=sc.next();
			System.out.println("나이: ");
			int age=sc.nextInt();
			System.out.println("주소: ");
			String address=sc.next();
			System.out.println("전화번호: ");
			String phone=sc.next();
			p[i]=new Person(name,age,address,phone);
			System.out.println("이름:" +p[i].getName());
		}
		
		

	}

}
