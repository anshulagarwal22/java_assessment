package Lambda;

interface Addition{
	int add(int a,int b,int c);
}

public class LambdawithArguments {
	public static void main(String args[]) {
		Addition ab = (a,b,c) -> (a+b+c);
		System.out.println(ab.add(5, 70, 40));
	}

}