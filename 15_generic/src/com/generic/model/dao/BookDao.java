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
		oriBooks.add(new Book("자바의 정석","남궁성",35000));
		oriBooks.add(new Book("자바마스터","유지훈",1000));
		oriBooks.add(new Book("정의란 무엇인가","마이클샌델",25000));
		oriBooks.add(new Book("부의 추월차선","엠제이드마코",30000));
	
		books=new ArrayList(oriBooks);
	
	}
}
