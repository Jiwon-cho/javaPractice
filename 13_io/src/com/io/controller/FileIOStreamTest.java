package com.io.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamTest {
	
	public void saveFile() {
		//OutputStream
		//Stream 은 반드시 반환 -> close() 메소드를 사용
		//예외처리를 해줘야함. -> try ~ catch 
		FileOutputStream out=null;
		try {
			 out=new FileOutputStream("testPath.txt");
			String msg="lambda fight 123";
			//write() 매소드를 이용해서 파일 전송
			byte[] data=msg.getBytes();
			out.write(data);
			out.write("한글이다".getBytes());
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(out!=null) out.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	public void loadFile() {
		//InputStream
		FileInputStream fis=null;
		try
		//(FileInputStream fis=new FileInputStream("testpath.txt"))
		{
			fis=new FileInputStream("testpath.txt");
			//파일에 있는 데이터를 가져올 때 read() 메소드 이용
			//byte 로 가져오는데..
			//int data=-1;//가져온 byte 데이터를 보관하는 변수
			//inputStream에서 파일에 저장된 내용을 더이상
			//가져올 것이 없으면 -1 반환 함
			/*
			 * while((data=fis.read())!=-1) { System.out.println((char)data); }
			 */
			byte[]temp=new byte[(int)new File("testpath.txt").length()];
			fis.read(temp);
			String data=new String(temp);
			System.out.println(data);
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally{
		try {
			if(fis!=null) fis.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
