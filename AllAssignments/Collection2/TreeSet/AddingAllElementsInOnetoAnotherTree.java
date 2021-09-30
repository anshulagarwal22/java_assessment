package TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class AddingAllElementsInOnetoAnotherTree {
	public static void main(String args[]) {
		NavigableSet<String> nav = new TreeSet<String>();
		nav.add("Red");
		nav.add("yellow");
		nav.add("black");
		nav.add("Grey");
		nav.add("Blue");
		System.out.println("Output of 1st Tree Set :"+nav);

		NavigableSet<String> nav1 = new TreeSet<String>();
		nav1.add("Himanshi");
		nav1.add("Sunita");
		nav1.add("Komal");
		System.out.println("Output of 1st Tree Set :"+nav);

		nav.addAll(nav1);
		System.out.println("Elements of 1st Tree are : "+nav);


	}


}