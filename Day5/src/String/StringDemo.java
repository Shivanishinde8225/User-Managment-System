package String;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String decleration
		char [] str = {'j','a','v','a'};
		String string = new String(str);
		
		String string2 ="java";
		
		System.out.println(string+" "+string2);
		
//		String are immutable
		String str1 = "shiv";
		String str2 = "shiv";
		
		String str3 = new String("shiv"+"shinde");
		
		System.out.println(str1.hashCode()+" "+str2.hashCode()+" "+str3.hashCode());
		 
//		String Methods
		System.out.println(str1.length());
		System.out.println(str2.charAt(3));
		System.out.println(str1.compareTo("rina"));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
//		int n = 111;
//		int m = 20;
//		System.out.println(n/m);
		
	}

}
