package com.test;

import java.util.Scanner;

public class Test {
	static public void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력하시오:");
		String name= sc.nextLine();
		
		
		System.out.print("당신의 키 입력:");
		double height=sc.nextDouble();
		
	
		System.out.print("당신의 주소를 말해주세요:");
		String address=sc.next();
		
		System.out.println("당신의 이름은 "+name+" 입니다"+" 당신의 키는 "+height+" 입니다"+" 당신의 주소는 "+address+" 입니다");
		
		//char 을 받아오는 메소드는 X String 문자열에서 제공하는 메소드를 사용
		System.out.print("성별:");
		char gender=sc.next().charAt(0);
		System.out.println(gender);
		
		//자바는 객체 지향->객체간 서로 기능을 호출해서 사용
		
		
		
		
		
		
	}


}
