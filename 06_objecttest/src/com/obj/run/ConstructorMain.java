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
		ConstructorTest ct2=new ConstructorTest(90,"����",200);
		System.out.println("==ct2==");
		System.out.println(ct2.age);
		System.out.println(ct2.nickName);
		
		//defuatl �����ڴ� Ŭ���� ���ο� �����ڰ� ������ �ڵ����� ������. 
		//Ŭ���� ���ο� �Ű������� �ִ� �����ڰ� �ϳ��� dfault �����ڸ� �������� �ʴ´�
		ConstructorTest ct3=new ConstructorTest("������");
		System.out.println(ct3.age);
		System.out.println(ct3.nickName);
		
		
		
		
		

	}

}
