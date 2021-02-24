package kh.model.run;

import kh.model.controller.BookController;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BookController().fileSave1("file.txt");
		new BookController().fileSave();

	}

}
