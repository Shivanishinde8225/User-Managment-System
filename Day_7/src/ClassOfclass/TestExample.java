package ClassOfclass;
class Demo1 extends Example{
	
}

public class TestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c = Demo1.class;
		
		System.out.println(c.getName());
		System.out.println(c.getSuperclass());
		Class [] sampleInterfacesClasses = c.getClasses();
		for(Class iClass : sampleInterfacesClasses) {
			System.out.println(iClass);
		}
	}

}
