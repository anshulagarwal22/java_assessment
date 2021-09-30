package hashset;

import java.util.HashSet;

public class HashsetisEmptyorNot {
	public static void main(String args[]) {
		HashSet<String> hash1 = new HashSet<String>();
		hash1.add("Himanshi");
		hash1.add("Komal");
		hash1.add("Jatin");
		if(hash1.isEmpty()) {
			System.out.println("Hash is empty");
		}
		else {
			System.out.println("Hash is not Empty");
		}
	}

}