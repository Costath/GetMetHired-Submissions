package Assignment6;

import java.util.TreeMap;

public class TreeMapIteration {
	public static void main (String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();		
		
		treeMap.put(1, "Jack");
		treeMap.put(2, "Rick");
		treeMap.put(3, "Kate");
		treeMap.put(4, "Tom");
		treeMap.put(5, "Steve");
		
		for(int i = treeMap.size(); i > 0 ; i--) {
			System.out.println("Key" + i + ": " + treeMap.get(i));
		}
	}
}
