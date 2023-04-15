package ExceptionHandling;

public class NullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length  = 0;
		try {
			
			String string = null;
			length = string.length();
		}catch (NullPointerException e) {
			
//			System.out.println("String is empty");
//			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		finally {
			
			System.out.println(length);
		}
		
		
		
	}

}
