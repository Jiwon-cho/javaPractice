package com.obj.controller;

import com.obj.model.vo.MemberVariable;
import com.obj.model.vo.PublicTest;
//import com.obj.model.vo.DefaultTest; �ȉ� ����Ʈ�� �Ⱥ���
public class ObjController {
	
	public void accessObj() {
		//���������ڿ� ���� Ŭ���� �̿밡�ɿ���
		//Ŭ������ �̿��ϱ� ���ؼ��� new �����ڷ� ����(��üȭ)�� �ؾ��Ѵ�.
		//new Ŭ������() <---Ŭ������ �����Ѱ�.
		PublicTest pt=new PublicTest();
		
		//default ���� ������ Ŭ���� �����ϱ�
		//DefaultTest dt=new DEfaultTest();
		
		java.util.Date d= new java.util.Date();//�̷��� �Ǳ� �ϴµ� �̷��� ��� ��ߵ� �ּҸ�
	}
	public void memberVari() {
		//��� ���� Ȱ�� ���������� �׽�Ʈ�ϱ�
		MemberVariable mv=new MemberVariable();
		
		//mv.age=18;//default ����������.
		//mv.height=190.3//private ���� ������
		System.out.println(mv.name);
		
		MemberVariable mv1=new MemberVariable();
		mv1.name="������";
		System.out.println(mv1.name);
	
		
		
//		System.out.println(mv.age);//���������ڷ� ������ ���ѵ� ������ �޼ҵ带 �̿���.
		//static ������ �����ϱ�
		//static ������ heap �� �ƴ� static ������ �����ϸ� ��������� �����ϴ� ����� �ٸ�
		//Ŭ������ ���� ���� �ʰ� ����� ����
		MemberVariable.gameTitle="������";
		//MemberVariable.bonus=0.2;//�޼ҵ带 �̿��ؼ� ����
		System.out.println(MemberVariable.bonus);
		MemberVariable mv2=new MemberVariable();
		System.out.println("mv: "+mv.memberId);
		System.out.println("mv1: "+mv1.memberId);
		System.out.println("mv2: "+mv2.memberId);
		
	}
}
