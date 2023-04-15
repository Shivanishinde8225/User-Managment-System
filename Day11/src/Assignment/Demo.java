package Assignment;

public class Demo {

	public static void main(String[] args) {
//		float [] arr = {1.2f,3.4f,5.5f};
		float [] arr = new float[3];
		arr[0] = 5.5f;
		arr[1] = 1.2f;
		arr[2] = 3.4f;
		ArraysDemo ad = new TestArrayDemo();
		System.out.println("Max element : "+ad.Max(arr));
		System.out.println("Min element : "+ad.Min(arr));
		System.out.println("total of array : "+ad.add(arr));
		

	}

}
