package com.poly2.run;

import com.poly2.model.vo.Person;
import com.poly2.model.vo.Student;
import com.poly2.model.vo.Teacher;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�߻� Ŭ������ ��ü������ �Ұ����ϴ�! �̿ϼ��� Ŭ������ ���� ������
		//�׷��� �ݵ�� ��ӹ޾� ������ �ؾ��Ѵ�!
		//Person p=new Person();
		Student s=new Student("������",19,"��⵵ �����",1,1);
		System.out.println(s.getName()+s.getAge()+
				s.getAddress()+s.getGrade()+s.getGroup());
		Teacher t=new Teacher("������",19,"��⵵ �����","java","�к�");
		System.out.println(t.getName()+t.getAge()+
				t.getAddress()+t.getMajor()+t.getJob());
		
		//�߻�Ŭ������ ������ Ÿ�����ν� ����� ������.
		
		Person p=s;//Ÿ�����ν� ������.
		//��Ӱ� ���������� �θ� �����ִ� ���븸 ����� ������.
//		((Student)p).getGrade();//�ڽ� �̿��� ����ȯ �ؼ�/����̶� ����
//		((Teacher)p).getJob();
		p.active();
		p=t;
		p.active();
		
		
		//�߻�Ŭ������ Ÿ��,�Ϲ� �θ�Ŭ������ ������
		//Person p=�ڱ��ڽ��� �� �� �ֳ�? �߻�Ŭ���� �� �ȉ�
		
		//Ŭ���� -> �߻� �޼ҵ带 �����ϰ� ������ �ݵ�� �߻�Ŭ������ �����ؾ���.
	}

}
