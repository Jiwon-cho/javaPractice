package com.kh.practice.func;

import java.util.Scanner;


public class OperatorPractice {

	//실습 문제 1
	public void practice1() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int su=sc.nextInt();

		if(su>0) {
			System.out.println("양수다");
		}else {
			System.out.println("양수가 아니다");
		}
	}

   //실습 문제 2
	public void practice2() {
	   Scanner sc=new Scanner(System.in);
	   System.out.print("정수를 입력하시오: ");
	   int su=sc.nextInt();
	  
	   if(su>0) {
		   System.out.println("양수다");
		   
	   }else if(su==0) {
		   System.out.println("0 이다");
		   
	   }else {
		   System.out.println("음수다");
	   }
	   
   }
   //실습 문제3
	public void	practice3() {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("정수를 입력하시오: ");
    	int su=sc.nextInt();
		
        if((su%2)==0) {
        	System.out.print("짝수다");
        }else if((su%2)==1) {
        	System.out.print("홀수다");
        }
    	
    	
    	
    }
	//실습 문제 4
	public void practice4() {
		Scanner sc=new Scanner(System.in);
		System.out.print("인원수: ");
		int ppl=sc.nextInt();
		System.out.print("사탕 개수: ");
		int candy=sc.nextInt();
		int su=(int)(candy/ppl);
		int su2=(int)(candy%ppl);
		System.out.print("1인당 사탕 개수: "+su+"\n남는 사탕 개수: "+su2);
		
	}
	//실습 문제 5
	public void practice5() {
		Scanner sc=new Scanner(System.in);
		System.out.print("이름: ");
		String name=sc.next();
		System.out.print("학년(숫자만): ");
		int grade=sc.nextInt();
		System.out.print("반(숫자만): ");
		int ban=sc.nextInt();
		System.out.print("번호(숫자만): ");
		int numb=sc.nextInt();
		System.out.print("성별(M/F): ");
		char gender=sc.next().charAt(0);
		System.out.print("성적(소수점 아래 둘째자리까지): ");
		double record=sc.nextDouble();
		String gender2;
		if(gender=='M') {
			gender2="남학생";
			System.out.print(""+grade+"학년 "+ban+"반 "+numb+"번 "+name+" "+gender2+"의 성적은 "+record+"이다.");
		}else if(gender=='F') {
			gender2="여학생";
			System.out.print(""+grade+"학년 "+ban+"반 "+numb+"번 "+name+" "+gender2+"의 성적은 "+record+"이다.");
		}
		
		
	}
	//실습 문제6
	public void practice6() {
		Scanner sc=new Scanner(System.in);
		System.out.print("나이를 입력하시오: ");
		int age=sc.nextInt();
		if(age>19) {
			System.out.println("성인");
		}else if(age>13) {
			System.out.println("청소년");
			
		}else {
			System.out.println("어린이");
		}
	}
	//실습 문제7
	public void practice7() {
		Scanner sc=new Scanner(System.in);
		System.out.print("국어 성적을 입력하시오: ");
		int korean=sc.nextInt();
		System.out.print("영어 성적을 입력하시오: ");
		int english=sc.nextInt();
		System.out.print("수학성적을 입력하시오: ");
		int math=sc.nextInt();
		int sum=korean+english+math;
		double aver=sum/3.0;
		
		
		if(korean>=40&&english>=40&&math>=40&&aver>=60) {
			System.out.println("합계: "+sum+"\n평균: "+aver+"\n합격");
			
		}else {
			System.out.println("합계: "+sum+"\n평균: "+aver+"\n불합격");
		}
		
	}
	//실습 문제8
	public void practice8() {
		Scanner sc=new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(-포함): ");
		char id=sc.next().charAt(7);
		if(id=='1'||id=='3') {
			System.out.println("남자");
		}else if(id=='2'||id=='4') {
			System.out.println("여자");
		}//00년대 생 이후는 3,4 라서 3,4도 포함 했습니다.
		
	}
	//실습 문제9
	public void practice9() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수1을 입력하시오(정수1은 정수2보다 작아야 한다): ");
		int num1=sc.nextInt();
		System.out.print("정수2를 입력하시오: ");
		int num2=sc.nextInt();
		System.out.print("정수를 입력하시오: ");
		int num3=sc.nextInt();
		if(num3<=num1||num3>num2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}
	//실습 문제10
	public void practice10() {
		Scanner sc=new Scanner(System.in);
		System.out.print("입력1: ");
		int su1=sc.nextInt();
		System.out.print("입력2: ");
		int su2=sc.nextInt();
		System.out.print("입력3: ");
		int su3=sc.nextInt();
		if(su1==su2&&su2==su3) {
			System.out.print("true");
			
		}else {
			System.out.print("false");
		}
		
		
	}
	//실습 문제11
	public void practice11() {
		Scanner sc=new Scanner(System.in);	
//		double[] bonus = {1.4,1.0,1.15};
//		char [] person = {'A','B','C'};
//								
//		for(int i=0;i<3;i++) {
//			System.out.print(person[i]+"사원의 연봉: ");
//			int realMoney= sc.nextInt();
//			double realPlus=realMoney*bonus[i];
//						
//			if(realMoney>=3000) {
//				System.out.println(person[i]+"사원의 연봉/연봉+a: "+realMoney+"/"+realPlus+"\n3000 이상");
//				}else {
//				System.out.println(person[i]+"사원의 연봉/연봉+a: "+realMoney+"/"+realPlus+"\n3000 미만");
//			}
			
		
		//조금 더 효율적인 코드를 만들어 보기 위해 따로 찾아서 이런 식으로도 코드를 만들어 보았습니다.
      System.out.print("A사원의 연봉: ");
	   int a=sc.nextInt();
	   System.out.print("B사원의 연봉: ");
		int b=sc.nextInt();
	   System.out.print("C사원의 연봉: ");
	   int c=sc.nextInt();
	   double reala=1.4*a;
       double realb=b;
	   double realc=1.15*c;	
		
		
		if(reala>=3000) {
			System.out.println("A사원의 연봉/연봉+a: "+a+"/"+reala+"\n3000 이상");
			
			
		}else {
			System.out.println("A사원의 연봉/연봉+a: "+a+"/"+reala+"\n3000 미만");
		}
		
		if(realb>=3000) {
			System.out.println("B사원의 연봉/연봉+a: "+b+"/"+realb+"\n3000 이상");
			
			
		}else {
			System.out.println("B사원의 연봉/연봉+a: "+b+"/"+realb+"\n3000 미만");
		}
		
		if(realc>=3000) {
			System.out.println("C사원의 연봉/연봉+a: "+c+"/"+realc+"\n3000 이상");
			
			
		}else {
			System.out.println("C사원의 연봉/연봉+a: "+c+"/"+realc+"\n3000 미만");
		}	
	}
	
	
	
	
}

  











