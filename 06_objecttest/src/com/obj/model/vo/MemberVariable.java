package com.obj.model.vo;

public class MemberVariable {
	//������� �����ϱ�
	//���������� �ڷ��� ������;
	public String name="�������̰�";
	int age;
	private double height;
	
	//��������� �����
	//static, final
	//static: ��������ҿ� ����Ǵ� ��, Ŭ���� ����
	public static String gameTitle;
	public static double bonus;
	public int memberId;
	private static int count=0;
	//final:��� ������.������ �ʴ� ��
	public final int MYAGE;
	
	//�ʱ�ȭ ���
	//��� ������ ���� �ʱⰪ�� �����Ҷ� ����ϴ°�
	{//�ν��Ͻ� �ʱ�ȭ ��� 
	//new �����ڷ� Ŭ������ �����Ҷ� ���� ����
	 name="������";
	 age=29;
	 height=128.2;
	 MYAGE=10;
	 if(bonus==0.0) {
			bonus=2.0;
		}
	 memberId=++count;
	 System.out.println("�ʱ�ȭ��� ����");
	}
	static {
		//static ���� ����� ������ �ʱ�ȭ�ϴ°�
		//����!
		count=100;//static ����
		bonus=22;//static ���� / Ŭ���� ����
		//age=50;//�������
		System.out.println("static���");
	}
	
	
	

	
	public void test() {
		//Ŭ���� ���ο����� ���ٿ����� ���� ���
		name="������";
		age=20;
		height=190.2;
		//��Ȯ�ϰ� ���� �ϴ� ���
		this.name="�ϳ��ϴ�";//this �� ��������� ���ִ� ��
		
	
	}
	
}
