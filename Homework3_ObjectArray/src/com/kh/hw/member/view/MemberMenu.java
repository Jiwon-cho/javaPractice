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
			System.out.println("최대 등록 가능한 회원수는 " + mc.getSize() + "명 입니다.");
			System.out.println("현재 등록된 회원수는 " +mc.existMemberNum()+ "명입니다.");
		if(mc.existMemberNum()<10) {
			System.out.println("1.새 회원 등록");
			System.out.println("2.회원 검색");
			System.out.println("3.회원 정보 수정");
			System.out.println("4.회원 삭제");
			System.out.println("5.모두 출력");
			System.out.println("9.끝내기");
			System.out.println("메뉴 번호: ");
			int cho = sc.nextInt();
			switch (cho) {
			case 1:insertMember();break;
			case 2:searchMember();break;
			case 3:updateMember();break;
			case 4:deleteMember();break;
			case 5:printAll();break;
			case 9:
				System.out.println("프로그램이 종료되었습니다.");
				break here;
			default:
				System.out.println("잘못 입력되었습니다. 다시 입력해주세요");
				break;
			}
		}else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
				System.out.println("2.회원 검색");
				System.out.println("3.회원 정보 수정");
				System.out.println("4.회원 삭제");
				System.out.println("5.모두 출력");
				System.out.println("9.끝내기");
				System.out.println("메뉴 번호: ");
				int cho = sc.nextInt();
				switch (cho) {
				case 2:searchMember();break;
				case 3:updateMember();break;
				case 4:deleteMember();break;
				case 5:printAll();break;
				case 9:
					System.out.println("프로그램이 종료되었습니다.");
					break here;
				default:
					System.out.println("잘못 입력되었습니다. 다시 입력해주세요");
					break;
			}
			
			}
		
//		int a = sc.nextInt();
//		if (a < 9 && a > 5 || a > 9) {
//			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
//		  	mainMenu();
//
//		}

	}
	
	}	
	

	public void insertMember() {
		System.out.println("새 회원을 등록합니다.");

		System.out.println("아이디: ");
		String id = sc.next();

		while (mc.checkId(id) == false) {
			System.out.println("중복된 아이디 입니다.");
			System.out.println("아이디: ");
			String id2 = sc.next();
			id = id2;
		}

		System.out.println("이름: ");
		String name = sc.next();
		System.out.println("비밀번호: ");
		String password = sc.next();
		System.out.println("이메일: ");
		String email = sc.next();

		System.out.println("성별: ");
		char gender = sc.next().toLowerCase().trim().charAt(0);
		while (gender != 'm' && gender != 'f') {
			System.out.println("성별을 다시 입력하세요.");
			char gender2 = sc.next().toLowerCase().trim().charAt(0);
			gender = gender2;
		}
		System.out.println("나이: ");
		int age = sc.nextInt();
		mc.insertMember(id, name, password, email, gender, age);
	}

	public void searchMember() {
		System.out.println("1.아이디로 검색하기");
		System.out.println("2.이름으로 검색하기");
		System.out.println("3.이메일로 검색하기");
		System.out.println("9.메인으로 돌아가기");
		System.out.println("메뉴 번호: ");
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
			System.out.println("메인으로 돌아갑니다.");break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}

	public void searchId() {
		System.out.println("검색할 ID: ");
		System.out.println(mc.searchId(sc.next()));
	}

	public void searchName() {
		System.out.println("검색할 이름: ");
		Member[] m = mc.searchName(sc.next());
		if (m[0].getName() != null) {
			System.out.println("찾으신 회원 조회 결과입니다.\n" + m[0].inform());
		} else {
			System.out.println("검색 결과가 없습니다.");
		}

	}

	public void searchEmail() {
		System.out.println("검색할 이메일: ");
		Member[] m = mc.searchEmail(sc.next());
		if (m[0].getEmail() != null) {
			System.out.println("찾으신 회원 조회 결과입니다.\n" + m[0].inform());
		} else {
			System.out.println("검색 결과가 없습니다.");
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
		System.out.println("1.특정 회원 삭제하기");
		System.out.println("2.모든 회원 삭제하기");
		System.out.println("9.메인으로 돌아가기");
		System.out.println("메뉴 번호: ");
		int cho=sc.nextInt();
		switch(cho) {
		case 1:deleteOne();break;
		case 2:deleteAll();break;
		case 9:System.out.println("메인으로 돌아갑니다.");break;
		default:System.out.println("잘못 입력하셨습니다.");break;
		}
		
	}
	
	
	public void deleteOne() {
		System.out.println("삭제할 회원의 아이디: ");
		String id=sc.next();
		System.out.println("정말 삭제하시겠습니까?(y/n): ");
		char asw=sc.next().toLowerCase().charAt(0);
		if(asw=='y') {
			System.out.println(mc.delete(id)?"삭제가 성공적으로 되었습니다.":"존재하지 않는아이디 입니다.");
			
		}else {
			return;
		}
	}
	
	public void deleteAll() {
		System.out.println("정말 삭제하시겠습니까?(y/n): ");
		char asw=sc.next().toLowerCase().charAt(0);
		if(asw=='y') {
			System.out.println("성공적으로 삭제하였습니다.");
			mc.delete();
		}else {
			return;
		}
	}
	
	public void updateMember() {
		System.out.println("1.비밀번호 수정하기");
		System.out.println("2.이름 수정하기");
		System.out.println("3.이메일 수정하기");
		System.out.println("9.메인으로 돌아가기");
		System.out.println("메뉴 번호: ");
		int cho=sc.nextInt();
		switch(cho) {
		case 1:updatePassword();break;
		case 2:updateName();break;
		case 3:updateEmail();break;
		case 9:System.out.println("메인으로 돌아갑니다.");break;
		default:break;
		}
		
	}
	
	public void updatePassword() {
		System.out.println("수정할 회원의 아이디: ");
		String id=sc.next();
		System.out.println("수정할 비밀번호: ");
		String pw=sc.next();
		System.out.println(mc.updatePassword(id, pw)?"수정이 성공적으로 되었습니다.":"존재하지 않는 아이디 입니다.");
		
		
	}
	
	
	public void updateName(){
		System.out.println("수정할 회원의 아이디: ");
		String id=sc.next();
		System.out.println("수정할 이름: ");
		String pw=sc.next();
		System.out.println(mc.updateName(id, pw)?"수정이 성공적으로 되었습니다.":"존재하지 않는 아이디 입니다.");
		
		
	}
	
	
	public void updateEmail() {
		System.out.println("수정할 회원의 아이디: ");
		String id=sc.next();
		System.out.println("수정할 이메일: ");
		String pw=sc.next();
		System.out.println(mc.updateEmail(id, pw)?"수정이 성공적으로 되었습니다.":"존재하지 않는 아이디 입니다.");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
