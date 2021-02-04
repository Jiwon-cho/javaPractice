package com.inherit.model.vo;

public class Employee extends Person{
	
//	private String name;
//	private int age;
//	private char gender;
//	private String addr;
	private String department;
	private String job;
	private int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(
			String name, int age, char gender, String addr, String phone,double weight,double height, 
			String department, String job, int salary) {
		super(name,age,gender,addr,phone,weight,height);
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//		this.addr = addr;
		this.department = department;
		this.job = job;
		this.salary = salary;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public char getGender() {
//		return gender;
//	}
//
//	public void setGender(char gender) {
//		this.gender = gender;
//	}
//
//	public String getAddr() {
//		return addr;
//	}
//
//	public void setAddr(String addr) {
//		this.addr = addr;
//	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public void infoObject() {
		System.out.println("°¨ÀÚ");
	}
	
	
	@Override
	public String toString() {
		return getName()+" "+getAge()+" "+getGender()+" "+getAddress()+" "
				+getPhone()+" "+getWeight()+" "+getHeight()+" "+department+" "+job+" "+salary;
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
