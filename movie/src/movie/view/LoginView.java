package movie.view;

import java.util.Scanner;

import movie.controller.MemberController;
import movie.model.vo.Member;

public class LoginView {
	Scanner sc=new Scanner(System.in);
	MemberController mc=new MemberController();
	
	public void initialView() {
	
		System.out.println("====영화 검색엔진===");
		System.out.println("1.로그인");
		System.out.println("2.회원 가입");
		System.out.println("0.프로그램 종료");
		System.out.print("메뉴 선택: ");
		int cho=sc.nextInt();
		switch(cho){
		case 1:login();break;
		case 2:mc.inPut();break;
		case 0:return;
		default:System.out.println("잘못 선택하셨습니다.");break;
		}
	}
	
		
	public Member inputData() {
		System.out.println("====회원 가입====");
		System.out.print("이름: ");
		String name=sc.next();
		System.out.print("주민번호: ");
		String idnumber=sc.next();
		System.out.println("아이디: ");
		String id=sc.next();
		System.out.println("비밀번호: ");
		String pw=sc.next();
		Member m=new Member(name,idnumber,id,pw);
		return m;
	}
	
	public void login() {
		System.out.println("아이디: ");
		String id=sc.next();
		System.out.println("비밀번호: ");
		String pw=sc.next();
		mc.login(id, pw);
		
	}
	
	

}
