package Day4;

public class TestFlyable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyable f ;
		f = new Bird();
		f.start();
		f.accelerate();
		f.turn();
		f.stop();
		
		f = new Kite();
		f.start();
		f.accelerate();
		f.turn();
		f.stop();
	}

}
