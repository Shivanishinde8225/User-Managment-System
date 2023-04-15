package interfaceDemo;

public class Employee implements NameOperation {
	@Override
	public void takeLeave() {
		System.out.println("Employee wants leave");
		
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("salary of employee : 10000");
		
	}
	public void completWork() {
		System.out.println("Employee complete work");
	}
}
