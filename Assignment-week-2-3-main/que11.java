import java.util.*;
//Replace all Digits with character


public class que11 {
    public static void main(String[] args) {
        String input = "Hello123World456";
        
        // Replace all digits with the character '#'
        String output = input.replaceAll("[0-9]", "#");
        
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + output);
    }
}

