package TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class SorttheElementinTreeMap {
	public static void main(String args[]) {
		TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>(new classa());
		map.put(3,12);
		map.put(9,9);
		map.put(1,98);
		map.put(2,45);
		
		
		System.out.println(map);		
	}
}

class classa implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

}