package ExceptionHandling;

public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		try {
			System.out.println(arr[4]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception`
			e.printStackTrace();
		}
		finally {
			System.out.println("finally :I am always executed");
		}
	}

}
