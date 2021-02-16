package com.exception.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsTest {
	
	//����ó�� �����ϱ�
	//ȣ��Ǵ� �� ���� ����ó�� �ϱ�
	public void a() throws FileNotFoundException {
 
		FileInputStream fis=new FileInputStream("test.txt");
	
	
	
	}
	
	public void b() throws IOException{
		a();//<-exceptio ó���϶�� ���ֱ� ������ ������ �������
	//Ư�� ���ǿ� ���� ���ܸ� �߻���ų  �� ����.
		//unchecked �� ��� X	//throw new ArrayIndexOutOfBoundsException();
	//throw new IOException(); checked �� ������ ó�� �������
	
	
	}

	public void c() {
	try {	
		b();
	}catch(IOException e) {
		
//���� ���� ���� ó�� ��������Ѵ�.
//	catch(EOFException e) {
//		e.printStackTrace();
//	}catch(FileNotFoundException e) {
//		e.printStackTrace();
//	}
	}

	}

	public void tryWithResourceTest() {
		//FileInputStream input=null;
		try(FileInputStream input=new FileInputStream("test.txt")) {//�����͵��� ���⿡ �־ �׳� �ڵ����� �ݰ� ����
			//input=new FileInputStream("test.txt");
			int data=-1;
			while((data=input.read())!=-1) {
				System.out.println((char)data);
			}
			}catch(IOException e){
				e.printStackTrace();
//			}finally {
//				try {
//					if(input!=null) input.close();
//					
//				}catch(IOException e) {
//					e.printStackTrace();
//				}
//		}
	}





	}
}


