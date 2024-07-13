package com.example.employees;

public class Developer extends Employee {

	public Developer(String name, int age, double salary, String department) {
		super(name, age, salary, department);
	}

	@Override
	public void performJob() {
		System.out.println(getName() + " is writing good code.");
	}

	@Override
	public void describeRole() {
		System.out.println(getName() + " is a developer with a salary of " + getSalary());
	}

	@Override
	public void describeRole(String extraInfo) {
		System.out.println(getName() + " is a developer in the " + getDepartment() + " department."+ extraInfo);
	}
}
