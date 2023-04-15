package ExceptionHandling;

import java.util.Scanner;

class YoungerAgeException extends Exception{
	public YoungerAgeException(String msg) {
		super(msg);
	}
}
class OldAgeException extends Exception{
	public OldAgeException(String msg) {
		super(msg);
	}
}
public class UserDefineException1 {

	public static void main(String[] args) throws YoungerAgeException, OldAgeException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age :");
		int age = scanner.nextInt();
		if(age < 20) {
			throw new YoungerAgeException("younger age");
			
		}
		else if(age > 60){
			throw new OldAgeException ("older agr");
		}
		else {
			System.out.println("thanks for registation");
			
		}

	}

}
