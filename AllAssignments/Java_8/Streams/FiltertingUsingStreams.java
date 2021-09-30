package Streams;

import java.util.ArrayList;
import java.util.List;

class Students {
	int rollno;
	String name;

	public Students(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
}

public class FiltertingUsingStreams {
	public static void main(String args[]) {
		List<Students> list = new ArrayList<Students>();
	
		list.add(new Students(1, "Anshul"));
		list.add(new Students(2, "raju"));
		list.add(new Students(3, "daredevil"));
		list.add(new Students(3, "deadpool"));
		list.add(new Students(2, "ravi"));


		list.stream().filter(x -> x.rollno > 3).map(x1 -> x1.rollno).forEach(System.out::println);
	}

}