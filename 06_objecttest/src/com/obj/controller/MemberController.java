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
	//�迭�� �ּ�, heap ������ �Ҵ�
	
	public MemberInfo newMember() {
		return new MemberInfo("lasttime","last","��Ʈ",950,"last@lasst.com");
		
	}

}
