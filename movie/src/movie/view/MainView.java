package movie.view;


import java.util.Scanner;

import movie.common.MovieList;
import movie.controller.MovieController;



public class MainView implements MovieList {
	private Scanner sc = new Scanner(System.in);

	public void logIn() {
		System.out.println("1.�α���");
	}

	public void mainMenu(MovieController mc) {

		System.out.println("[TOP 10 ��ȭ]");
		for (int i = 0; i < 10; i++) {
			System.out.println("" + (i + 1) + ". " + movieList.get(i).getTit());
		}
		while (true) {
			System.out.println("=====��ȭ �޴�====");
			System.out.println("1.��ȭ �˻�");
			System.out.println("2.��ȭ ��õ");
			System.out.println("3.�α� ���");
			System.out.println("4.�˻�");
			System.out.println("0.���α׷� ����");
			System.out.print("�޴� ����: ");
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
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				return;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				break;
			}
		}

	}

	public void search(MovieController mc) {
		System.out.println("1.���� �󿵿�ȭ ��ü �˻�");
		System.out.println("2.�̸����� �˻�");
		System.out.println("3.�������� �˻�");
		System.out.println("4.�帣�� �˻�");
		System.out.println("0.�ʱ� �޴��� ���ư���");
		System.out.print("�޴� ����: ");
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
			System.out.println("�ʱ� �޴��� ���ư��ϴ�.");
			break;
		default:
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
			break;
		}
	}

	public void Msg(String a) {
		System.out.println(a);
	}

	public String SearchName() {
		System.out.println("��ȭ ������ �����ÿ�: ");
		return sc.next();

	}

	public int SearchGenre() {
		System.out.println("===��ȭ �帣===");
		for (int i = 0; i < genre.size(); i++) {
			if (i == (genre.size() - 1)) {
				System.out.println((i + 1) + " " + genre.get(i));
			} else if (((i + 1) % 3) != 0) {
				System.out.print((i + 1) + " " + genre.get(i) + " ");
			} else if (((i + 1) % 3) == 0) {
				System.out.println((i + 1) + " " + genre.get(i));
			}
		}
		System.out.print("�帣 ��ȣ ����: ");
		return sc.nextInt();
	}

	public double SearchRating() {
		System.out.print("ã���� �ϴ� ����(��)�� �Է��Ͻÿ�: ");
		return sc.nextDouble();
	}

}
