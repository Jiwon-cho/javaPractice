package com.threadtest.controller;

public class GameCharacter {
	
	private String name;
	private int hp;
	public GameCharacter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GameCharacter(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
}
