package com.generic.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.generic.model.vo.Book;

public class BookDao {
	
	public static List oriBooks;
	public static List<Book> books;
	
	static {
		oriBooks=new ArrayList();
		books=new ArrayList();
		oriBooks.add(new Book("�ڹ��� ����","���ü�",35000));
		oriBooks.add(new Book("�ڹٸ�����","������",1000));
		oriBooks.add(new Book("���Ƕ� �����ΰ�","����Ŭ����",25000));
		oriBooks.add(new Book("���� �߿�����","�����̵帶��",30000));
	
		books=new ArrayList(oriBooks);
	
	}
}
