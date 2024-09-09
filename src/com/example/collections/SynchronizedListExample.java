package com.example.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SynchronizedListExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(4,3,2,1,5));
		List<Integer> synchronizedList = Collections.synchronizedList(list);
		
		
		Runnable task = () -> {
			// keyword synchronized - means only 1 thread can access sychronizedList
			// at one time
			synchronized (synchronizedList) {
				// iterate and show the item in the list
				for (int i = 0; i < synchronizedList.size(); i++) {
					System.out.println(Thread.currentThread().getName() + " -" 
							+ synchronizedList.get(i));
				}
			}
		};
		
		// Background process , 
		// I define task (Runnable task) 
		// Once the method start is called, the task will be executed 
		// (task) whatever is inside {}
		
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);
		
		
		thread1.start();
		thread2.start();
		
		

	}

}
