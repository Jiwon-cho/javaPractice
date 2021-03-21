package movie.view;


import java.util.Scanner;

import movie.common.MovieList;
import movie.controller.MovieController;



public class MainView implements MovieList {
	private Scanner sc = new Scanner(System.in);

	public void logIn() {
		System.out.println("1.로그인");
	}

	public void mainMenu(MovieController mc) {

		System.out.println("[TOP 10 영화]");
		for (int i = 0; i < 10; i++) {
			System.out.println("" + (i + 1) + ". " + movieList.get(i).getTit());
		}
		while (true) {
			System.out.println("=====영화 메뉴====");
			System.out.println("1.영화 검색");
			System.out.println("2.영화 추천");
			System.out.println("3.로그 출력");
			System.out.println("4.검색");
			System.out.println("0.프로그램 종료");
			System.out.print("메뉴 선택: ");
			int cho = sc.nextInt();
			switch (cho) {
			case 1:
				mc.Search();
				break;
			case 2:
				break;
			case 3:
				mc.logPrint();
				break;
			case 0:
				System.out.println("프로그램이 종료되었습니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다.");
				break;
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
		switch (sc.nextInt()) {
		case 1:
			mc.searchAll();
			break;
		case 2:
			mc.searchName();
			;
			break;
		case 3:
			mc.searchRating();
			break;
		case 4:
			mc.serachGenre();
			break;
		case 0:
			System.out.println("초기 메뉴로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못 입력하였습니다.");
			break;
		}
	}

	public void Msg(String a) {
		System.out.println(a);
	}

	public String SearchName() {
		System.out.println("영화 제목을 적으시오: ");
		return sc.next();

	}

	public int SearchGenre() {
		System.out.println("===영화 장르===");
		for (int i = 0; i < genre.size(); i++) {
			if (i == (genre.size() - 1)) {
				System.out.println((i + 1) + " " + genre.get(i));
			} else if (((i + 1) % 3) != 0) {
				System.out.print((i + 1) + " " + genre.get(i) + " ");
			} else if (((i + 1) % 3) == 0) {
				System.out.println((i + 1) + " " + genre.get(i));
			}
		}
		System.out.print("장르 번호 선택: ");
		return sc.nextInt();
	}

	public double SearchRating() {
		System.out.print("찾고자 하는 평점(대)을 입력하시오: ");
		return sc.nextDouble();
	}

}
