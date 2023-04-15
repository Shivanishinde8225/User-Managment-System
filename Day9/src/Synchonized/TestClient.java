package Synchonized;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d = new Display();
		
		MyThread thread= new MyThread(d, "shiv");
		MyThread thread1= new MyThread(d, "Ron");
		thread.start();
		thread1.start();
	}

}
