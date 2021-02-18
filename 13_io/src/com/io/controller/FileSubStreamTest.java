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

	// ���꽺Ʈ���� �̿��غ���.
	public void stringChangeOutput() {
		// FileOutputStream -> byte ���� ���. �����͸� FileWriter ��������
		BufferedWriter fw = null;
		try {
			fw = new BufferedWriter(new OutputStreamWriter(System.out));
			// System.out.write;//system.out �� �⺻ stream �̶� ���������⺻ ��
			fw.write("�̰͵� �ȴ�");
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
		// fileStream Ű���� �����͸� �޾ƿ��� ����
		// Scanner ����Ѱ� ����
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("�Է�: ");
			String data = br.readLine();// Ű����� ���� �Է°� �޾ƿ�
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	//BufferReader
		//BufferWriter �̿��ϱ�
		//������ ���
		public void bufferedWriterTest() {
			try(BufferedWriter bw=new BufferedWriter(new FileWriter("sample.txt"))){
				
				bw.write("������ ����� \n");
				bw.write("������ �ݿ��� \n");
				bw.write("������ ����� \n");
				bw.write("������ �Ͽ��� \n");
				bw.flush();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	
		public void bufferdReaderTest() {
			try(BufferedReader br=new BufferedReader(new FileReader("sample.txt"))){
			String data="";
			while((data=br.readLine())!=null) {
				//readLine() �� \n �������� ����
				System.out.println(data);
			}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		//DataInputStream
		//DataOutputStream
		//�����͸� �ڷ����� ������ ���·� ����
		//�ڷ����� ������ ���°� ������
		//FileInputStream, FileOutputStream
		public void dataOutputStreamTest() {
			Scanner sc=new Scanner(System.in);
			try(DataOutputStream dis=new DataOutputStream(new FileOutputStream("member.data"))){
				System.out.print("���̵�: ");
				dis.writeUTF(sc.nextLine());
				//utf �� String Ÿ�� ������ �� ���� ��
				System.out.print("�н�����: ");
				dis.writeUTF(sc.nextLine());
				System.out.print("����: ");
				dis.writeChar(sc.next().charAt(0));
				System.out.print("����: ");
				dis.writeInt(sc.nextInt());
				System.out.print("Ű: ");
				dis.writeDouble(sc.nextDouble());
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		public void dataInputStreamTest() {
			try(DataInputStream dis=new DataInputStream(new FileInputStream("member.data"))){
				 //�ҷ��ö� ����!!
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
					System.out.println("�̸�: ");
					dis.writeUTF(sc.next());
					System.out.println("����: ");
					dis.writeInt(sc.nextInt());				
					System.out.println("����: ");
					dis.writeChar(sc.next().charAt(0));
					System.out.println("Ű: ");
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
