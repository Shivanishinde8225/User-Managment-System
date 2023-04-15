package InnerClass;

public class WorkAnonymousInner {

	public static void main(String[] args) {
		// object of interface and anonymous Inner class
		Workable workable = new Workable() {
			
			@Override
			public void doWork() {
				System.out.println("Employees are workable");
				
			}
		};
		workable.doWork();
	}

}
