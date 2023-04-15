package javaTutorial;

public class Gc {
	public void finalize() {
		System.out.println("Object is garbage colleced");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gc obj = new Gc();
		Gc obj1 = new Gc();
		
//		by nulling object
//		obj = null;
//		obj1 = null;
		
//		by assining reference to another
		obj = obj1;
		
		System.gc();
	}

}
