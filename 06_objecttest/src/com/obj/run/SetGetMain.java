package com.obj.run;

import com.obj.controller.MemberController;
import com.obj.model.vo.MemberInfo;
import com.obj.model.vo.Person;

public class SetGetMain {
	public static void main(String[] args) {
		//Person객체 이용하기
		Person p=new Person("유병승",19,"01036446259",180.5,"경기도시흥시");
		//p.name;//접근못함 -> 접근하는 방법 만들어줘야함
		//메소드로 접근하게 만들어줌 ->settr/getter 라고 부름.
		//멤버변수별 한개씩 존재함.(getter 1개, setter 1개)
		System.out.println(p.getName());
		System.out.println(p.getAge());
		p.setName("유지훈");
		System.out.println(p.getName());
		p.setAge(29);
		System.out.println(p.getAge());
		p.setAge(-20);
		System.out.println(p.getAge());
	
		MemberInfo m0=new MemberInfo();
		m0.setId("sk");
		m0.setPassword("124");
		m0.setName("skjflkj");
		m0.setAge(29);
		m0.setEmail("slkfj");
		
		MemberInfo m1=new MemberInfo("gwon","124","관리자",29,"서울");
		MemberInfo m2=new MemberInfo("gkj","123","sa",20,"sl");
		MemberInfo m3=new MemberInfo("1gkj","77123","sxxxa",20,"sadl");
		
		System.out.println(m0.getId()+m0.getPassword()+m0.getName()+m0.getAge()+m0.getEmail());
		System.out.println(m1.getId()+m1.getPassword()+m1.getName()+m1.getAge()+m1.getEmail());
		System.out.println(m2.getId()+m2.getPassword()+m2.getName()+m2.getAge()+m2.getEmail());
		System.out.println(m3.getId()+m3.getPassword()+m3.getName()+m3.getAge()+m3.getEmail());
		
		//회원정보를 수정하는 메소드
		MemberController mc=new MemberController();
		mc.updateMember("admin","1234",m1);
		
		System.out.println(m1.getId());
		System.out.println(m1.getPassword());
		
		int su=10;
		int su2=20;
		mc.changeValue(su,su2);
		System.out.println(su+" "+su2);
		
		int[] arr= {1,2,3,4,5};
		mc.changeArr(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		MemberInfo m4= mc.newMember();
		System.out.println(m4.getName());
		
	
	
	}

}