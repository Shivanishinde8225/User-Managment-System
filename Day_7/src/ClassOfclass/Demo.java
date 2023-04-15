package ClassOfclass;

import java.io.Serializable;

//reflextion API

class Sample1 implements Serializable,Cloneable{
	
}
public class Demo {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
//		Class class1 = Class.forName("Sample1");
		
		
		
		Class c = Sample1.class;
		
		System.out.println(c.getName());
		System.out.println(c.getSuperclass());
		Class [] sampleInterfacesClasses = c.getInterfaces();
		for(Class i : sampleInterfacesClasses) {
			
			System.out.println(i.getName());
		}
	}

}
