package Comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Instructor>{

	@Override
	public int compare(Instructor i1, Instructor i2) {
		// TODO Auto-generated method stub
		return (i1.name).compareTo(i2.name);
	}

	

}
