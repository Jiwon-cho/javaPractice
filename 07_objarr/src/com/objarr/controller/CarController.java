package com.objarr.controller;

import java.util.Scanner;

import com.objarr.model.vo.Car;

public class CarController {
	private Scanner sc=new Scanner(System.in);
	
	public void carArr() {
		Car[]c=new Car[5];
		for (int i = 0; i < c.length; i++) {
			c[i] = new Car();// �䷸�� ����� �߰��� ���ڵ��� null�� �Ƴ༭ ���ư� 0���� ����Ʈ�����ϱ�

			System.out.print("�𵨸�: ");
			c[i].setModel(sc.next());
			System.out.print("ž���ο�: ");
			c[i].setPpl(sc.nextInt());
			System.out.println("ȸ��: ");
			c[i].setMaf(sc.next());
			System.out.print("����: ");
			c[i].setPrice(sc.nextInt());
			System.out.print("����: ");
			c[i].setClr(sc.next());

		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].getModel() + " " + c[i].getPpl() + " " + c[i].getMaf() + " "
					+ c[i].getPrice() + " " + c[i].getClr());
		}
		
		System.out.print("�ڵ��� ���� �Է�: ");
		String cho=sc.next();
		for(int i=0;i<c.length;i++) {
			if(c[i].getClr().equals(cho)) {
				System.out.println(c[i].getModel() + " " + c[i].getPpl() + " " + c[i].getMaf() + " "
						+ c[i].getPrice() + " " + c[i].getClr());
			}
	}
		
	}
}

