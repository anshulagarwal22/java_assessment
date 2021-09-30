package com.demo;

import java.util.Scanner;

//Write a program to print the area of a rectangle 
//by creating a class named 'Area' taking the values of its length and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area of the rectangle.
//Length and breadth of rectangle are entered through keyboard.

	

	class RectangleArea{
		int returnArea(int length,int breadth) {
			return length*breadth;
		} 
	}
	public class Rectangle1 {
		@SuppressWarnings("resource")
		
		public static void main(String args[])	{
			
			Scanner sc=new Scanner(System.in);/// input value from keyboard
			int length,breadth;
			System.out.print("Please Enter length of rectangle ");
		    length=Integer.parseInt(sc.nextLine());
		    System.out.print("Please Enter breadth of rectangle ");
		    breadth=Integer.parseInt(sc.nextLine());
		    
		    //Creating object of class
		    RectangleArea rectangleArea=new RectangleArea();
		    int temp1=rectangleArea.returnArea(length, breadth);
		    System.out.println("Area of rectangle "+temp1);
			
		}

	}
