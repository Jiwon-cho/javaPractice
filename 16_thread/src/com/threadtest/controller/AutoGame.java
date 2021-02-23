package com.threadtest.controller;

public class AutoGame {
	
	public static void main(String[] args) {
		GameThread bs=new GameThread(new GameCharacter("º´½Â",10000));
		GameThread ky=new GameThread(new GameCharacter("±â¿µ",20000));
		GameThread jh=new GameThread(new GameCharacter("ÁöÈÆ",60000));
		bs.start();
		jh.start();
		ky.start();
	
	
	}

}
