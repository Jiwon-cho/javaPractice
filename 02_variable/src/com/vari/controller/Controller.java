package com.vari.controller;

import java.util.Scanner;
//��������� Ŭ����
public class Controller {
	
	public void test() {
		Scanner sc=new Scanner(System.in);
		System.out.print("�̸�:");
		String name=sc.nextLine();
		System.out.print("����:");
		int age=sc.nextInt();
		System.out.print("����(M/F):");
	    sc.nextLine();
		char gender=sc.nextLine().charAt(0);
	    System.out.print("Ű:");
		double height=sc.nextDouble();
		System.out.print("�ּ�:");
		sc.nextLine();
		String address=sc.nextLine();
		System.out.println("����� �̸��� "+name+" �Դϴ�"+" ����� Ű�� "+height+" �Դϴ�"+" ����� ������ "+gender+" �Դϴ�"+" ����� �ּҴ� "+address+" �Դϴ�");
	}

}
