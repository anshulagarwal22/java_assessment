package September9.MainPackage;

import September9.Addition.AdditionService;
import September9.Divison.*;
import September9.EvenOdd.*;
import September9.Multiplication.*;
import September9.Substraction.*;

public class MainPackage {
	public static void main(String args[]) {
		
		
		//Calling AdditionService class member by creating object of that class
		
		AdditionService addition=new AdditionService();
		int Sum=addition.calculateAddition(1, 4);
		System.out.println("Sum is : "+Sum);
		
		//Calling SubstractionService class member by creating object of that class
		
		SubstractionService substraction=new SubstractionService();
		int Sub=substraction.calculateSubstraction(8, 9);
		System.out.println("Substraction is : "+Sub);
		
		//Calling MultiplyService class member by creating object of that class
		
		MultiplicationService multiplication=new MultiplicationService();
		int Mul=multiplication.calculateMultiplication(5 ,2);
		System.out.println("Multiplication is : "+Mul);
		
		//Calling DivisionService class member by creating object of that class
		
		DivisionService division=new DivisionService();
		float Div=division.calculateDivision((float)12.0,(float)4.0);
		System.out.println("Division is : "+Div);
		
		
		//Calling EvenOdd class member by creating object of that class direct print
		
		EvenOddService EvenOdd1=new EvenOddService();
		EvenOdd1.getEvenOddNum(10);
	}

}
