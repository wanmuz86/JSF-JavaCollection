package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// Create an ArrayList and LinkedList
		// List Interface
		// ArrayList - Class
		// LinkedList - Class
		// Inside documentation <E> - Generics ..
		
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		
		// Add an element to the ArrayList and LinkedList using add
		// Collection interface
		
		arrayList.add("apple");
		arrayList.add("banana");
		arrayList.add("cherry");
		arrayList.add("date");
		arrayList.add("elderberry");
		
		
		linkedList.add("apple");
		linkedList.add("banana");
		linkedList.add("cherry");
		linkedList.add("date");
		linkedList.add("elderberry");
		
		
		System.out.println("ArrayList: "+arrayList);
		System.out.println("LinkedList: "+linkedList);
		
		
		// get method  (List interface)
		
		String getThirdElementFromArrayList = arrayList.get(2);
		System.out.println("ArrayList : "+getThirdElementFromArrayList);
		
		
		String getThirdElementFromLinkedList = linkedList.get(2);
		System.out.println("LinkedList : "+getThirdElementFromLinkedList);
		
		
		// set method (List interface)
		// Change the value of a given index
		
		arrayList.set(2, "citrus");
		linkedList.set(2, "citrus");
		
		System.out.println("ArrayList: "+arrayList);
		System.out.println("LinkedList: "+linkedList);
		
		
		System.out.println("Arraylist elements: ");
		
		for (String fruit: arrayList) {
			System.out.println(fruit);
		}
		
	
		Iterator<String> iterator = linkedList.iterator();
		
		// As long as there is an item
		// Selagi ada item
		
		while(iterator.hasNext()) {
			// show it
			// tunjukkan item
			System.out.println(iterator.next());
		}
		
		List<Integer> arrayListNumber = new ArrayList<>();
		List<Integer> linkedListNumber = new LinkedList<>();
		
		long startTime = System.nanoTime();
		for (int i= 0; i < 10000;i++ ) {
			arrayListNumber.add(i);
		}
		long endTime = System.nanoTime();
		
		System.out.println("Time taken to add 10,000 elements to ArrayList: "+
		(endTime - startTime) + " ns");
	
		long startTime2 = System.nanoTime();
		
		for (int i = 0; i < 10000; i++) {
			linkedListNumber.add(i);
		}
		
		long endTime2 = System.nanoTime();
		
		System.out.println("Time taken to add 10,000 elements to LinkedList: "+
		(endTime2 - startTime2) + " ns");
		
		
		

		
	
	}
	
}
