package com.obj.run;

import java.util.Scanner;

import com.obj.controller.MethodTest;
import com.obj.model.vo.CalcResult;
import com.obj.model.vo.Person;

public class MethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MethodTest 클래스의 cal2매소드를 호출하려면
		MethodTest mt=new MethodTest();
		mt.cal2(10,10,'+');
		
		//double result=mt.cal2(10,10,'+'); 이건 불가능함/ void 라 반환값이 없기 때문
		double result=mt.cal3(10, 10, '+');//이건 변수 값으로 저장 가능/반환값이 있기 때문 
		System.out.println(mt.cal3(10,10,'+'));//return 값이 mt.cal3 에 들어감 메소드 안에 들어간거
		//입력 받은 값으로 이용하기 cal3()
		Scanner sc=new Scanner(System.in);
//		System.out.print("수: ");
//		int su=sc.nextInt();
//		System.out.print("수: ");
//		int su2=sc.nextInt();
//		System.out.print("연산자: ");
//		char op=sc.next().charAt(0);
//		
//		System.out.println(""+su+op+su2+'='+mt.cal3(su, su2, op));
////		
//		if(mt.cal3(su, su2, op)>100) {
//			System.out.println("계산한 결과가 크다");
//		}
		
//		System.out.print(mt.cal4());
		CalcResult cr=mt.cal4();
		System.out.println(""+cr.su+cr.op+cr.su2+"="+result);
		
		
		
		//static 메소드 호출하기
		MethodTest.staticTest();
		Person p=new Person();
		p.setCount(10);//static이라서 바로 접근

	}

}
