package interfaceDemo;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		NameOperation np = new Employee();
		
		Employee np = new Employee();
		np.takeLeave();
		np.calculateSalary();
		np.completWork();
		
		Manager mp = new Manager();
		mp.takeLeave();
		mp.calculateSalary();
		mp.assignWork();
		
	}

}
