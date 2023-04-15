package Thread;

public class MyThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread = new MyThread();
		thread.start();
		for(int i = 0 ;i < 20; i++) {
			System.out.println("main thread");
			System.out.println(Thread.currentThread().getName());
		}
	}

}
