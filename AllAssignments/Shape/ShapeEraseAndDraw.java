package September7.Shape;



class Shape1{
	void draw() {
		System.out.println("Drawing");
	}
	void erase() {
		System.out.println("Erase");
	}
}

class circle1 extends Shape1 {
	void draw() {
		System.out.println("Draw Class for circle :");
	}
	void erase() {
		System.out.println("Erase Class For Circle");
	}
	
}
class triangle1 extends Shape1{
	void draw() {
		System.out.println("Draw Class for triangle :");
	}
	void erase() {
		System.out.println("Erase Class For triangle");
	}
}
class square1 extends Shape1{
		void draw() {
			System.out.println("Draw Class for sqaure :");
		}
		void erase() {
			System.out.println("Erase Class For square");
		}
	}

public class ShapeEraseAndDraw{
	public static void main(String arg[]){
		Shape1 s = new triangle1();
		s.draw();
		s.erase();
		
		s= new circle1();
		s.draw();
		s.erase();
		s=new square1();
		s.draw();
		s.erase();
		
	}
}