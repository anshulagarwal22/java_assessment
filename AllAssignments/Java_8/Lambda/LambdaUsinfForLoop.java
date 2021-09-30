package Lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaUsinfForLoop {
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("Himanshi");
		list.add("Komal");
		list.add("Jatin");
		list.forEach((n) -> System.out.println(n));
		
	}

}