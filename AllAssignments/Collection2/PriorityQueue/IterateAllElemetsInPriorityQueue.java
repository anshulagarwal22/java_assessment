package PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class IterateAllElemetsInPriorityQueue {
	public static void main(String args[]) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Red");
		queue.add("Black");
		queue.add("Orange");
		queue.add("White");

		Iterator its = queue.iterator();
		while (its.hasNext()) {
			System.out.println("Iteration Of Priority Queue : " + its.next());
		}

	}

}