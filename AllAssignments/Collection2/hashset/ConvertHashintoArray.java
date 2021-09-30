package hashset;

import java.util.HashSet;

public class ConvertHashintoArray {
	public static void main(String args[]) {
		HashSet<String> hash1 = new HashSet<String>();
		hash1.add("Ravinder");
		hash1.add("Sachin");
		hash1.add("Arvind");
		hash1.add("Rahul");
		hash1.add("Ruchir");
		hash1.add("Alok");
		hash1.add("Vinod");
		System.out.println(hash1);
		String[] array = new String[hash1.size()];
		hash1.toArray(array);		
		for(String temp : array) {
			System.out.println("Elements are :"+temp);
		}
	}

}