package Assignment6;

import java.util.ArrayList;

public class SubList {
	public static void main (String[] args) {
		ArrayList<String> OriginalList = new ArrayList<String>();
		
		ArrayList<String> NewList = new ArrayList<String>();
		
		OriginalList.add("Steve");
		OriginalList.add("Justin");
		OriginalList.add("Ajeet");
		OriginalList.add("John");
		OriginalList.add("Arnold");
		OriginalList.add("Chaitanya");
		
		for(String name: OriginalList) {
			if(name.contains("J") || name.contains("j")) {
				NewList.add(name);
			}
		}
		
		System.out.println("Original ArrayList Content: " + OriginalList);		
		System.out.print("SubList stored in ArrayList: " + NewList);
	}
}