package com.obj.model.vo;

public class ConstructorTest {
	
	//멤버변수
	public int age;
	public String nickName;
	public int tea;
	
	//생성자
	//접근제한자 클래스명(){로직}
	//생성자 보통,, 대걔 일반적으로 public
	//생성자의 접근제한자가 private,default 로 선언 되면 외부에서 클래스를 사용하지 못함
	//외부 패키지에서 클래스를 사용하지 못함->public!
	public ConstructorTest() {} //기본생성자(default생성자)
	
	//매개변수 있는 생성자
	//외부에서 값을 전달 받아 멤버변수를 초기화하는 생성자
	//호출하는 곳에서 반드시 선언한 매개변수에 값을 넣어줘야함.
	public ConstructorTest(int age1,String nickName,int tea) {
							//매개변수
		//this.age=age;//아룸아 같아서 this 안붙이면 먼저 클래스 에있는 필드변수 붙어 찾는다/
//		age=age1;//필드변수랑 매개변수랑 달라서 this 없어도 암
//		this.nickName=nickName;
	
		this(age1,nickName);//주의사항!! this() 생성자는 항상 코드의 맨위에 있어야함.
		this.tea=tea;
		
	}
	public ConstructorTest(int age, String nickName) {
	
				this.age=age;
		this.nickName=nickName;
	}
	//매개변수 있는 생성자는 여러개 만들 수 잇음
	public ConstructorTest(String nickname) {
		this(19,"달심",300);
		this.nickName=nickname;
	}

}
