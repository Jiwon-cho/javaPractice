package com.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesMain {

	public static void main(String[] args) {
		// Properties ��ü Ȱ���ϱ�
		// key, value �������� �����.
		// key : String/ value : String -> ������
		Properties prop = new Properties();
		// �� �ֱ�
		// setProperty(Key,value)
		prop.setProperty("email", "prince0324@naver.com");
		prop.setProperty("domain", "www.iei.or.kr");

		System.out.println(prop);
		// �� ��������
		String v = prop.getProperty("email");
		System.out.println(v);

		// ���ϰ� �����ؼ� ó������
		// Ư�����Ͽ� properties ��ü�� �������ִ� ������ �����ϴ� �޼ҵ带 ������ ����
		// properties,xml ����
		// store(): �Ϲ�����
		// storeToXML(): xml ������ ���Ϸ� ����
		try {
			prop.store(new FileOutputStream("test.properties"), "myinfo"); // ("���ϸ�"/ "�ּ�")
			prop.storeToXML(new FileOutputStream("test.xml"), "xmltest");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// properties �ܺ����ϰ� �ս��� ������ �Ǳ� ������
		// �ַ� ȯ�漳���� ���� ����, ��������, ����Ʈ���� ����..

		// �ܺο��� ������ ���ϵ� �ҷ��� �� ����
		loadProperty();
	}

	public static void loadProperty() {
		Properties prop=new Properties();
		//�ܺ����Ͽ� ������ �ҷ�������
		//load() �޼ҵ带 �̿���
	try {	
		prop.load(new FileInputStream("testData.properties"));
		System.out.println(prop.getProperty("driver"));
		System.out.println(prop.getProperty("url"));
		//xml �ҷ�����
		prop.loadFromXML(new FileInputStream("test.xml"));
		System.out.println(prop.getProperty("domain"));
		prop.list(System.out);
	}catch(IOException e) {
		e.printStackTrace();
	}
	}


}
