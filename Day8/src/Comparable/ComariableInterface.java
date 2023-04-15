package Comparable;

import java.util.Arrays;

class Studentc implements Comparable<Studentc>{
	int roll;
	String name;
	
	public Studentc(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
		
	}
	@Override
	public int compareTo(Studentc s) {
		
		return this.roll-s.roll;
	}
	@Override
	public String toString() {
		return "roll=" + roll + ", name=" + name ;
	}
	
	
}	
	
public class ComariableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentc[] students = new Studentc[3];
		students[0]= new Studentc(10, "Shiv");
		students[1]= new Studentc(30, "Uday");
		students[2]= new Studentc(20, "kapil");
		
		Arrays.sort(students);
		
//		System.out.println(Arrays.toString(students));	
		for(Studentc student: students) {
			System.out.println(student);
		}
		
	}

}

