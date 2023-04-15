package Wrapper;

public class TestWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		autoboxing 
		int num = 20;
		Integer integer = Integer.valueOf(num);
		System.out.println(num +" " + integer);
		
//		unboxing
//		Integer integer2 = new Integer(100);
		Integer integer2 = 100;
		int num2 = integer2.intValue();
		System.out.println(num2 +" " + integer2);
		
		
	}

}
