package com.condition.controller;

import java.util.Scanner;

public class ConditionController {
	public void ifTest() {
		//if문 활용하기
		//if(조건식){로직}
		Scanner sc=new Scanner(System.in);
//		System.out.print("정수 입력: ");
//		int su =sc.nextInt();
//		
//		if(su%2==0) {
//			System.out.println("짝수이다");
//		}
//        System.out.println("이름은?: ");
//        String name=sc.nextLine();
//        if(name.equals("조지원")) {
//        	System.out.println("나코왕");
//        }else {
//        	System.out.println("너 누구냐?");
//        }
//		
		System.out.println("당신이 키우는 묭양이의 이름은 무엇 인가요?: ");
		String name=sc.nextLine();
		if(name.equals("묭식이")) {
			System.out.println("묭식이는 네껀가용?: ");
			
			String answer=sc.next();
			if(answer.equals("녱")) {
				for(int i=0;i<100000000;i++) {
					System.out.println("내꺼양 내꺼양 내꺼양");
				
			}
			
			
		}
		
	}
		
		//if 범위 밖에 있는 변수에 접근 가능 
	    //but if 문 중괄호(범위) 밖에서 if 문 내부에서 선언한 변수에 접근 불가능

//		System.out.println("국어 성적을 입력 하시오: ");
//		int sum=sc.nextInt();
//		System.out.println("영어 성적을 입력하시오: ");
//		sum+=sc.nextInt();
//		System.out.println("수학 성적을 입력하시오: ");
//		sum+=sc.nextInt();
//		if(sum/3.0>=60) {
//			System.out.println("합격입니다");
//		}else {
//			System.out.println("불합격 입니다");
//		}
//		
//	
//	   System.out.println("정수 입력: ");
//	   int su=sc.nextInt();
//	   if(su>0) {
//		   System.out.println("양수");
//	   }else {
//		   System.out.println("음수");
//	   }
//	
		
		//미성년자는 회원가입 못하고 성년이면 회원가입을 하는 로직
//		System.out.println("몇살이냐?: ");
//		int age=sc.nextInt();
//		if(age>19) {
//			System.out.println("회원가입 가능");
//			System.out.println("==회원 가입==");
//			System.out.println("이름:");
//			//String name=sc.nextLine();< 이렇게 쓰면 line 이 위에 int age=sc.nextInt(); 여기에서 \n읽어버림
//			//sc 를 같이 쓰고 있기 때문에
//			String naem=sc.next();
//			System.out.println("키: ");
//			double height=sc.nextDouble();
//			
//		}else {
//			System.out.println("회원 가입 안됌");
//		}
		
		
	
	
	
	}
	public void ifelseifTest() {
		//성적등급/ if에서 false 되면 쭉쭉 내려간다 걸릴때까지
		Scanner sc=new Scanner(System.in);
//		System.out.println("성적 입력: ");
//		int record=sc.nextInt();
//		if(record>=90) {
//			System.out.println("A등급");
//			
//		}else if(record>=80) {
//			System.out.println("B등급");
//			
//		}else if(70<=record) {
//			System.out.println("C등급");
//			
//		}else {
//			System.out.println("자살 ㄱ");
//		}
//		
//		System.out.println("당신의 나이는 몇살입니까?: ");
//		int age=sc.nextInt();
//		if(age>60) {
//			System.out.println("인생 잘 살았니?");
//		}else if(50<=age) {
//			System.out.println("일해서 노후 ㄱ");
//		}else if(40<=age) {
//			System.out.println("일,가족");
//		}else if(30<=age) {
//			System.out.println("일,결혼");
//		}else if(20<=age) {
//			System.out.println("공부,취업");
//		}else if(10<=age){
//			System.out.println("공부,대학");
//			
//		}else {
//			System.out.println("엄마 젖이나 더 먹고와라");
//		}
		
//		System.out.println("아이디를 입력하시오: ");
//		String id=sc.nextLine();
//		if(id.equals("user01")) {
//			System.out.println("패스워드를 입력하시오: ");
//			String password=sc.next();
//			if(password.equals("user01")) {
//				System.out.println("로그인에 성공하셨습니다");
//			}else {
//				System.out.println("패스워드가 잘 못되었습니다");
//			}
//		}else {
//			System.out.println("아이디가 잘못 되었습니다");
//		}
//		
		
		System.out.println("아이디를 입력하시오: ");
		String id=sc.nextLine();
		System.out.println("패스워드를 입력하시오: ");
		String password=sc.next();
		if(id.equals("user01")&&password.equals("user01")) {
			System.out.println("로그인 성공");
			
		}else if(id.equals("user01")) {
			System.out.println("패스워드가 틀립니다");
			
			
		}else if(password.equals("user01")){
			System.out.println("아이디가 틀립니다");
		}else  {
			System.out.println("둘다 아님");
		}
		
	}
	public void ifinifTest() {
		Scanner sc=new Scanner(System.in);
		System.out.println("나이: ");
		int age=sc.nextInt();
		if(age>19) {
			System.out.println("내국인이냐 외국인이냐 1.내국인,2.외국인");
			int cho=sc.nextInt();
			if(cho==1) {
				System.out.println("회원가입 ㅊㅊ");
				
			}else if(cho==2) {
				//그냥 else 로 갔으면 1만아니면 걍 다 외국인임
				
				System.out.println("외국인 등록증 있니?1.있다2.없다");
				int cho2=sc.nextInt();
				if(cho2==1) {
					System.out.println("회원 가입 가능");
					
				}else {
					System.out.println("꺼져");
				}
			}
			
		}else {
			System.out.println("꺼져");
		}
	}
	
	public void switchTest() {
		Scanner sc=new Scanner(System.in);
//		System.out.println("===오늘의 저녁 메뉴===");
//		System.out.println("1.카레");
//		System.out.println("2.짬뽕");
//		System.out.println("3.제육볶음");
//		System.out.println("4.부대찌개");
//		System.out.println("입력: ");
//		int choice=sc.nextInt();
//		
//		switch(choice) {
//		case 1: System.out.println("3분이며 카레");break;
//		case 2: System.out.println("짬뽕 뇸뇸");break;
//		case 3: System.out.println("고기");break;
//		case 4: System.out.println("부대부대");break;
//		default: System.out.println("그런메뉴 없다");break;
//		
//		}
//		
//		//switch문의 ()안에 비교연산,논리 연산 못들어감
//		//switch문의 ()안에 가능한것은?
//		//case 뒤에는 에쌍 값
//		System.out.println("==후식==");
//		System.out.println("가.커피 나.사탕 다.콜라 라.아이스크림");
//		System.out.print("입력: ");
//		char cho=sc.next().charAt(0);
//		switch(cho) {
//			case '가':System.out.println("아메리카노");
//			case '나':System.out.println("사탕");break;
//			case '다':System.out.println("탄산");break;
//		
//		
//		}
//		
//		System.out.println("==공부메뉴==");
//		System.out.println("변수 연산자 조건문");
//		System.out.println("입력: ");
//		String cho2=sc.next();
//		switch(cho2) {
//			case "변수":System.out.println("저장 공간");break;
//			case "연산자":System.out.println("연산처리");break;
//			case "조건문":System.out.println("조건을 주는 문");break;
//			
//		}
//	
//		
		System.out.println("월 입력: ");
		int month=sc.nextInt();
		switch(month) {
			case 1:
			
			case 3:
			case 5:
			case 7:	
			case 8:
			case 10:
			case 12: System.out.println("31일까지 있다");break;
			case 2: System.out.println("28일 까지 있다");break;
			case 4:case 6: case 9: case 11: System.out.println("30일까지 있다");break;
			
					
		
		}
//		//switch 문의 case 에는 다른 메소드를 호출하는 구문을 사용함
//		System.out.println("1. 메인화면");
//		int choice=sc.nextInt();
//		switch (choice) {
//			case 1: ifTest();break;
//				//new Test().mainMenu();
		
		int i= 1;
		while(i>=1) {
			System.out.println("묭식이 내꺼양");
			i++;
		}
			
		}
	}


