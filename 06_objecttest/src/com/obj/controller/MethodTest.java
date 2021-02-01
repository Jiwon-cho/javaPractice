package com.obj.controller;

import java.util.Scanner;

import com.obj.model.vo.CalcResult;

//기능제공형 클래스
public class MethodTest {
	//(멤버)메소드 만들기
	
	//반환형이 없고 매개변수 업 ㅅ는 메소드
	public void cal() {
		//메소드 로직을 구성 하는 곳
		
	}
	
	//반환형이 없고 매개변수가 있는 메소드
	public void cal2(int su,int su2,char op) {
		switch(op) {
		case '+': System.out.println(su+"+"+su2+"="+(su+su2));break;
		case '-': System.out.println(su+"-"+su2+"="+(su-su2));break;
		case '*': System.out.println(su+"*"+su2+"="+(su*su2));break;
		case '/': System.out.println(su+"/"+su2+"="+((double)su/su2));break;
		}
	}
	
	//반환형이 있고 배개변수가 있는 매소드 구현하기
	//반환형이 있는 메소드는 반드시 무조건 절대적으로!!!
	//메소드 구현부에 return 예약어가 있어야함
	public double cal3(int su,int su2,char op) {
		double result;
		switch(op) {
		case'+': result=su+su2;break;
		case'-':result=su-su2;break;
		case'*':result=su*su2;break;
		case'/':result=(double)su/su2;break;
		default: result=0.0;
		//result 에 값이 없으면 결론적으로 return에 아무것도 안들어가서 초기화가 안됌 그래서 
		//default 에 넣든 위에 넣어 놓든 메소드 안에서 무조건 한번은 넣어 놓아야함
		}
		return result;
		
	}
	//반환형 있고 매개 변수 없는 메소드 구현하기
	public CalcResult cal4() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("수입력: ");
		int su=sc.nextInt();
		System.out.print("수입력: ");
		int su2=sc.nextInt();
		System.out.print("연산자: ");
		char op=sc.next().charAt(0);
		double result=0.0;
		switch(op) {
		case'+': result=su+su2;break;
		case'-':result=su-su2;break;
		case'*':result=su*su2;break;
		case'/':result=(double)su/su2;break;
		
		}
		CalcResult cr=new CalcResult(su,su2,op,result);
		return cr;
		//return 값은 한개만 리턴가능/ 얜 매개변수 없이 그냥 지정 이라 결과값만 나옴 뭐가 어떻게 진행되는지 메인에서는
		//알수가 없음//그래서 이렇게 메소드 써서 변수를 받아옴
	}

}
