package Assignment2;

import java.util.Comparator;

public class NameComparator implements Comparator<Doctor>{

	@Override
	public int compare(Doctor o1, Doctor o2) {
		
		return (o2.name).compareTo(o1.name);
		
	}

}
