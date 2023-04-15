package javaTutorial;
import java.util.Scanner;
public class Week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the number :");
		num = sc.next().charAt(0);
		switch(num) {
		case '1' : System.out.println(" Today is : Monday");
		break;
		case '2' : System.out.println(" Today is : Tuesday");
		break;
		case '3' : System.out.println(" Today is : Wednesday");
		break;
		case '4' : System.out.println(" Today is : Thrusday");
		break;
		case '5' : System.out.println(" Today is : Friday");
		break;
		case '6' : System.out.println(" Today is : Saturday");
		break;
		case '7' : System.out.println(" Today is : Sunday");
		break;
		default:
			System.out.println("Invalid Input");
		}
		

	}

}
