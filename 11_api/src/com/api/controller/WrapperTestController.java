package com.api.controller;

public class WrapperTestController {
	public static void main(String[] args) {
		//wrapperŬ������ �ڵ����� �����.
		Integer age=new Integer(19);
		System.out.println(age);
		int age2=age;//��ü�� �⺻�ڷ����� ���Ե�.���� ��ڽ�
		age=100;//����ڽ�!
		
		Double weight=65.6;//<-�ڵ� ��ڽ�
		
		System.out.println(age.MAX_VALUE);//<-��ü�� �ʵ庯�� ������ �θ�������
		
		//���ڿ��� ����Ÿ������ �����ϴ� ���
		//ag2=(int)"19";<-�ȉ�, String�� ��ü�ϱ�
		age2=Integer.parseInt("19");
		System.out.println(age2);
		weight=Double.parseDouble("65.6");
		System.out.println(weight);
		//age2=Integer.parseInt("19 ");
		boolean flag=Boolean.parseBoolean("true");
		test(age2);//<-wrapper Ŭ���� �� ��
	
	}
	public static void test(Number obj) {//<-�ѹ��� �θ� �ڷ����̰� �װ��� ���� ������Ʈ�� �Ѵ� ��(Object obj) {
		System.out.println(obj instanceof Integer);
		System.out.println(obj);
	}
	
}
