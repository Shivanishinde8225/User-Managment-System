package Day41;
import java.util.Scanner;
public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Animal a = null ;	
		
		int animal;
		
		System.out.println("1.Cat   2.Rat  3.Snake  4.Frog");
		System.out.println("Enter name of animal :");
		animal  = sc.nextInt();
		
		if(animal == 1 ) {
			a = new Cat();
			
		}
		else if(animal == 2 ) {
			a = new Rat();
			
		}
		else if(animal == 3 ) {
			a = new Snake();
			
		}
		else if(animal == 4 ) {
			a = new Frog();
			
		}
		a.eat();
		a.classes();
		a.sound();
		a.jump();
		
		
		
	}

}
