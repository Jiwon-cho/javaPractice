package com.obj.model.vo;

public class ConstructorTest {
	
	//�������
	public int age;
	public String nickName;
	public int tea;
	
	//������
	//���������� Ŭ������(){����}
	//������ ����,, ��� �Ϲ������� public
	//�������� ���������ڰ� private,default �� ���� �Ǹ� �ܺο��� Ŭ������ ������� ����
	//�ܺ� ��Ű������ Ŭ������ ������� ����->public!
	public ConstructorTest() {} //�⺻������(default������)
	
	//�Ű����� �ִ� ������
	//�ܺο��� ���� ���� �޾� ��������� �ʱ�ȭ�ϴ� ������
	//ȣ���ϴ� ������ �ݵ�� ������ �Ű������� ���� �־������.
	public ConstructorTest(int age1,String nickName,int tea) {
							//�Ű�����
		//this.age=age;//�Ʒ�� ���Ƽ� this �Ⱥ��̸� ���� Ŭ���� ���ִ� �ʵ庯�� �پ� ã�´�/
//		age=age1;//�ʵ庯���� �Ű������� �޶� this ��� ��
//		this.nickName=nickName;
	
		this(age1,nickName);//���ǻ���!! this() �����ڴ� �׻� �ڵ��� ������ �־����.
		this.tea=tea;
		
	}
	public ConstructorTest(int age, String nickName) {
	
				this.age=age;
		this.nickName=nickName;
	}
	//�Ű����� �ִ� �����ڴ� ������ ���� �� ����
	public ConstructorTest(String nickname) {
		this(19,"�޽�",300);
		this.nickName=nickname;
	}

}
