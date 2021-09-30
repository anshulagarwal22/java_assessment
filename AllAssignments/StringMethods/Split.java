package StringMethods;
public class Split {

	   public static void main(String args[]) {
	      String Str = new String("Hello this is anshul");
	      System.out.println(Str);
	      System.out.println("After Spliting:" );      
	      
	      for (String s: Str.split(" ")) {
	         System.out.println(s);
	      }
	   }
	}