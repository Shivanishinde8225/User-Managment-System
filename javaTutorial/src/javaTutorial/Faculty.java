package javaTutorial;
class Trainer{
	int age;
	String technology;
	int exprience;
	int id;
	Trainer(){
		
	}
	Trainer(int age, String technology, int exprience, int id) {
		super();
		this.age = age;
		this.technology = technology;
		this.exprience = exprience;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Trainer [name=" + age + ", technology=" + technology + ", exprience=" + exprience + ", id=" + id + "]";
	}
	
	
}
public class Faculty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		Trainer [] t = new Trainer[3];
		t[0] = new Trainer(34,"java",18,101); 
		t[1] = new Trainer(44,"python",9,102); 
		t[2] = new Trainer(46,"sql",22,103);
		for(Trainer i : t) {
			System.out.println(i);
		}
		
	}

}
