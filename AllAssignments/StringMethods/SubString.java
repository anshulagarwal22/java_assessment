package StringMethods;

public class SubString {
	


public static void main(String[] args) {
String s = "This is anshul agarwal";
String subs = "";

// prints the substring after index 8 till index 17
subs = s.substring(5, 14);
System.out.println("substring = " + subs);

// prints the substring after index 0 till index 8
subs = s.substring(0, 7);
System.out.println("substring = " + subs);
}


}
