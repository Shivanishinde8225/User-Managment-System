package javaTutorial;

public class Client {
	public static void main(String[] args) {
		Department dept = new Department();
		dept.setNumber(101);
		dept.setLocation("pandharpur");
		dept.setName("CSE");
		dept.setHod("pingale sir");
		
		Department dept1 = new Department(101,"pandharpur","CSE","pingale sir");
		
		System.out.println(dept);
		System.out.print(dept1);

		
	}

}
