package Comparator;

import java.util.Arrays;

public class ComparatorInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instructor[] instructors= new Instructor[3];
		instructors[0] = new Instructor(10,"fraz");
		instructors[1] = new Instructor(9, "shraddha");
		instructors[2] = new Instructor(15, "Aman");
		
		Arrays.sort(instructors,new IdComparator());
		for(Instructor instructor : instructors) {
			System.out.println(instructor);
		}
		
		Arrays.sort(instructors,new NameComparator());
		for(Instructor instructor : instructors) {
			System.out.println(instructor);
		}
		
	}

}
