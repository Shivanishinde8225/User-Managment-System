package Assingment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee(101, "minakshi",200000);
		Employee employee2;
		try {
//			Serialization
			FileOutputStream fos = new FileOutputStream("C:\\DELL/Minakshi.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(employee);
			
			FileInputStream fis = new FileInputStream("C:\\DELL/Minakshi.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			employee2 = (Employee) ois.readObject();
			System.out.println(employee+"\n"+employee2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
