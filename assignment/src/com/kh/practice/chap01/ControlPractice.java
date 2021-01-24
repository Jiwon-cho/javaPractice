package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	//실습 문제1
	public void Practice1() {
		Scanner sc=new Scanner(System.in);
		System.out.print("1.입력\n"+"2.수정\n"+"3.조회\n"+"4.삭제\n"+"7.종료\n"+"메뉴 번호를 입력하세요: ");
	    int a=sc.nextInt();
		switch(a) {
		case 1: System.out.println("입력 메뉴입니다.");break;
		case 2: System.out.println("수정 메뉴입니다.");break;
		case 3: System.out.println("조회 메뉴입니다.");break;
		case 4: System.out.println("삭제 메뉴입니다.");break;
		case 7: System.out.println("프로그램이 종료됩니다.");break;
		}
		
	}
	//실습 문제2
	public void Practice2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int su=sc.nextInt();
		if(su>0&&su%2==0) {
			System.out.println("짝수다");
			
		}else if(su%2==1) {
			System.out.println("홀수다");
		}else {
			System.out.println("양수만 입력해주세요");
		}
		
		
	}
	//실습 문제3
	public void Practice3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("국어 점수를 입력하시오: ");
		int korean=sc.nextInt();
		System.out.print("수학 점수를 입력하시오: ");
		int math=sc.nextInt();
		System.out.print("영어 점수를 입력하시오: ");
		int english=sc.nextInt();
		int sum=korean+english+math;
		double aver=sum/3.0;
		
		if(korean>=40&&english>=40&&math>=40&&aver>=60) {
			System.out.println("국어: "+korean+"\n수학: "+math+"\n영어: "+english+"\n합계: "+sum+"\n평균: "+aver+"\n축하합니다, 합격입니다!");
			
		}else {
			System.out.println("불합격입니다.");
		}	
		
	}
	//실습 문제4
	public void Practice4() {
		Scanner sc=new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력: ");
		int month=sc.nextInt();
		switch(month) {
		case 1: case 2: case 12:System.out.println(month+"월은 겨울 입니다.");break;
		case 3:case 4:case 5:System.out.println(month+"월은 봄 입니다.");break;
		case 6:case 7:case 8:System.out.println(month+"월은 여름 입니다.");break;
		case 9:case 10: case 11:System.out.println(month+"월은 가을 입니다.");break;
		default:System.out.println(month+"월은 잘못 입력된 달입니다.");
		
		}
		
	}
	//실습 문제5
	public void Practice5() {
		Scanner sc=new Scanner(System.in);
		System.out.print("아이디: ");
		String id=sc.next();
		System.out.print("비밀번호: ");
		String pas=sc.next();
		if(id.equals("myId")&&pas.equals("myPassword12")) {
			System.out.print("로그인 성공");
		}else if(pas.equals("myPassword12")) {
			System.out.println("아이디가 틀렸습니다.");
		}else if(id.equals("myId")) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		
	}
	//실습 문제6
	public void Practice6() {
		Scanner sc=new Scanner(System.in);
		System.out.print("권환을 확인하고자 하는 회원 등급: ");
		String member=sc.next();
		switch(member) {
		case "관리자": System.out.println("회원 관리,게시글 관리,게시글 작성, 댓글 작성, 게시글 조회");break;
		case "회원": System.out.println("게시글 작성,게시글 조회,댓글 작성");break;
		case "비회원":System.out.println("게시글 조회");break;
		}
	}
	//실습 문제7
	public void Practice7() {
		Scanner sc=new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요: ");
		double height=sc.nextDouble();
		height*=height;
		System.out.print("몸무게(kg)를 입력해 주세요: ");
		double weight=sc.nextDouble();
		double bmi=weight/height;
		System.out.println("BMI 지수:"+bmi);
		if(bmi>=30) {
			System.out.println("고도비만");
		}else if(bmi>=25) {
			System.out.println("비만");
		}else if(bmi>=23) {
			System.out.println("과체중");
		}else if(bmi>=18.5) {
			System.out.println("정상체중");
		}else {
			System.out.println("저체중");
		}
		
	}
	//실습 문제8
	public void Practice8() {
		Scanner sc=new Scanner(System.in);
		System.out.print("피연산자1 입력: ");
		int a=sc.nextInt();
		double e=(double)a;
		
		System.out.print("피연산자2 입력: ");
		int b=sc.nextInt();
		double f=(double)b;
		System.out.print("연산자를 입력(+,-*,/,%): ");
		char c=sc.next().charAt(0);
		char [] d = {'+','-','*','/','%'};
		double [] result = {(e+f),(e-f),(e*f),(e/f),(e%f)};
		for(int i=0;i<5;i++) {
			if(e>0&&f>0&&d[i]==c) {
				 
					System.out.println(""+a+d[i]+b+"= "+result[i]);}
	
			}
		 if(c!='+'&&c!='/'&&c!='*'&&c!='-'&&c!='%'){
				System.out.println("잘못 입력하셨습니다.프로그램을 종료합니다.");}	
	}		
	//실습 문제9	
	public void Practice9() {
		Scanner sc=new Scanner(System.in);
		System.out.print("중간 고사 점수를 입력하시오: ");
		double mid=sc.nextInt()*0.2;
		System.out.print("기말 고사 점수를 입력하시오: ");
		double fin=sc.nextInt()*0.3;
		System.out.print("과제 점수를 입력하시오: ");
		double asg=sc.nextInt()*0.3;
		System.out.print("출석 회수를 입력하시오: ");
		double att=sc.nextDouble();
		System.out.println("=========결과=========");
		double sum=mid+fin+asg+att;
		if(sum>=70&&(20-att)<(20*0.3)) {
			
				System.out.println("중간 고사 점수(20): "+mid+"\n기말 고사 점수(30): "+fin+"\n과제 점수(30): "+asg+"\n출석 점수(20): "+att+"\n총점: "+sum+"\nPASS");
				
			}else if((20-att)>=(20*0.3)){
				System.out.println("Fail "+"[출석 회수 부족("+(int)att+"/"+20+")]");
			}
		else if(sum<70) {
			System.out.println("중간 고사 점수(20): "+mid+"\n기말 고사 점수(30): "+fin+"\n과제 점수(30): "+asg+"\n출석 점수(20): "+att+"\n총점: "+sum+"\nFail [점수 미달]");
		}
		
		
		
	}
	//실습 문제 10
	public void Practice10() {
		Scanner sc=new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.\n"+"1.메뉴 출력\n"+"2.짝수/홀수\n"+"3.합격/불합격\n"+"4.계절\n"+"5.로그인\n"+"6.권한 확인\n"+"7.BMI\n"+"8.계산기\n"+"9.P/F\n"+"선택: ");
		int numb=sc.nextInt();
		switch(numb) {
		case 1: Practice1();break;
		case 2: Practice2();break;
		case 3: Practice3();break;
		case 4: Practice4();break;
		case 5: Practice5();break;
		case 6: Practice6();break;
		case 7: Practice7();break;
		case 8: Practice8();break;
		case 9: Practice9();break;
		
		}
		
	}









}
