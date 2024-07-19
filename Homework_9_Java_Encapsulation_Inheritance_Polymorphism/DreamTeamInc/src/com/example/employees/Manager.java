package com.example.employees;

/**
 * Represents a manager with specific attributes and methods.
 */

public class Manager extends Employee {

	public Manager(String name, int age, double salary, String department) {
		super(name, age, salary, department);
	}

	@Override
	public String getRole() {
		return "manager";
	}

	@Override
	public void performJob() {
		System.out.println(getName() + " is managing the team");
	}

	@Override
	public void describeRole() {
		System.out.println(getName() + " is a " + getRole() + " with a salary of " + getSalary());
	}

	@Override
	public void describeRole(String extraInfo) {
		System.out.println(getName() + " is a " + getRole() + " in the " + getDepartment() + " department.");
	}

	public void assignTask(Employee employee, String task) {
		System.out.println(getName() + " is assigning task: " + task + " to " + employee.getName());
		employee.performJob();
	}

	@Override
	public void participateInMeeting() {
		conductMeeting();
	}

	@Override
	public void takeBreakAfterMeeting() {
		takeBreak();
	}

	public void conductMeeting() {
		System.out.println(getName() + " is conducting meeting.");
	}
}
