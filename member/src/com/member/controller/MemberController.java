package com.member.controller;

import com.member.model.dao.MemberDao;
import com.member.model.vo.Member;
import com.member.view.MainView;

public class MemberController {
	private MainView view=new MainView(); 
	private MemberDao dao=new MemberDao();
	
	public void mainMenu() {
		view.mainBoard(this);
		
	}
	
	
	public void insertMember() {
		Member m=view.inputData();
		boolean flag=dao.insertMember(m);
		view.printMsg(flag?"입력되었습니다":"입력 실패");
	}

}
