package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController sc=new StudentController();
	
	public void StudentMenu() {
		Student[] s=sc.printStudent();
		System.out.println("============학생 정보 출력=============");
		for(int i=0;i<5;i++) {
			System.out.println("이름: "+s[i].getName()+" / 과목: "+s[i].getSubject()+" / 점수: "+s[i].getScore());
		}
		
		System.out.println("============학생 성적 출력=============");
		double[] d=sc.avgScore();
		System.out.println("학생 점수 합계: "+(int)d[0]);
		System.out.println("학생 점수 평균: "+d[1]);
		
		System.out.println("============성적 결과 출력=============");
		int a=sc.getCUT_LINE();
		for(int i=0;i<5;i++) {
			if(s[i].getScore()<a) {
				System.out.println(s[i].getName()+"학생은 재시험 대상입니다.");
			}else {
				System.out.println(s[i].getName()+"학생은 통과입니다.");
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
