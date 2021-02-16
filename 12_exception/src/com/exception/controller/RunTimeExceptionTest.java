package com.exception.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class RunTimeExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	//ArithmeticException ������������� ���� �ȉ� ��
//try{ <-�̷��� �ϸ� �� �߰�ȣ ���� ���� �ȿ� ���� ���� �ϸ� ���� ������ �Ǽ� �ۿ��� ����
		System.out.println("��: ");
		int su=sc.nextInt();
		System.out.println("��: ");
		int su2=sc.nextInt();
		try {		
		System.out.println(su/su2);
		System.out.println("�����߻� ���� �ڵ�");//<-���� �߻� �̵Ǹ� �ٷ� catch�� �Ѿ�� ������ ���� �׳� �Ѿ
	}catch(ArithmeticException e) {
		System.out.println("������?");
	}
		
		//NegativeArraySizeException: �迭 ���̸� ������ ����
		//int[] intArr=new int[-29];//compile ������ ������,heap���� �� �� ����1111
		//����ڿ��� ���� ���� �Ǽ��� ���� ���� �Էµ� �� �ֱ� ������ ���� ó���� ����
		
		//ArrayIndexOutOfBoundsException : �迭�� �ε��� ������ �Ѿ ����	
		String[] names=new String[3];
	try {	
		names[3] ="����";
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("�迭 ����");
		//String[] temp=new String[names.length+5];
		String[] temp=Arrays.copyOf(names, names.length+5);
		//System.arraycopy(names, 0, temp,0,names.length);
		temp[3]="������";
		names=temp;
	}
	
	for(String n: names) {
		System.out.println(n);
	}
		//ClassCastException : Ŭ���� ����ȯ ����
		Object obj=new Date();
		try {	
			String a=(String)obj;
	}catch(ClassCastException e) {
		System.out.println("����");
	}
	
	//NullPointerException	
		String name=null;
	try {	
		name.charAt(0);
	}catch(NullPointerException e) {
		System.out.println("�⺻�� ����");
		name="������";
		
	}
		//		
		
		//checkedException
		//IOException(�����������) -> �߻��ϴ� ���ܿ� ���� ����	
	String hobby[]=null;
	
	try {
		//hobby[0]="�";
	FileInputStream input=new FileInputStream("test.txt");
	input.read();
	
}
catch(FileNotFoundException e) {
	e.printStackTrace();
	//return;
}//Exception ���� ��Ӱ��谡 ����	
	catch(NullPointerException e){
	System.out.println("����");
}catch(IOException e) {
	System.out.println("IO");//IOException �� �θ� Ŭ������ �� ���ϲ� �� ó��, notfound �� �ڽ�
}finally {
	System.out.println("������ ����");//try�� ������ ������ �����ϰ� �ϴ� ��
}

	
	
System.out.println("������?");
new ThrowsTest().tryWithResourceTest();
	
	
	
	
}

}