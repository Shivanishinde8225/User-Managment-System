package Thread1;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo tDemo = new ThreadDemo(20, 30, 3);
		tDemo.setName("Area");
		tDemo.start();
		for(int i = 0 ;i < 10; i++) {
//			System.out.println("main thread");
			System.out.println(Thread.currentThread().getName());
		}

	}

}
