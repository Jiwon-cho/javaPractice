package com.objarr.controller;

import java.util.Scanner;

import com.objarr.model.vo.Car;

public class CarController {
	private Scanner sc=new Scanner(System.in);
	
	public void carArr() {
		Car[]c=new Car[5];
		for (int i = 0; i < c.length; i++) {
			c[i] = new Car();// 요렇게 해줘야 중간에 숫자들이 null이 아녀서 돌아감 0으로 디폴트값들어가니까

			System.out.print("모델명: ");
			c[i].setModel(sc.next());
			System.out.print("탑승인원: ");
			c[i].setPpl(sc.nextInt());
			System.out.println("회사: ");
			c[i].setMaf(sc.next());
			System.out.print("가격: ");
			c[i].setPrice(sc.nextInt());
			System.out.print("색깔: ");
			c[i].setClr(sc.next());

		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].getModel() + " " + c[i].getPpl() + " " + c[i].getMaf() + " "
					+ c[i].getPrice() + " " + c[i].getClr());
		}
		
		System.out.print("자동차 색깔 입력: ");
		String cho=sc.next();
		for(int i=0;i<c.length;i++) {
			if(c[i].getClr().equals(cho)) {
				System.out.println(c[i].getModel() + " " + c[i].getPpl() + " " + c[i].getMaf() + " "
						+ c[i].getPrice() + " " + c[i].getClr());
			}
	}
		
	}
}

