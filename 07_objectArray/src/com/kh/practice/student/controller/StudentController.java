package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	private Student[] sArr=new Student[5];
	
	public StudentController() {}
	
	public void printStudnet() {
		sArr[0]=new Student();
		sArr[0].setName("김길동");
		sArr[0].setSubject("자바");
		sArr[0].setScore(100);
//		sArr[1].setName("박길동");
//		sArr[1].setSubject("디비");
//		sArr[1].setScore(50);
//		sArr[2].setName("이길동");
//		sArr[2].setSubject("화면");
//		sArr[2].setScore(85);
//		sArr[3].setName("정길동");
//		sArr[3].setSubject("서버");
//		sArr[3].setScore(60);
//		sArr[4].setName("홍길동");
//		sArr[4].setSubject("자바");
//		sArr[4].setScore(20);
		
		System.out.print(sArr[0].getName());
	}







}

