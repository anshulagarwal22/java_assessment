package hashset;

import java.util.HashSet;

public class EmptytheHashSet {
	public static void main(String args[]) {
		HashSet<String> hash1 = new HashSet<String>();
		hash1.add("Himanshi");
		hash1.add("Komal");
		hash1.add("Jatin");
		hash1.removeAll(hash1);
		System.out.println("Elements in HashSet are : "+hash1);
	}
}