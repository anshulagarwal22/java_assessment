package Lambda;

interface Sum{
	String Add();
	
}

public class LambdawithAReturntype {
	public static void main(String args[]) {
		Sum s = () -> {
			return "This is a java Class";
		};
		System.out.println(s.Add());
		
	}

}