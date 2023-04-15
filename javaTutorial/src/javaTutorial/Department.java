package javaTutorial;

public class Department {
	int number;
	String name;
	String hod;
	String location;
	
	public Department() {
		
	}
	public Department(int number, String name, String hod, String location) {
		super();
		this.number = number;
		this.name = name;
		this.hod = hod;
		this.location = location;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHod() {
		return hod;
	}
	public void setHod(String hod) {
		this.hod = hod;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [number=" + number + ", name=" + name + ", hod=" + hod + ", location=" + location + "]";
	}
	
	

}
