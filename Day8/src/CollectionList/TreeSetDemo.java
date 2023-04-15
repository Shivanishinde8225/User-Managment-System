package CollectionList;

import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet treeSet = new TreeSet<>();
		treeSet.add(10);
		treeSet.add(10);
		treeSet.add(0);
		treeSet.add(20);
		treeSet.add(14);
		System.out.println(treeSet);
		
		TreeSet treeSet2= new TreeSet<>();
		treeSet2.add("shiv");
		treeSet2.add("Shiv");
		treeSet2.add("ron");
		treeSet2.add("dora");
		System.out.println(treeSet2);
		
		SortedSet sortedSet = treeSet2.headSet("shiv");
		System.out.println(sortedSet);
		
		SortedSet sortedSet1 = treeSet2.tailSet("dora");
		System.out.println(sortedSet1);
	}

}
