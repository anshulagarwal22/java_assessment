package com.demo;

public class ProgramOnAddSubMulAreaInterest {
	
	
	public static void main( String args[])
	{
	

    int a = 2 ;
    int b = 4 ;
					
    int add=a+b;              // addition of two int
   
    int sub=a-b;              // subtraction of two int

							
    float num1 = 6.1f ; 
    float num2 = 8.2f ;  
    float mul = num1 * num2 ;      //  multiplication of two float


    float A= num1 ; 
    float AreaOfSquare = A * A ;   					// area of square 


				
    float p = 40.8f ; 
    float r = num1 ; 
    float t = num2 ; 
    float SimpleInterest = ( p * r * t ) / 100 ;     // simple interest 

				 

    float B = num1 ;
    float H = num2 ; 
    float AreaOfTriangle = ( B * H ) / 2 ;            // area of triangle
				



    	//outputs
    System.out.println ( " Addition of two int is " + add ) ; 
    System.out.println ( " Subtraction of two int is " + sub ) ; 
    System.out.println ( " Multiplication of two float is " + mul ) ; 
    System.out.println ( " Area of Square " + AreaOfSquare ) ; 
    System.out.println ( " Simple Interest is " + SimpleInterest ) ; 
    System.out.println ( " Area of Triangle " + AreaOfTriangle ) ;
		
		
		
		}
	}
