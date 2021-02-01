package com.kh.method.controller;

import java.util.*;

public class MethodController {
	
	//1.문자열 두개를 전달 받고 두 문자열을 결합하여 리턴해주는 매소드 만들기
	public String st(String a,String b) {
		
		return a+b;
		
	}
	//2.정수 두개를 전달 받아 첫째수 부터 두번째수까지의 합을 구하는 기능
	//그 결과를 리턴해주는 메소드
	public int it(int a,int b) {
		int result=0;
		if(a<b) {
			for(int i=a;i<b;i++) {
				result+=i;
			}
		}else {
			System.out.print("\n계산할 수 가 없다.");
			result=0;
			
		}
		
		return result;
	}
	
	public boolean ch(char a) {
		boolean result=true;
		if(123>(int)a&&96<(int)a||'A'<=a&&a<='Z') {
			return true;
			
		}else {
			return false;
		}
		
	}
	public boolean sstt(String a,String b) {
		return a.equals(b);
	}
//		boolean result=true;
//		if(a.equals(b)) {
//			result=true;
//		}else {
//			result=false;
//		}
//		return result;
//	}
//	
	
	
	}
	
