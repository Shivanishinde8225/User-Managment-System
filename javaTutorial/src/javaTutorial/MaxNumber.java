package javaTutorial;
import java.util.Scanner;
class MaxNumber1 {
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		int maxNum(int num1,int num2,int num3) {
//			System.out.println("Enter three numbers :");
//			num1 = sc.nextInt();
//			num2 = sc.nextInt();
//			num3 = sc.nextInt();
			int res = ((num1 > num2)? num1:num2)< num3? num3:((num1 > num2)? num1:num2);
			return res;
			
		}		
		
//		String name = "ramesh";
//		System.out.println(name instanceof  String);
	
}
public class MaxNumber{
	public static void main(String[] args) {
		MaxNumber1 obj = new MaxNumber1();
		int ans = obj.maxNum(30, 40, 60);
		System.out.print(ans);
		
	}
}
	

