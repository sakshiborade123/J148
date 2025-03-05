import java.util.Arrays; // Importing Arrays class for sorting

public class que4 {

    // Built-in method using Arrays.sort()
    public static String sortString(String str) {  
        char[] arr = str.toCharArray();  // Convert the string into a character array
        Arrays.sort(arr);  // Sort the character array in alphabetical order
        return new String(arr);  // Convert the sorted character array back into a string
    }  

    // Manual sorting method (Bubble Sort) for String
    public static String sortArray(String str) {
        char[] arr = new char[str.length()];
        
        
        
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        
        
        
        return sortArray(arr);  
        
    }

    
    
    public static String sortArray(char[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {  
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Convert sorted character array back to string using StringBuilder
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            sb.append(c);
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {  
        
        String testStr = "hello";

        System.out.println("Built-in sort: " + sortString(testStr)); 
        System.out.println("Manual sort (Bubble sort): " + sortArray(testStr)); 
        
    }  
}
