package movie.view;

import java.util.Scanner;

import movie.controller.MovieController;
import movie.model.vo.Movie;

public class MainView {
	private Scanner sc = new Scanner(System.in);
	private MovieController mc=new MovieController();
	private Movie m=new Movie();
	
	public void mainMenu() {
		System.out.println("=====영화 메뉴====");
		String [][] movie=m.main();
		System.out.println("[TOP 10 영화]");
		for(int i=0;i<10;i++) {
			System.out.println(""+(i+1)+". "+movie[i][1]);
		}
		
//		System.out.println("찾고자 하는 영화의 이름을 입력하시오: ");
//		String name = sc.next().trim().replace(" ", "");
//		mc.searchName(name);
		
	}

}
