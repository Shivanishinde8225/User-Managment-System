package Day4;

public class Kite implements Flyable{
	@Override
	public void start() {
		System.out.println("Kite is starts fly");
	
	}
	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Kite is starts accelerate");

	}
	@Override
	public void turn() {
	// TODO Auto-generated method stub
		System.out.println("Kite is starts turn");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Kite is stop fly");
	}

}
