package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	private int size=10;
	private Member []m=new Member[size];
	

	public MemberController() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public Member[] getM() {
		return m;
	}


	public void setM(Member[] m) {
		this.m = m;
	}
	
	public int existMemberNum() {
		int a=0;
		for(int i=0;i<m.length;i++) {
			if(m[i]!=null)
				a++;
		}
		return a;
	}
	
	public boolean delete(String id) {
		boolean flag=false;	
		for(int i=0;i<m.length;i++) {
			if(m[i]!=null&&id.equals(m[i].getId())) {
				m[i]=null;
				flag=true;
			}
		}
		return flag;
	}
	
	public void delete() {
		for(int i=0;i<m.length;i++) {
			m[i]=null;
		}
	}
	
	public boolean updatePassword(String id,String password) {
		boolean flag=false;
		for(int i=0;i<m.length;i++) {
			if(m[i].getId().equals(id)) {
				m[i].setPassword(password);
				flag=true;
			}
		}
		return flag;
	}
	
	public boolean updateName(String id,String name) {
		boolean flag=false;
		for(int i=0;i<m.length;i++) {
			if(m[i].getName().equals(name)) {
				m[i].setPassword(name);
				flag=true;
			}
		}
		return flag;
	}
	
	
	
	
	public boolean updateEmail(String id,String email) {
		boolean flag=false;
		for(int i=0;i<m.length;i++) {
			if(m[i].getEmail().equals(email)) {
				m[i].setPassword(email);
				flag=true;
			}
		}
		return flag;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void insertMember(String id,String name,String password,String email,char gender,int age) {
		
		
		for(int i=0;i<m.length;i++) {
		
		if(m[i]==null) {
			m[i]=new Member();
			m[i].setId(id);
			m[i].setName(name);
			m[i].setPassword(password);
			m[i].setEmail(email);
			m[i].setGender(gender);
			m[i].setAge(age);
			break;
		}
		
		}
	}
	
	public String searchId(String id) {
		String a="검색 결과가 없습니다.";
		for(int i=0;i<m.length;i++) {
	if(m[i]!=null&&id.equals(m[i].getId())) {
			a="찾으신 회원 조회 결과입니다.\n"+m[i].inform();
			
		}
		
	}
		
	
		return a;
	}
	
	
	public  Member[] searchName(String name) {
		Member[]m1=new Member[1];
		for(int i=0;i<m.length;i++) {
	if(m[i]!=null&&name.equals(m[i].getName())) {
			m1[0]=m[i];
			
		}
		
	}
		
	
		return m1;
	}
	
	
	public Member[] searchEmail(String email) {
		Member[]m1=new Member[1];
		for(int i=0;i<m.length;i++) {
	if(m[i]!=null&&email.equals(m[i].getEmail())) {
			m1[0]=m[i];
			
		}
		
	}
		
	
		return m1;
	}
	
	
	
	
	
	
	
	
	
	
	public boolean checkId(String inputid) {
		boolean flag=true;
		for(int i=0;i<m.length;i++) {
			if(m[i]==null) {
				continue;
			}
			else if(inputid.equals(m[i].getId())) {
				flag=false;
			}
		}
		return flag;
	}
	
	
	public Member[] printAll() {
		return m;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
