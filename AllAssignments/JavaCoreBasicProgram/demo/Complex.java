package com.demo;
//Print the sum, difference and product of two complex numbers 
//by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered 
//by user.


import java.util.*;

class Comp{
  int real;
  int imag;
  public Comp(int r, int i){
    real = r;
    imag = i;
  }

  public static Comp add(Comp a, Comp b){
    return new Comp((a.real+b.real),(a.imag+b.imag));
  }

  public static Comp diff(Comp a, Comp b){
    return new Comp((a.real-b.real),(a.imag-b.imag));
  }

  public static Comp product(Comp a, Comp b){
    return new Comp(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
  }

  public void printComp(){
    if(real == 0 && imag!=0){
      System.out.println(imag+"i");
    }
    else if(imag == 0 && real!=0){
      System.out.println(real);
    }
    else{
      System.out.println(real+"+"+imag+"i");
    }
  }

}

class Complex{
  @SuppressWarnings("resource")
public static void main(String[] args){

		Scanner sc =new Scanner(System.in);////Input from keyboard
		int num1,num2,num3,num4;
		System.out.print("Enter first real number ");
		num1=Integer.parseInt(sc.nextLine());// Input first real number
		System.out.print("Enter imaginary number ");
		num2=Integer.parseInt(sc.nextLine());// Input imaginary number
		System.out.print("Enter second real number ");
		num3=Integer.parseInt(sc.nextLine());// Input second real number
		System.out.print("Enter imaginary number ");
		num4=Integer.parseInt(sc.nextLine());// Input imaginary number
		
    Comp c = new Comp(num1,num2);
    Comp d = new Comp(num3,num4);

    Comp e = Comp.add(c,d);
    Comp f = Comp.diff(c,d);
    Comp g = Comp.product(c,d);
    e.printComp();
    f.printComp();
    g.printComp();
  }
}