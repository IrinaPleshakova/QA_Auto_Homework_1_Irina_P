package com.example.employees;

/**
 * Represents a designer with specific attributes and methods.
 */

public class Designer extends Employee {

	public Designer(String name, int age, double salary, String department) {
		super(name, age, salary, department);
	}

	@Override
	public String getRole() {
		return "designer";
	}

	@Override
	public void performJob() {
		System.out.println(getName() + " is designing a good user interface.");
	}

	@Override
	public void describeRole() {
		System.out.println(getName() + " is a " + getRole() + " with a salary of " + getSalary());
	}

	@Override
	public void describeRole(String extraInfo) {
		System.out.println(getName() + " is a " + getRole() + " in the " + getDepartment() + " department.");
	}
}
