package com.threadtest.controller;

public class AutoGame {
	
	public static void main(String[] args) {
		GameThread bs=new GameThread(new GameCharacter("����",10000));
		GameThread ky=new GameThread(new GameCharacter("�⿵",20000));
		GameThread jh=new GameThread(new GameCharacter("����",60000));
		bs.start();
		jh.start();
		ky.start();
	
	
	}

}
