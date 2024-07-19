package com.example.employees;

/**
 * Represents a developer with specific attributes and methods.
 */

public class Developer extends Employee {

	public Developer(String name, int age, double salary, String department) {
		super(name, age, salary, department);
	}

	@Override
	public String getRole() {
		return "developer";
	}

	@Override
	public void performJob() {
		System.out.println(getName() + " is writing good code.");
	}

	@Override
	public void describeRole() {
		System.out.println(getName() + " is a " + getRole() + " with a salary of " + getSalary());
	}

	@Override
	public void describeRole(String extraInfo) {
		System.out.println(getName() + " is a " + getRole() + " in the " + getDepartment() + " department."+ extraInfo);
	}

	@Override
	public void participateInMeeting() {
		System.out.println(getName() + " is participating in a meeting. ");
	}

	@Override
	public void takeBreakAfterMeeting() {
		takeBreak();
	}
}
