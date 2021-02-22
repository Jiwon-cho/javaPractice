package com.model.vo;

import java.util.Date;

public class Food implements Comparable{
	private String name;
	private int price;
	private String category;
	private int calorie;
	private Date exp;
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Food(String name, int price, String category, int calorie, Date exp) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		this.calorie = calorie;
		this.exp = exp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public Date getExp() {
		return exp;
	}
	public void setExp(Date exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", category=" + category + ", calorie=" + calorie + ", exp="
				+ exp + "]";
	}
	
	//객체의 동일성을 비교하기위해
	//equals 오버라이딩 처리를 해야함.
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Food) {
			Food f=(Food)obj;
			if(this.name.equals(f.getName())&&this.category.equals(f.getCategory())
					&&this.price==f.getPrice()) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int compareTo(Object f) {
		if(f instanceof Food) {
			Food temp=(Food)f;
			return name.compareTo(temp.name);//이름 오름차순으로 정렬
			//return price-temp.price; // 가격 순
		}
		return 0;
	}
	
}
