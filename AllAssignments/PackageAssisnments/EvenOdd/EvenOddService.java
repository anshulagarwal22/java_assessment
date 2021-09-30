package September9.EvenOdd;
public class EvenOddService {
	
	public int getEvenOdd(int num) {
		int a=0;
		if(num%2==0) {
			a=1;
		}
		else {
			a=0;
		}
		return a;
	}
	
	//For printing
	public void getEvenOddNum(int num) {
		
		if(num%2==0) {
			System.out.println("The given number "+num+" is even ");
		}
		else {
			System.out.println("The given number "+num+" is odd ");
		}
	}

}