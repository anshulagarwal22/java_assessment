package com.demo;

//Write a program to print the area of a rectangle
//by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and
//the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.

import java.util.Scanner;
class Area {
	int length,breadth;
	//For set the dim
	void setDim(int l,int b)	{
		length=l;
		breadth=b;
	}
	
	//For calculating the area of rectangle
	int getArea() {
		return length*breadth;
	} 
	
}
public class RactKeyboard {
   public static void main(String args[])
   {
	   @SuppressWarnings("resource")
	   
	   
	Scanner sc = new Scanner(System.in);//////// input value from user
	   int length,breadth;
	   
	   System.out.print("Please Enter length of rectangle ");
	   length=Integer.parseInt(sc.nextLine());
	   System.out.print("Please Enter breadth of rectangle ");
	   breadth=Integer.parseInt(sc.nextLine());
	   //Creating object
	   Area area=new Area();
	   area.setDim(length, breadth);
	   int temp1=area.getArea();
	   System.out.println("Area of rectangle is "+temp1);
	   
	   
   }
}