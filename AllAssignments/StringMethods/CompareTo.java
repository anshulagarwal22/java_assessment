package StringMethods;

public class CompareTo {
	public static void main(String[] args) {

		String val1 = "Hello World";
		String val2 = "Hello User";
		String val3 = "How are you?";
		String val4 = "What are you doing?";
				
		System.out.println("Compare val1 and val2  : "+val1.compareTo(val2)); 
		System.out.println("Compare val2 and val3  : "+val2.compareTo(val3)); 
		System.out.println("Compare val3 and val4  : "+val3.compareTo(val4)); 
	}
}