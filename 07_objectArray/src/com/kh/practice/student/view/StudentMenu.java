package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController sc=new StudentController();
	
	public void StudentMenu() {
		Student[] s=sc.printStudent();
		System.out.println("============�л� ���� ���=============");
		for(int i=0;i<5;i++) {
			System.out.println("�̸�: "+s[i].getName()+" / ����: "+s[i].getSubject()+" / ����: "+s[i].getScore());
		}
		
		System.out.println("============�л� ���� ���=============");
		double[] d=sc.avgScore();
		System.out.println("�л� ���� �հ�: "+(int)d[0]);
		System.out.println("�л� ���� ���: "+d[1]);
		
		System.out.println("============���� ��� ���=============");
		int a=sc.getCUT_LINE();
		for(int i=0;i<5;i++) {
			if(s[i].getScore()<a) {
				System.out.println(s[i].getName()+"�л��� ����� ����Դϴ�.");
			}else {
				System.out.println(s[i].getName()+"�л��� ����Դϴ�.");
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
