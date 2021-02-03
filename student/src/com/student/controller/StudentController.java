package com.student.controller;

import com.student.model.dao.StudentDao;
import com.student.model.vo.Student;
import com.student.view.MainView;

public class StudentController {
	//view �� dao �޼ҵ带 ȣ��
	
	private StudentDao dao=new StudentDao();//������ ���� ��
	private MainView view=new MainView();
	public void mainMenu() {
		//���� ȭ���� ȣ�����ִ� ���
		view.mainMenu(this);
	}
	public void studentCal() {
		searchAll();
		Student s=view.calCul();
		String students=dao.studentCal(s);
		view.printMsg(students.equals("")?"������ �Է� ������ �ʽ��ϴ�":students);
	}
	
	
	
	public void studentRecord() {
		searchAll();
		Student s=view.inputRecord();
		boolean flag=dao.studentRecord(s);
		view.printMsg(flag?"�Է¼���":"��ȸ���� �ʽ��ϴ�");
		
	}
	
	
	
	
	
	public void insertStudent() {
		//����ڰ� �Է��ϴ� �����͸� dao�� �ɹ������� ������ �ϴ� ���
		//1.����ڿ��� ������ �Է� �޾ƾ���.->�Է�ȭ���� ���
		Student s=view.inputData();
		//2.ȭ�鿡�� �޾ƿ� ���� dao�� ����ҿ� ����.
		boolean flag=dao.insertStudent(s);
		//student ���� ����� ���� �޼��� ��� ��Ű��
		view.printMsg(flag?"�Է¼���":"��Ͻ���");
	}
	
	public void searchAll() {
		//dao��������� ���� 
		String students=dao.searchAll();
		view.printMsg(students.equals("")?"����� �����Ͱ� �����ϴ�":students);
	}

	public void searchGender() {
		//1.������ �������� �л��� ��ȸ����.
		char gender=view.choiceGender();
		String students=dao.searchGender(gender);
		view.printMsg(students.equals("")?"��ȸ�� �����Ͱ� �����ϴ�":students);
		//view.printMsg(gender=='M'?"[���л�]\n"+students:"[���л�]\n"+students);
	}
	
	public void changeInfo() {
		//1.����ȭ���� ���
		searchAll();
		Student s=view.reSet();
		boolean flag=dao.changeInfo(s);
		view.printMsg(flag?"��������":"��������");
	
}

}