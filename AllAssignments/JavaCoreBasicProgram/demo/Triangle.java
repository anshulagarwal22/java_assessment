package com.demo;

//Write a program to print the area and perimeter of a triangle 
//having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.
class  Area1{

	int perimeter()	{
		int s1=3;
		int s2=4;
		int s3=5;
   		return (s1+s2+s3);
	}
	
	double area() {
		double s1= 3.0;
		double s2= 4.0;
		double s3= 5.0;
		double  sp=((s1+s2+s3)/2);
        
        double ar=(((sp*(sp-s1))*(sp-s2)*(sp-s3)));       
        
        double a=Math.sqrt(ar); 	
		return a;		
	}
	
}

public class Triangle {
	public static void main(String args[]){
		
		Area1 A1=new Area1();
		Area1 A2=new Area1();
		double temp1=A1.area();
		System.out.println("Area of triangle is "+temp1);
		
		
		int temp2=A2.perimeter();
		System.out.println("Perimeter of triangle is "+temp2);
	
	}
}