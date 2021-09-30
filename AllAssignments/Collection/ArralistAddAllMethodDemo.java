package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArralistAddAllMethodDemo {
	
	@SuppressWarnings("rawtypes")
	public static void main(String args[]) {
		
		//Merging of two arrays
		ArrayList<String> arrlist1=new ArrayList<String>();
		arrlist1.add("lucifer");
		arrlist1.add("Amenadiel");
		
		ArrayList<String> arrlist2=new ArrayList<String>();
		arrlist2.add("Raju");
		arrlist2.add("Farhan");
		arrlist2.add("Rancho");
		arrlist2.add("Anshul");
		arrlist2.add("Ram");
		
		arrlist2.addAll(arrlist1);
		
		Iterator itr=arrlist2.iterator();
		while(itr.hasNext()) {
			System.out.println("List is : "+itr.next());
		}
		
	}

}