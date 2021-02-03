package com.objarr.model.vo;

public class Car {
	private String model;
	private int ppl;
	private String maf;
	private int price;
	private String clr;
	
	public Car() {}
	
	public Car(String model,int ppl,String maf,int price, String clr) {
		this.model=model;
		this.ppl=ppl;
		this.maf=maf;
		this.price=price;
		this.clr=clr;
	}
	
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	public void setPpl(int ppl) {
		this.ppl=ppl;
	}
	public int getPpl() {
		return ppl;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	
	
	public void setMaf(String maf) {
		this.maf=maf;
	}
	public String getMaf() {
		return maf;
	}
	
	public void setClr(String clr) {
		this.clr=clr;
	}
	public String getClr() {
		return clr;
	}
	

}
