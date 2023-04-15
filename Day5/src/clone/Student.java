package clone;

public class Student implements Cloneable {
	int rno;
	String name;
	String address;
	public Student(int rno, String name, String address) {
		super();
		this.rno = rno;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "rno=" + rno + ", name=" + name + ", address=" + address ;
		
	}
	
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();	
	}
	
}
