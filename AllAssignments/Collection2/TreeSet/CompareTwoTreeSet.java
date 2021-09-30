package TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class CompareTwoTreeSet {
	public static void main(String args[]) {
		NavigableSet<String> nav = new TreeSet<String>();
		nav.add("Red");
		nav.add("yellow");
		nav.add("black");
		nav.add("Grey");
		nav.add("Blue");
		System.out.println("Output of 1st Tree Set :"+nav);

		NavigableSet<String> nav1 = new TreeSet<String>();
		nav1.add("Red");
		nav1.add("yellow");
		nav1.add("black");
		nav1.add("Grey");
		nav1.add("Blue");
		System.out.println("Output of 2nd Tree Set :"+nav1);

		System.out.println(nav.equals(nav1)); //Comparing

		NavigableSet<String> nav3 = new TreeSet<String>();
		nav3.add("Red");
		nav3.add("yellow");
		nav3.add("black");
		nav3.add("Grey");
		System.out.println("Output of 3rd Tree Set :"+nav3);

		System.out.println(nav3.equals(nav1)); //Comparing



	}
	}

