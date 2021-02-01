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
		System.out.print("양의 정수: ");
		int c=sc.nextInt();
		int [] a=new int[c];
		for(int i=0;i<c;i++) {
			a[i]=b++;
			System.out.print(a[i]+" ");
		}
			
		
		
	}
	
	public void practice4() {
		String[]a= {"사과","귤","포도","복숭아","참외"};
		System.out.println(a[1]);
		
		
	}
	
	public void practice5() {
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열: ");
		String a=sc.next();
		System.out.print("문자: ");
		char b=sc.next().charAt(0);
		char[]c=new char[a.length()];
		int count=0;
		System.out.print(a+"에"+b+"가 존재하는 위치(인덱스): ");
		for(int i=0;i<a.length();i++) {
			c[i]=a.charAt(i);
			if(b==c[i]) {
				System.out.print(i+" ");
				count++;
			}

	}
		System.out.print("\n"+b+" 개수: "+count);
		
		
		
	}
	public void practice6() {
		Scanner sc=new Scanner(System.in);
		char[]a= {'월','화','수','목','금','토','일'};
		System.out.print("0~6 사이 숫자 입력: ");
		int b=sc.nextInt();
		if(b<7&&b>=0) {
			System.out.println(a[b]);
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
		
	}
	public void practice7() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수: ");
		int su=sc.nextInt();
		int array[]=new int[su];
		int sum=0;
		for(int i=0;i<su;i++) {
			System.out.print("배열"+i+"번째 인덱스에 넣을값: ");
			int index =sc.nextInt();
			array[i]=index;
			sum+=array[i];
		}
		for(int i=0;i<su;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.print("\n"+sum);
		
	}
	public void practice8() {
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag) {
			int a=1;
			System.out.print("정수: ");
			int su=sc.nextInt();
			int array[]=new int[su];
			int b=(su+1)/2;
			if(su%2==1&&su>2) {
				for(int i=0;i<b;i++) {
					array[i]=a++;
					}
				for(int i=b;i<su;i++) {
					array[i]=--b;
				}
				for(int i=0;i<su;i++) {
					System.out.print(array[i]+", ");
				}
				flag=false;
				}else {
					System.out.println("다시 입력하세요.");
				}
		}
		
		
	}
	public void practice9() {
		Scanner sc=new Scanner(System.in);
		String chicken[]= {"양념","간장","후라이드"};
		System.out.print("치킨 이름을 입력하세요: ");
		String ch=sc.next();
		boolean flag=false;
		for(int i=0;i<3;i++) {
			if(chicken[i].equals(ch)) {
				flag=true;
			
			}
				
			}
		System.out.println(flag?ch+"치킨 배달가능":ch+"치킨은 없는 메뉴입니다.");
		}
		
	
	public void practice10() {
		Scanner sc=new Scanner(System.in);
		char[]id=new char[14];
		char ddi[]=id;
		System.out.print("주민등록번호(-포함): ");
		String di=sc.next();
		for(int i=0;i<14;i++) {
			id[i]=di.charAt(i);
			if(i>7) {
				ddi[i]='*';
			}
			System.out.print(ddi[i]);
		}
		
		
		
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
