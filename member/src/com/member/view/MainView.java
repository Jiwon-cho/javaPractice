package com.member.view;

import java.util.Scanner;

import com.member.controller.MemberController;
import com.member.model.vo.Member;

public class MainView {
	private Scanner sc=new Scanner(System.in);
	public void mainBoard(MemberController mct) {
		
		while(true){
			System.out.println("======회원 관리 시스템======");
			System.out.println("1. 회원 이름 검색");
			System.out.println("2. 회원 등록");
			System.out.println("0.프로그램 종료");
			System.out.print("선택: ");
			int cho=sc.nextInt();
			switch(cho) {
			case 1:break;
			case 2:mct.insertMember();break;
			case 3:break;
			case 0:System.out.println("프로그램이 종료 되었습니다.");return;
			}
		
		}
	}

	public Member inputData() {
		
		System.out.println("====학생 등록====");
		System.out.print("아이디: ");
		String id=sc.next();
		System.out.print("패스워드: ");
		String pw=sc.next();
		System.out.print("이름: ");
		String name=sc.next();
		System.out.print("나이: ");
		int age=sc.nextInt();
		System.out.print("성별(M/F): ");
		char gender=sc.next().charAt(0);
		System.out.print("주소: ");
		sc.nextLine();
		String address=sc.nextLine();
		Member m=new Member(id,pw,name,address,age,gender);
		return m;
	}
	
	public void printMsg(String msg) {
		System.out.println("===시스템 메세지===");
		System.out.println(msg);
		System.out.println("===============");
		
	}
	
}
