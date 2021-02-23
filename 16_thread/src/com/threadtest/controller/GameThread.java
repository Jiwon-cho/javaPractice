package com.threadtest.controller;

public class GameThread extends Thread {

	private GameCharacter gc;

	/**
	 * 
	 */
	public GameThread() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param gc
	 */
	public GameThread(GameCharacter gc) {
		super();
		this.gc = gc;
	}

	@Override
	public void run() {
		System.out.println("===========" + gc.getName() + "���� �����ϼ̽��ϴ�. ===========");
		while (true) {
			int damage = (int) (Math.random() * 500) + 1;
			int cho = (int) (Math.random() * 2);
			switch (cho) {
			case 0:
				System.out.println("������ �޾Ҵ�.");
				gc.setHp(gc.getHp() - damage);
				break;
			case 1:
				System.out.println("������ ȸ����");
				break;
			}
			if (gc.getHp() < 0) {
				System.out.println(gc.getName() + "���� �׾����ϴ�.");
				break;
			}
			System.out.println(gc.getName() + "���� " + gc.getHp() + "���Ҵ�.");
			try {
				sleep((int) (Math.random() * 1000) + 300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}