package September7.Shape;

public abstract class ThreeDimentionalShape extends Shape {

	ThreeDimentionalShape(float dimension1) {
		super(dimension1);
	}
	ThreeDimentionalShape(float length,float width,float height) {
		super(length,width,height);
	}
	abstract void getArea();
	abstract void getVolume();
	
}

//Class for Sphere
class Sphere extends ThreeDimentionalShape{
	Sphere(float radius){
		super(radius);
	}
	void getArea() {
		float areaofsphere=(4*((float)Math.PI)*getDimention1()*getDimention1());
		System.out.println("Area of sphare : "+areaofsphere);
	}
	void getVolume() {
		float sphereVolume=(((float)4.0/(float)3.0)*((float)Math.PI)*getDimention1()*getDimention1()*getDimention1());
		System.out.println("Volume of sphare : "+sphereVolume);
	}
}

// Class for cube
class Cube extends ThreeDimentionalShape{
	Cube(float side){
		super(side);
	}
	void getArea() {
		float areaofcube=(6*getDimention1()*getDimention1());
		System.out.println("Area of cube : "+areaofcube);
	}
	void getVolume() {
		float cubeVolume=(getDimention1()*getDimention1()*getDimention1());
		System.out.println("Volume of cube : "+cubeVolume);
	}
}

//Class for Cuboid
class Cuboid extends ThreeDimentionalShape{
	float length;
	float width;
	float height;
	Cuboid(float length,float width,float height){
		super(length,width,height);
	}
	void getArea() {
		
		this.length=getDimention1();
		this.width=getDimention2();
		this.height=getDimention3();
		float areaofcuboid=(2*((length*width)+(width*height)+(length*height)));
		System.out.println("Area of cuboid : "+areaofcuboid);
	}
	void getVolume() {
		float cuboidVolume=(getDimention1()*getDimention2()*getDimention3());
		System.out.println("Volume of cuboid : "+cuboidVolume);
	}
}
