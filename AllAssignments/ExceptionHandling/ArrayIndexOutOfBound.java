//Write a program that takes as input the size of the array and the elements in the array. 
//The program then asks the user to enter a particular index and prints the element at that index. 
//This program may generate Array Index Out Of Bounds Exception. Use exception handling mechanisms 
//to handle this exception. In the catch block, print the class name of the exception thrown.

package September9.ExceptionHandling;

import java.util.Scanner;

public class ArrayIndexOutOfBound {
	
	@SuppressWarnings("resource")
	
	public static void main(String args[]) {
		int n ;
				
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter size of the array : ");
		n=sc.nextInt();
		
		int arr[]=new int[n];
		
		// Taking input in the array
		System.out.println("\nEnter the elements which you want insert in array : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
				
		try {
			int a;
			System.out.println("Enter the index of the element you want to access : ");
			a=sc.nextInt();	
			System.out.println("The element at index "+a+" in array["+a+"]: "+arr[a]);
		    System.out.println("The element is found in array");
		    
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Entered index is not correct "+e);
		}
	}

}