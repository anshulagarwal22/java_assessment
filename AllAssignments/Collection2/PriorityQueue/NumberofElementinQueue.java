package PriorityQueue;

import java.util.PriorityQueue;

public class NumberofElementinQueue {
	public static void main(String args[]) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Red");
		queue.add("Black");
		queue.add("Orange");
		queue.add("White");
		System.out.println("Elements of 1st Queue :"+queue);
		
		System.out.println(queue.size());
		
		
	}
}