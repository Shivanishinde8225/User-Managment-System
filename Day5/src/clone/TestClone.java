package clone;

public class TestClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student(110,"Shiv","pune");
		try {
			Student st1 = (Student)st.clone();
			System.out.println("st :"+st+"\nhashcode of st :"+st.hashCode());
			
			System.out.println("st1 :"+st1+"\nhashcode of st1 :"+st1.hashCode());
			
		} catch (CloneNotSupportedException e) {
			
			System.out.println("clone not supported");
		}
		
	}

}
