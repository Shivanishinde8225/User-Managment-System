package ioSerializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class AccountTest {
C:\\DELL/Sample.txt
	public static void main(String[] args) {
		
		Account iAccount = new Account("Pandharpur","Shiv",101, 20000);
		Account iAccount2;
		
		try {
//			Serialization process
			FileOutputStream fos = new FileOutputStream("");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(iAccount);	
			oos.close();
			fos.close();
			
//			Deserialization process
			FileInputStream fis = new FileInputStream("C:\\DELL/Sample.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			iAccount2 = (Account) ois.readObject();
			ois.close();
			fis.close();
			System.out.println(iAccount+"\n"+iAccount2);	
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
