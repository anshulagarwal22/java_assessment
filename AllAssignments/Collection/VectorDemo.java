package Collection;

import java.util.List;
import java.util.Vector;

//Vector is synchronized
// Java vector contains many legacy methods that are not the part of a collections framework.
public class VectorDemo {
	
	public static void main(String args[]) {
		
		List<String> vect=new Vector<String>();
		vect.add("Raju");
		vect.add("Farhan");
		vect.add("Rancho");
		vect.add("Anshul");
		vect.add("Ram");
		
		
		System.out.println(vect);
	}

}