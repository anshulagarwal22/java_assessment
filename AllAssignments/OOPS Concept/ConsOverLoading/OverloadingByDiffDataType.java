package September8.ConsOverLoading;

public class OverloadingByDiffDataType {
	
    OverloadingByDiffDataType(int n1,int n2) {
		System.out.println("Sum of two integer number : "+(n1+n2));
	}
	
    OverloadingByDiffDataType(float n1,float n2) {
    	System.out.println("Sub of two float number : "+(n1-n2));
	}
    OverloadingByDiffDataType(double n1,double n2) {
		System.out.println("mul of two double number : "+(n1*n2));
	}
    OverloadingByDiffDataType(String s) {
		System.out.println("String is : "+s);
	}
    
    public static void main(String args[]) {
    	OverloadingByDiffDataType  a1=new OverloadingByDiffDataType(8, 3);
    	OverloadingByDiffDataType  a2=new OverloadingByDiffDataType((float)5.5,(float)8.9);
    	OverloadingByDiffDataType  a3=new OverloadingByDiffDataType(60.0, 80.00);
    	OverloadingByDiffDataType  a4=new OverloadingByDiffDataType("hi");
    }

}