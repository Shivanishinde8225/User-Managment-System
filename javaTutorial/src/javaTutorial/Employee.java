package javaTutorial;

public class Employee {

	int rolln;
	String name;
	String address;
	int age;
	double salary;
	public Employee(){
		
	}
	public Employee(int rolln, String name, String address, int age, double salary) {
		super();
		this.rolln = rolln;
		this.name = name;
		this.address = address;
		this.age = age;
		this.salary = salary;
	}
	public int getRolln() {
		return rolln;
	}
	public void setRolln(int rolln) {
		this.rolln = rolln;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [rolln=" + rolln + ", name=" + name + ", address=" + address + ", age=" + age + ", salary="
				+ salary + "]";
	}
	
	

}
