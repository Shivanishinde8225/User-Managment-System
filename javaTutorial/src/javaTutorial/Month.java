package javaTutorial;
import java.util.Scanner;
public class Month {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the number :");
		num = sc.nextInt();
		switch(num) {
		case 1 : System.out.println(" Today is : Jan");
		break;
		case 2 : System.out.println(" Today is : Feb");
		break;
		case 3 : System.out.println(" Today is : Mar");
		break;
		case 4 : System.out.println(" Today is : Apr");
		break;
		case 5 : System.out.println(" Today is : May");
		break;
		case 6 : System.out.println(" Today is : June");
		break;
		case 7 : System.out.println(" Today is : July");
		break;
		case 8 : System.out.println(" Today is : Aug");
		break;
		case 9 : System.out.println(" Today is : Sep");
		break;
		case  10 : System.out.println(" Today is : Oct");
		break;
		case  11 : System.out.println(" Today is : Nov");
		break;
		case 12  : System.out.println(" Today is : Dec");
		break;
		default:
			System.out.println("Invalid Input");
	}
	}
}
