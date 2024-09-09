package com.example.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
	Set<Integer> hashSet = new HashSet<Integer>();
	Set<Integer> treeSet = new TreeSet<Integer>();
	// The value in Set is going to be unique / duplicate will not exists
	/// Arrangement doesn't matter
	hashSet.add(34);
	hashSet.add(12);
	hashSet.add(45);
	hashSet.add(23);
	hashSet.add(34);
	hashSet.add(45);
	
	// Will be arranged based on Tree
	treeSet.add(34);
	treeSet.add(12);
	treeSet.add(45);
	treeSet.add(23);
	treeSet.add(34);
	treeSet.add(45);
	
	System.out.println("HashSet: "+hashSet);
	System.out.println("TreeSet: "+treeSet);
	
	
	boolean is12InTheHashSet = hashSet.contains(12);
	boolean is12InTheTreeSet = treeSet.contains(12);
	
	System.out.println("Is 12 present in HashSet? "+is12InTheHashSet);
	System.out.println("Is 12 present in TreeSet? "+is12InTheTreeSet);
	
	
	System.out.println("Iterating hashset with iterator");
	Iterator<Integer> it = hashSet.iterator();
	
	while(it.hasNext()) {
		System.out.println("Item in hashSet "+it.next());
	}
	
	System.out.println("Iterating treeset with for loop");
	
	for (Integer entry:treeSet) {
		System.out.println("Entry in treeset is "+entry);
	}
	
	
	
	}
	
	
	
	

}
