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
		Scanner sc=new Scanner(System.in);
		char[]a= {'��','ȭ','��','��','��','��','��'};
		System.out.print("0~6 ���� ���� �Է�: ");
		int b=sc.nextInt();
		if(b<7&&b>=0) {
			System.out.println(a[b]);
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		
		
	}
	public void practice7() {
		Scanner sc=new Scanner(System.in);
		System.out.print("����: ");
		int su=sc.nextInt();
		int array[]=new int[su];
		int sum=0;
		for(int i=0;i<su;i++) {
			System.out.print("�迭"+i+"��° �ε����� ������: ");
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
			System.out.print("����: ");
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
					System.out.println("�ٽ� �Է��ϼ���.");
				}
		}
		
		
	}
	public void practice9() {
		Scanner sc=new Scanner(System.in);
		String chicken[]= {"���","����","�Ķ��̵�"};
		System.out.print("ġŲ �̸��� �Է��ϼ���: ");
		String ch=sc.next();
		boolean flag=false;
		for(int i=0;i<3;i++) {
			if(chicken[i].equals(ch)) {
				flag=true;
			
			}
				
			}
		System.out.println(flag?ch+"ġŲ ��ް���":ch+"ġŲ�� ���� �޴��Դϴ�.");
		}
		
	
	public void practice10() {
		Scanner sc=new Scanner(System.in);
		char[]id=new char[14];
		char ddi[]=id;
		System.out.print("�ֹε�Ϲ�ȣ(-����): ");
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
