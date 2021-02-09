package com.api.controller;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTestController {
	public static void main(String[] args) {
		//���ڿ� ó�� Ŭ������ ���� �˾ƺ���.
		//1. StringŬ����, �ڹٿ��� �⺻�ڷ��� ó�� ���ڿ��� ó���� �� �ִ� Ŭ����
		String str="������";
		System.out.println(str);
		//�ּҰ� ����ϱ�
		//String�� �Һ��� �������̴�.
		System.out.println(str.hashCode());
		str+="�����̴�.";
		System.out.println(str);
		System.out.println(str.hashCode());
		
		//String Ŭ�������� �����ϴ� �޼ҵ� �˾ƺ���
		//���� ����
		//1. concat(): ���ڿ��� �����ϰ� ��ȯ �ϴ� �޼ҵ�
		String temp=str.concat("19���̴�");//str+19���̴�;
		System.out.println(temp);
		//2.contains(Ȯ�ι��ڿ�): ���ڿ��� Ư�����ڰ� ���Եƴ��� Ȯ���ϴ� �޼ҵ�
		//�Ű������� ���� ���ڿ��� ���ԵǾ��ִ��� Ȯ���Ͽ� ������ true, ������ false;
		System.out.println(temp.contains("����"));
		System.out.println(temp.contains("�л�"));
		
		if(temp.contains("����")) {
			System.out.println("�״� ���� ���̴�");
		}
		//3.indexOf():�Ű������� ���ڿ��� ������ ���ڸ� ã�� �� ���ڿ��� �ε�����ȣ�� ��ȯ
		//���࿡ ������ -1�� ��ȯ
		System.out.println(temp.indexOf("19"));//�ٸ� �޼ҵ��ϰ� �����Ͽ� ���� ���
		//�Ű������� �ΰ��ִ°͵� ���� -> ã�� ���� �ε����� ������ �� ����
		temp="abaabcd";
		System.out.println(temp.indexOf("a",2)); //���� ��ġ ���� ���ϸ�(�ߺ��ǰ� �ִ°��) ���� ó�������°� �ε��� ��ȯ
		System.out.println(temp.indexOf("29"));//�����: -1;
		
		//4. lastIndexOf(): �����ʿ������� ã��
		System.out.println(temp.lastIndexOf("a"));
	
		//5.replace(������󹮱�, ��ü ����): Ư�������� �����ϴ� �޼ҵ�
		String change=temp.replace("a", "����");
		System.out.println(change);
		temp="�̰� ������ ����   �ƾ�";
		System.out.println(temp.replace(" ", ""));
		
		change=temp.replaceFirst(" ", "");//ó������ �ٲٴ°�
		System.out.println(change);
		
		//6.split(): ���ڿ��� Ư�� �����ڿ� ���� ���� �Ǿ������� �� �����ڸ� ��������
		//�迭 ���¸� ������ִ� �Լ�
		temp="�ڵ�,�౹,ķ��,Ŭ���̹�";
		String[] hobbies=temp.split(",");
		System.out.print(Arrays.toString(hobbies));
		System.out.println();
		for(int i=0;i<hobbies.length;i++) {
			System.out.println(hobbies[i]);
		}
		//for each��: �迭,List,Map,Set���� �ڷḦ �ڵ����� �ݺ��Ͽ�
		//�����͸� ��ȸ�� �� �ְ� ���ִ� �ݺ���
		//for(�迭�ڷ��� ����: �迭||List||Set||Map){����}
		for(String h: hobbies) {
			System.out.println(h);
		}
		//7.join(): �迭�� �Ǿ��ִ� ���� ���ڿ��� �������ִ� �޼ҵ� static
		change=String.join("-",hobbies);
		System.out.println(change);
		
		//8. substring(): ���ڿ��� Ư�� ��ġ�� �߶󳻴� ��
		//substring(����)/substring(����,����);
		temp="���� �� ���½ð�";
		System.out.println(temp.substring(5));
		System.out.println(temp.substring(3,4));//(����,����) ���� �ڿ��� ���Ծ��� �� �ڿ����� ���������� 3,3�����ϸ� �ƹ��͵� �ȳ���
		//indexOf(): �ε��� ��ȣ�� ã�°�
		System.out.println(temp.substring(temp.indexOf("��")));
		System.out.println(temp.substring(temp.indexOf("��"),temp.indexOf("��")));
		System.out.println(temp.substring(temp.indexOf("��"),temp.indexOf("��")+1));
		
		//9.������ ��ȯ(�빮��->�ҹ���, �ҹ���->�빮��)
		//toUpperCase(),toLowerCase()
		temp="aBxCxKKm";
		System.out.println(temp.toUpperCase());
		System.out.println(temp.toLowerCase());
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("����(M/F): ");
//		if(sc.next().toUpperCase().charAt(0)=='M') {
//			System.out.println("���ڴ�");
//		}else {
//			System.out.println("���ڴ�");
//		}
		//10. trim(): �������� �޼ҵ�
		//�ٸ��ڷ����� ���ڿ��� �����ϱ�
		//�⺻Ŭ���� ����ȯ(�ڷ���)
		int age=19;
		//temp=(String)age; >string�� ���������� �̷��� ����
		//String.valueOf();
		temp=String.valueOf(age);
		System.out.println(temp);
		double height=190.2;
		System.out.println(String.valueOf(height));
		
		//StringBufer Ŭ����
		//�⺻�ڷ���ó�� ���� �ʰ� ��üó�� ����.
		//�����ؼ� ����Ѵ�. �޼ҵ带 �̿��ؼ� �����͸� �����Ѵ�.
		StringBuffer sb=new StringBuffer();
		//������ �ֱ�(�߰�)
		//append() �޼ҵ� �̿�
		sb.append("������ ��������!!");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.append("������ ����ð�");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		//temp="������ ���� �ȳ�";
		//���ڿ��� Ư������ġ�� ���ڸ� �߰��ϴ� �޼ҵ� ����
		//insert();
		//sb.insert(sb.lastIndexOf("!"), "ȫȫȫ");//������ �����ϸ� �ϴ´�� �ٲ� '����'
		sb.insert(sb.lastIndexOf("!")+1, "ȫȫȫ");
		System.out.println(sb);// �̷��� �ϸ�!ȫȫȫ ! <�� ������ �ϴϱ�
		sb.delete(sb.indexOf("��"), sb.indexOf("!"));
		System.out.println(sb);
		
		//���ϴ� ���� ����(����!)
		//setCharAt();
		sb.setCharAt(0,'��');
		System.out.println(sb);
		
		//���ڿ��� �Ųٷ�����
		//reverse()
		sb.reverse();
		System.out.println(sb);
		
		//String,StringBuffer ��ȯ�� ����
		String temp1=new String(sb);
		//temp1=sb.toString();//�̷����ص� ���� �Ȱ���
		System.out.println(temp1);
		StringBuffer sb1=new StringBuffer(temp1);
		
		//sb.contains();
		temp1.contains("�ð�");
		
		StringBuilder sbuilder=new StringBuilder();
		sbuilder.append("����� �ұ� ������");
		System.out.println(sbuilder);//�� �Ȱ������� safe ��ɸ� ����
		
		//StringTokenizer Ŭ���� �̿��ϱ�
		String lang="java,oracle,html/css,javascript/jqeury,mybatis";
		StringTokenizer st=new StringTokenizer(lang,",/");
		//st.hasMoreTokens() -> �� ������ false ������ true
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			//System.out.println(st.nextToken());->�̷��� �ϸ� �̰� ������ 2���� �ƴ϶� �ϳ� ���Ƽ� ���� ��
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
