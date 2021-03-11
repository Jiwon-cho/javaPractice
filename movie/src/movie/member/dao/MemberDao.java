package movie.member.dao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import movie.model.vo.Member;

public class MemberDao {
	ArrayList<Member> m=new ArrayList<Member>();
	
	public void save() {
		try(ObjectOutputStream obo=new ObjectOutputStream(new FileOutputStream("Member.txt"))) {
			obo.writeObject(m);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public boolean insert(Member mb) {
	boolean flag=true;	
	try {	
	m.add(mb);
	}catch(Exception e) {
		flag=false;
		e.printStackTrace();
	}
	
	return flag;

}
}