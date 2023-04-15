package Day4;

public class TestVehicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b =new Bike();
		b.start();
		b.run(80);
		b.stop();
		
		Car c =new Car();
		c.start();
		c.run(160);
		c.stop();
	}

}
