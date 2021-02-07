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
			System.out.println("====�޴�====");
			System.out.println("1.��");
			System.out.println("2.�簢��");
			System.out.println("9.������");
			System.out.println("�޴��� ���ÿ�: ");
			int cho = sc.nextInt();

			switch (cho) {
			case 1:
				circleMenu();
				break;
			case 2:
				rectangleMenu();
				break;
			case 9:
				System.out.println("���α׷��� ���� �Ǿ����ϴ�");
				return;
			}
		}
	}

	public void circleMenu() {
		System.out.println("====�� �޴�====");
		System.out.println("1.�� �ѷ�");
		System.out.println("2.�� ����");
		System.out.println("9.��������");
		System.out.println("�޴� ��ȣ: ");
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
		System.out.println("====�簢�� �޴�====");
		System.out.println("1.�簢�� �ѷ�");
		System.out.println("2.�簢�� ����");
		System.out.println("9.��������");
		System.out.println("�޴� ��ȣ: ");
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
		System.out.println("X ��ǥ:");
		int x = sc.nextInt();
		System.out.println("Y ��ǥ: ");
		int y = sc.nextInt();
		System.out.println("������: ");
		int radius = sc.nextInt();
		String a = cc.calcCircum(x, y, radius);
		System.out.println(a);
	}

	public void calcCircleArea() {
		System.out.println("X ��ǥ:");
		int x = sc.nextInt();
		System.out.println("Y ��ǥ: ");
		int y = sc.nextInt();
		System.out.println("������: ");
		int radius = sc.nextInt();
		String a = cc.calcCircleArea(x, y, radius);
		System.out.println(a);
	}

	public void calcPerimeter() {
		System.out.println("X ��ǥ:");
		int x = sc.nextInt();
		System.out.println("Y ��ǥ: ");
		int y = sc.nextInt();
		System.out.println("����: ");
		int height = sc.nextInt();
		System.out.println("�ʺ�: ");
		int width = sc.nextInt();
		String a = rc.calcPerimeter(x, y, width, height);
		System.out.println(a);
	}

	public void calcRectArea() {
		System.out.println("X ��ǥ:");
		int x = sc.nextInt();
		System.out.println("Y ��ǥ: ");
		int y = sc.nextInt();
		System.out.println("����: ");
		int height = sc.nextInt();
		System.out.println("�ʺ�: ");
		int width = sc.nextInt();
		String a = rc.calcRectArea(x, y, width, height);
		System.out.println(a);
	}

}
