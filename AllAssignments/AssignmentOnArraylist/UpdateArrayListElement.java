package September13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Write a Java program to update specific array element by given element
public class UpdateArrayListElement {
	
	@SuppressWarnings("rawtypes")
	public static void main(String args[]) {
		
		List<String> updateArrayList=new ArrayList<String>();
		updateArrayList.add("Raju");
		updateArrayList.add("Farhan");
		updateArrayList.add("Rancho");
		updateArrayList.add("Anshul");
		updateArrayList.add("Ram");
		
		
		System.out.println("Before update the arraylist :");
		Iterator itr=updateArrayList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("After updating the arraylist :");
		updateArrayList.set(3, "Lucifer");
		Iterator itr1=updateArrayList.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}