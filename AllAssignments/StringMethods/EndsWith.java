package StringMethods;


public class EndsWith {
    public static void main(String[] args) {
        String s = "hello world This is ends with Example";
       
        System.out.println("EndsWith character 'e': " + s.endsWith("e"));
        System.out.println("EndsWith character 'ple': " + s.endsWith("ple"));
        System.out.println("EndsWith character 'Hello': " + s.endsWith("hello"));
    }
}