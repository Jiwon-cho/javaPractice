package com.poly2.run;

import java.util.Scanner;

import com.poly2.common.PrintDriver;
import com.poly2.controller.PrintController;
import com.poly2.model.vo.CannonPrinter;
import com.poly2.model.vo.LgPrinter;
import com.poly2.model.vo.SamsungPrinter;

public class PrintMain {
	public static void main(String[] args) {
//		new PrintController().print();
	
		Scanner sc=new Scanner(System.in);
		System.out.println("프린트하기");
		System.out.println("1.cannon");
		System.out.println("2.Samsung");
		System.out.println("3.lg");
		System.out.println("선택");
		int cho=sc.nextInt();
		PrintDriver pd=null;
		switch(cho) {
		case 1: pd=new CannonPrinter();break;
		case 2: pd=new SamsungPrinter();break;
		case 3: pd=new LgPrinter();break;
		}
		
		
		new PrintController(pd).print();
	
	
	}   
}
