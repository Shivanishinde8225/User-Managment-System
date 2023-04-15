package inheritance;
class Bank{
	int account;
	String name;
	void details(int account,String name) {
		System.out.println("Account :"+ account+" Name :"+name);		
	}
	
}
class Saving extends Bank{
	float rateOfInterest;
	void show(float rateOfInterest) {
		System.out.println(" rateOfInterest :"+ rateOfInterest);
	}
	
}
class Current extends Bank{
	float amount;
	
	void show(float amount) {
		System.out.println(" amount :"+ amount);
	}
	
}
public class MainBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Current c = new Current();
		c.details(101,"shiv");
		c.show(20000);
		
		Saving s = new Saving();
		s.details(102,"Ron");
		s.show(8);
	}

}
