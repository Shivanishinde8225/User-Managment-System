package CollectionList;

import java.util.*;
class Student{
	int roll;
	String name;
	float marks;
	public Student(int roll, String name, float marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
class Employee{
	String name;
	int salary;
	String dept;
	public Employee(String name, int salary, String dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	
}
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	list of different type	
		List list = new ArrayList<>();
		list.add(10);
		list.add("shiv");
		list.add(true);
		list.add(12.4f);
		System.out.println(list);
		
		Student student = new Student(101,"shiv",40.3f);
		Student student1 = new Student(102,"ron",40.3f);
		Student student2 = new Student(103,"harry",40.3f);
		
//		list of Objects
		List<Object> list3 = new ArrayList<>();
		list3.add(student2);
		list3.add(student);
		list3.add(student1);
		list3.add(0, list);
		System.out.println(list3);

		
		List<Integer> list2 = new ArrayList<>();
		list2.add(23);
		list2.add(34);
		list2.add(45);
		System.out.println(list2);
		
//		List Oprations/Methods
		System.out.println(list2.size());
		System.out.println(list2.isEmpty());
		
		list2.remove(2);
		System.out.println(list2);
		
		list2.set(0, 3);
		System.out.println(list2);
		
//		list2.clear();
//		System.out.println(list2);
		
		Object[] arr =list2.toArray(); 
		for(Object i : arr) { 
			System.out.println(i); 
		}
		
		
//		Iterator
		List<String>string = new ArrayList<>();
		string.add("sani");
		string.add("gita");
		Iterator ite = string.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next()+"'s birthday ");
		}
		
		
		List<Employee> list4 = new ArrayList<>();
		list4.add(new Employee("shiv", 20000, "CSE"));
		list4.add(new Employee("shiv", 20000, "CSE"));
		list4.add(new Employee("shiv", 20000, "CSE"));
		
		Iterator<Employee> iterator = list4.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
