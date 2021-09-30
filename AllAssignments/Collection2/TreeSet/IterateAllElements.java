package TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class IterateAllElements {
	public static void main(String args[]) {
		NavigableSet<String> nav = new TreeSet<String>();
		nav.add("Red");
		nav.add("yellow");
		nav.add("black");
		System.out.println("Colors of tree are : "+nav);

		for(String temp : nav) {
			System.out.println("Elements of Tree Set are :"+temp);
		}
	}

}