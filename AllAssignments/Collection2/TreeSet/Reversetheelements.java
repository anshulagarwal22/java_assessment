package TreeSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Reversetheelements {
	public static void main(String args[]) {
		NavigableSet<String> nav = new TreeSet<String>();
		nav.add("Red");
		nav.add("yellow");
		nav.add("black");
		System.out.println("Colors of tree are : "+nav);
		Iterator iterator = nav.descendingIterator(); 
		while(iterator.hasNext()) {
			System.out.println("Reversed Order is :"+iterator.next() );
		}


	}

}