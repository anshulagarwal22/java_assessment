package StringMethods;

public class Equals {
	

	    public static void main(String[] args) 
	    {String s1 = "Hello World";
	    String s2 = "Anshul Agarwal";
	     
	    //1 - check two strings for same character sequence
	    boolean A = s1.equals(s2);    //false
	    System.out.println(A);
	    //2
	    A = s1.equals("Hello World");   //true
	    System.out.println(A);
	    //3
	    A = s1.equals(null);                  //false
	    System.out.println(A);
	    //4 - case-insensitive
	    A = s1.equals("HELLO WORLD");   //false
	    System.out.println(A);
	}

}
