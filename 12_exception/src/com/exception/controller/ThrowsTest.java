package com.exception.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsTest {
	
	//예외처리 위임하기
	//호출되는 곳 에서 예외처리 하기
	public void a() throws FileNotFoundException {
 
		FileInputStream fis=new FileInputStream("test.txt");
	
	
	
	}
	
	public void b() throws IOException{
		a();//<-exceptio 처리하라고 되있기 때문에 무조건 해줘야함
	//특정 조건에 따라 예외를 발생시킬  수 있음.
		//unchecked 라 상관 X	//throw new ArrayIndexOutOfBoundsException();
	//throw new IOException(); checked 라서 무조건 처리 해줘야함
	
	
	}

	public void c() {
	try {	
		b();
	}catch(IOException e) {
		
//위임 받은 예외 처리 다해줘야한다.
//	catch(EOFException e) {
//		e.printStackTrace();
//	}catch(FileNotFoundException e) {
//		e.printStackTrace();
//	}
	}

	}

	public void tryWithResourceTest() {
		//FileInputStream input=null;
		try(FileInputStream input=new FileInputStream("test.txt")) {//닫을것들을 여기에 넣어서 그냥 자동으로 닫게 설정
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


