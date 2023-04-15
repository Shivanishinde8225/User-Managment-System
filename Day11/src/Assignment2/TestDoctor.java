package Assignment2;

import java.util.Arrays;

//import Comparator.IdComparator;
//import Comparator.Instructor;

public class TestDoctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor[] doc = new Doctor[3];
		doc[0] = new Doctor(104, "shiv", "Pandharpur","mbbs");
		doc[1] = new Doctor(102, "sham", "Pune","md");
		doc[2] = new Doctor(103, "ram", "Thane","bhms");
		
		Arrays.sort(doc,new NameComparator());
		for(Doctor i : doc) {
			System.out.println(i);
		}
	}

}
