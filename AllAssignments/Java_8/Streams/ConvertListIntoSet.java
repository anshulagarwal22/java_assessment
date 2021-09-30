package Streams;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;  

class Students1 {
	int rollno;
	String name;

	public Students1(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
}

public class ConvertListIntoSet {
	public static void main(String args[]) {
		List<Students1> list = new ArrayList<Students1>();
		list.add(new Students1(1, "Anshul"));
		list.add(new Students1(2, "raju"));
		list.add(new Students1(3, "daredevil"));
		list.add(new Students1(3, "deadpool"));
		list.add(new Students1(2, "ravi"));

		
		Set<Integer> set = list.stream()
				            .filter(x -> x.rollno > 1)
				            .map(x -> x.rollno)
				            .collect(Collectors.toSet());
		System.out.println(set);
	}
}