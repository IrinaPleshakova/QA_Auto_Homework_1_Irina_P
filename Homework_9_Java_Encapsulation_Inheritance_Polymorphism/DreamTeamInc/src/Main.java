import com.example.employees.Designer;
import com.example.employees.Developer;
import com.example.employees.Employee;
import com.example.employees.Manager;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Manager("Bartek", 25, 4000, "Management"));
		employees.add(new Developer("Konrad", 30, 3500, "Development"));
		employees.add(new Designer("Hanna", 27, 2500, "Design"));

		for (Employee employee: employees){
			employee.performJob();
			employee.describeRole();
			employee.describeRole(" This employee works very good. Needs a salary increase!");
		}
	}

}