import java.util.Scanner;

public class que18 {
    public static String addBinaryStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        // Process each bit from right to left
        while (i >= 0 || j >= 0 || carry == 1) {
            int bit1 = (i >= 0) ? a.charAt(i) - '0' : 0; // Get bit from 'a', else 0
            int bit2 = (j >= 0) ? b.charAt(j) - '0' : 0; // Get bit from 'b', else 0

            int sum = bit1 + bit2 + carry;
            result.append(sum % 2); // Append the sum's last bit
            carry = sum / 2; // Compute carry for the next iteration

            i--; j--; // Move to the next bit
        }

        return result.reverse().toString(); // Reverse and return result
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking binary string inputs
        System.out.print("Enter first binary string: ");
        String binary1 = sc.next();
        System.out.print("Enter second binary string: ");
        String binary2 = sc.next();

        // Perform binary addition
        String result = addBinaryStrings(binary1, binary2);

        // Display result
        System.out.println("Sum of binary strings: " + result);

        sc.close();
    }
}
