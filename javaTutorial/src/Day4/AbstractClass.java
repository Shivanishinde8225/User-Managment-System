package Day4;

abstract class Bank {
	
	public abstract void rateOfInterest(double rate);
	
	void withdraw() {
		System.out.println("Amount is withdrawing ..");
	};
	
	void deposite() {
		System.out.println("Amount is deposite ..");
	};
	
}
class ICICBank extends Bank{
	
	@Override
	public void rateOfInterest(double rate) {
		System.out.println("rateOfInterest of ICIC :"+rate);
	}
}
class HDFCBank extends Bank{
	
	@Override
	 public void rateOfInterest(double rate) {
		System.out.println("rateOfInterest of HDFC :"+rate);
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICICBank ic = new ICICBank();
		ic.deposite();
		ic.withdraw();
		ic.rateOfInterest(8.9);
		
		HDFCBank hd = new HDFCBank();
		hd.deposite();
		hd.withdraw();
		hd.rateOfInterest(5.5);
		
	}

}
