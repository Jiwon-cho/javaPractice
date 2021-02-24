package com.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesMain {

	public static void main(String[] args) {
		// Properties 객체 활용하기
		// key, value 형식으로 저장됨.
		// key : String/ value : String -> 무조건
		Properties prop = new Properties();
		// 값 넣기
		// setProperty(Key,value)
		prop.setProperty("email", "prince0324@naver.com");
		prop.setProperty("domain", "www.iei.or.kr");

		System.out.println(prop);
		// 값 가져오기
		String v = prop.getProperty("email");
		System.out.println(v);

		// 파일과 연동해서 처리가능
		// 특정파일에 properties 객체가 가지고있는 내용을 저장하는 메소드를 가지고 있음
		// properties,xml 파일
		// store(): 일반파일
		// storeToXML(): xml 형식의 파일로 저장
		try {
			prop.store(new FileOutputStream("test.properties"), "myinfo"); // ("파일명"/ "주석")
			prop.storeToXML(new FileOutputStream("test.xml"), "xmltest");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// properties 외부파일과 손쉽게 연동이 되기 때뭉네
		// 주로 환경설정에 대한 내용, 설정정보, 소프트웨어 설정..

		// 외부에서 생성한 파일도 불러올 수 있음
		loadProperty();
	}

	public static void loadProperty() {
		Properties prop=new Properties();
		//외부파일에 내용을 불러오려면
		//load() 메소드를 이용함
	try {	
		prop.load(new FileInputStream("testData.properties"));
		System.out.println(prop.getProperty("driver"));
		System.out.println(prop.getProperty("url"));
		//xml 불러오기
		prop.loadFromXML(new FileInputStream("test.xml"));
		System.out.println(prop.getProperty("domain"));
		prop.list(System.out);
	}catch(IOException e) {
		e.printStackTrace();
	}
	}


}
