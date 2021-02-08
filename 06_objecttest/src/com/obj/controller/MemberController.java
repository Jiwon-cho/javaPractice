package com.obj.controller;

import com.obj.model.vo.MemberInfo;

public class MemberController {
	
	public void updateMember(String id, String password, MemberInfo m1) {
		MemberInfo m=new MemberInfo();
		m1.setId(id);
		m1.setPassword(password);
	}
	
	public void changeValue(int su, int su2) {
		su=200;
		su2=300;
	}
	public void changeArr(int[] arr) {
		arr[0]=100;
		arr[1]=200;
	
	}
	//배열도 주소, heap 영역에 할당
	
	public MemberInfo newMember() {
		return new MemberInfo("lasttime","last","라스트",950,"last@lasst.com");
		
	}

}
