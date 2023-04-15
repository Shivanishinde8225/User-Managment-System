package Runnable;

public class TestRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableDemo runnableDemo= new RunnableDemo();
		Thread thread = new Thread(runnableDemo);
		thread.start();
//		thread.start(); //---> IllegalThreadStateException
		for(int i = 0 ;i < 10; i++) {
			System.out.println("main thread");
		}
	}

}
