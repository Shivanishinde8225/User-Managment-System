package javaTutorial;

public class StaticBlock {
	static {
		System.out.println("Static block1");
	}
	static {
		System.out.println("Static block2");
	}
	static void block() {
		System.out.println("Static block3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In main method");
		StaticBlock.block();
	}

}
