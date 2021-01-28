package com.obj.model.vo;

public class MemberVariable {
	//멤버변수 선언하기
	//접근제한자 자료형 변수명;
	public String name="가오가이거";
	int age;
	private double height;
	
	//멤버변수의 예약어
	//static, final
	//static: 공공저장소에 저장되는 것, 클래스 변수
	public static String gameTitle;
	public static double bonus;
	public int memberId;
	private static int count=0;
	//final:상수 고정값.변하지 않는 값
	public final int MYAGE;
	
	//초기화 블록
	//멤버 변수의 값에 초기값을 대입할때 사용하는것
	{//인스턴스 초기화 블록 
	//new 연산자로 클래스를 생성할때 마다 실행
	 name="허정승";
	 age=29;
	 height=128.2;
	 MYAGE=10;
	 if(bonus==0.0) {
			bonus=2.0;
		}
	 memberId=++count;
	 System.out.println("초기화블록 실행");
	}
	static {
		//static 으로 선언된 변수를 초기화하는것
		//없다!
		count=100;//static 변수
		bonus=22;//static 변수 / 클래스 변수
		//age=50;//멤버변수
		System.out.println("static블록");
	}
	
	
	

	
	public void test() {
		//클래스 내부에서는 접근연산자 없이 사용
		name="유병승";
		age=20;
		height=190.2;
		//정확하게 접근 하는 방식
		this.name="니나니뇨";//this 는 명시적으로 써주는 것
		
	
	}
	
}
