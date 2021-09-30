package hashset;

import java.util.HashSet;

public class NumberofElementsinHashSet {
	public static void main(String args[]) {
		HashSet<String> hash1 = new HashSet<String>();
		hash1.add("Red");
		hash1.add("Blue");
		hash1.add("Yellow");
		hash1.add("White");
		hash1.add("Black");
		System.out.println("Size of HashSet is : "+hash1.size());
	}
}