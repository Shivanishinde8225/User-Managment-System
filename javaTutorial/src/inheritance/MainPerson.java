package inheritance;
//Multilevel inheritance

class Person{
	void Display() {
		System.out.println("I am a person...");
	}
}
class Student extends Person{
	void Display() {
		System.out.println("I am a Student...");
	}
}
class Boy extends Student{
	void Display() {
		System.out.println("I am a Boy...");
	}
}
public class MainPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.Display();
		
		Student s = new Student();
		s.Display();
		
		Boy b = new Boy();
		b.Display();
		
		System.out.println(p instanceof Person);
		System.out.println(s instanceof Person);
		System.out.println(s instanceof Student);
		System.out.println(b instanceof Person);
		System.out.println(b instanceof Student);
		System.out.println(b instanceof Boy);
		System.out.println(p instanceof Boy);
		System.out.println(p instanceof Student);
		
	}

}
