package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	private Member mem=null;
	private Book[] bList=new Book[5];
	
	{
		bList[0]=new CookBook("�������� ����","������","tvN",true);
		bList[1]=new AniBook("�ѹ� �� �ؿ�","��Ƽ","�����",19);
		bList[2]=new AniBook("������ ���ǽ�","����","japan",12);
		bList[3]=new CookBook("�������� �󸶳� ���ְԿ�","������","��ȭ",false);
		bList[4]=new CookBook("������ �� �����غ�","������","�ұ�å",true);
	}
	
	
	public void insertMember(Member mem) {
		this.mem=mem;
	}
	
	public Member myInfo() {
		return mem;
	}
	
	public Book[] selectAll() {
		return bList;
	}
	
}