package com.kh.method.controller;

import java.util.*;

public class MethodController {
	
	//1.���ڿ� �ΰ��� ���� �ް� �� ���ڿ��� �����Ͽ� �������ִ� �żҵ� �����
	public String st(String a,String b) {
		
		return a+b;
		
	}
	//2.���� �ΰ��� ���� �޾� ù°�� ���� �ι�°�������� ���� ���ϴ� ���
	//�� ����� �������ִ� �޼ҵ�
	public int it(int a,int b) {
		int result=0;
		if(a<b) {
			for(int i=a;i<b;i++) {
				result+=i;
			}
		}else {
			System.out.print("\n����� �� �� ����.");
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
	
