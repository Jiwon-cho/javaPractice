package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public MemberMenu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void mainMenu() {
		here:
		while (true) {
			System.out.println("�ִ� ��� ������ ȸ������ " + mc.getSize() + "�� �Դϴ�.");
			System.out.println("���� ��ϵ� ȸ������ " + "���Դϴ�.");

			System.out.println("1.�� ȸ�� ���");
			System.out.println("2.ȸ�� �˻�");
			System.out.println("3.ȸ�� ���� ����");
			System.out.println("4.ȸ�� ����");
			System.out.println("5.��� ���");
			System.out.println("9.������");
			System.out.println("�޴� ��ȣ: ");
			int cho = sc.nextInt();
			switch (cho) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 9:
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break here;
			default:
				System.out.println("�߸� �ԷµǾ����ϴ�.");
				break;
			}

		}
		int a = sc.nextInt();
		if (a < 9 && a > 5 || a > 9) {
			System.out.println("�߸� �ԷµǾ����ϴ�.");
		  	mainMenu();

		}

	}

}
