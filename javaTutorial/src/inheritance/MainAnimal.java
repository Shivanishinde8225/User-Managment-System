package inheritance;

//Single level inheritance

class Animal{
	void sound() {
		System.out.print("we are animal and we have specific sound");
	}
}
class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("Dog can bark");
	}
	void walk() {
		System.out.println("Dog is walking");
	} 
}	
public class MainAnimal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a = new Dog();
		a.sound();
		
		Dog d =new Dog();
		d.walk();

	}

}
