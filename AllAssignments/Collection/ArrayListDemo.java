package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	@SuppressWarnings("rawtypes")
	public static void main(String args[]) {
		
		ArrayList<String> arrList=new ArrayList<String>();
		arrList.add("Raju");
		arrList.add("Farhan");
		arrList.add("Rancho");
		arrList.add("Anshul");
		arrList.add("Ram");
		
		
		
		Iterator itr=arrList.iterator();
		while(itr.hasNext()) {
			
			System.out.println("List is : "+itr.next());
			
		}
	}

}