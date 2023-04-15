package InnerClass;

public class LocalOuter {
	private String nameString = "shiv";
	void show() {
		class LocalInner{
			void inner() {
				System.out.println("Myself :"+nameString);
			}
		}
		LocalInner lI= new LocalInner();
		lI.inner();
	}
	
	public static void main(String[] args) {
		LocalOuter localOuter = new LocalOuter();
		localOuter.show();
	}
}
