package hashset;

import java.util.HashSet;

public class CloningHashsetintoAnother {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		HashSet<String> hash1 = new HashSet<String>();
		hash1.add("Red");
		hash1.add("Blue");
		hash1.add("Yellow");
		hash1.add("White");
		hash1.add("Black");
		System.out.println(hash1);
		
		//New HashSet
		HashSet<String> hash2 = new HashSet<String>();
		hash2 = (HashSet<String>) hash1.clone();
		System.out.println(hash2);
	}
	

}