package Day43;

import java.util.List;

public class Institute {
	
	String instituteName;
	List<Department>departments;
	
	public Institute(String instituteName, List<Department> departments) {
		super();
		this.instituteName = instituteName;
		this.departments = departments;
	}
	
	public int getTotalStudents() {
		
		int noOfStudents = 0;
		List<Student> students;
		for(Department dept : departments) {
			students = dept.getStudents();
			
			for(Student st : students) {
				noOfStudents++;
			}
		}
		
		return noOfStudents;
	}
}
