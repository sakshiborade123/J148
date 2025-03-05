public class que16 {
    public static void main(String[] args) {
        // Creating a string
        String str = "Hello";
        
        // Trying to modify the string
        str.concat(" World"); // This creates a new string but doesn't change the original one

        // Printing the original string
        System.out.println("Original String: " + str); // Still prints "Hello"

        // Assigning the modified string to a new reference
        String newStr = str.concat(" World");
        System.out.println("New String after modification: " + newStr);
    }
}
