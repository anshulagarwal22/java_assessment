package hashset;
import java.util.HashSet;
import java.util.Iterator;

public class IterateAllElemets {
	public static void main(String args[]) {
		HashSet<String> hash1 = new HashSet<String>();
		hash1.add("Himanshi");
		hash1.add("Komal");
		hash1.add("Jatin");
		Iterator<String> iterator = hash1.iterator();
		while(iterator.hasNext()) {
			System.out.println("Elements are "+iterator.next());
			
		}
		
	}

}