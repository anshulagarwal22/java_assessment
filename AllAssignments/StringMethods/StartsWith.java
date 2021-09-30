package StringMethods;

public class StartsWith {
    public static void main(String[] args) {
        String s = "hello";
       
        System.out.println("StartsWith character 'll': " + s.startsWith("ll"));
        System.out.println("StartsWith character 'el': " + s.startsWith("el"));
        System.out.println("StartsWith character 'hel': " + s.startsWith("hel"));
    }
}