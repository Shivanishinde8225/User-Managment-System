package javaTutorial;
import java.util.Arrays;
//import java.lang.*;
class ArrayOperation{
	int sum = 0,min ,max;
	int arrSum(int[] arr) {
		for(int i : arr) {
			sum += i;
		}
		return sum;
	}
	int arrMin(int[] arr) {
		min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < arr[i-1]) {
				min = arr[i];
			}
		}
		return min;
	}
	int arrMax(int[] arr) {
		max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > arr[i-1]) {
				max = arr[i];
			}
		}
		return max;
	}			
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {56,23,80,45,67};
		
		Arrays.sort(arr);
		for(int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		ArrayOperation obj = new ArrayOperation();
		System.out.println( "sum : "+obj.arrSum(arr));
		System.out.println( "min : "+obj.arrMin(arr));
		System.out.println( "max : "+obj.arrMax(arr));
			
		
//		String[] str = new String[5];
//		str[0] = "Shiv ";
//		str[1] = "Ron ";
//		str[2] = "Harry ";
//		str[3] = "Ram ";
//		str[4] = "isha ";
//		System.out.println();
//		for(int i = 0; i < str.length; i++) {
//			System.out.print(str[i]+ " ");
//		}
	}

}
