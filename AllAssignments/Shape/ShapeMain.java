package September7.Shape;

public class ShapeMain {

	public static void main(String args[]) {
		
		
		//FOR TWO DIMENTIONAL SHAPES
		
		
		//Creating object for Square
		TwoDimentionalShape twoDimentionalShape=new Triangle((float)9,(float)7);
		twoDimentionalShape.getArea();
				
		
		//Creating object for Square
		TwoDimentionalShape twoDimentionalShape1=new Square((float)8);
		twoDimentionalShape1.getArea();
		

		//Creating object for circle
		TwoDimentionalShape twoDimentionalShape2=new Circle((float)8);
		twoDimentionalShape2.getArea();
		
		
		
		//FOR THREE DIMENTIONAL SHAPES
		
		
		//Creating object for SphereArea
		ThreeDimentionalShape threeDimentionalShap3=new Sphere((float)8);
		threeDimentionalShap3.getArea();
		
		
		//Creating object for SphereVolume
		ThreeDimentionalShape threeDimentionalShapV=new Sphere((float)8);
		threeDimentionalShapV.getVolume();
		
		
		
		//Creating object for Cube Area
		ThreeDimentionalShape threeDimentionalShapC=new Cube((float)3);
		threeDimentionalShapC.getArea();
		
		
		
		//Creating object for  Cube volume
		ThreeDimentionalShape threeDimentionalShapCV=new Cube((float)3);
		threeDimentionalShapCV.getVolume();
		
		
		//Creating object for Cuboid Area
		ThreeDimentionalShape Cuboid1=new Cuboid((float)3,(float)5,(float)2);
		Cuboid1.getArea();
		
		//Creating object for  Cuboid volume
		ThreeDimentionalShape Cuboid2=new Cuboid((float)3,(float)5,(float)2);
		Cuboid2.getVolume();
   }
	
}