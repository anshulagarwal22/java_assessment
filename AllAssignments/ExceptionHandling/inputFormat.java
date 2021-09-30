//Handle exception in number Problem statement: Get the input String from user and parse it to integer, 
//if it is not a number it will throw number format exception Catch it and print 
//"Entered input is not a valid format for an integer." or else print the square of that number. 

package September9.ExceptionHandling;
import java.util.Scanner;

public class inputFormat {

	public static void main(String args[]) {
		String n;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer : ");
		try {
			n=sc.next();
			int i=Integer.parseInt(n);
			System.out.println("The Square of number is : "+i*i);
					
		}
		catch(NumberFormatException e) {
			System.out.println("Entered input is not a valid format for an integer");
		}
	}
}