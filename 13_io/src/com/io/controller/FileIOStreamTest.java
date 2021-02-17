package com.io.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamTest {
	
	public void saveFile() {
		//OutputStream
		//Stream �� �ݵ�� ��ȯ -> close() �޼ҵ带 ���
		//����ó���� �������. -> try ~ catch 
		FileOutputStream out=null;
		try {
			 out=new FileOutputStream("testPath.txt");
			String msg="lambda fight 123";
			//write() �żҵ带 �̿��ؼ� ���� ����
			byte[] data=msg.getBytes();
			out.write(data);
			out.write("�ѱ��̴�".getBytes());
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
			//���Ͽ� �ִ� �����͸� ������ �� read() �޼ҵ� �̿�
			//byte �� �������µ�..
			//int data=-1;//������ byte �����͸� �����ϴ� ����
			//inputStream���� ���Ͽ� ����� ������ ���̻�
			//������ ���� ������ -1 ��ȯ ��
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
