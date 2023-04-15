package javaTutorial;
class calsi{
	int num1,num2;
	int sum(int num1,int num2) {
		return num1+num2;		
	}
	int sub(int num1,int num2) {
		return num1-num2;		
	}
	int mul(int num1,int num2) {
		return num1*num2;		
	}
	int div(int num1,int num2) {
		return num1/num2;		
	}
}
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calsi c = new calsi();
		System.out.println("addition : "+c.sum(23, 45));
		System.out.println("substraction : "+c.sub(123, 45));
		System.out.println("multipication : "+c.mul(23, 45));
		System.out.println("division : "+c.div(450, 45));
		
	}

}
