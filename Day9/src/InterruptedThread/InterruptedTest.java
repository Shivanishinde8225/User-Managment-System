package InterruptedThread;

public class InterruptedTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		Interrupted thread = new Interrupted();
//		thread.start();
//		thread.interrupt();
//		System.out.println("Main Method");
		
		Join j = new Join();
		j.start();
		j.join();
		System.out.println(j.total);
	}

}
