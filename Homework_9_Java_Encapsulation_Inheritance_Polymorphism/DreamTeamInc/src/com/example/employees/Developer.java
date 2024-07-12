package com.example.employees;

public class Developer extends Employee {

	public Developer(String name, int age, double salary) {
		super(name, age, salary);
	}

	@Override
	public void performJob() {
		System.out.println(getName() + " is writing good code.");
	}

	@Override
	public void describeRole() {
		System.out.println(getName() + " is a developer with a salary of " + getSalary());
	}
}
