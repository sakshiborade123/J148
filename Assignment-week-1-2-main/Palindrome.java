// //Check a given Number is Palindrime or not 

// import java.util.Scanner;

// public class Que9 {
//     public static void Palindrom(String str) {
//         if(str.length()==1){
//             System.out.println(str);
//         }else if(str.length()>0){
//             for(int i=0;i<str.length();i++){
//                 if(str.charAt(i)!=str.charAt(str.length()-1-i)){
//                     System.out.println("String is  not palindrome ");
//                     return;
//                 }
//                 else{
//                     System.out.println("string is palindrome");
//                     return;
//                 }
//             }
//         }
        
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String str=sc.nextLine();
//         Palindrom(str);
        
//     }
// }


import java.util.Scanner;

public class Palindrome {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert the string to lowercase for case-insensitivity
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int start = 0;
        int end = str.length() - 1;
        
        // Check characters from both ends towards the center
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;  // If any characters do not match, it's not a palindrome
            }
            start++;
            end--;
        }
        
        return true;  // If all characters match, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string from the user
        System.out.println("Enter a string to check if it is a palindrome:");
        String input = scanner.nextLine();
        
        // Check if the input string is a palindrome
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        
        scanner.close();
    }
}
