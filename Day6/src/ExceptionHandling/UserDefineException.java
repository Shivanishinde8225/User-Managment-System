package ExceptionHandling;

import java.util.Scanner;

class InvalidProductException extends Exception{
	public InvalidProductException(String msg) {
		super(msg);
	}	
}
public class UserDefineException {

	public static void main(String[] args) throws InvalidProductException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter weight :");
		int productWeight = scanner.nextInt();
		if(productWeight < 50) {
			throw new InvalidProductException("Product weight is invalid");
			
		}
		else{
			System.out.println("Product weight is valid");
		}
	}

}
