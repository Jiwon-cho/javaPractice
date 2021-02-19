package com.student.view;

import java.util.Scanner;

import com.student.controller.StudentController;
import com.student.model.dao.StudentDao;
import com.student.model.vo.Student;

public class MainView {
	private StudentDao dao=new StudentDao();
	
	//����ȭ���� ������ִ� �޼ҵ� ����
	public void mainMenu(StudentController stc) {
	//StudentController stc=new StudentController();
	while(true) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("======�л����� ���α׷�=====");
		System.out.println("1.��ü �л� ��ȸ");
		System.out.println("2.�л� ���");
		System.out.println("3.�л������˻�");
		System.out.println("4.�л���������(����,�ּ�)");//���� �̸�
		System.out.println("5.�����Է�");
		System.out.println("7.�л��������(�հ�,���)");
		System.out.println("8.������ ����");
		System.out.println("9.������ �ҷ�����");
		System.out.println("0. ���α׷� ����");
		System.out.print("����: ");
		int cho=sc.nextInt();
		switch(cho) {
		case 1: stc.searchAll();break;
		case 2: stc.insertStudent();break;
		case 3: stc.searchGender();break;
		case 4: stc.changeInfo();break;
		case 5: stc.studentRecord();break;
		case 7: stc.studentCal();break;
		case 8:stc.studentSave();break;
		case 9:stc.studentLoad();break;
		case 0:stc.studentSave();System.out.println("���α׷��� �����մϴ�");return;
		//return �� �޼ҵ� ��ü�� ���������� �� 
		}
	}
}
	
	public Student calCul() {
		Scanner sc=new Scanner(System.in);
		Student s=new Student();	
		System.out.println("�л��� �̸��� �Է��Ͻÿ�: ");
		s.setName(sc.next());
		return s;
		
	}
	
	
	public Student inputRecord() {
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		System.out.println("������ �Է��� �л��� �̸��� �Է��Ͻÿ�: ");
		s.setName(sc.next());
		System.out.println("���� ������ �Է��ϼ���: ");
		s.setKor(sc.nextInt());
		System.out.println("���� ������ �Է��ϼ���: ");
		s.setEng(sc.nextInt());
		System.out.println("���� ������ �Է��ϼ���: ");
		s.setMath(sc.nextInt());
		System.out.println("�ڵ� ������ �Է��ϼ���: ");
		s.setCoding(sc.nextInt());
		return s;
	}
	
	
	

	//����� ������ �Է� ȭ�� ����
	public Student inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("====�л� ���====");
		System.out.print("�̸�: ");
		String name=sc.next();
		System.out.print("����: ");
		int age=sc.nextInt();
		System.out.print("����(M/F): ");
		char gender=sc.next().charAt(0);
		System.out.print("�ּ�: ");
		sc.nextLine();
		String address=sc.nextLine();
		Student s=new Student(name,age,gender,address);
		return s;
	}
	//�޼��� �ҷ��ϴ� �޼ҵ� ����
	public void printMsg(String msg) {
		System.out.println("====�ý��� �޼���====");
		System.out.println(msg);
		System.out.println("==================");
		
	}
	
	//���� ����ȭ��
	public char choiceGender() {
		Scanner sc=new Scanner(System.in);
		System.out.println("====�˻��� ����====");
		System.out.print("1.����2.����: ");
		int choice=sc.nextInt();
		if(choice==1)return 'M';
		else return 'F';
		//return sc.nextInt()==1?'M':'F';
	}
	
	public Student reSet() {
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		System.out.println("====�л����� ����===");
		System.out.println("������ �л��̸�: ");
		s.setName(sc.next());
		System.out.print("����: ");
		s.setAge(sc.nextInt());
		System.out.print("�ּ�: ");
		sc.nextLine();
		s.setAddress(sc.nextLine());
		return s;
	}
	
	
}