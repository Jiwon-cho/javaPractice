package movie.view;

import java.util.ArrayList;
import java.util.Scanner;

import movie.controller.MovieController;
import movie.dao.MovieDao;
import movie.model.vo.Movie;

public class MainView {
	private Scanner sc = new Scanner(System.in);
	private MovieController mc=new MovieController();
	private static MovieDao dao = MovieDao.getInstance();
	
	public void logIn() {
		System.out.println("1.�α���");
	}
	
	public void mainMenu() {
		ArrayList<Movie> movieList = dao.GetMovieInfo();
		System.out.println("[TOP 10 ��ȭ]");
		for(int i=0;i<10;i++) {
			System.out.println(""+(i+1)+". "+movieList.get(i).getTit());
		}
		while(true) {
			System.out.println("=====��ȭ �޴�====");
			System.out.println("1.��ȭ �˻�");
			System.out.println("2.��ȭ ��õ");
			System.out.println("3.�α� �ƿ�");
			System.out.println("4.�˻�");
			System.out.println("0.���α׷� ����");
			System.out.print("�޴� ����: ");
			int cho=sc.nextInt();
			switch(cho) {
			case 1:search(); break;
			case 2: break;
			case 3: break;
			case 0: System.out.println("���α׷��� ����Ǿ����ϴ�.");return;
			default: System.out.println("�߸� �Է��Ͽ����ϴ�.");break;
			}
		}
		
		

	}
	
	public void search() {
		System.out.println("1.���� �󿵿�ȭ ��ü �˻�");
		System.out.println("2.�̸����� �˻�");
		System.out.println("3.�������� �˻�");
		System.out.println("4.�帣�� �˻�");
		System.out.println("0.�ʱ� �޴��� ���ư���");
		System.out.print("�޴� ����: ");
		switch(sc.nextInt()) {
		case 1:mc.searchAll();break;
		case 2:mc.searchName();;break;
		case 3:break;
		case 4:mc.serachGenre();break;
		case 0:break;
		default: System.out.println("�߸� �Է��Ͽ����ϴ�.");break;
		}
	}

	public String nameSearch() {
		System.out.println("��ȭ ������ �����ÿ�: ");
		return sc.next();
}
	
	
}
