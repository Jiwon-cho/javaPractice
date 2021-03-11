package movie.member.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
	
	public void loadMember() {
		File f=new File("Member.txt");
		if(f.exists()) {
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f))) {
				m=(ArrayList<Member>)ois.readObject();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		}
		}
	
	
	
	public boolean loginMovie(String id, String pw) {
		boolean flag=false;
		for(int i=0;i<m.size();i++) {
			if(id.equals(m.get(i).getId())&&pw.equals(m.get(i).getPw())) {
			flag=true;	
			}
		}
		return flag;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}