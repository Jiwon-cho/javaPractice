package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	private Student[] sArr=new Student[5];
	
	public StudentController() {}
	
	public void printStudnet() {
		sArr[0]=new Student();
		sArr[0].setName("��浿");
		sArr[0].setSubject("�ڹ�");
		sArr[0].setScore(100);
//		sArr[1].setName("�ڱ浿");
//		sArr[1].setSubject("���");
//		sArr[1].setScore(50);
//		sArr[2].setName("�̱浿");
//		sArr[2].setSubject("ȭ��");
//		sArr[2].setScore(85);
//		sArr[3].setName("���浿");
//		sArr[3].setSubject("����");
//		sArr[3].setScore(60);
//		sArr[4].setName("ȫ�浿");
//		sArr[4].setSubject("�ڹ�");
//		sArr[4].setScore(20);
		
		System.out.print(sArr[0].getName());
	}







}

