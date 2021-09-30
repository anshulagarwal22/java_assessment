package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class ListLinkDemo {
	
	public static void main(String args[]) {
		
		LinkedList<String> arrlist2=new LinkedList<String>();
		arrlist2.add("Raju");
		arrlist2.add("Farhan");
		arrlist2.add("Rancho");
		arrlist2.add("Anshul");
		arrlist2.add("Ram");
		
		Iterator itr=arrlist2.iterator();
		
		while(itr.hasNext()) {
			System.out.println("List is : "+itr.next());
		}
	}

}