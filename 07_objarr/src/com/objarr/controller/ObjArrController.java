package com.objarr.controller;

import java.util.Scanner;

import com.objarr.model.vo.Fruit;

public class ObjArrController {

	public void objArrTest() {
		// ���ϰ�ü�� ������ �� �ִ� ��������
		Fruit apple = new Fruit("���", "����", 23000, 2.3, "Ư��");
		// ���ϰ�ü�� ������ ������ �� �ִ� ������� Ȯ��
		// ���ϰ�ü �迭����
		Fruit[] fruits = new Fruit[5];
		// ���ϰ�ü�迭�� ���ֱ�
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}

		// ��ü�迭 �̿��ϱ�
		fruits[0] = new Fruit("����", "���", 8000, 0.5, "Ư��");
		fruits[1] = new Fruit("Ű��", "��������", 15000, 1, "��");
		fruits[2] = new Fruit("��", "����", 25000, 3.5, "Ư��");
		fruits[3] = new Fruit();
		fruits[4] = new Fruit();
		// �� ��ü�� ���� �����ϱ�
		System.out.println(fruits[0].getName());
		System.out.println(fruits[0].getOrigin());

		// ��ü�迭 ��ü����ϱ�

		for (int i = 0; i < 5; i++) {
//			if(fruits[i]==null) {
//				break;
//			}
			System.out.println(fruits[i].getName() + " " + fruits[i].getOrigin() + " " + fruits[i].getPrice() + " "
					+ fruits[i].getWeight() + " " + fruits[i].getRating());

		}

		// ������ �Է¹޾Ƽ� �迭�� ä���
		Fruit[] fs = new Fruit[2];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < fs.length; i++) {
			fs[i] = new Fruit();// �䷸�� ����� �߰��� ���ڵ��� null�� �Ƴ༭ ���ư� 0���� ����Ʈ�����ϱ�

			System.out.print("�̸�: ");
			fs[i].setName(sc.next());
			System.out.print("������: ");
			fs[i].setOrigin(sc.next());
			System.out.print("����: ");
			fs[i].setPrice(sc.nextInt());
			System.out.println("����: ");
			fs[i].setWeight(sc.nextDouble());
			System.out.print("���: ");
			fs[i].setRating(sc.next());

		}
		for (int i = 0; i < fs.length; i++) {
			System.out.println(fs[i].getName() + " " + fs[i].getOrigin() + " " + fs[i].getPrice() + " "
					+ fs[i].getWeight() + " " + fs[i].getRating());
		}

	}

}
