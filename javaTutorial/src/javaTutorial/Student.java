package javaTutorial;
class Student1{
	static int  count = 0;
	int rno;
	String name;
	
	Student1(){
		
	}
	
	Student1(int rno, String name) {
		super();
		this.rno = rno;
		this.name = name;
		count++;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Student1.count = count;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student1 [rno=" + rno + ", name=" + name + "]";
	}
	
}
public class Student {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 st = new Student1(101,"sanjana");
		Student1 st1 = new Student1(102,"Ron");
		Student1 st2 = new Student1(103,"Harry");
		Student1 st3 = new Student1(104,"Shiv");
		
		System.out.println("total "+ Student1.count +" Students are present");
		

	}

}
