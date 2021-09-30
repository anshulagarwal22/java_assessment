package SuperKeyword;

class Area{
	int  length , breadth;
	void setValueA(int l,int b) {
		length=l;
		breadth=b;
	}
	void Show() {
		System.out.println("Area : "+(length+breadth));
	}
}

class Perimeter extends Area{
	int length1,Breadth1;
	void setValueB(int l,int b) {
		length1=l;
		Breadth1=b;
	}
	void Show() {
		super.Show();// we can call parent class method
		System.out.println("Perimeter : "+(2*(length+breadth)));
	}
}

public class Super {
	public static void main(String args[]) {
		 Perimeter p=new Perimeter();
		p.setValueA(10, 70);
		
		p.setValueB(80,5);
		p.Show();
		
		
	}

}
