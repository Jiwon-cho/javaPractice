package com.op.controller;

import java.util.Scanner;
//기느제공 클래스
public class OperatorController {
	
	public void singleOp() {
		//부정연산
		//!값 or 변수명
		//! 비교연산,논리연산,메소드() ->보통사용
		boolean flag=true;
		System.out.println(flag);
		System.out.println(!flag);
	
//		for(int i=1;i<11;i++) {
//			System.out.println(i);
//		}
		//증가연산자:++
		int count=0;
		count++;
		System.out.println(count);
		//증감연산자 : --
		count=100;
		count--;
		count--;
		System.out.println(count);
		
		++count;
		++count;
		System.out.println(count);
//		int temp=count++;//후위연산 , 앞에꺼 다하고 그다음에 해라
		int temp=++count;
		System.out.println(temp);
		System.out.println(count);
		System.out.println(temp++);
		System.out.println(temp);
		//1.count ->for문/while 문
		
		
	}
	public void calculator() {
		//산술연산을 해보자.
		//이항 연산으로 두개의값을 더하기,빼고, 곱하기 나누기한 값을 출력
		int num=10;
		int num2=20;
		int result=num+num2;
		System.out.println(num+"+"+num2+"="+result);
		
		//나누기 *주의해야할 사항이 있음
		//연산시 자료형
		int su=5;
		int su2=3;
		double result2=(double)su/su2;
		System.out.println((double)su/su2);
		System.out.println(su/3.0);
		
		//나머지 연산 : % ->나머지 수
		System.out.println(su%su2);
		//수의 규칙->
		su=129947;
		System.out.println(su%2);
		
		
		
			
		
				
	}
	public void compareTest() {
		int age=19;
		int age2=20;
		System.out.println(age==19);
		System.out.println(age2==20);
		System.out.println(age==age2);
		age2=19;
		System.out.println(age==age2);
		
		System.out.println(age!=20);
		System.out.println(age!=age2);
		
		//입력받은 변수가 19인지 확인하기
		
		Scanner sc=new Scanner(System.in);
	
//		System.out.println("숫자를 입력하시오:");
//		int numb=sc.nextInt();
//		
//		System.out.println(numb==19);
//		
//		//문자열 동등 비교?
//		String hobby="코딩";
//		String hate="코딩";
//		String str=new String("코딩");
//		System.out.println(hobby==hate);
//		System.out.println(str==hobby);
//		System.out.println(hobby+" "+hate+" "+str);
//		
//		//문자열 동등비교하는 메소드 ->equals();
//		System.out.println(hobby.equals(str));
//		System.out.println(hobby.equals("게임"));
//		
//		//char -> 기본자료형
//		char ch='A';
//		char ch1='A';
//		
//		//대소 비교(숫자값)
//		System.out.println("age<numb:"+(age<numb));
//		
//		//미성년자니? ture,false;
//		System.out.println("당신의 나이는 몇입니까?:");
//		int age3=sc.nextInt();
//		System.out.println("미성년 여부:"+(age3<20));
//		
//		int suja=20;
//		int suja2=20;
//		System.out.println(suja>=suja2);
		
		String ch="azx";
		String ch1="axk";
		System.out.println(ch.charAt(1)<ch1.charAt(0));
		
		
		
		
		
	}
	public void logicTest() {
		//나이가 성인이고 사는 곳이 경기도인 사람
//		int age= 19;
////		String address="경기도 안양";
//		System.out.println(age==19&&address.equals("서울"));
//		//나이가 19살이거나 서울사는 사람 확인
//		address="하와이";
//		System.out.println(age==19||address.equals("서울"));
		
		//입력 받은 수가 10에서 50 사이인지 확인
		Scanner sc=new Scanner(System.in);
//		System.out.println("아이디를 입력하시오:");
////		int numb=sc.nextInt();
////		
////		System.out.println(10<=numb&&numb<=50);
////		
//		String id=sc.nextLine();
//		System.out.println("비밀번호를 입력하시오:");
//		int password=sc.nextInt();
//		System.out.println(id.equals("admin")&&password==1234);
//		
//		System.out.println("나이를 입력하시오:");
//		int age=sc.nextInt();
//		System.out.println("성별을 입력하시오(M/F):");
//		String gender=sc.next();
//		System.out.println(9<age&&age<20&&gender.charAt(0)=='F');
		
		//입력 받은 주소가 경기도거나 강원도인 사람
//		System.out.println("주소를 입력하시오:");
//		String address=sc.nextLine();
//		System.out.println(address.equals("경기도")||address.equals("강원도"));
		
		//사는 곳이 광주나 서울 살고 나이가 30대이면서 남자인사람
//		System.out.println("당신의 나이는 몇살 입니까:");
//		int age=sc.nextInt();
//		System.out.println("당신이 사는 곳은 어디입니까?");
//		String address=sc.next();
//		System.out.println("당신의 성별은 무엇입니가(M/F)?");
//		char gender=sc.next().charAt(0);;
//		System.out.println(29<age&&age<40&&gender=='M'&&(address.equals("광주")||address.equals("서울")));
//		
		
		
		
	}
	public void complexOp() {
        //변수에 있는 값에 특정 연산을 한 후 다시 변수에 대입하는 연산자
		int su=100;
		su+=200;
		su++;
		System.out.println(su);
		su*=3;
		System.out.println(su);
		
		//문자열에 대한 복합대입연산은 가능할까?
//		String msg="묭식이는 내꺼양 \n";
//		msg+="마자욤마자용마자용";//msg=msg+"...";
//		System.out.println(msg);
		//msg-= "slkfj" 는 안댐
//		String page="<html>";
//		page+="<head>";
//		page+="</head>";
//		System.out.println(page);
		
		
	}
	public void thirdOp() {
		Scanner sc=new Scanner(System.in);
		
		//삼항연산자 사용하기
		//조건의 결과에 따라 처리되는 로직이 달라지게 하는것
		//true/false
		//조건식 ? treu 일 때 실행 : false 실행
//		int age=20;
//		age=15;
//		System.out.println(age>19?"술마시자":"꺼져");
//		
//		int su=30;
//		System.out.println(su==30?"ㅈ됬다":"아닌디");
		
//		System.out.println("숫자 써라:");
//		int numb=sc.nextInt();
//		System.out.println(numb>100?"크다":"작다");
		
//		System.out.println("몇살?: ");
//		int age=sc.nextInt();
//		System.out.println(age<=19?"공부해라":"돈벌어라");
		
		System.out.println("몇살이누?: ");
		int age=sc.nextInt();
		System.out.println("성별이 뭐누?: ");
		char gender=sc.next().charAt(0);
		String msg=age<20?17<=age&&age<=19?"고딩이냐?":"중딩이냐?":gender=='M'?"왼쪽으로 가세요":"오른쪽으로 가세요";
		System.out.println(msg);
		
		
		
		
		
	}
	public void bitOp() {
		//비트연산 실행해보기
		//저장소에 있는 비트끼리의 연산을 의미함
		//A&B: 두 비트 모두 1일때 1
		//A|B: ENQLXM GKSRORK 1일때 1
		//A^B(XOR): 두 비트가 다를 때 1
		//~A: 보수 *반전
		int a=10,b=22;
		String basic="";
		for(int i=0;i<32;i++) {
			basic+="0";
		}
		String bit=basic+Integer.toBinaryString(a);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit+" -> a비트값");
		bit=basic+Integer.toBinaryString(b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit+" -> b비트값");
		bit=basic+Integer.toBinaryString(a&b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit+" -> a&b비트값");
		bit=basic+Integer.toBinaryString(a|b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit+" -> a|b비트값");
		bit=basic+Integer.toBinaryString(a^b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit+" -> a^b비트값");
		bit=basic+Integer.toBinaryString(~b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit+" -> ~b비트값");
		
	}
}
