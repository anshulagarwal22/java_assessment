package StringMethods;

public class EqualsIgnoreCase{
public static void main(String[] args) 
{
    String s1 = "Hello World";
    String s2 = "Anshul Agarwal";
     
    //1 - check two strings for same character sequence
    boolean A = s1.equalsIgnoreCase(s2);    //false
    System.out.println(A);
    //2
    A = s1.equalsIgnoreCase("Hello World");   //true
    System.out.println(A);
    //3
    A = s1.equalsIgnoreCase(null);                  //false
    System.out.println(A);
    //4 - case-insensitive
    A = s1.equalsIgnoreCase("HELLO WORLD");   //TRUE
    System.out.println(A);
}
}