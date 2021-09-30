package Lambda;

interface Odd {
	boolean isodd(int a);
}

public class LambdaisOddorEven {
	public static void main(String args[]) {
		Odd o = (a) -> (a % 2 != 0);
		System.out.println(o.isodd(8));
	};
}