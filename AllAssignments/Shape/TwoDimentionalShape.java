package September7.Shape;

public abstract class TwoDimentionalShape extends Shape {

	TwoDimentionalShape(float side1){
		super(side1);
	}
    TwoDimentionalShape(float side1,float side2) {
		super(side1,side2);
	}
	abstract void getArea();
}


/// class for Triangle
class Triangle extends TwoDimentionalShape {
	float areaoftriangle;
	Triangle(float base,float height) {
		super(base,height);		
	}
	
	// For calculating area of triangle
	void getArea() {
		areaoftriangle=(((float)0.5)*(getDimention1()*getDimention2()));
		System.out.println("Area of triangle : "+areaoftriangle);
	}
}


/// class for Square

class Square extends TwoDimentionalShape{
	float areaofsquare;
	Square(float side){
		super(side);
	}
	// for calculating the area	
	void getArea() {
		areaofsquare=getDimention1()*getDimention1();
		System.out.println("Area of Square : "+areaofsquare);
	}

}


/// class for Circle

class Circle extends TwoDimentionalShape {
    float areaofcircle;
	Circle(float radius){
		super(radius);
	}
	
	//For circle area
	
	void getArea()	{
		areaofcircle=getDimention1()*getDimention1()*(float)Math.PI;
		System.out.println("Area of circle : "+areaofcircle);
	}
}
