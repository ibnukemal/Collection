package com.sqa.collections;
import java.util.TreeMap;


public class BelajarTreeMap {

	public static void main(String[] args) {
	
		TreeMap<String, String> domains = new TreeMap<>();
		
		domains.put("my", "Malaysia");
		domains.put("id", "Indonesia");
		domains.put("us", "Amerika Serikat");
		domains.put("uk", "Inggris");
		
		System.out.println(domains);
		System.out.println(domains.descendingMap());

	}

}
