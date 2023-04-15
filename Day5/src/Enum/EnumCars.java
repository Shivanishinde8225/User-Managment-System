package Enum;

public class EnumCars {
	public enum Car{HONDA,AUDI,BMW,VOLVO}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c;
		c = Car.HONDA;
		switch (c) {
		case HONDA: {
			
			System.out.println("car Honda");
			break;
		}
		case AUDI: {
			
			System.out.println("car AUDI");
			break;
		}
		case BMW: {
			
			System.out.println("car BMW");
			break;
		}
		case VOLVO: {
			
			System.out.println("car VOLVO");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + c);
		}
	}

}
