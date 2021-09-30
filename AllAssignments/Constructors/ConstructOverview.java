package Constructors;




public class ConstructOverview {
	
	ConstructOverview() {                     //  ZERO ARGUMENT CONSTRUCTOR
		
		int radius=3;
		
		
		float areaofCircle = ((radius)*(radius))*(float)Math.PI;
		
		System.out.println("AREA OF CIRCLE IS : " +areaofCircle);
	}
	
	
	ConstructOverview(int side) {                   //PARAMETERIZED CONSTRUCTOR
		
	int areaofSquare= side*side;
		
		System.out.println("Perimeter of square is  " +areaofSquare);
	}

	
	ConstructOverview(int base, int height) {                     // METHOD OVERLOADING
		
		int areaofTriangle= base+height;
		
		System.out.println("Perimeter of Triangle is  " +areaofTriangle);
	}
	
	
	public static void main(String args[]) {
		
		ConstructOverview c1= new ConstructOverview();
		ConstructOverview c2= new ConstructOverview(4);
		ConstructOverview c3= new ConstructOverview(3,5);
	}
}