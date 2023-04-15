package InnerClass;

abstract class  worker{
	abstract void work();
}

public class AnonymousAbstract {
		
	public static void main(String[] args) {
		worker wk = new worker() {
			
			@Override
			void work() {
				System.out.println("Employees are working..");
			}
		};
		wk.work();
	}
}
