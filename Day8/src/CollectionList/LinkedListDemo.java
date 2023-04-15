package CollectionList;

import java.util.*;

class Teacher{
	int id;
	String nameS;
	public Teacher(int id, String nameS) {
		super();
		this.id = id;
		this.nameS = nameS;
	}
	
	@Override
	public String toString() {
		return "id=" + id + ", nameS=" + nameS ;
	}
	
}
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkedList<Integer> linkedList = new LinkedList<>();
//		linkedList.add(10);
//		linkedList.add(20);
//		System.out.println(linkedList);
//		linkedList.remove(1);
//		System.out.println(linkedList);
		
		
		LinkedList<Teacher> list = new LinkedList<>();
		list.add( new Teacher(101, "Shan"));
		list.add( new Teacher(102, "Shan"));
		list.add( new Teacher(103, "Shan"));

		ListIterator<Teacher> itrIterator = list.listIterator();
		while(itrIterator.hasNext()) {
//			System.out.println(itrIterator.next());
			itrIterator.next();
		}
		while(itrIterator.hasPrevious()) {
			
			System.out.println(itrIterator.previous());
			
		}
	}

}
