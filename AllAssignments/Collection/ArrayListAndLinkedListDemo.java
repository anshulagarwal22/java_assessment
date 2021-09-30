package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAndLinkedListDemo {
	
	@SuppressWarnings("rawtypes")
	public static void main(String args[]) {
	   
		// merging of two arrays
		List<String> list1=new LinkedList<String>();
		
		list1.add("lucifer");
		list1.add("Amenadiel");
		
		ArrayList<String> arrlist2=new ArrayList<String>();
		arrlist2.add("Raju");
		arrlist2.add("Farhan");
		arrlist2.add("Rancho");
		arrlist2.add("Anshul");
		arrlist2.add("Ram");
		
		
		arrlist2.addAll(list1);
		
		Iterator itr=arrlist2.iterator();
		while(itr.hasNext()) {
			System.out.println("List is : "+itr.next());
		}
	}

}