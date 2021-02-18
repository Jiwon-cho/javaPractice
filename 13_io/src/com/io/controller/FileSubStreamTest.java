package com.io.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import com.io.model.vo.Person;

public class FileSubStreamTest {

	// 서브스트림을 이용해보자.
	public void stringChangeOutput() {
		// FileOutputStream -> byte 단위 통신. 데이터를 FileWriter 변경해줌
		BufferedWriter fw = null;
		try {
			fw = new BufferedWriter(new OutputStreamWriter(System.out));
			// System.out.write;//system.out 이 기본 stream 이라서 보조보조기본 임
			fw.write("이것도 된다");
			fw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void stringChangeInput() {
		// fileStream 키모드로 데이터를 받아오는 로직
		// Scanner 비슷한거 구현
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("입력: ");
			String data = br.readLine();// 키보드로 부터 입력값 받아옴
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	//BufferReader
		//BufferWriter 이용하기
		//성능이 향상
		public void bufferedWriterTest() {
			try(BufferedWriter bw=new BufferedWriter(new FileWriter("sample.txt"))){
				
				bw.write("오늘은 목요일 \n");
				bw.write("오늘은 금요일 \n");
				bw.write("오늘은 토요일 \n");
				bw.write("오늘은 일요일 \n");
				bw.flush();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	
		public void bufferdReaderTest() {
			try(BufferedReader br=new BufferedReader(new FileReader("sample.txt"))){
			String data="";
			while((data=br.readLine())!=null) {
				//readLine() 은 \n 기준으로 읽음
				System.out.println(data);
			}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		//DataInputStream
		//DataOutputStream
		//데이터를 자료형을 유지한 상태로 저장
		//자료형을 유지한 상ㅇ태고 가져옴
		//FileInputStream, FileOutputStream
		public void dataOutputStreamTest() {
			Scanner sc=new Scanner(System.in);
			try(DataOutputStream dis=new DataOutputStream(new FileOutputStream("member.data"))){
				System.out.print("아이디: ");
				dis.writeUTF(sc.nextLine());
				//utf 는 String 타입 저장할 때 쓰는 것
				System.out.print("패스워드: ");
				dis.writeUTF(sc.nextLine());
				System.out.print("성별: ");
				dis.writeChar(sc.next().charAt(0));
				System.out.print("나이: ");
				dis.writeInt(sc.nextInt());
				System.out.print("키: ");
				dis.writeDouble(sc.nextDouble());
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		public void dataInputStreamTest() {
			try(DataInputStream dis=new DataInputStream(new FileInputStream("member.data"))){
				 //불러올때 주의!!
				String id=dis.readUTF();
				String pw=dis.readUTF();
				char gender=dis.readChar();
				int age=dis.readInt();
				double height=dis.readDouble();
				System.out.println(id+pw+gender+age+height);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		public void personData() {
		try(Scanner sc=new Scanner(System.in);DataOutputStream dis=new DataOutputStream(new FileOutputStream("person.data") );){
					//DataOutputStream dis=new DataOutputStream(new FileOutputStream("person.data") )){
				for(int i=0;i<3;i++) {
					Person p=new Person();
					System.out.println("이름: ");
					dis.writeUTF(sc.next());
					System.out.println("나이: ");
					dis.writeInt(sc.nextInt());				
					System.out.println("성별: ");
					dis.writeChar(sc.next().charAt(0));
					System.out.println("키: ");
					dis.writeDouble(sc.nextDouble());
					
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			}
		
		public void personLoad() {
			Person[] persons=new Person[3];
			try(DataInputStream dis=new DataInputStream(new FileInputStream("person.data"))) {
			for(int i=0;i<3;i++) {	
				persons[i]=new Person();
				persons[i].setName(dis.readUTF());
				persons[i].setAge(dis.readInt());
				persons[i].setGender(dis.readChar());
				persons[i].setHeight(dis.readDouble());
			}
			for(Person p: persons) {
				System.out.println(p);
			}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	

}
