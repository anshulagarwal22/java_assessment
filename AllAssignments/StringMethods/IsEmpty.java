package StringMethods;


public  class IsEmpty {
    public static void main(String args[])
    {
        // non-empty string
        String str1 = "Hello_World";
  
        // empty string
        String str2 = "";
  
        // prints false
        System.out.println(str1.isEmpty());
  
        // prints true
        System.out.println(str2.isEmpty());
    }
}