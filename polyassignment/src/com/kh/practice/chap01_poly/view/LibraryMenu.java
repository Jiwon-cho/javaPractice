package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc=new LibraryController();
	private Scanner sc=new Scanner(System.in);

	public void mainMenu() {
		System.out.println("이름: ");
		String name=sc.next();
		System.out.println("나이: ");
		int age=sc.nextInt();
		System.out.println("성별: ");
		char gender=sc.next().toLowerCase().charAt(0);
		Member mem=new Member(name,age,gender);
		lc.insertMember(mem);
	while(true) {	
		System.out.println("===== 메뉴 ====");
		System.out.println("1.마이페이지");
		System.out.println("2.도서 전체 조회");
		System.out.println("3.도서 검색");
		System.out.println("4.도서 대여하기");
		System.out.println("9.프로그램 종료하기");
		System.out.println("메뉴 번호: ");
		int cho=sc.nextInt();
		switch(cho) {
		case 1:System.out.println(lc.myInfo());break;
		case 2:selectAll();break;
		case 3:
		case 4:
		case 9:System.out.println("프로그램을 종료합니다.");return;
		default:System.out.println("잘못 입력하였습니다.");break;
		}
	}


	}

	public void selectAll() {
		Book bl[]=lc.selectAll();
		for(int i=0; i<bl.length;i++) {
			System.out.println(i+"번 도서"+bl[i]);
			
		}
	
	}




}
