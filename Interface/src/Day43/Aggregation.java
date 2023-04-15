package Day43;

import java.util.ArrayList;

import java.util.List;

public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student(101,"Shiv","CSE");
		Student st1 = new Student(101,"Shan","CSE");
		Student st2 = new Student(101,"Ron","ENTC");
		Student st3 = new Student(101,"Sham","ENTC");
		
		List<Student>cseStudent = new ArrayList<Student>();
		cseStudent.add(st);
		cseStudent.add(st1);
		List<Student>entcStudent = new ArrayList<Student>();
		entcStudent.add(st2);
		entcStudent.add(st3);
		
		Department dept = new Department("CSE",cseStudent);
		Department dept1 = new Department("ENTC",entcStudent);
		
		List<Department>depts = new ArrayList<Department>();
		depts.add(dept);
		depts.add(dept1);
		
		Institute institute = new Institute("skn scoe", depts);
		System.out.println(institute.getTotalStudents());
		
		
		
		
	}

}
