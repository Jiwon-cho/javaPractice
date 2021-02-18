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
		// Stream 은 반드시 반환 -> close() 메소드를 사용
		// 예외처리를 해줘야함. -> try ~ catch
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("testPath.txt");
			String msg = "lambda fight 123";
			// write() 매소드를 이용해서 파일 전송
			byte[] data = msg.getBytes();
			out.write(data);
			out.write("한글이다".getBytes());
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
			// 파일에 있는 데이터를 가져올 때 read() 메소드 이용
			// byte 로 가져오는데..
			// int data=-1;//가져온 byte 데이터를 보관하는 변수
			// inputStream에서 파일에 저장된 내용을 더이상
			// 가져올 것이 없으면 -1 반환 함
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

	// 문자처리 기반의 스트림
	// Reader /Writer

	public void strSaveFile() {
		// FileWriter -> stream
		try (FileWriter out = new FileWriter("strData")) {
			String str = "오늘은 목요일 엄청 춥다.";
			out.write(str);
			out.write("매우 춥다.코로나가 다시 심해진다.");
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

	// 간단한 메모장 만들기
	// 시작을함. 클라이언트한테 값을 입력을 받음
	// 그 입력값을 변수에 저장하고 exit 입력전까지는 계속 입력을 받음
	// exit라고 입력하면 파일에 저장
	// 파일에 저장되 구문 출력
	
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
			System.out.println("불러올 파일 이름: ");
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
				System.out.println("입력하라: ");
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
		System.out.println("파일명을 입력하라: ");
		try (FileWriter fw = new FileWriter(sc.next());) {

			String msg = "";
			while (!msg.contains("exit")) {
				System.out.println("입력하라: ");
				msg = sc.next();
				fw.write(msg);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void dataSave() {
		Person[] ppl=new Person[3];
		ppl[0]=new Person("유병승",19,'남',180.5);
		ppl[1]=new Person("유병승1",20,'여',181.5);
		ppl[2]=new Person("유병승2",21,'남',182.5);
		
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
