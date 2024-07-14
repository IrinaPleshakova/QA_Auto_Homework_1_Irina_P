package com.example.employees;

import java.util.ArrayList;

/**
 * Represents an office environment managing employees and office activities.
 */

public class Office {
	private ArrayList<Employee> employees;

	public Office() {
		this.employees = new ArrayList<>();
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	/**
	 * Lists all employees in the office with their names, roles, and ages.
	 */
	public void listEmployees() {
		System.out.println("Employees in the office: ");
		for (Employee employee : employees) {
			System.out.println("- " + employee.getName() + " - " + employee.getRole() + " (" + employee.getAge() + " y.o.)");
		}
	}

	/**
	 * Starts the workday for all employees, making them work.
	 */
	public void startWorkDay() {
		for (Employee employee : employees) {
			employee.work();
		}
	}

	/**
	 * Conducts an office meeting with all employees participating and then taking a break.
	 */
	public void conductOfficeMeeting() {
		for (Employee employee : employees) {
			employee.participateInMeeting();
		}
		System.out.println("\n- Meeting finished. Participants are taking a break - ");
		for (Employee employee : employees) {
			employee.takeBreakAfterMeeting();
		}
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}
}