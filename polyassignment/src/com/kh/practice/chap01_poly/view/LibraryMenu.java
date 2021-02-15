package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc=new LibraryController();
	private Scanner sc=new Scanner(System.in);

	public void mainMenu() {
		System.out.println("�̸�: ");
		String name=sc.next();
		System.out.println("����: ");
		int age=sc.nextInt();
		System.out.println("����: ");
		char gender=sc.next().toLowerCase().charAt(0);
		Member mem=new Member(name,age,gender);
		lc.insertMember(mem);
	while(true) {	
		System.out.println("===== �޴� ====");
		System.out.println("1.����������");
		System.out.println("2.���� ��ü ��ȸ");
		System.out.println("3.���� �˻�");
		System.out.println("4.���� �뿩�ϱ�");
		System.out.println("9.���α׷� �����ϱ�");
		System.out.println("�޴� ��ȣ: ");
		int cho=sc.nextInt();
		switch(cho) {
		case 1:System.out.println(lc.myInfo());break;
		case 2:selectAll();break;
		case 3:
		case 4:
		case 9:System.out.println("���α׷��� �����մϴ�.");return;
		default:System.out.println("�߸� �Է��Ͽ����ϴ�.");break;
		}
	}


	}

	public void selectAll() {
		Book bl[]=lc.selectAll();
		for(int i=0; i<bl.length;i++) {
			System.out.println(i+"�� ����"+bl[i]);
			
		}
	
	}




}
