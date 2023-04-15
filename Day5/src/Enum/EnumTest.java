package Enum;
// we can write enum ouside class also
//public enum week{MONDAY,TUSDAY,WEDNESDAY,Thrusday,FRIDAY,SATURDAY,SUNDAY}

public class EnumTest {
	
	public enum week{MONDAY(2),TUSDAY(10),WEDNESDAY(3),Thrusday(4),FRIDAY(5),SATURDAY(6),SUNDAY(8);
	int day;	
	week(int day) {
		// TODO Auto-generated constructor stub
		this.day = day; 
	}
	}
	
	public static void main(String[] args) {
		
		for(week wk : week.values()) {
			System.out.println(wk);
			System.out.println(wk+ " "+wk.day);
		}
		
		System.out.println(week.valueOf("MONDAY")+" ==> "+week.valueOf("MONDAY").ordinal());
		
	}

}
