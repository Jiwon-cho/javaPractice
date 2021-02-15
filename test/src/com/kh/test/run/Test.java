package com.kh.test.run;

import com.kh.test.person.model.vo.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] pArr=new Person[3];
		
		for(int i=0;i<=pArr.length;i++) {
			pArr[i]=new Person();
			System.out.println(pArr[i].getName());
		}

	}

}
