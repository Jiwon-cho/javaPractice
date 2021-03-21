package movie.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import movie.common.MovieCommon;
import movie.common.MovieList;
import movie.dao.MovieDao;
import movie.view.MainView;

public class MovieController extends MovieCommon implements MovieList {
	private static MovieDao dao = MovieDao.getInstance();
	public MainView mv = new MainView();
//	private SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//	private Date today=new Date();
//	private String date=sdf.format(today);
//	private Calendar c=Calendar.getInstance();
//	private String time=" "+c.get(Calendar.YEAR)+"�� "+(c.get(Calendar.MONTH)+1)+"�� "+c.get(Calendar.DATE)+"�� "
//			+(c.get(Calendar.AM_PM)==0?"���� ":"���� ")+c.get(Calendar.HOUR)+"�� "+c.get(Calendar.MINUTE)+"�� "
//			+c.get(Calendar.SECOND)+"�� ";

	Scanner sc = new Scanner(System.in);

	public void MainMovie() {
		dao.LogLoad();
		mv.mainMenu(this);
	}

	public void Search() {
		mv.search(this);
	}

	public void searchAll() {
		String movieList = dao.SearchAll();
		logList.add("��ȭ ��ü�˻� ��� ��� "+time);
		dao.Log(logList);
		mv.Msg(movieList);
	}

	public void searchName() {

		String title = mv.SearchName();
		String movie = dao.SearchName(title);
		logList.add("�̸����� �˻� ��� ���/ "+title+" �˻� "+time);
		dao.Log(logList);
		mv.Msg(movie);

	}

	public void serachGenre() {
		int a = mv.SearchGenre();
		String movie = dao.SearchGenre(a);
		logList.add("�帣�� �˻� ��� ���/ "+genre.get(a-1)+" �˻� "+time);
		dao.Log(logList);
		mv.Msg(movie);

	}

	public void searchRating() {
		double d = mv.SearchRating();
		String movie = dao.SearchRating(d);
		logList.add("�������� �˻� ��� ���/ "+d+" ���� �˻� "+time);
		dao.Log(logList);
		mv.Msg(movie);

	}
	
	public void logPrint() {
		dao.logPrint();
	}
	
	
	

}
