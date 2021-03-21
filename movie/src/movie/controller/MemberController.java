package movie.controller;

import movie.member.dao.MemberDao;
import movie.model.vo.Member;
import movie.view.LoginView;
import movie.view.MainView;

public class MemberController {
	
	MemberDao dao=new MemberDao();
	
	
	
	public void inPut() {
		LoginView lv=new LoginView();
		Member m=lv.inputData();
		boolean b=dao.insert(m);
		if(b==true) {
			System.out.println("회원가입이 되었습니다.");
			dao.save();
		}else {
			System.out.println("회원가입에 실패하였습니다.");
			lv.initialView();
		}
	}
	
//	public void login(String id,String pw) {
//		dao.loadMember();
//		LoginView lv=new LoginView();
//		boolean flag=dao.loginMovie(id, pw);
//		if(flag==true) {
//			new MainView().mainMenu();
//		}else {
//			System.out.println("로그인에 실패하였습니다.");
//			lv.initialView();
//		}
//		
//	}
	
	

}
