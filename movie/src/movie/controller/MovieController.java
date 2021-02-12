package movie.controller;

import movie.model.vo.Movie;

public class MovieController extends Movie{
	private Movie m=new Movie();
	
	
	public void searchName(String name) {
		String movie[][]=m.main();
		boolean flag = false;
		for (int i = 0; i < movie.length; i++) {

			if (name.equals(movie[i][1].trim().replace(" ", "")) && movie[i][0].equals("청소년 관람불가")) {
				System.out.println("\"" + movie[i][1] + "\"" + "(을)를 시청하기 위해서는 성인 인증이 필요합니다.");
				flag = true;
			} else if (name.equals(movie[i][1].trim().replace(" ", "")) && !movie[i][0].equals("청소년 관람불가")) {
				System.out.println("\"" + movie[i][1] + "\"" + "(은)는 " + movie[i][0] + " 입니다.");
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println(name + " (은)는 존재하지 않는 영화입니다.");
		}
	}

}
