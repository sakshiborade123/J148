import java.util.LinkedHashSet;

public class que15{
    public static void UniqueChar(String str) {
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();

        // Adding unique characters to the set
        for (char c : str.toCharArray()) {
            uniqueChars.add(c);
        }

        // Printing unique characters
        System.out.print("Unique characters in the string: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {
        String str = "Hello";
        UniqueChar(str);
    }
}
