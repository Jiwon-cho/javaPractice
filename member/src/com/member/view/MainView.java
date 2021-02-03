package com.member.view;

import java.util.Scanner;

import com.member.controller.MemberController;
import com.member.model.vo.Member;

public class MainView {
	private Scanner sc=new Scanner(System.in);
	public void mainBoard(MemberController mct) {
		
		while(true){
			System.out.println("======ȸ�� ���� �ý���======");
			System.out.println("1. ȸ�� �̸� �˻�");
			System.out.println("2. ȸ�� ���");
			System.out.println("0.���α׷� ����");
			System.out.print("����: ");
			int cho=sc.nextInt();
			switch(cho) {
			case 1:break;
			case 2:mct.insertMember();break;
			case 3:break;
			case 0:System.out.println("���α׷��� ���� �Ǿ����ϴ�.");return;
			}
		
		}
	}

	public Member inputData() {
		
		System.out.println("====�л� ���====");
		System.out.print("���̵�: ");
		String id=sc.next();
		System.out.print("�н�����: ");
		String pw=sc.next();
		System.out.print("�̸�: ");
		String name=sc.next();
		System.out.print("����: ");
		int age=sc.nextInt();
		System.out.print("����(M/F): ");
		char gender=sc.next().charAt(0);
		System.out.print("�ּ�: ");
		sc.nextLine();
		String address=sc.nextLine();
		Member m=new Member(id,pw,name,address,age,gender);
		return m;
	}
	
	public void printMsg(String msg) {
		System.out.println("===�ý��� �޼���===");
		System.out.println(msg);
		System.out.println("===============");
		
	}
	
}
