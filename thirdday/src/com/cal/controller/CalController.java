package com.cal.controller;

import java.util.Scanner;

public class CalController {
	public void ca() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오:");
		
		int su=sc.nextInt();
		
		System.out.print("숫자를 입력하시오:");
		
		int su2=sc.nextInt();
		
		System.out.printf("%f\n",(double)su/su2);
		
		System.out.println(su+su2);
		System.out.println(su*su2);
		
		
		System.out.println(su-su2);
		
		
		
	}
	

}
