package com.io.controller;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Date;

public class FileController {
	
	public static void main(String[] args) {
		//File 객체를 이용해보자.
		//클래스로 생성해서 사용을 함
		//생성자의 매개변수에 경로+파일명 대입
		//파일명 -> 디폴트 경로(프로젝트가 있는 경로)에 파일이 지정됨
		File f=new File("test.txt");
		//File f=new File("c:\\fileData.txt");//<-이렇게 하면 막힘 운영체계에서 막아버림/
		//경로 고정해놓으면 운영체계따라 다를 수도있어서 하나의 운영체계기준으로 고정해서 써버리면 다른데서 안돌아감
		//heap영역에 File 객체가 생성된 상태.
	
		//File클래스를 이요해서 파일  생성하기
		
		//하드가서 입력값 받은걸 만들기 때문에,입,출력 에러 처리
		try{
			System.out.println(f.createNewFile()); //파일 생성되면 true,생성되지않으면 false//이미 만들어놔서 false
		}catch(IOException e) {
			e.printStackTrace();
		}
	
		//프로젝트 기준으로 절대 경로 찾기
		//System.out.println(FileController.class.getResource("").getPath());
		String path=FileController.class.getResource("/").getPath();
		path=path.substring(0,path.lastIndexOf("bin"));
		System.out.println(path);
		File f2=new File(path+"testPath.txt");
		try {
			f2.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//File객체로 폴더도 생성이 가능함.
		File dir=new File("root/a"+File.separator+"ransom");//default 폴더에 폴더 생성
		//폴더를 생성 mkdir(),mkdirs()
		//mkdir(): 폴더를 한개만 생성이 가능 [com/test/] <- 이거 없으면, 못 만듬->controller
		//mkdirs():지정된 모든 폴더 생성	com/test/controller
		dir.mkdirs();
//	
//		//생성된 폴더, 파일을 삭제
//		//delete() 메소드 이용
//		File del=new File("root");
//		del.delete();
//		File[] delList=new File("root").listFiles();
//		for(int i=0;i<delList.length)
//		
		
//		for(File d: delList) {
//			d.delete();
//		}
//	
	//createFile 메소드를 만들어
		//default 경로에 test 폴더를 만들고 test 폴더 안에 rclass 파일을 생성하는 기능 구현
		CreateFile();
				
	//file에 대한 정보를 출력해주는 메소드
	System.out.println(f2.getName());//파일 이름 확인
	System.out.println(dir.getName());
	System.out.println(f2.canExecute());//실행파일인지 확인
	System.out.println(dir.canExecute());
	System.out.println(f2.canRead());//읽을 수 있니?
	System.out.println(f2.canWrite());//수정할 수 있니?
	System.out.println(f2.getParent());//상위경로
	File pa=f2.getParentFile();//부모 폴더 파일객체로반환
	System.out.println(pa.getName());
	System.out.println(f2.getAbsolutePath());//전체 절대 경로
	//상대 경로는 특정 기준 잡아 위아래로 있는거 가져오거나 함
	System.out.println(f2.isHidden());//숨김파일인가?
	System.out.println(f2.length());//파일크기 ->바이트
	System.out.println(new Date(f2.lastModified()));//수정 날짜
	System.out.println(f2.exists());
	if(f2.exists()) {
		System.out.println("파일있다.");
	}else {
	  System.out.println("없다.");
	}
	System.out.println(f2.isFile());//파일인가?
	System.out.println(f2.isDirectory());//폴더인가?
	
	//폴더에 전체 파일을 가져오는 메소드
	File rootDir=new File("c:\\Users\\user");
	String[] fileNames=rootDir.list();//user 에 있는 모든 파일/폴더
	for(String name:fileNames) {
//		//System.out.println(s);
		File temp=new File(rootDir.getAbsoluteFile(),name);
//		//new File(rootDir.getAbsoluteFile()+"/"+name);
		if(temp.isFile())System.out.println(temp.getName());
	}
	File[] files=rootDir.listFiles();
//	for(File temp: files) {
//		if(temp.isFile())System.out.println(temp.getName());
//	}
//	
//	

	System.out.println("========lamda 표현식==========");
	FilenameFilter file12;
	files=rootDir.listFiles((File dir1, String name) -> {
		String name1="slkjs";
		return new File(dir1,name).isFile();
	}
			//화살표 함수, 화살표는 추상메소드가 하나만 있을때, 논리를 짜야한다면 {해서 더 쓴다}
			
//(new FilenameFilterImpl()
//		new FilenameFilter() {
//		@Override
//		public boolean accept(File dir, String name) {
//			return new File(dir,name).isFile();
//		}
//	}); 인터페이스 안에 메소드가 하나만 있고 이를 써야만 하는 경우 그냥 이렇게 퉁 칠 수 있음, 이 위의께 더 간결하게 만든것
			);
			//(File f12,String name) -> new File(f12,name).isFile());
	for(File temp: files) {
		System.out.println(temp.getName());
	}
	
	
	
	
	
	}
	
	public static void CreateFile() {
		File dir=new File("test");
		dir.mkdir();
		//String path=FileController.class.getResource("/").getPath();
		//path=path.substring(0,path.lastIndexOf("bin"))+"test/";
		//System.out.println(path);
		File f=new File(dir.getName()+"/rclass");//=(test/rclass)
		try {
			f.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
		

	}
	

}
