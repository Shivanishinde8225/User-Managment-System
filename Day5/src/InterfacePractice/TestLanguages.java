package InterfacePractice;
import java.util.Scanner;

public class TestLanguages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		Languages l=null;
		System.out.println("1.C \n2.C++ \n3.Java \n4.Python \n5.Exit");
		do {
			System.out.print("Enter your choice :");
			choice = sc.nextInt();
					
			if(choice == 1) {
				l = new C();
			}		
			else if(choice == 2) {
				l = new Cpp();
			}	
			else if(choice == 3) {
				l = new Java();
			}		
			else if(choice == 4) {
				l = new Python();
			}
			else if(choice == 5) {
				break;
			}
			else {
				System.out.println("Invalid Input");
			}
			
			l.getName();
			l.getVersion();
			l.getFounder();
			l.getCategory();	
		}while(choice != 5);
	}

}
