package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
	
	public static void main(String args[]) {
		
		List<String> cars=new ArrayList<String>();
		cars.add("BMW");
		cars.add("XUV");
		cars.add("Tesla");
		
		//For each loop
		for(String carlist:cars) {
			System.out.println("Car name : "+carlist);
		}
	}

}