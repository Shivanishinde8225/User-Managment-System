package Assignment1;

import java.util.Arrays;

public class testTV {


	public static void main(String[] args) {
		
		TV [] arr = new TV[3];
		arr[1] = new TV(102,"LCD", 40000);
		arr[2] = new TV(103,"LED", 30000);
		arr[0] = new TV(101,"LED", 20000);
		Arrays.sort(arr);
		for(TV a : arr) {
			System.out.println(a);
			
		}
	}

}
