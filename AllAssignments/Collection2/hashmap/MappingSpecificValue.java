package hashmap;

import java.util.HashMap;
import java.util.Map;

public class MappingSpecificValue {
	public static void main(String args[]) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"Yellow");
		map.put(2,"Green");
		map.put(3,"Grey");
		
		System.out.println(map);
		System.out.println(map.containsValue("Green"));
		System.out.println(map.containsValue("Blue"));
	}


}