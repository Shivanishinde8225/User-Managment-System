package Comparator;

public class Instructor {
	int id;
	String name;
	public Instructor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name ;
	}
	
}
