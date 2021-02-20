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
		System.out.println("[TOP 10 영화]");
		for(int i=0;i<10;i++) {
			System.out.println(""+(i+1)+". "+movie[i][1]);
		}
		while(true) {
			System.out.println("=====영화 메뉴====");
			System.out.println("1.연령으로 검색");
			System.out.println("2.평점으로 검색");
			System.out.println("3.제목으로 검색");
			System.out.println("0.프로그램 종료");
			System.out.println("메뉴 선택: ");
			int cho=sc.nextInt();
			switch(cho) {
			case 1: break;
			case 2: break;
			case 3: break;
			case 0: System.out.println("프로그램이 종료되었습니다.");return;
			default: System.out.println("잘못 입력하였습니다.");break;
			}
		}
		
		
		
		
//		System.out.println("찾고자 하는 영화의 이름을 입력하시오: ");
//		String name = sc.next().trim().replace(" ", "");
//		mc.searchName(name);
		
	}

}
