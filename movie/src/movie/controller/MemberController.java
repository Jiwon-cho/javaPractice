package movie.controller;

import movie.member.dao.MemberDao;
import movie.model.vo.Member;
import movie.view.LoginView;

public class MemberController {
	LoginView lv=new LoginView();
	MemberDao dao=new MemberDao();
	
	
	
	public void inPut() {
		Member m=lv.inputData();
		boolean b=dao.insert(m);
		System.out.println(b?"회원가입이 되셨습니다.":"회원가입에 실패하셨습니다.");
	}
	
	
	

}
