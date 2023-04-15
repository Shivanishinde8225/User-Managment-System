package interfaceDemo;

public class Manager implements NameOperation{
	@Override
	public void takeLeave() {
		// TODO Auto-generated method stub
		System.out.println("manager wants leave");
		
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("salary of manager : 10000");
		
	}
	public void assignWork() {
		System.out.println("Manager assign work to employee");
	}

}
