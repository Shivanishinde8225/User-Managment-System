package Thread1;



public class ThreadDemo extends Thread{
	int length,breadth,radius;
	
	public ThreadDemo(int length, int breadth, int radius) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.radius = radius;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int area = (length*breadth);
	 System.out.println("Area of rectangle :"+area);
	 
	 double area1 =3.14*radius*radius; 
	 System.out.println("Area of circle :"+area1);
	}
}
