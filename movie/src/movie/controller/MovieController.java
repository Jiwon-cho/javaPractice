package movie.controller;

import java.util.Calendar;
import java.util.Scanner;

import movie.model.vo.Movie;

public class MovieController extends Movie{
	private Movie m=new Movie();
	private Scanner sc=new Scanner(System.in);
	
	
	public void searchName(String name) {
		String movie[][]=m.main();
		boolean flag = false;
		for (int i = 0; i < movie.length; i++) {

			if (name.equals(movie[i][1].trim().replace(" ", "")) && movie[i][0].equals("û�ҳ� �����Ұ�")) {
				System.out.println("��ȭ ������ �˻��ϱ� ���ؼ��� ���� ������ �ʿ��մϴ�.");
				
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
	
	
	public void identify() {
		String movie[][]=m.main();
		Calendar c=Calendar.getInstance();
		int y=c.get(Calendar.YEAR);
		System.out.println("��������� �Է����ֽÿ�(ex)19000101): ");
		int ay=Integer.parseInt(sc.next().substring(0,4));
		if(y-ay+1>19) {
			for (int i = 0; i < movie.length; i++) {
			
		}
		}
	}
	
	
	
	

}
