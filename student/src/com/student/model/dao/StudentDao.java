package com.student.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.student.common.StudentDaoInter;
import com.student.model.vo.Student;

public class StudentDao implements StudentDaoInter{
	// 프로그램에서 동작하는 데이터저장 역할
	private Student[]st=new Student[5];
	private static int studentCount=0;//studentindex를 관리
	//private Students[] students=new Student[5] 이런식으로 하면 밑에 student 있어서
	// 밑에 이 student 쓸꺼면 this.student 써야됨
	

	//	private Student s1;// 안넣으면 null임,default 값, 참조형 자료의 default는 null
//	private Student s2;
//	private Student s3;
//	private Student s4;
//	private Student s5;
	@Override
	public void saveStudent() {
		
		try(ObjectOutputStream obo =new ObjectOutputStream(new FileOutputStream("Student.txt"))){
			obo.writeObject(st);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void loadStudent() {
	File f=new File("Student.txt");
	if(f.exists()) {
	try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f))) {
			st=(Student[])ois.readObject();
		for(Student s:st) {
			System.out.println(s);
		}
			
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
	
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 매개변수로 전달된 저장소(멤버변수)에 저장하는 기능
	// 인자값->받아오는 데이터
	@Override
	public String studentCal(Student s) {
		String result="";
//		if (s1!=null&&s1.getName().equals(s.getName())) {
//			int sum=s1.getKor()+s1.getEng()+s1.getCoding()+s1.getMath();
//			double avr=sum/4;
//			result+="이름: "+s1.getName()+"\n합계: "+sum+"\n평균: "+avr;
//						
//		}
//		else if (s2!=null&&s2.getName().equals(s.getName())) {
//			int sum=s2.getKor()+s2.getEng()+s2.getCoding()+s2.getMath();
//			double avr=sum/4;
//			result+="이름: "+s2.getName()+"\n합계: "+sum+"\n평균: "+avr;			
//		}
//		else if (s3!=null&&s3.getName().equals(s.getName())) {
//			int sum=s3.getKor()+s3.getEng()+s3.getCoding()+s3.getMath();
//			double avr=sum/4;
//			result+="이름: "+s3.getName()+"\n합계: "+sum+"\n평균: "+avr;		
//		}
//		else if (s4!=null&&s4.getName().equals(s.getName())) {
//			int sum=s4.getKor()+s4.getEng()+s4.getCoding()+s4.getMath();
//			double avr=sum/4;
//			result+="이름: "+s4.getName()+"\n합계: "+sum+"\n평균: "+avr;
//		}
//		else if (s5!=null&&s5.getName().equals(s.getName())){
//			int sum=s5.getKor()+s5.getEng()+s5.getCoding()+s5.getMath();
//			double avr=sum/4;
//			result+="이름: "+s5.getName()+"\n합계: "+sum+"\n평균: "+avr;		
//		}
		for(int i=0;i<st.length;i++) {
			if (st[i]!=null&&st[i].getName().equals(s.getName())) {
				int sum=st[i].getKor()+st[i].getEng()+st[i].getCoding()+st[i].getMath();
				double avr=sum/4;
				result+="이름: "+st[i].getName()+"\n합계: "+sum+"\n평균: "+avr;
		}
		}
		return result;
	}
	
	
	
	
	@Override
	public boolean studentRecord(Student s) {
	
	
		boolean flag=false;
//		if (s1!=null&&s1.getName().equals(s.getName())) {
//			s1.setKor(s.getKor());
//			s1.setEng(s.getEng());
//			s1.setMath(s.getMath());
//			s1.setCoding(s.getCoding());
//		}
//		else if (s2!=null&&s2.getName().equals(s.getName())) {
//			s2.setKor(s.getKor());
//			s2.setEng(s.getEng());
//			s2.setMath(s.getMath());
//			s2.setCoding(s.getCoding());			
//		}
//		else if (s3!=null&&s3.getName().equals(s.getName())) {
//			s3.setKor(s.getKor());
//			s3.setEng(s.getEng());
//			s3.setMath(s.getMath());
//			s3.setCoding(s.getCoding());			
//		}
//		else if (s4!=null&&s4.getName().equals(s.getName())) {
//			s4.setKor(s.getKor());
//			s4.setEng(s.getEng());
//			s4.setMath(s.getMath());
//			s4.setCoding(s.getCoding());
//		}
//		else if (s5!=null&&s5.getName().equals(s.getName())){
//			s5.setKor(s.getKor());
//			s5.setEng(s.getEng());
//			s5.setMath(s.getMath());
//			s5.setCoding(s.getCoding());			
//		}else {
//			flag=false;
//		}
	for(int i=0;i<st.length;i++) {
		if (st[i]!=null&&st[i].getName().equals(s.getName())) {
			st[i].setKor(s.getKor());
			st[i].setEng(s.getEng());
			st[i].setMath(s.getMath());
			st[i].setCoding(s.getCoding());
			flag=true;
			break;
	}
	}
		
		return flag;
	}


	
	@Override
	public boolean insertStudent(Student s) {
		// 1.비어있는 변수를 찾아서 저장
		boolean flag=true;
//		boolean flag = false;
//	
//		for(int i=0;i<5;i++) {
//		if (st[i] == null) {
//			// s1변수가 비어있다
//			st[i] = s;
//			flag=true;
//			break;
//		} else if (s2 == null) {
//			s2 = s;
//
//		} else if (s3 == null) {
//			s3 = s;
//
//		} else if (s4 == null) {
//			s4 = s;
//
//		} else if (s5 == null) {
//			s5 = s;
//			;
//		} else {
//			// 저장공간 없음!
//			flag = false;
//		}
		//return flag;
	try {
		st[studentCount++]=s;
	}catch(ArrayIndexOutOfBoundsException e) {
		//배열 의 길이를 증가
		//단 이전값을 유지하면서.
		Student[] temp=new Student[st.length+10];
		System.arraycopy(st,0,temp,0,st.length);
		st=temp;
		st[studentCount]=s;

}

		return flag;
	}

	@Override
	public String searchAll() {
		// 멤버변수에 있는 데이터를 반환.
		String students = "";
		for(int i=0;i<st.length;i++) {
		if (st[i] != null) {
			students += st[i] + "\n";
		}
//		if (s2 != null) {
//			students += s2.studentInfo() + "\n";
//		}
//		if (s3 != null) {
//			students += s3.studentInfo() + "\n";
//		}
//		if (s4 != null) {
//			students += s4.studentInfo() + "\n";
//		}
//		if (s5 != null) {
//			students += s5.studentInfo() + "\n";
//		}
		}
		return students;

	}
	@Override
	public String searchGender(char gender) {
		String students="";
//		if (s1!=null&&s1.getGender()==gender) {
//			students += s1.studentInfo() + "\n";
//		}
//		if (s2 != null&&s2.getGender()==gender) {
//			students += s2.studentInfo() + "\n";
//		}
//		if (s3 != null&&s3.getGender()==gender) {
//			students += s3.studentInfo() + "\n";
//		}
//		if (s4 != null&&s4.getGender()==gender) {
//			students += s4.studentInfo() + "\n";
//		}
//		if (s5 != null&&s5.getGender()==gender) {
//			students += s5.studentInfo() + "\n";
//		}
		for(int i=0;i<st.length;i++) {
			if (st[i] != null&&st[i].getGender()==gender) {
				students += st[i] + "\n";
			}
		
		}
		return students;
	}
	@Override
	public boolean changeInfo(Student s) {
		boolean flag=false;
//		if (s1!=null&&s1.getName().equals(s.getName())) {
//			s1.setAge(s.getAge());
//			s1.setAddress(s.getAddress());				
//		}
//		else if (s2!=null&&s2.getName().equals(s.getName())) {
//			s2.setAge(s.getAge());
//			s2.setAddress(s.getAddress());				
//		}
//		else if (s3!=null&&s3.getName().equals(s.getName())) {
//			s3.setAge(s.getAge());
//			s3.setAddress(s.getAddress());				
//		}
//		else if (s4!=null&&s4.getName().equals(s.getName())) {
//			s4.setAge(s.getAge());
//			s4.setAddress(s.getAddress());
//		}
//		else if (s5!=null&&s5.getName().equals(s.getName())){
//			s5.setAge(s.getAge());
//			s5.setAddress(s.getAddress());				
//		}else {
//			flag=false;
//		}
		for(int i=0;i<st.length;i++) {
			if(st[i]!=null&&st[i].getName().equals(s.getName())) {
				st[i].setAge(s.getAge());
				st[i].setAddress(s.getAddress());
				flag=true;
				break;
			}
		}
		return flag;

	}
	
}