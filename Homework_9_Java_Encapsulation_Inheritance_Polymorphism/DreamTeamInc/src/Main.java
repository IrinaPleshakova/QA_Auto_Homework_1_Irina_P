import com.example.employees.Employee;
import com.example.employees.Designer;
import com.example.employees.Developer;
import com.example.employees.Manager;
import com.example.employees.Office;

/**
 * Main class to simulate an office environment with employees of different roles interacting with each other.
 * This program demonstrates various office activities such as starting a workday, conducting meetings,
 * assigning tasks, and employees describing their roles.
 */

public class Main {
	public static void main(String[] args) {
		Office office = new Office();

		Manager manager = new Manager("Bartek", 25, 4000, "Management");
		Developer developer = new Developer("Konrad", 30, 3500, "Development");
		Designer designer = new Designer("Hanna", 27, 2500, "Design");

		office.addEmployee(manager);
		office.addEmployee(developer);
		office.addEmployee(designer);

		office.listEmployees();

		System.out.println("\n-- Starting work day --");
		office.startWorkDay();

		System.out.println("\n-- Conducting office meeting --");
		office.conductOfficeMeeting();

		System.out.println("\n-- Manager assigns task --");
		manager.assignTask(developer, "Develop new feature");
		manager.assignTask(designer, "Create new UI design");


		System.out.println("\n-- Employees describe roles --");
		for (Employee employee: office.getEmployees()){
			employee.performJob();
			employee.describeRole();
			employee.describeRole(" This employee works very good. Needs a salary increase!");
			System.out.println();
		}
	}

}