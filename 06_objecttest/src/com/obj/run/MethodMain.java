package com.obj.run;

import java.util.Scanner;

import com.obj.controller.MethodTest;
import com.obj.model.vo.CalcResult;
import com.obj.model.vo.Person;

public class MethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MethodTest Ŭ������ cal2�żҵ带 ȣ���Ϸ���
		MethodTest mt=new MethodTest();
		mt.cal2(10,10,'+');
		
		//double result=mt.cal2(10,10,'+'); �̰� �Ұ�����/ void �� ��ȯ���� ���� ����
		double result=mt.cal3(10, 10, '+');//�̰� ���� ������ ���� ����/��ȯ���� �ֱ� ���� 
		System.out.println(mt.cal3(10,10,'+'));//return ���� mt.cal3 �� �� �޼ҵ� �ȿ� ����
		//�Է� ���� ������ �̿��ϱ� cal3()
		Scanner sc=new Scanner(System.in);
//		System.out.print("��: ");
//		int su=sc.nextInt();
//		System.out.print("��: ");
//		int su2=sc.nextInt();
//		System.out.print("������: ");
//		char op=sc.next().charAt(0);
//		
//		System.out.println(""+su+op+su2+'='+mt.cal3(su, su2, op));
////		
//		if(mt.cal3(su, su2, op)>100) {
//			System.out.println("����� ����� ũ��");
//		}
		
//		System.out.print(mt.cal4());
		CalcResult cr=mt.cal4();
		System.out.println(""+cr.su+cr.op+cr.su2+"="+result);
		
		
		
		//static �޼ҵ� ȣ���ϱ�
		MethodTest.staticTest();
		Person p=new Person();
		p.setCount(10);//static�̶� �ٷ� ����

	}

}
