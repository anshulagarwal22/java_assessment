package PriorityQueue;

import java.util.PriorityQueue;

public class InsertGivenElementinPriorityQueue {
	public static void main(String args[]) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Red");
		queue.add("Black");
		queue.add("Orange");
		queue.add("White");
	
		System.out.println("Elements are : "+queue);
		
		//Adding a element in queue
		queue.offer("Yellow");
		queue.add("Green");
		
		System.out.println(queue);
		
	}
}