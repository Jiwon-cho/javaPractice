package com.kh.method.run;

import com.kh.method.controller.MethodController;

public class Run {
	public static void main(String[] args) {
		MethodController st=new MethodController();
		System.out.print(st.st("가나","다라"));
		
		System.out.print("\n"+st.it(10,30));
	
		System.out.println("\n"+st.ch('2'));
		
		System.out.println(st.sstt("akak", "wkqk"));
	
	
	}
}
