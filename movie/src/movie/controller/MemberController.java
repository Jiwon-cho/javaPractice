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
		System.out.println(b?"ȸ�������� �Ǽ̽��ϴ�.":"ȸ�����Կ� �����ϼ̽��ϴ�.");
	}
	
	
	

}
