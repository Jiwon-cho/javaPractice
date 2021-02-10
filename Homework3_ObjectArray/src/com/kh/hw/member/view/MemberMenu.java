package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

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
			System.out.println("���� ��ϵ� ȸ������ " +mc.existMemberNum()+ "���Դϴ�.");
		if(mc.existMemberNum()<10) {
			System.out.println("1.�� ȸ�� ���");
			System.out.println("2.ȸ�� �˻�");
			System.out.println("3.ȸ�� ���� ����");
			System.out.println("4.ȸ�� ����");
			System.out.println("5.��� ���");
			System.out.println("9.������");
			System.out.println("�޴� ��ȣ: ");
			int cho = sc.nextInt();
			switch (cho) {
			case 1:insertMember();break;
			case 2:searchMember();break;
			case 3:updateMember();break;
			case 4:deleteMember();break;
			case 5:printAll();break;
			case 9:
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break here;
			default:
				System.out.println("�߸� �ԷµǾ����ϴ�. �ٽ� �Է����ּ���");
				break;
			}
		}else {
				System.out.println("ȸ�� ���� ��� �� á�� ������ �Ϻ� �޴��� ���µ˴ϴ�.");
				System.out.println("2.ȸ�� �˻�");
				System.out.println("3.ȸ�� ���� ����");
				System.out.println("4.ȸ�� ����");
				System.out.println("5.��� ���");
				System.out.println("9.������");
				System.out.println("�޴� ��ȣ: ");
				int cho = sc.nextInt();
				switch (cho) {
				case 2:searchMember();break;
				case 3:updateMember();break;
				case 4:deleteMember();break;
				case 5:printAll();break;
				case 9:
					System.out.println("���α׷��� ����Ǿ����ϴ�.");
					break here;
				default:
					System.out.println("�߸� �ԷµǾ����ϴ�. �ٽ� �Է����ּ���");
					break;
			}
			
			}
		
//		int a = sc.nextInt();
//		if (a < 9 && a > 5 || a > 9) {
//			System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
//		  	mainMenu();
//
//		}

	}
	
	}	
	

	public void insertMember() {
		System.out.println("�� ȸ���� ����մϴ�.");

		System.out.println("���̵�: ");
		String id = sc.next();

		while (mc.checkId(id) == false) {
			System.out.println("�ߺ��� ���̵� �Դϴ�.");
			System.out.println("���̵�: ");
			String id2 = sc.next();
			id = id2;
		}

		System.out.println("�̸�: ");
		String name = sc.next();
		System.out.println("��й�ȣ: ");
		String password = sc.next();
		System.out.println("�̸���: ");
		String email = sc.next();

		System.out.println("����: ");
		char gender = sc.next().toLowerCase().trim().charAt(0);
		while (gender != 'm' && gender != 'f') {
			System.out.println("������ �ٽ� �Է��ϼ���.");
			char gender2 = sc.next().toLowerCase().trim().charAt(0);
			gender = gender2;
		}
		System.out.println("����: ");
		int age = sc.nextInt();
		mc.insertMember(id, name, password, email, gender, age);
	}

	public void searchMember() {
		System.out.println("1.���̵�� �˻��ϱ�");
		System.out.println("2.�̸����� �˻��ϱ�");
		System.out.println("3.�̸��Ϸ� �˻��ϱ�");
		System.out.println("9.�������� ���ư���");
		System.out.println("�޴� ��ȣ: ");
		int cho = sc.nextInt();
		switch (cho) {
		case 1:
			searchId();
			break;
		case 2:
			searchName();
			break;
		case 3:
			searchEmail();
			break;
		case 9:
			System.out.println("�������� ���ư��ϴ�.");break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
		}
	}

	public void searchId() {
		System.out.println("�˻��� ID: ");
		System.out.println(mc.searchId(sc.next()));
	}

	public void searchName() {
		System.out.println("�˻��� �̸�: ");
		Member[] m = mc.searchName(sc.next());
		if (m[0].getName() != null) {
			System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.\n" + m[0].inform());
		} else {
			System.out.println("�˻� ����� �����ϴ�.");
		}

	}

	public void searchEmail() {
		System.out.println("�˻��� �̸���: ");
		Member[] m = mc.searchEmail(sc.next());
		if (m[0].getEmail() != null) {
			System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.\n" + m[0].inform());
		} else {
			System.out.println("�˻� ����� �����ϴ�.");
		}

	}

	public void printAll() {
		Member[] m = mc.printAll();
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null) {
				break;
			} else {
				System.out.println(m[i].inform());
			}
		}
	}
	
	
	public void deleteMember() {
		System.out.println("1.Ư�� ȸ�� �����ϱ�");
		System.out.println("2.��� ȸ�� �����ϱ�");
		System.out.println("9.�������� ���ư���");
		System.out.println("�޴� ��ȣ: ");
		int cho=sc.nextInt();
		switch(cho) {
		case 1:deleteOne();break;
		case 2:deleteAll();break;
		case 9:System.out.println("�������� ���ư��ϴ�.");break;
		default:System.out.println("�߸� �Է��ϼ̽��ϴ�.");break;
		}
		
	}
	
	
	public void deleteOne() {
		System.out.println("������ ȸ���� ���̵�: ");
		String id=sc.next();
		System.out.println("���� �����Ͻðڽ��ϱ�?(y/n): ");
		char asw=sc.next().toLowerCase().charAt(0);
		if(asw=='y') {
			System.out.println(mc.delete(id)?"������ ���������� �Ǿ����ϴ�.":"�������� �ʴ¾��̵� �Դϴ�.");
			
		}else {
			return;
		}
	}
	
	public void deleteAll() {
		System.out.println("���� �����Ͻðڽ��ϱ�?(y/n): ");
		char asw=sc.next().toLowerCase().charAt(0);
		if(asw=='y') {
			System.out.println("���������� �����Ͽ����ϴ�.");
			mc.delete();
		}else {
			return;
		}
	}
	
	public void updateMember() {
		System.out.println("1.��й�ȣ �����ϱ�");
		System.out.println("2.�̸� �����ϱ�");
		System.out.println("3.�̸��� �����ϱ�");
		System.out.println("9.�������� ���ư���");
		System.out.println("�޴� ��ȣ: ");
		int cho=sc.nextInt();
		switch(cho) {
		case 1:updatePassword();break;
		case 2:updateName();break;
		case 3:updateEmail();break;
		case 9:System.out.println("�������� ���ư��ϴ�.");break;
		default:break;
		}
		
	}
	
	public void updatePassword() {
		System.out.println("������ ȸ���� ���̵�: ");
		String id=sc.next();
		System.out.println("������ ��й�ȣ: ");
		String pw=sc.next();
		System.out.println(mc.updatePassword(id, pw)?"������ ���������� �Ǿ����ϴ�.":"�������� �ʴ� ���̵� �Դϴ�.");
		
		
	}
	
	
	public void updateName(){
		System.out.println("������ ȸ���� ���̵�: ");
		String id=sc.next();
		System.out.println("������ �̸�: ");
		String pw=sc.next();
		System.out.println(mc.updateName(id, pw)?"������ ���������� �Ǿ����ϴ�.":"�������� �ʴ� ���̵� �Դϴ�.");
		
		
	}
	
	
	public void updateEmail() {
		System.out.println("������ ȸ���� ���̵�: ");
		String id=sc.next();
		System.out.println("������ �̸���: ");
		String pw=sc.next();
		System.out.println(mc.updateEmail(id, pw)?"������ ���������� �Ǿ����ϴ�.":"�������� �ʴ� ���̵� �Դϴ�.");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
