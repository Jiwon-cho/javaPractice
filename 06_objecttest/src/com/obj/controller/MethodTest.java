package com.obj.controller;

public class MethodTest {
	//(���)�޼ҵ� �����
	
	//��ȯ���� ���� �Ű����� �� ���� �޼ҵ�
	public void cal() {
		//�޼ҵ� ������ ���� �ϴ� ��
		
	}
	
	//��ȯ���� ���� �Ű������� �ִ� �޼ҵ�
	public void cal2(int su,int su2,char op) {
		switch(op) {
		case '+': System.out.println(su+"+"+su2+"="+(su+su2));break;
		case '-': System.out.println(su+"-"+su2+"="+(su-su2));break;
		case '*': System.out.println(su+"*"+su2+"="+(su*su2));break;
		case '/': System.out.println(su+"/"+su2+"="+((double)su/su2));break;
		}
	}
	
	//��ȯ���� �ְ� �谳������ �ִ� �żҵ� �����ϱ�
	//��ȯ���� �ִ� �޼ҵ�� �ݵ�� ������ ����������!!!
	//�޼ҵ� �����ο� return ���� �־����
	public double cal3(int su,int su2,char op) {
		double result;
		switch(op) {
		case'+': result=su+su2;break;
		case'-':result=su-su2;break;
		case'*':result=su*su2;break;
		case'/':result=(double)su/su2;break;
		default: result=0.0;
		//result �� ���� ������ ��������� return�� �ƹ��͵� �ȵ��� �ʱ�ȭ�� �ȉ� �׷��� 
		//default �� �ֵ� ���� �־� ���� �޼ҵ� �ȿ��� ������ �ѹ��� �־� ���ƾ���
		}
		return result;
		
	}

}
