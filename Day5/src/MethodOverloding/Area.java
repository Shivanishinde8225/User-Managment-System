package MethodOverloding;

public class Area {
	static float area(int l,float b){
		
		return l*b;
		
	}	
//	we can also done by changes sequences
	static float area(float b,int l){
		
		return l*b;
		
	}
//	with changing number of parameters
	static float area(int l,int b,int h){
		
		return l*b*h;
		
	}	
//	with different data type 
	static float area(float r){
		float pie = 3.14f;
		return pie*r*r;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Area of square :"+Area.area(20, 20.0f));
		System.out.println("Area of rectangle :"+Area.area( 20.1f,20));
		System.out.println("Area of cuboid :"+Area.area(20, 20, 20));
		System.out.println("Area of circle:"+Area.area(2.3f));
	}

}
