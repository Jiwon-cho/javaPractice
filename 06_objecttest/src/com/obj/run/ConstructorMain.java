package com.obj.run;

import com.obj.model.vo.ConstructorTest;
import java.util.*;

public class ConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorTest ct=new ConstructorTest();
		System.out.println(ct.nickName);
		System.out.println(ct.age);
		System.out.println(ct.tea);
		
//		Scanner sc=new Scanner(System.in);
		ConstructorTest ct2=new ConstructorTest(90,"유자",200);
		System.out.println("==ct2==");
		System.out.println(ct2.age);
		System.out.println(ct2.nickName);
		
		//defuatl 생성자는 클래스 내부에 생성자가 없으면 자동으로 생성됨. 
		//클래스 내부에 매개변수가 있는 생성자가 하나라도 dfault 생성자를 생성하지 않는다
		ConstructorTest ct3=new ConstructorTest("날강두");
		System.out.println(ct3.age);
		System.out.println(ct3.nickName);
		
		
		
		
		

	}

}
