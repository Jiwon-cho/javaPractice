package com.obj.controller;

import java.util.Scanner;

import com.obj.model.vo.CalcResult;

//��������� Ŭ����
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
	//��ȯ�� �ְ� �Ű� ���� ���� �޼ҵ� �����ϱ�
	public CalcResult cal4() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("���Է�: ");
		int su=sc.nextInt();
		System.out.print("���Է�: ");
		int su2=sc.nextInt();
		System.out.print("������: ");
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
		//return ���� �Ѱ��� ���ϰ���/ �� �Ű����� ���� �׳� ���� �̶� ������� ���� ���� ��� ����Ǵ��� ���ο�����
		//�˼��� ����//�׷��� �̷��� �޼ҵ� �Ἥ ������ �޾ƿ�
	}

}
