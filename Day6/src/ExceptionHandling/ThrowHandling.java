package ExceptionHandling;
import java.util.Scanner;
public class ThrowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter weight :");
		int productWeight = scanner.nextInt();
		if(productWeight < 50) {
			throw new ArithmeticException("Product weight is invalid");
			
		}
		else{
			System.out.println("Product weight is valid");
		}
		
	}

}
