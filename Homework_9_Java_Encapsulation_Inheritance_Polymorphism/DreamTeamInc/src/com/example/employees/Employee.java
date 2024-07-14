package com.example.employees;

/**
 * Represents a generic employee with basic attributes and methods.
 */

public class Employee {
	private String name;
	private int age;
	private double salary;
	private String department;

	public Employee (String name, int age, double salary, String department) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void work() {
		System.out.println(name + " is working.");
	}

	public void takeBreak() {
		System.out.println(name + " is taking a break.");
	}

	public String getRole() {
		return "employee";
	}

	public void performJob() {
		System.out.println(name + " is performing assigned job");
	}

	public void describeRole() {
		System.out.println(name + " is an " + getRole() + " with a salary of " + salary);
	}

	public void describeRole(String extraInfo) {
		System.out.println(name + " is an " + getRole() + " in the " + department + " department." + extraInfo);
	}

	public void participateInMeeting() {
		work();
	}

	public void takeBreakAfterMeeting() {
	}
}
