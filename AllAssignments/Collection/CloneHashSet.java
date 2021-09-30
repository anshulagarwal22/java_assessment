package Collection;

//. Write a Java program to clone a hash set to another hash set. 

import java.util.HashSet;

public class CloneHashSet {
	
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		
		HashSet<String> hashset=new HashSet<String>();
		hashset.add("India");
		hashset.add("UK");
		hashset.add("Singapur");
		hashset.add("London");
		hashset.add("Sri Lanka");
		//Printing before clone
		System.out.println("Original hashset  : "+hashset);
		
		//clone HashSet
		HashSet<String> newHashSet=new HashSet<String>();
		newHashSet=(HashSet<String>)hashset.clone();
		System.out.println("Cloned hashset : "+newHashSet);
		
	}

}