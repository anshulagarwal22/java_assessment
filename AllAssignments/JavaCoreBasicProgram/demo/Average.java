package com.demo;
//Print the average of three numbers entered by user by creating a class 
//named 'Average' having a method to calculate and print the average.
import java.util.*;

class CalculateAverage{
	int avg;
	void calculate(int num1,int num2,int num3) {
		avg=(num1+num2+num3)/3;		
	}
	int printAverage() {
		return avg;
	}
}
public class Average {
	@SuppressWarnings("resource")
	
	public static void main(String args[])	{
	
		Scanner sc =new Scanner(System.in);////Input from keyboard
		int num1,num2,num3;
		System.out.print("Enter first number ");
		num1=Integer.parseInt(sc.nextLine());// Input first number
		System.out.print("Enter second number ");
		num2=Integer.parseInt(sc.nextLine());// Input second number
		System.out.print("Enter third number ");
		num3=Integer.parseInt(sc.nextLine());// Input third number
		
		//Creating object of the class for passing the parameter
		CalculateAverage calculateAvg=new CalculateAverage();	
		calculateAvg.calculate(num1, num2, num3);
		int temp=calculateAvg.printAverage();
		System.out.println(temp);		
	}
}
