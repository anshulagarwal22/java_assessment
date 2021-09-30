package com.demo;

//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units 
//by creating a class named 'Triangle' with constructor having the three sides as its parameters.

class Area2{
	
	
	//Perimeter 
		int perimeter(int s1,int s2,int s3)	{
			return (s1+s2+s3);
		}
		
		
	//Area
	 double area(double s1,double s2,double s3) {
		 double  sp=((s1+s2+s3)/2);
	        
	        double ar=(((sp*(sp-s1))*(sp-s2)*(sp-s3)));       
	        
	        double a=Math.sqrt(ar); 	
			return a;		
	
	
	
	}

}
public class TriangleConstruct {
	public static void main(String args[])	{

		Area2 A1=new Area2();
		double temp1=A1.area(3, 4, 5);
		System.out.println("Area of triangle is :"+temp1);
		
		
		
		Area2 A2=new Area2();
		int temp2=A2.perimeter(3, 4, 5);
		System.out.println("Perimeter of triangle is :S"+temp2);
		
		
	}

}