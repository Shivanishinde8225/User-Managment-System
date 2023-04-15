package Assignment2;

import java.util.Comparator;

public class IdComparator implements Comparator<Doctor>{
	public int  compare(Doctor o1, Doctor o2) {
		
		return o1.id-o2.id;
	}
}
