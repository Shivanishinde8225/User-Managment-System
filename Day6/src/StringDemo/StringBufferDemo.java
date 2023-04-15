package StringDemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sBuffer = new StringBuffer("java ");
		
		sBuffer.insert(5, "programming ");		
		System.out.println(" sBuffer insert :"+sBuffer);
		
		StringBuffer sBuffer2 = sBuffer.append(" is interested");
		System.out.println("sBuffer2 append :"+sBuffer2);
		System.out.println("sBuffer append :"+sBuffer);
		
		sBuffer2.replace(0, 4, "python");
		System.out.println("sBuffer2 replace :"+sBuffer2);
		System.out.println("sBuffer replace :"+sBuffer);
		
		sBuffer.reverse();
		System.out.println(" sBuffer reverse :"+sBuffer);
		
		
		
	}

}
