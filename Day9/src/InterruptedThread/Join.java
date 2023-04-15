package InterruptedThread;

public class Join extends Thread {
	public int  total;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int total = 0;
		for(int i = 0; i <= 100; i++ ) {
			total += i;
		}
	}

}
