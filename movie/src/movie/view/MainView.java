package movie.view;

import java.util.Scanner;

import movie.controller.MovieController;

public class MainView {
	private Scanner sc = new Scanner(System.in);
	private MovieController mc=new MovieController();
	
	public void mainMenu() {
		
		System.out.println("ã���� �ϴ� ��ȭ�� �̸��� �Է��Ͻÿ�: ");
		String name = sc.next().trim().replace(" ", "");
		mc.searchName(name);
		
	}

}
