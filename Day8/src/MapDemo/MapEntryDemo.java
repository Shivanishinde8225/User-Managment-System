package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapEntryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String>mp = new HashMap<>();
		mp.put(10,"Shiv");
		mp.put(13,"Sham");
		mp.put(14,"Shan");
		mp.put(15,"faze");
		System.out.println(mp);
		
		System.out.println(mp.get(13));
		
		for(Map.Entry entry : mp.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
