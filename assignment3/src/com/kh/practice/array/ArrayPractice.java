package com.kh.practice.array;

import java.util.*;

public class ArrayPractice {
	public void practice1() {
		int a[]=new int[10];
		int b=1;
		for(int i=0;i<10;i++) {
			a[i]=b++;
			System.out.print(a[i]+" ");
		}
		
	}
	
	public void practice2() {
		int a[]=new int[10];
		int b=10;
		for(int i=0;i<10;i++) {
			a[i]=b--;
			System.out.print(a[i]+" ");
		}
	}
	
	public void practice3() {
		Scanner sc=new Scanner(System.in);
		int b=1;
		System.out.print("���� ����: ");
		int c=sc.nextInt();
		int [] a=new int[c];
		for(int i=0;i<c;i++) {
			a[i]=b++;
			System.out.print(a[i]+" ");
		}
			
		
		
	}
	
	public void practice4() {
		String[]a= {"���","��","����","������","����"};
		System.out.println(a[1]);
		
		
	}
	
	public void practice5() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڿ�: ");
		String a=sc.next();
		System.out.print("����: ");
		char b=sc.next().charAt(0);
		char[]c=new char[a.length()];
		int count=0;
		System.out.print(a+"��"+b+"�� �����ϴ� ��ġ(�ε���): ");
		for(int i=0;i<a.length();i++) {
			c[i]=a.charAt(i);
			if(b==c[i]) {
				System.out.print(i+" ");
				count++;
			}

	}
		System.out.print("\n"+b+" ����: "+count);
		
		
		
	}
	public void practice6() {
		
		
	}
	public void practice7() {
		
	}
	public void practice8() {
		
	}
	public void practice9() {
		
	}
	public void practice10() {
		
	}
	public void practice11() {
		
	}
	public void practice12() {
		
	}
	public void practice13() {
		
	}
	public void practice14() {
		
	}
	public void practice15() {
		
	}
	public void practice16() {
		
	}


	
	
	
	
	

	}
