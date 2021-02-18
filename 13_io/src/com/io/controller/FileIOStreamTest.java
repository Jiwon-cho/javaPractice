package com.io.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.io.model.vo.Person;

public class FileIOStreamTest {

	public void saveFile() {
		// OutputStream
		// Stream �� �ݵ�� ��ȯ -> close() �޼ҵ带 ���
		// ����ó���� �������. -> try ~ catch
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("testPath.txt");
			String msg = "lambda fight 123";
			// write() �żҵ带 �̿��ؼ� ���� ����
			byte[] data = msg.getBytes();
			out.write(data);
			out.write("�ѱ��̴�".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null)
					out.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void loadFile() {
		// InputStream
		FileInputStream fis = null;
		try
		// (FileInputStream fis=new FileInputStream("testpath.txt"))
		{
			fis = new FileInputStream("testpath.txt");
			// ���Ͽ� �ִ� �����͸� ������ �� read() �޼ҵ� �̿�
			// byte �� �������µ�..
			// int data=-1;//������ byte �����͸� �����ϴ� ����
			// inputStream���� ���Ͽ� ����� ������ ���̻�
			// ������ ���� ������ -1 ��ȯ ��
			/*
			 * while((data=fis.read())!=-1) { System.out.println((char)data); }
			 */
			byte[] temp = new byte[(int) new File("testpath.txt").length()];
			fis.read(temp);
			String data = new String(temp);
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	// ����ó�� ����� ��Ʈ��
	// Reader /Writer

	public void strSaveFile() {
		// FileWriter -> stream
		try (FileWriter out = new FileWriter("strData")) {
			String str = "������ ����� ��û ���.";
			out.write(str);
			out.write("�ſ� ���.�ڷγ��� �ٽ� ��������.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void strLoadFile() {
		try (FileReader fr = new FileReader("strData")) {

			int data = -1;
			String msg = "";
			while ((data = fr.read()) != -1) {
				msg += (char) data;
			}
			System.out.println(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// ������ �޸��� �����
	// ��������. Ŭ���̾�Ʈ���� ���� �Է��� ����
	// �� �Է°��� ������ �����ϰ� exit �Է��������� ��� �Է��� ����
	// exit��� �Է��ϸ� ���Ͽ� ����
	// ���Ͽ� ����� ���� ���
	
	public void messageLoad() {
		String path=FileIOStreamTest.class.getResource("/").getPath();
		path=path.substring(0,path.lastIndexOf("bin"));
		File f=new File(path);
		String [] fileList=f.list();
		for(String name: fileList) {
			if(name.contains(".gw")) {
				System.out.println(name);
			}
		}
			Scanner sc=new Scanner(System.in);
			System.out.println("�ҷ��� ���� �̸�: ");
			try (FileReader fr = new FileReader(sc.next()+".gw")) {
				String msg2 = "";
				int data = -1;
				while ((data = fr.read()) != -1) {
					msg2 += (char) data;
				}
				System.out.println(msg2);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	
	

	public void simpleMemo() {
		try (FileWriter fw = new FileWriter("memo.gw"); Scanner sc = new Scanner(System.in);) {

			String msg = "";
			while (!msg.contains("exit")) {
				System.out.println("�Է��϶�: ");
				msg = sc.nextLine();
				fw.write(msg);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		try (FileReader fr = new FileReader("memo.gw")) {
			String msg2 = "";
			int data = -1;
			while ((data = fr.read()) != -1) {
				msg2 += (char) data;
			}
			System.out.println(msg2);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void inputMemo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϸ��� �Է��϶�: ");
		try (FileWriter fw = new FileWriter(sc.next());) {

			String msg = "";
			while (!msg.contains("exit")) {
				System.out.println("�Է��϶�: ");
				msg = sc.next();
				fw.write(msg);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void dataSave() {
		Person[] ppl=new Person[3];
		ppl[0]=new Person("������",19,'��',180.5);
		ppl[1]=new Person("������1",20,'��',181.5);
		ppl[2]=new Person("������2",21,'��',182.5);
		
		try(FileWriter out=new FileWriter("person.data")){
		for(Person p:ppl) {
			out.write(p.getName()+",");
			out.write(String.valueOf(p.getAge())+",");
			out.write(p.getGender()+",");
			out.write(String.valueOf(p.getHeight())+"\n");
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void dataLoad() {
				
		try (FileReader fr = new FileReader("person.data")) {
			String person = "";
			int data = -1;
			while ((data = fr.read()) != -1) {
				person += (char) data;
			}
			String[]ppl=person.split("\n");
			for(int i=0;i<3;i++) {	
			
			String[]ppl2=ppl[i].split(",");
			Person p=new Person(ppl2[0],Integer.parseInt(ppl2[1]),ppl2[2].charAt(0),Double.parseDouble(ppl2[3]));
//			for(String att:ppl) {
//				System.out.println(att);
//			}
			System.out.println(p);
		}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
