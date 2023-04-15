package Day42;

import java.util.HashSet;
import java.util.Set;

public class Association {
	public static void main(String[] args) {
		Employee emp = new Employee("Shiv");
		Employee emp1 = new Employee("Harry");
		Employee emp2 = new Employee("Ron");
		
		Set<Employee>employees = new HashSet<Employee>();
		employees.add(emp);
		employees.add(emp1);
		employees.add(emp2);
		
		
		Bank hdfc = new Bank("HDFC");
		hdfc.setEmployees(employees);
		
		System.out.println("Bank name :"+hdfc.getName());
		System.out.println(hdfc.getEmployees());
				
	}
}
