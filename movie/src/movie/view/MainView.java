package movie.view;

import java.util.Scanner;

import movie.controller.MovieController;
import movie.model.vo.Movie;

public class MainView {
	private Scanner sc = new Scanner(System.in);
	private MovieController mc=new MovieController();
	private Movie m=new Movie();
	
	public void mainMenu() {
		String [][] movie=m.main();
		System.out.println("[TOP 10 ��ȭ]");
		for(int i=0;i<10;i++) {
			System.out.println(""+(i+1)+". "+movie[i][1]);
		}
		while(true) {
			System.out.println("=====��ȭ �޴�====");
			System.out.println("1.�������� �˻�");
			System.out.println("2.�������� �˻�");
			System.out.println("3.�������� �˻�");
			System.out.println("0.���α׷� ����");
			System.out.println("�޴� ����: ");
			int cho=sc.nextInt();
			switch(cho) {
			case 1: break;
			case 2: break;
			case 3: break;
			case 0: System.out.println("���α׷��� ����Ǿ����ϴ�.");return;
			default: System.out.println("�߸� �Է��Ͽ����ϴ�.");break;
			}
		}
		
		
		
		
//		System.out.println("ã���� �ϴ� ��ȭ�� �̸��� �Է��Ͻÿ�: ");
//		String name = sc.next().trim().replace(" ", "");
//		mc.searchName(name);
		
	}

}
