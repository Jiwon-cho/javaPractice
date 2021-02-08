package com.kh.example.practice2.model.vo;

public class Product {
	
	private String name;
	private int price;
	private String brand;
	
	public Product() {}
	
	
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


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public void information() {
		name="핸드폰";
		price=290;
		brand="갤럭시";
		System.out.println(name+" "+price+" "+brand);
	}
	

}
