package JavaIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file = new FileOutputStream("C:\\java.txt");
		String string = "hello";
		byte[] b = string.getBytes();
		file.write(b);
		file.close();
		System.out.println("write successfully");
		
//		File file2 = new File(string);
//		file2.createNewFile();
		
	}

}
