package movie.controller;

import movie.model.vo.Movie;

public class MovieController extends Movie{
	private Movie m=new Movie();
	
	
	public void searchName(String name) {
		String movie[][]=m.main();
		boolean flag = false;
		for (int i = 0; i < movie.length; i++) {

			if (name.equals(movie[i][1].trim().replace(" ", "")) && movie[i][0].equals("û�ҳ� �����Ұ�")) {
				System.out.println("\"" + movie[i][1] + "\"" + "(��)�� ��û�ϱ� ���ؼ��� ���� ������ �ʿ��մϴ�.");
				flag = true;
			} else if (name.equals(movie[i][1].trim().replace(" ", "")) && !movie[i][0].equals("û�ҳ� �����Ұ�")) {
				System.out.println("\"" + movie[i][1] + "\"" + "(��)�� " + movie[i][0] + " �Դϴ�.");
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println(name + " (��)�� �������� �ʴ� ��ȭ�Դϴ�.");
		}
	}

}
