package com.io.controller;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Date;

public class FileController {
	
	public static void main(String[] args) {
		//File ��ü�� �̿��غ���.
		//Ŭ������ �����ؼ� ����� ��
		//�������� �Ű������� ���+���ϸ� ����
		//���ϸ� -> ����Ʈ ���(������Ʈ�� �ִ� ���)�� ������ ������
		File f=new File("test.txt");
		//File f=new File("c:\\fileData.txt");//<-�̷��� �ϸ� ���� �ü�迡�� ���ƹ���/
		//��� �����س����� �ü����� �ٸ� �����־ �ϳ��� �ü��������� �����ؼ� ������� �ٸ����� �ȵ��ư�
		//heap������ File ��ü�� ������ ����.
	
		//FileŬ������ �̿��ؼ� ����  �����ϱ�
		
		//�ϵ尡�� �Է°� ������ ����� ������,��,��� ���� ó��
		try{
			System.out.println(f.createNewFile()); //���� �����Ǹ� true,�������������� false//�̹� �������� false
		}catch(IOException e) {
			e.printStackTrace();
		}
	
		//������Ʈ �������� ���� ��� ã��
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
		
		//File��ü�� ������ ������ ������.
		File dir=new File("root/a"+File.separator+"ransom");//default ������ ���� ����
		//������ ���� mkdir(),mkdirs()
		//mkdir(): ������ �Ѱ��� ������ ���� [com/test/] <- �̰� ������, �� ����->controller
		//mkdirs():������ ��� ���� ����	com/test/controller
		dir.mkdirs();
//	
//		//������ ����, ������ ����
//		//delete() �޼ҵ� �̿�
//		File del=new File("root");
//		del.delete();
//		File[] delList=new File("root").listFiles();
//		for(int i=0;i<delList.length)
//		
		
//		for(File d: delList) {
//			d.delete();
//		}
//	
	//createFile �޼ҵ带 �����
		//default ��ο� test ������ ����� test ���� �ȿ� rclass ������ �����ϴ� ��� ����
		CreateFile();
				
	//file�� ���� ������ ������ִ� �޼ҵ�
	System.out.println(f2.getName());//���� �̸� Ȯ��
	System.out.println(dir.getName());
	System.out.println(f2.canExecute());//������������ Ȯ��
	System.out.println(dir.canExecute());
	System.out.println(f2.canRead());//���� �� �ִ�?
	System.out.println(f2.canWrite());//������ �� �ִ�?
	System.out.println(f2.getParent());//�������
	File pa=f2.getParentFile();//�θ� ���� ���ϰ�ü�ι�ȯ
	System.out.println(pa.getName());
	System.out.println(f2.getAbsolutePath());//��ü ���� ���
	//��� ��δ� Ư�� ���� ��� ���Ʒ��� �ִ°� �������ų� ��
	System.out.println(f2.isHidden());//���������ΰ�?
	System.out.println(f2.length());//����ũ�� ->����Ʈ
	System.out.println(new Date(f2.lastModified()));//���� ��¥
	System.out.println(f2.exists());
	if(f2.exists()) {
		System.out.println("�����ִ�.");
	}else {
	  System.out.println("����.");
	}
	System.out.println(f2.isFile());//�����ΰ�?
	System.out.println(f2.isDirectory());//�����ΰ�?
	
	//������ ��ü ������ �������� �޼ҵ�
	File rootDir=new File("c:\\Users\\user");
	String[] fileNames=rootDir.list();//user �� �ִ� ��� ����/����
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

	System.out.println("========lamda ǥ����==========");
	FilenameFilter file12;
	files=rootDir.listFiles((File dir1, String name) -> {
		String name1="slkjs";
		return new File(dir1,name).isFile();
	}
			//ȭ��ǥ �Լ�, ȭ��ǥ�� �߻�޼ҵ尡 �ϳ��� ������, ���� ¥���Ѵٸ� {�ؼ� �� ����}
			
//(new FilenameFilterImpl()
//		new FilenameFilter() {
//		@Override
//		public boolean accept(File dir, String name) {
//			return new File(dir,name).isFile();
//		}
//	}); �������̽� �ȿ� �޼ҵ尡 �ϳ��� �ְ� �̸� ��߸� �ϴ� ��� �׳� �̷��� �� ĥ �� ����, �� ���ǲ� �� �����ϰ� �����
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
