package com.example.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortShuffleList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,3,2,1,5);
		
		// Use Collection static class to sort the list in ascending order
		

		
		System.out.println("Sorted list: "+list);
		
		
		// Use Collection static class to shuffle the list
		Collections.shuffle(list);
		System.out.println("Shuffled list "+list);
		
		int min = Collections.min(list);
		int max = Collections.max(list);
		
		System.out.println("The smallest item is "+min);
		System.out.println("The largest item is "+max);
		

	}

}
