package MapDemo;

import java.util.*;
import java.util.HashSet;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hashMap = new HashMap<>();
		hashMap.put("k",10);
		hashMap.put("s",19);
		hashMap.put("j",10);
		hashMap.put("i",50);
		
		System.out.println(hashMap);
		
		Set set= hashMap.keySet();
		System.out.println(set);
		
		Collection collection = hashMap.values();
		System.out.println(collection);
		
//		Methods
		hashMap.containsKey(hashMap);
		hashMap.containsValue(hashMap);
		
		hashMap.remove("k");
		System.out.println(hashMap);
		
		System.out.println(hashMap.get("s"));
	}

}
