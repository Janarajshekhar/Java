
public class final4 {
    public static void main(String[] args) {
        String str1 = "Hello";
        System.out.println("Original String: " + str1);
        
        str1.concat(" World");

        System.out.println("After concat (no assignment): " + str1);

        String str2 = str1.concat(" World");
        System.out.println("After concat (with assignment): " + str2);
    }
}
