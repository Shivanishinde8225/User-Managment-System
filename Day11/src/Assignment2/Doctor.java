package Assignment2;

import java.util.Comparator;

public class Doctor {
	int id;
	String name;
	String address;
	String speciality;
	public Doctor(int id, String name, String address, String speciality) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.speciality = speciality;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", address=" + address + ", speciality=" + speciality + "]";
	}
	
	
	
}
