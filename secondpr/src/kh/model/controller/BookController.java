package kh.model.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import kh.model.vo.Book;

public class BookController {

	public void fileSave1(String fileName) {
		File f=new File(fileName);
		try(ObjectOutputStream op=new ObjectOutputStream(new FileOutputStream(f))){
			op.writeObject(new Book("자바를정복하자",3500));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void fileSave() {
		ArrayList<Book> bookList=new ArrayList<Book>();	
		bookList.add(new Book("자바를 잡아라", 30000));

		bookList.add(new Book("오라클 정복", 35000));

		bookList.add(new Book("웹표준 2.0", 27500));

		bookList.add(new Book("자바 Servlet/JSP", 28000));

		bookList.add(new Book("ajax 사용법", 15000));
		
		for(Book b: bookList) {
			System.out.println(b);
		}
		
		
		
		
		
		
		
		
		
		
	}
	

}
