package com.student.view;

import java.util.Scanner;

import com.student.controller.StudentController;
import com.student.model.vo.Student;

public class MainView {
	
	//메인화면을 출력해주는 메소드 구현
	public void mainMenu(StudentController stc) {
	//StudentController stc=new StudentController();
	while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("======학생관리 프로그램=====");
		System.out.println("1.전체 학생 조회");
		System.out.println("2.학생 등록");
		System.out.println("3.학생성별검색");
		System.out.println("4.학생정보수정(나이,주소)");//기준 이름
		System.out.println("0. 프로그램 종료");
		System.out.print("선택: ");
		int cho=sc.nextInt();
		switch(cho) {
		case 1: stc.searchAll();break;
		case 2: stc.insertStudent();break;
		case 3: stc.searchGender();break;
		case 4: stc.changeInfo();break;
		case 0:System.out.println("프로그램을 종료합니다");return;
		//return 은 메소드 자체를 끝내버리는 것 
		}
	}
}

	//사용자 데이터 입력 화면 구현
	public Student inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("====학생 등록====");
		System.out.print("이름: ");
		String name=sc.next();
		System.out.print("나이: ");
		int age=sc.nextInt();
		System.out.print("성별(M/F): ");
		char gender=sc.next().charAt(0);
		System.out.print("주소: ");
		sc.nextLine();
		String address=sc.nextLine();
		Student s=new Student(name,age,gender,address);
		return s;
	}
	//메세지 불력하는 메소드 구현
	public void printMsg(String msg) {
		System.out.println("====시스템 메세지====");
		System.out.println(msg);
		System.out.println("==================");
		
	}
	
	//성별 선택화면
	public char choiceGender() {
		Scanner sc=new Scanner(System.in);
		System.out.println("====검색할 성별====");
		System.out.print("1.남자2.여자: ");
		int choice=sc.nextInt();
		if(choice==1)return 'M';
		else return 'F';
		//return sc.nextInt()==1?'M':'F';
	}
	
	public Student reSet() {
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		System.out.println("====학생정보 수정===");
		System.out.println("수정할 학생이름: ");
		s.setName(sc.next());
		System.out.print("나이: ");
		s.setAge(sc.nextInt());
		System.out.print("주소: ");
		sc.nextLine();
		s.setAddress(sc.nextLine());
		return s;
	}
	
}