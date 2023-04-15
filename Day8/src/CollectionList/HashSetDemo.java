package CollectionList;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		hashset has unique element
		ArrayList list = new ArrayList<>();
		list.add(23);
		list.add(45);
		list.add(78);
		
		HashSet hset = new HashSet<>(list);
		hset.add("g");
		hset.add(10);
		hset.add(10);
		hset.add(null);
		
		System.out.println(hset);
		
		LinkedHashSet lHashSet =new LinkedHashSet<>();
		lHashSet.add(10);
		lHashSet.add(10);
		lHashSet.add("shiv");
		System.out.println(lHashSet);
	}

}
