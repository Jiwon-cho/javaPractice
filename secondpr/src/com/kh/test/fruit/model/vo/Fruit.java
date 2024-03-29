package com.kh.test.fruit.model.vo;

import java.util.Objects;



public class Fruit {
	private String name;
	private String flavor;
	/**
	 * 
	 */
	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param flavor
	 */
	public Fruit(String name, String flavor) {
		super();
		this.name = name;
		this.flavor = flavor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", flavor=" + flavor + "]";
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Fruit) {
			Fruit f=(Fruit)o;
			if(name.equals(f.name)&&flavor.equals(f.flavor)){
				return true;
			}
		}
		return false;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(name,flavor);
	}
	
	
}
