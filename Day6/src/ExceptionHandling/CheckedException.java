package ExceptionHandling;

public class CheckedException {
	int add(int a ,int b) {
		try {
			
			System.out.println("hi"+(a+b));
			return a+b;
//			System.exit(0);
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			System.out.println("finally");
		}
		return b;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckedException ce = new CheckedException();
		ce.add(10, 20);
	}

}
