package InterruptedThread;

public class Interrupted extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("I am lazy thread");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("I am interrupted");
		}
	}
}
