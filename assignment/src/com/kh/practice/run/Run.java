package com.kh.practice.run;
import java.util.*;
import com.kh.practice.func.OperatorPractice;

public class Run {
	public static void main(String[] args) {
		int a=1;
		
//		new OperatorPractice().practice1();
//		new OperatorPractice().practice2();
//		new OperatorPractice().practice3();
//		new OperatorPractice().practice4();	
//		new OperatorPractice().practice5();	
//		new OperatorPractice().practice6();		
//		new OperatorPractice().practice7();	
//		new OperatorPractice().practice8();	
//		new OperatorPractice().practice9();	
//		new OperatorPractice().practice10();	
		Scanner sc = new Scanner(System.in);
		OperatorPractice o =new OperatorPractice(sc.nextInt());
		o.practice1(); 
		o.practice2();
		o.practice3();
	}

}
