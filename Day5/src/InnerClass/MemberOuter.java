package InnerClass;

public class MemberOuter {
	private int value = 30;
	class MemberInner{
		void message() {
			System.out.println("private data member of Outer class in Inner class :"+value);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberOuter mo = new MemberOuter();
		MemberOuter.MemberInner mi = mo.new MemberInner();
		mi.message();
				
	}

}
