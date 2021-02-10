package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book("자바","외국","외국인");
		Book c=new Book("자바","외국","외국인",20,29.2);
		b.inform();
		c.inform();
	}

}
