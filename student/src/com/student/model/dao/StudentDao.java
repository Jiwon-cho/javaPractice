package com.student.model.dao;

import com.student.model.vo.Student;

public class StudentDao {
	// ���α׷����� �����ϴ� ���������� ����
	private Student s1;// �ȳ����� null��,default ��, ������ �ڷ��� default�� null
	private Student s2;
	private Student s3;
	private Student s4;
	private Student s5;

	// �Ű������� ���޵� �����(�������)�� �����ϴ� ���
	// ���ڰ�->�޾ƿ��� ������
	public String studentCal(Student s) {
		String result="";
		if (s1!=null&&s1.getName().equals(s.getName())) {
			int sum=s1.getKor()+s1.getEng()+s1.getCoding()+s1.getMath();
			double avr=sum/4;
			result+="�̸�: "+s1.getName()+"\n�հ�: "+sum+"\n���: "+avr;
						
		}
		else if (s2!=null&&s2.getName().equals(s.getName())) {
			int sum=s2.getKor()+s2.getEng()+s2.getCoding()+s2.getMath();
			double avr=sum/4;
			result+="�̸�: "+s2.getName()+"\n�հ�: "+sum+"\n���: "+avr;			
		}
		else if (s3!=null&&s3.getName().equals(s.getName())) {
			int sum=s3.getKor()+s3.getEng()+s3.getCoding()+s3.getMath();
			double avr=sum/4;
			result+="�̸�: "+s3.getName()+"\n�հ�: "+sum+"\n���: "+avr;		
		}
		else if (s4!=null&&s4.getName().equals(s.getName())) {
			int sum=s4.getKor()+s4.getEng()+s4.getCoding()+s4.getMath();
			double avr=sum/4;
			result+="�̸�: "+s4.getName()+"\n�հ�: "+sum+"\n���: "+avr;
		}
		else if (s5!=null&&s5.getName().equals(s.getName())){
			int sum=s5.getKor()+s5.getEng()+s5.getCoding()+s5.getMath();
			double avr=sum/4;
			result+="�̸�: "+s5.getName()+"\n�հ�: "+sum+"\n���: "+avr;		
		}
		
		return result;
	}
	
	
	
	
	
	public boolean studentRecord(Student s) {
		boolean flag=true;
		if (s1!=null&&s1.getName().equals(s.getName())) {
			s1.setKor(s.getKor());
			s1.setEng(s.getEng());
			s1.setMath(s.getMath());
			s1.setCoding(s.getCoding());
		}
		else if (s2!=null&&s2.getName().equals(s.getName())) {
			s2.setKor(s.getKor());
			s2.setEng(s.getEng());
			s2.setMath(s.getMath());
			s2.setCoding(s.getCoding());			
		}
		else if (s3!=null&&s3.getName().equals(s.getName())) {
			s3.setKor(s.getKor());
			s3.setEng(s.getEng());
			s3.setMath(s.getMath());
			s3.setCoding(s.getCoding());			
		}
		else if (s4!=null&&s4.getName().equals(s.getName())) {
			s4.setKor(s.getKor());
			s4.setEng(s.getEng());
			s4.setMath(s.getMath());
			s4.setCoding(s.getCoding());
		}
		else if (s5!=null&&s5.getName().equals(s.getName())){
			s5.setKor(s.getKor());
			s5.setEng(s.getEng());
			s5.setMath(s.getMath());
			s5.setCoding(s.getCoding());			
		}else {
			flag=false;
		}
		return flag;

	}
	
	
	public boolean insertStudent(Student s) {
		// 1.����ִ� ������ ã�Ƽ� ����
		boolean flag = true;
		if (s1 == null) {
			// s1������ ����ִ�
			s1 = s;
		} else if (s2 == null) {
			s2 = s;

		} else if (s3 == null) {
			s3 = s;

		} else if (s4 == null) {
			s4 = s;

		} else if (s5 == null) {
			s5 = s;
			;
		} else {
			// ������� ����!
			flag = false;
		}
		return flag;

	}

	public String searchAll() {
		// ��������� �ִ� �����͸� ��ȯ.
		// ��������� ���� ������ ��ȯ���� ����
		String students = "";
		if (s1 != null) {
			students += s1.studentInfo() + "\n";
		}
		if (s2 != null) {
			students += s2.studentInfo() + "\n";
		}
		if (s3 != null) {
			students += s3.studentInfo() + "\n";
		}
		if (s4 != null) {
			students += s4.studentInfo() + "\n";
		}
		if (s5 != null) {
			students += s5.studentInfo() + "\n";
		}
		return students;

	}
	
	public String searchGender(char gender) {
		String students="";
		if (s1!=null&&s1.getGender()==gender) {
			students += s1.studentInfo() + "\n";
		}
		if (s2 != null&&s2.getGender()==gender) {
			students += s2.studentInfo() + "\n";
		}
		if (s3 != null&&s3.getGender()==gender) {
			students += s3.studentInfo() + "\n";
		}
		if (s4 != null&&s4.getGender()==gender) {
			students += s4.studentInfo() + "\n";
		}
		if (s5 != null&&s5.getGender()==gender) {
			students += s5.studentInfo() + "\n";
		}
		return students;

	}
	
	public boolean changeInfo(Student s) {
		boolean flag=true;
		if (s1!=null&&s1.getName().equals(s.getName())) {
			s1.setAge(s.getAge());
			s1.setAddress(s.getAddress());				
		}
		else if (s2!=null&&s2.getName().equals(s.getName())) {
			s2.setAge(s.getAge());
			s2.setAddress(s.getAddress());				
		}
		else if (s3!=null&&s3.getName().equals(s.getName())) {
			s3.setAge(s.getAge());
			s3.setAddress(s.getAddress());				
		}
		else if (s4!=null&&s4.getName().equals(s.getName())) {
			s4.setAge(s.getAge());
			s4.setAddress(s.getAddress());
		}
		else if (s5!=null&&s5.getName().equals(s.getName())){
			s5.setAge(s.getAge());
			s5.setAddress(s.getAddress());				
		}else {
			flag=false;
		}
		return flag;

	}
	
}