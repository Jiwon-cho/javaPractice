package com.student.common;

import com.student.model.vo.Student;

public interface StudentDaoInter {
	 
	boolean insertStudent(Student s);
	
	String searchAll();
	
	String searchGender(char gender);
	
	boolean changeInfo(Student s);
	
	String studentCal(Student s);
	
	boolean studentRecord(Student s);
	public void saveStudent();
	public void loadStudent();
	
	
}
