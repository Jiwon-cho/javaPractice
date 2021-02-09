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
			System.out.println("최대 등록 가능한 회원수는 " + mc.getSize() + "명 입니다.");
			System.out.println("현재 등록된 회원수는 " + "명입니다.");

			System.out.println("1.새 회원 등록");
			System.out.println("2.회원 검색");
			System.out.println("3.회원 정보 수정");
			System.out.println("4.회원 삭제");
			System.out.println("5.모두 출력");
			System.out.println("9.끝내기");
			System.out.println("메뉴 번호: ");
			int cho = sc.nextInt();
			switch (cho) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 9:
				System.out.println("프로그램이 종료되었습니다.");
				break here;
			default:
				System.out.println("잘못 입력되었습니다.");
				break;
			}

		}
		int a = sc.nextInt();
		if (a < 9 && a > 5 || a > 9) {
			System.out.println("잘못 입력되었습니다.");
		  	mainMenu();

		}

	}

}
