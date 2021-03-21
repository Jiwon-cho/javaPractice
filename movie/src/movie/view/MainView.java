package movie.view;

import java.util.ArrayList;
import java.util.Scanner;

import movie.controller.MovieController;
import movie.dao.MovieDao;
import movie.model.vo.Movie;

public class MainView {
	private Scanner sc = new Scanner(System.in);
	private static MovieDao dao = MovieDao.getInstance();
	
	public void logIn() {
		System.out.println("1.로그인");
	}
	
	public void mainMenu(MovieController mc) {
		ArrayList<Movie> movieList = dao.GetMovieInfo();
		System.out.println("[TOP 10 영화]");
		for(int i=0;i<10;i++) {
			System.out.println(""+(i+1)+". "+movieList.get(i).getTit());
		}
		while(true) {
			System.out.println("=====영화 메뉴====");
			System.out.println("1.영화 검색");
			System.out.println("2.영화 추천");
			System.out.println("3.로그 아웃");
			System.out.println("4.검색");
			System.out.println("0.프로그램 종료");
			System.out.print("메뉴 선택: ");
			int cho=sc.nextInt();
			switch(cho) {
			case 1:mc.Search(); break;
			case 2: break;
			case 3: break;
			case 0: System.out.println("프로그램이 종료되었습니다.");return;
			default: System.out.println("잘못 입력하였습니다.");break;
			}
		}
		
		

	}
	
	public void search(MovieController mc) {
		System.out.println("1.현재 상영영화 전체 검색");
		System.out.println("2.이름으로 검색");
		System.out.println("3.평점으로 검색");
		System.out.println("4.장르로 검색");
		System.out.println("0.초기 메뉴로 돌아가기");
		System.out.print("메뉴 선택: ");
		switch(sc.nextInt()) {
		case 1:mc.searchAll();break;
		case 2:mc.searchName();;break;
		case 3:mc.searchRating();break;
		case 4:mc.serachGenre();break;
		case 0:System.out.println("초기 메뉴로 돌아갑니다.");break;
		default: System.out.println("잘못 입력하였습니다.");break;
		}
	}
	
	
	
	
	
	public void Msg(Object a) {
		System.out.println(a);
	}

	
	
}
