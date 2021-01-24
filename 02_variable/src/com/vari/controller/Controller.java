package com.vari.controller;

import java.util.Scanner;
//기능제공용 클래스
public class Controller {
	
	public void test() {
		Scanner sc=new Scanner(System.in);
		System.out.print("이름:");
		String name=sc.nextLine();
		System.out.print("나이:");
		int age=sc.nextInt();
		System.out.print("성별(M/F):");
	    sc.nextLine();
		char gender=sc.nextLine().charAt(0);
	    System.out.print("키:");
		double height=sc.nextDouble();
		System.out.print("주소:");
		sc.nextLine();
		String address=sc.nextLine();
		System.out.println("당신의 이름은 "+name+" 입니다"+" 당신의 키는 "+height+" 입니다"+" 당신의 성별은 "+gender+" 입니다"+" 당신의 주소는 "+address+" 입니다");
	}

}
