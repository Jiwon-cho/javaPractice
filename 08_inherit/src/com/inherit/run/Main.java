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
		
		//1.모든 객체는 Object 객체의 자식이다! -> Object를 상속받고 있다.
		
		s.getClass();
		
		Scanner sc=new Scanner(System.in);
		//sc.getClass(); 모든 클래스가 obejct 를 부모 클래스로 가지고 있기 때문에 됨
		
		
		
		//s.getName();//Person을 상속받아 Person 이 가지고 있는 name 을 사용
		s.setName("조지원");
		e.setName("아무개");
		s.setHeight(190.2);
		e.setHeight(129.3);
		System.out.println(s.getName());
		System.out.println(e.getName());
		System.out.println(s.getHeight());
		System.out.println(e.getHeight());
		
		//생성자로 초기화하기 ->super 생성자를 이용하는 방법
		//Student s1=new Student(1,3,3);
		//System.out.println(s1.getName()+" "+s1.getGrade());
		Student s2=new Student();
		System.out.println(s2.getName()+" "+s2.getGrade());
		
		Student s3=new Student("조지원",29,'m',"의왕","13123",59.2,188.2,2,2,2);
		System.out.println(s3.getName()+" "+s3.getGrade());
		
		
		Person p=new Person();
		
		s.infoObject();
		e.infoObject();
		p.infoObject();
	
		System.out.println(s3);
		
		e=new Employee("정찬",26,'남',"서울","123213231",70,199.5,"개발팀","팀장",100);
		System.out.println(e);
		
		
		
		
		
		
		
		
		
	}

}
