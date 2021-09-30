package StringMethods;

public class ReplaceAll {
	   public static void main(String args[]) {
	         
	
	      String Str = new String("Hello This is anshul ");
	        
	      System.out.print(" String is : " );
	      System.out.println(Str);
	        
	      // Using replaceAll 
	      System.out.print("After replacing All : " );
	      System.out.println(Str.replaceAll("(.*)is(.*)", "Hello World"));
	      
	   }
	}