package Day43;

import java.util.List;

public class Department {
	
	String nameOfDept;
	List<Student>students ;
	
	public Department(String nameOfDept, List<Student> students) {
		super();
		this.nameOfDept = nameOfDept;
		this.students = students;
	}
	
	public List<Student> getStudents() {
		return students;
	}

}
