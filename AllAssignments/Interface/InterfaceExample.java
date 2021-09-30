package Interface;

interface Area{
	void displayArea();
}
interface Perimeter{
	void displayperimeter();
}

 class A1 implements Area,Perimeter{
    int length=5;
    int breadth=9;
	@Override
	public void displayArea() {
	
		System.out.println("Area : "+(length+breadth));
		
	}
	@Override
	public void displayperimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter : "+(2*(length+breadth)));
	}
	
}
public class InterfaceExample {
	public static void main(String args[]) {
		A1 a1=new A1();
		a1.displayArea();
		a1.displayperimeter();
	}

}