package September8;
abstract class A{
	abstract void show();
}
	class Base extends A{
		void show() {
		System.out.println(" I am Base  ");
	}
	}
public class Abstract {
	public static void main(String arg[]) {
		Base b = new Base();
		b.show();
}

}