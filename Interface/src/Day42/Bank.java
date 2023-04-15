package Day42;

import java.util.Set;

public class Bank {
	String name;
	Set<Employee>employees;
	
	public Bank(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}	

}
