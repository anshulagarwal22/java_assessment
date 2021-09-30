package September8.MethodOverLoading;



public class OverloadingByDiffDataType {
	
	void calculateSum(int n1,int n2) {
		System.out.println("Sum of two integer number : "+(n1+n2));
	}
	
    void calculateSub(float n1,float n2) {
    	System.out.println("Sub of two float number : "+(n1-n2));
	}
    
    void calculateMultiply(double n1,double n2) {
		System.out.println("mul of two double number : "+(n1*n2));
	}
    void calculateMultiply(float num1,float num2) {
    	System.out.println("Multiplication of two float number : "+(num1*num2));
	}
    
    void printstring(String s) {
		System.out.println("String is : "+s);
	}

    public static void main(String args[]) {
    	//Creating object for integer number
    	OverloadingByDiffDataType o=new OverloadingByDiffDataType();
    	o.calculateSum(7, 8);
    	o.calculateMultiply(98.00, 90.0);
    	o.calculateSub((float)90.0,(float)1.2);
      	o.printstring("hi");
    }
    
    
}