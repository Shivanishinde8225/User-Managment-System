package Synchonized;


public class Display {
	String name;
	

	public void wish(String name) {
		for(int i = 0; i <= 10; i++) {
			try {
				System.out.println("Good Morning "+name);
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

}
