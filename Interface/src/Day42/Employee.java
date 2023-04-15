package Day42;

public class Employee {
	String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "name=" + name ;
		
	}
	
}
