package com.inherit.run;

import java.util.Scanner;

import com.inherit.model.vo.Employee;
import com.inherit.model.vo.Person;
import com.inherit.model.vo.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		Employee e=new Employee();
		
		//1.��� ��ü�� Object ��ü�� �ڽ��̴�! -> Object�� ��ӹް� �ִ�.
		
		s.getClass();
		
		Scanner sc=new Scanner(System.in);
		//sc.getClass(); ��� Ŭ������ obejct �� �θ� Ŭ������ ������ �ֱ� ������ ��
		
		
		
		//s.getName();//Person�� ��ӹ޾� Person �� ������ �ִ� name �� ���
		s.setName("������");
		e.setName("�ƹ���");
		s.setHeight(190.2);
		e.setHeight(129.3);
		System.out.println(s.getName());
		System.out.println(e.getName());
		System.out.println(s.getHeight());
		System.out.println(e.getHeight());
		
		//�����ڷ� �ʱ�ȭ�ϱ� ->super �����ڸ� �̿��ϴ� ���
		//Student s1=new Student(1,3,3);
		//System.out.println(s1.getName()+" "+s1.getGrade());
		Student s2=new Student();
		System.out.println(s2.getName()+" "+s2.getGrade());
		
		Student s3=new Student("������",29,'m',"�ǿ�","13123",59.2,188.2,2,2,2);
		System.out.println(s3.getName()+" "+s3.getGrade());
		
		
		Person p=new Person();
		
		s.infoObject();
		e.infoObject();
		p.infoObject();
	
		System.out.println(s3);
		
		e=new Employee("����",26,'��',"����","123213231",70,199.5,"������","����",100);
		System.out.println(e);
		
		
		
		
		
		
		
		
		
	}

}
