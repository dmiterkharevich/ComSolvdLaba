package com.solvd.mobileoperator.staff;

public class Employee implements Staff {

	protected int salary;
	protected int age; 
	protected String sex; 
	private String status = "employee"; 
		
	public Employee() {
		
	} 
	
	public Employee(int age, String sex) {
		this.age = age;
		this.sex = sex;
	} 
	
	@Override
	public void aquire() {
		System.out.println("I can aquire new skills!");
	}
	
	
	@Override
	public void printInfo() {
		System.out.println("I am a(an)_ "  + this.status);
		System.out.println("I am_  " + this.age + "  _years old");
		System.out.println("My sex is_ " + this.sex);		
		System.out.println("My salary is_ " + this.salary);		
		System.out.println("I can work 8 hours every day!");
		System.out.println("I can aquire new skills!");
	}	
	
	// Overload ???
	public void printInfo(int age, String sex, int salary, String status) {
		this.age = age;
		this.sex = sex;
		this.salary = salary;
		this.status = status;
		System.out.println("I am a(an)_ "  + this.status);
		System.out.println("I am_  " + this.age + "  _years old");
		System.out.println("My sex is_ " + this.sex);		
		System.out.println("My salary is_ " + this.salary);		
		System.out.println("I can work 8 hours every day!");
		System.out.println("I can aquire new skills!");
	}
	
	@Override
	public int showAge() {
		return this.age;
	}
	
	@Override
	public String showSex() {
		return this.sex;
	}
	
	@Override
	public String showStatus() {
			return this.status;
	}
	
	@Override
	public void setInfoAgain(int age, String sex, int salary, String status) {
		this.salary = salary;
		this.age = age;
		this.sex = sex;
		this.status = status;
	}
	
	@Override
	public double showSalaryMaximum(int age, int salary, String status) {
		double salaryMaximum;
		double coefficient = 1.0;
		
		if (age < 30) {
			coefficient += 0.2;
		} else if (age < 50) {
			coefficient += 0.3;
		} else {
			coefficient += 0.1;
		}
		
		if (status == "expirienced applicant") {
			coefficient += 0.2;
		} else if (status == "employee") {
			coefficient += 0.3;
		} else if (status == "boss") {
			coefficient += 0.4;
		} else if (status == "bad employee") {
			coefficient += 0.1;
		}
		
		salaryMaximum = coefficient*salary;
		return salaryMaximum;
	}
	
	// Overloading
	public void printInfo(int age, String sex) {
		System.out.println(salary);
		System.out.println(age);
		System.out.println(sex);
	}
	
	// Overloading
	public void showStatus(String status) {
		this.status = status;
		System.out.println(status);
	}
	
	//OverLoading
	public int showAge(int age) {
		this.age = age; 
		return this.age;
	}
	
	//OverLoading
	public String showSex(String sex) {
		this.sex = sex; 
		return this.sex;
	}
	
	@Override
	public void work() {
		System.out.println("I can work 8 hours every day!");
	}

}
