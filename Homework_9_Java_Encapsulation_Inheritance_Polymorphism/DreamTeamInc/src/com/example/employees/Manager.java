package com.example.employees;

public class Manager extends Employee {

	public Manager(String name, int age, double salary) {
		super(name, age, salary);
	}

	@Override
	public void performJob() {
		System.out.println(getName() + " is managing the team");
	}

	@Override
	public void describeRole() {
		System.out.println(getName() + " is a manager with a salary of " + getSalary());
	}
}
