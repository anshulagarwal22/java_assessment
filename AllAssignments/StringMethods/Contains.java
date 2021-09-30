package StringMethods;

public class Contains {
    public static void main(String[] args) {
        String str_Sample = "Hello World this is a contains Example";
        //Check if String contains a sequence
        System.out.println("Contains sequence 'llo': " + str_Sample.contains("llo"));
        System.out.println("Contains sequence 'Example': " + str_Sample.contains("Example"));
        //String contains method is case sensitive  
        System.out.println("Contains sequence 'example': " + str_Sample.contains("example"));
        System.out.println("Contains sequence 'is a': " + str_Sample.contains("is a"));
    }
}