package TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Sizeofelementlessthan7 {
	public static void main(String args[]) {
		NavigableSet<String> nav = new TreeSet<String>();
		nav.add("Red");
		nav.add("yellow");
		nav.add("black");
		nav.add("Grey");
		nav.add("Blue");


		int elemets = nav.size();

		if(elemets > 7) {
			System.out.println("Elements are more than 7 ");
		}
		else {
			System.out.println("Elements are Less than 7 ");
		}

	}

}