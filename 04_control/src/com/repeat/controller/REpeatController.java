package com.repeat.controller;

import java.util.Scanner;

public class REpeatController {

	public void basicFor() {
		Scanner sc = new Scanner(System.in);

		// 1부터 100까지 출력
//		for(int i=1;i<=100;i++) {
//			System.out.println(i);
//		}
//		
//		//1부터 100까지 짝수 출력
//		for(int i=2; i<=100;i+=2) {
//			System.out.println(i);
//		}
//       //100부터 1까지 출력하기
//		for(int i=100;i>0;i--) {
//    	   System.out.println(i);
//       }
//       
//        
//		//1부터 100 다 더하기
//		int sum=0;
//		for(int i=1;i<=100;i++) {
//			sum+=i;
//    	   
//    	   }
//		System.out.println(sum);
//    	    
//    	
//		//1부터 100 홀수 값만 더하기
//		int sum2=0;
//		for(int i=1;i<=100;i+=2) {
//			sum2+=i;
//		}
//		System.out.println(sum2);
//		
		// for 문 활용하기
		String msg = "";
		for (; !msg.equals("0");) {
			System.out.println(msg);
			msg = sc.next();
		}
		for (;;) {
			System.out.println("무한루프");
		}

	}

	public void Student() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			sc.nextLine();// 요렇게 하면 처음에 이거 입력 받아서 깜박댐
			/*
			 * if(i!=1){ sc.nextLine(); 이런식으로 해야됨
			 */

			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("나이: ");
			int age = sc.nextInt();
			System.out.print("학년: ");
			int grade = sc.nextInt();
			System.out.println("반: ");
			int group = sc.nextInt();
			System.out.println("번호: ");
			int number = sc.nextInt();
			System.out.println(name + age + group + number);
		}
	}

	public void ExtraFor() {
		// 사용자에게 반복횟수를 입력받아
		// 그 횟수만큼 자바 화이팅을 출력
		Scanner sc = new Scanner(System.in);
//		System.out.print("반복 횟수를 입력 하시오: ");
//		int su=sc.nextInt();
//		for(int i=0;i<su;i++) {
//			System.out.println("자바 화이팅");
////		}
//		System.out.print("학생 수를 입력 하시오: ");
//		int su2=sc.nextInt();
//		String stu="";
//		for(int i=0;i<su2;i++) {
//			System.out.print("이름: ");
//			String name=sc.next();
//			System.out.print("나이: ");
//			int age=sc.nextInt();
//			System.out.print("학년: ");
//			int grade=sc.nextInt();
//			System.out.println("반: ");
//			int group=sc.nextInt();
//			System.out.println("번호: ");
//			int number=sc.nextInt();
//			stu+=name+age+group+number+"\n";
//			System.out.println(name+age+group+number);
//		}
//		System.out.println(stu);

		System.out.println("학생수?: ");
		int su = sc.nextInt();
		int sum = 0;
		int aver = 0;
		for (int i = 0; i < su; i++) {
			int sum2 = 0;
			System.out.print("국어 점수를 입력하시오: ");
			sum2 += sc.nextInt();
			System.out.print("수학 점수를 입력하시오: ");
			sum2 += sc.nextInt();
			System.out.print("영어 점수를 입력하시오: ");
			sum2 += sc.nextInt();
			System.out.print("코딩 점수를 입력하시오: ");
			sum2 += sc.nextInt();
			sum += sum2;
			aver += sum2 / 4;
			System.out.println("합계: " + sum2 + "\n평균: " + sum2 / 4);

		}
		aver = aver / su;
		System.out.println("합계: " + sum + " 평균: " + aver);

	}

	public void Cal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==계산기==");
		System.out.println("몇번 계산?: ");
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			System.out.println("수1: ");
			int su1 = sc.nextInt();
			System.out.print("연산자: ");
			char op = sc.next().charAt(0);
			System.out.println("수2: ");
			int su2 = sc.nextInt();
			switch (op) {
			case '+':
				System.out.println(su1 + "+" + su2 + "=" + (su1 + su2));
				break;
			case '-':
				System.out.println(su1 + "-" + su2 + "=" + (su1 - su2));
				break;
			case '*':
				System.out.println(su1 + "*" + su2 + "=" + (su1 * su2));
				break;
			case '/':
				System.out.println(su1 + "/" + su2 + "=" + (su1 / (double) su2));
				break;

			}

		}
	}

	public void WhileTest() {
//	 int i=0;
//	 while(i<5) {
//		 i++;
//		 System.out.println("무야호~");
//	 }
		// while: 무한반복,특정조건에서 반복문 종료할때
//	 while(true) {
//		 System.out.println("무한루프");
//	 }
		Scanner sc = new Scanner(System.in);
//	 String msg="";
//	 while(!msg.equals("0")) {
//		    msg=sc.nextLine();
//		    System.out.println(msg);
//	
//	 System.out.println("====계산기====");
//	 int cho=-1;
//	 while(cho!=0) {
//		 
//		 System.out.println("수1: ");
//		 int su1=sc.nextInt();
//		 System.out.print("연산자: ");
//		 char op=sc.next().charAt(0);
//		 System.out.println("수2: ");
//		 int su2=sc.nextInt();
//		 switch(op) {
//		 case '+':System.out.println(su1+"+"+su2+"="+(su1+su2));break;
//		 case '-':System.out.println(su1+"-"+su2+"="+(su1-su2));break;
//		 case '*':System.out.println(su1+"*"+su2+"="+(su1*su2));break;
//		 case '/':System.out.println(su1+"/"+su2+"="+(su1/(double)su2));break;
//			 
//		 }
//		 
//	 }
//		System.out.println("계속 하시게습니까?(1.y/0.n)");
//		cho=sc.nextInt();
//		
//		int cho=0;
//		do {
//			System.out.println("실행하기!");
//		}while(cho==1);
//		cho
//		while(cho==1) {
//			System.out.println("while 실행");
//		}

		int kim = 0;

		int total = 0;
		String answer = "";
		do {
			System.out.println("1.김밤 1000\n" + "2.라면 1200\n" + "3.떡볶이 2000\n" + "4.순대 1500");
			System.out.println("선택: ");
			int cho = sc.nextInt();

			switch (cho) {
			case 1:
				total += 1000;
				break;

			case 2:
				total += 1200;
				break;
			case 3:
				total += 2000;
				break;
			case 4:
				total += 1500;
				break;
			}
			System.out.println("계속 결제를 진행하십니까?(Y/N)");
			answer = sc.next();

		} while (!answer.equals("N"));
		System.out.println("총합: " + total + " 입니다.");

	}

	public void forInfor() {
		Scanner sc = new Scanner(System.in);
//	 
//	 for(int i=2;i<10;i++) {
//		 for(int j=1;j<10;j++) {
//			 System.out.println(i+"X"+j+"="+(i*j));
//		 }
//	 }
//	 //중첩 반복문 기본 회전
//	 //i,j 처럼 두개 다르게 써야함
//	 for(int i=0;i<10;i++) {
//		 System.out.println("외곽"+i);
//		 for(int j=0;j<5;j++) {
//			 System.out.print(j+" ");
//			 
//		 }
//		 System.out.println();
//	 }

		// 중첩 반복문 어디에??
		// 1. 2 차원 배열사용 값을 대입, 값을 호출(순회)
		// 2. 중복값 확인, 정렬 로직을 구성할때 사용->배열에서..
		// apple 에서 각 문자역 중복값이 몇개 인지 확인
//		int count = 0;
//		String msg = sc.next();
//		for (int i = 0; i < msg.length(); i++) {
//			count = 0;
//			System.out.println(msg.charAt(i));
//			for (int j = 0; j < msg.length(); j++) {
////			 System.out.print(msg.charAt(j)+" ");
//				if (i != j && msg.charAt(i) == msg.charAt(j)) {
//					System.out.print("같다 ");
//					count++;
//
//				} else {
//					System.out.print("다름 ");
//				}
//
//			}
//			System.out.println(msg.charAt(i) + "는 " + count + " 중복한다");
//		}
		// 별찍기
//		for(int i=0;i<10;i++) {
//			for(int j=0;j<10;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

	}

	public void breakTest() {
		// break 문은 특정 조건에 반복문을 종료할 때 사용함.
		// 보통 무한루프 설정한 반복문에서 많이 사용
//		for(int i=0;;i++) {
//			System.out.println("무한루프");
//			if(i==10) {
//				break;
//			}
//			
//			
//		}

		Scanner sc = new Scanner(System.in);
//		String msg="";
//		while(true) {
//			System.out.println("입력: ");
//			String temp=sc.nextLine();
//			msg+=temp+"\n";
//			if(temp.equals("end")) {
//				System.out.println(msg);
//				break;
//			}
////		}
//		here: // here: 뒤에꺼 끝내버림 아예
//		for (int i = 2; i < 10; i++) {
//			System.out.println("==== " + i + "단 ====");
//			for (int j = 1; j < 10; j++) {
//				System.out.println(i + "X" + j + "=" + i * j);
//				if (j == 5) {
//					break here;
//				}
//			}
//		}
		// continue 문 사용하기
		// continue 문 아래 코드를 생략하고 반복문 실행하기
		for(int i=2;i<10;i++) {
			System.out.println("==== "+i+"단 ====");
		    for(int j=1;j<10;j++) {
		    	
		    	if(j==5) {
		    		continue;
		    	}
		    	System.out.println(i+"X"+j+"="+i*j);
		    }
		}
	
	
	
	
	}

}
