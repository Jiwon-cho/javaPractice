package com.student.controller;

import com.student.model.dao.StudentDao;
import com.student.model.vo.Student;
import com.student.view.MainView;

public class StudentController {
	//view 와 dao 메소드를 호출
	
	private StudentDao dao=new StudentDao();//선언을 해준 것
	private MainView view=new MainView();
	public void mainMenu() {
		//메인 화면을 호출해주는 기능
		view.mainMenu(this);
	}
	public void studentCal() {
		searchAll();
		Student s=view.calCul();
		String students=dao.studentCal(s);
		view.printMsg(students.equals("")?"성적이 입력 되있지 않습니다":students);
	}
	
	
	
	public void studentRecord() {
		searchAll();
		Student s=view.inputRecord();
		boolean flag=dao.studentRecord(s);
		view.printMsg(flag?"입력성공":"조회되지 않습니다");
		
	}
	
	
	
	
	
	public void insertStudent() {
		//사용자가 입력하는 데이터를 dao의 맴버변수에 저장을 하는 기능
		//1.사용자에게 데이터 입력 받아야함.->입력화면을 출력
		Student s=view.inputData();
		//2.화면에서 받아온 값을 dao의 저장소에 저장.
		boolean flag=dao.insertStudent(s);
		//student 저장 결과에 따라 메세지 출력 시키기
		view.printMsg(flag?"입력성공":"등록실패");
	}
	
	public void searchAll() {
		//dao멤버변수에 값을 
		String students=dao.searchAll();
		view.printMsg(students.equals("")?"저장된 데이터가 없습니다":students);
	}

	public void searchGender() {
		//1.성별을 기준으로 학생을 조회하자.
		char gender=view.choiceGender();
		String students=dao.searchGender(gender);
		view.printMsg(students.equals("")?"조회된 데이터가 없습니다":students);
		//view.printMsg(gender=='M'?"[남학생]\n"+students:"[여학생]\n"+students);
	}
	
	public void changeInfo() {
		//1.수정화면을 출력
		searchAll();
		Student s=view.reSet();
		boolean flag=dao.changeInfo(s);
		view.printMsg(flag?"수정성공":"수정실패");
	
}

}