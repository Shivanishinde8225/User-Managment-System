package javaTutorial;
class Bike{
	final void run() {
		System.out.println(" bike is running ");
	}
}
class Honda extends Bike{
//	final void run() { //--> here we can't override run method
//		System.out.println("honda bike is running ");
//	}
}
public class FinalKeyword {
	final int  age = 21; //--> now it is like constant 
	void modify() {
//		age = 23; ==> we can't change it
		System.out.println(age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKeyword fk = new FinalKeyword();
		fk.modify();
		
		Honda h = new Honda();
		h.run();

	}

}
