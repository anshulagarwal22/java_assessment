package com.demo;

//Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively 
//by creating a class named 'Rectangle' with a method named 'Area' which returns the area and length and breadth passed as parameters to its constructor.


class Rectangle{
	//Area of rectangle
	int area(int length,int breadth) {
		return length*breadth;
	}
	
}
public class RactangleArea {
	
	
	public static void main(String args[]) {
		// for side(4,5)
		Rectangle rectangle1=new Rectangle();
		int temp1=rectangle1.area(4,5);
		System.out.println("Area of rectangle for side 4 and 5 is "+temp1);
		
		
		//For side(5,8)
		Rectangle rectangle2=new Rectangle();
		int temp2=rectangle2.area(5,8);
		System.out.println("Area of rectangle for side 5 and 8 is "+temp2);
		
	}

}