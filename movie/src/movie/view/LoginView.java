package movie.view;

import java.util.Scanner;

import movie.controller.MemberController;
import movie.model.vo.Member;

public class LoginView {
	Scanner sc=new Scanner(System.in);
	MemberController mc=new MemberController();
	
	public void initialView() {
	
		System.out.println("====��ȭ �˻�����===");
		System.out.println("1.�α���");
		System.out.println("2.ȸ�� ����");
		System.out.println("0.���α׷� ����");
		System.out.print("�޴� ����: ");
		int cho=sc.nextInt();
		switch(cho){
		case 1:login();break;
		case 2:mc.inPut();break;
		case 0:return;
		default:System.out.println("�߸� �����ϼ̽��ϴ�.");break;
		}
	}
	
		
	public Member inputData() {
		System.out.println("====ȸ�� ����====");
		System.out.print("�̸�: ");
		String name=sc.next();
		System.out.print("�ֹι�ȣ: ");
		String idnumber=sc.next();
		System.out.println("���̵�: ");
		String id=sc.next();
		System.out.println("��й�ȣ: ");
		String pw=sc.next();
		Member m=new Member(name,idnumber,id,pw);
		return m;
	}
	
	public void login() {
		System.out.println("���̵�: ");
		String id=sc.next();
		System.out.println("��й�ȣ: ");
		String pw=sc.next();
		mc.login(id, pw);
		
	}
	
	

}
