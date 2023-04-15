package Day4;

public class Bird implements Flyable{
	@Override
	public void start() {
		System.out.println("Bird is starts fly");
	
	}
	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Bird is starts accelerate");

	}
	@Override
	public void turn() {
	// TODO Auto-generated method stub
		System.out.println("Bird is starts turn");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Bird is stop fly");
	}
}
