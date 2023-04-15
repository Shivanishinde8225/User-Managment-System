package ExceptionHandling;

public class NumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "str";
		try {
			
			int num = Integer.parseInt(string);
			System.out.println(num);
		} catch (NumberFormatException e) {
			e.printStackTrace();
//			System.out.println("type missmatch");
		}
	}

}
