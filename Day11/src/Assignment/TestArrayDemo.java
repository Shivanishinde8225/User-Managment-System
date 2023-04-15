package Assignment;

public class TestArrayDemo implements ArraysDemo {
	
	@Override
	public float Max(float[] arr) {
		float max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	@Override
	public float Min(float [] arr) {
		float min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public float add(float [] arr) {
		float total = 0;
		for(int i= 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total;
	}



}
