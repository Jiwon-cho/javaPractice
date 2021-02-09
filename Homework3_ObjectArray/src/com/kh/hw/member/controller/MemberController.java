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
	
	
}
