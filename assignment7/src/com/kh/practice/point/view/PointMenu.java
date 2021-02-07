package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();

	public void mainMenu() {

		while (true) {
			System.out.println("====메뉴====");
			System.out.println("1.원");
			System.out.println("2.사각형");
			System.out.println("9.끝내기");
			System.out.println("메뉴를 고르시오: ");
			int cho = sc.nextInt();

			switch (cho) {
			case 1:
				circleMenu();
				break;
			case 2:
				rectangleMenu();
				break;
			case 9:
				System.out.println("프로그램이 종료 되었습니다");
				return;
			}
		}
	}

	public void circleMenu() {
		System.out.println("====원 메뉴====");
		System.out.println("1.원 둘레");
		System.out.println("2.원 넓이");
		System.out.println("9.메인으로");
		System.out.println("메뉴 번호: ");
		int cho = sc.nextInt();
		switch (cho) {
		case 1:
			calcCircum();
			break;
		case 2:
			calcCircleArea();
			break;
		default:
			break;

		}
	}

	public void rectangleMenu() {
		System.out.println("====사각형 메뉴====");
		System.out.println("1.사각형 둘레");
		System.out.println("2.사각형 넓이");
		System.out.println("9.메인으로");
		System.out.println("메뉴 번호: ");
		int cho = sc.nextInt();
		switch (cho) {
		case 1:
			calcPerimeter();
			break;
		case 2:
			calcRectArea();
			break;
		default:
			break;
		}
	}

	public void calcCircum() {
		System.out.println("X 좌표:");
		int x = sc.nextInt();
		System.out.println("Y 좌표: ");
		int y = sc.nextInt();
		System.out.println("반지름: ");
		int radius = sc.nextInt();
		String a = cc.calcCircum(x, y, radius);
		System.out.println(a);
	}

	public void calcCircleArea() {
		System.out.println("X 좌표:");
		int x = sc.nextInt();
		System.out.println("Y 좌표: ");
		int y = sc.nextInt();
		System.out.println("반지름: ");
		int radius = sc.nextInt();
		String a = cc.calcCircleArea(x, y, radius);
		System.out.println(a);
	}

	public void calcPerimeter() {
		System.out.println("X 좌표:");
		int x = sc.nextInt();
		System.out.println("Y 좌표: ");
		int y = sc.nextInt();
		System.out.println("높이: ");
		int height = sc.nextInt();
		System.out.println("너비: ");
		int width = sc.nextInt();
		String a = rc.calcPerimeter(x, y, width, height);
		System.out.println(a);
	}

	public void calcRectArea() {
		System.out.println("X 좌표:");
		int x = sc.nextInt();
		System.out.println("Y 좌표: ");
		int y = sc.nextInt();
		System.out.println("높이: ");
		int height = sc.nextInt();
		System.out.println("너비: ");
		int width = sc.nextInt();
		String a = rc.calcRectArea(x, y, width, height);
		System.out.println(a);
	}

}
