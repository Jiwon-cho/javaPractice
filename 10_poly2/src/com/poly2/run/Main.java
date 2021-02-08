package com.poly2.run;

import com.poly2.model.vo.Person;
import com.poly2.model.vo.Student;
import com.poly2.model.vo.Teacher;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//추상 클래스는 자체생성이 불가능하다! 미완성된 클래스로 보기 때문에
		//그래서 반드시 상속받아 생성을 해야한다!
		//Person p=new Person();
		Student s=new Student("유병승",19,"경기도 시흥시",1,1);
		System.out.println(s.getName()+s.getAge()+
				s.getAddress()+s.getGrade()+s.getGroup());
		Teacher t=new Teacher("조지원",19,"경기도 시흥시","java","학부");
		System.out.println(t.getName()+t.getAge()+
				t.getAddress()+t.getMajor()+t.getJob());
		
		//추상클래스도 변수의 타입으로써 사용이 가능함.
		
		Person p=s;//타입으로써 가능함.
		//상속과 마찬가지로 부모에 속해있는 내용만 사용이 가능함.
//		((Student)p).getGrade();//자식 이용은 형변환 해서/상속이랑 같음
//		((Teacher)p).getJob();
		p.active();
		p=t;
		p.active();
		
		
		//추상클래스의 타입,일반 부모클래스의 차이점
		//Person p=자기자신이 들어갈 수 있나? 추상클래스 라 안됌
		
		//클래스 -> 추상 메소드를 포함하고 있으면 반드시 추상클래스로 선언해야함.
	}

}
