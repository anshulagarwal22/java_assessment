package TreeSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class SizeofTreeSet {
	public static void main(String args[]) {
		NavigableSet<String> nav = new TreeSet<String>();
		nav.add("Red");
		nav.add("yellow");
		nav.add("black");
		nav.add("Grey");
		nav.add("Blue");
		System.out.println(nav.size()); //size of treeset
	}

}