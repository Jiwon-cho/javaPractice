package com.practice.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		
		ArrayList<Person>ppl=new ArrayList<Person>();
		ppl.add(new Person("Á¶Áö¿ø",29,192.3));
		ppl.add(new Person("È«ÇÒ¸Å",79,122.3));
		ppl.add(new Person("¿ÕµÅÁö",21,182.3));
		try(ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream("practice.txt"))){
			oo.writeObject(ppl);
		}catch(IOException e) {
			e.printStackTrace();
		}
		loading();
	}
	
	
	
	public static void loading() {
		ArrayList<Person>ppl=new ArrayList<Person>();
		try(ObjectInputStream oi=new ObjectInputStream(new FileInputStream("practice.txt"))){
			ppl=(ArrayList<Person>)oi.readObject();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		for(Person p: ppl) {
			if(p.getAge()>29) {
				System.out.println(p.getName());
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
