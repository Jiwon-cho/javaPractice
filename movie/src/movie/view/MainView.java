package movie.view;

import java.util.Scanner;

import movie.controller.MovieController;

public class MainView {
	private Scanner sc = new Scanner(System.in);
	private MovieController mc=new MovieController();
	
	public void mainMenu() {
		
		System.out.println("찾고자 하는 영화의 이름을 입력하시오: ");
		String name = sc.next().trim().replace(" ", "");
		mc.searchName(name);
		
	}

}
