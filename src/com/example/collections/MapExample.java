package com.example.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
	
		Map<String, Integer> hashMap = new HashMap<>();
		Map<String, Integer> treeMap = new TreeMap<>();
		
		// Add key value pair using put (Map interface)
		
		hashMap.put("apple", 1);
		hashMap.put("banana", 2);
		hashMap.put("cherry",3);
		hashMap.put("date", 4);
		hashMap.put("ananas",0);
		

		
		treeMap.put("apple", 1);
		treeMap.put("banana",2);
		treeMap.put("cherry", 3);
		treeMap.put("date", 4);
		treeMap.put("ananas", 5);
		
		// Observation : Arrangement does not matter in HashMap
		// We are not accessing the Hashmap by index, but by key
		System.out.println("Hashmap: "+hashMap);
		
		// Observation : Treemap will be arranged based on key order
		// Using tree data structure
		System.out.println("Treemap: "+treeMap);
		
		
		int bananaValueHashMap = hashMap.get("banana");
		int bananaValueTreeMap = treeMap.get("banana");
		
		System.out.println(bananaValueHashMap);
		System.out.println(bananaValueTreeMap);
		
		// Put method to update item in the map
		hashMap.put("betik", 4);
		treeMap.put("betik", 4);
	
		
		
		System.out.println("Hashmap "+hashMap);
		System.out.println("Updated Tree map "+treeMap);
		
		
		// Iterate through the Map
		
		System.out.println("HashMap elements:");
		
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		System.out.println("HashMap elements with iterator:");
		Iterator<Map.Entry<String, Integer>> itr = hashMap.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			System.out.println("Key "+entry.getKey() + " = "+entry.getValue());
		}
		
		
		
		System.out.println("TreeMap elements:");
		
		for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " = "+entry.getValue());
		}
		
		// To verify if the key exists in the map
		
		boolean isCherryInHashMap = hashMap.containsKey("durian");
		boolean isCherryInTreeMap = treeMap.containsKey("cherry");
		
		System.out.println("Is 'durian' in HashMap? "+isCherryInHashMap);
		System.out.println("Is 'cherry' in TreeMap? " + isCherryInTreeMap);

	}

}
