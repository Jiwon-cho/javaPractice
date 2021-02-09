package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	private Student[] sArr=new Student[5];
	private int CUT_LINE=60;
	
	public StudentController() {}
	
	
	
	public int getCUT_LINE() {
		return CUT_LINE;
	}



	public void setCUT_LINE(int cUT_LINE) {
		CUT_LINE = cUT_LINE;
	}



	public Student[] printStudent() {
		sArr[0]=new Student("김길동","자바",100);
		sArr[1]=new Student("박길동","디비",50);
		sArr[2]=new Student("이길동","화면",85);
		sArr[3]=new Student("정길동","서버",60);
		sArr[4]=new Student("홍길동","자바",20);

		
		return sArr;
	}
	
	public int sumScore() {
		Student[] s=printStudent();
		int result=0;
		for(int i=0;i<5;i++) {
			result+=s[i].getScore();
		}
		return result;
	}

	public double[] avgScore() {
		double []d=new double[2];
		d[0]=sumScore();
		d[1]=d[0]/5;
		return d;
	}



}

