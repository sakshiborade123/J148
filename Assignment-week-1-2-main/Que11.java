import java.util.*;
//Calculate mod without using % operator
public class Que11 {

   
    
    
        // Method to calculate modulus without using % operator (using subtraction)
        public static int modUsingSubtraction(int number, int divisor) {
            while (number >= divisor) {
                number -= divisor;
            }
            return number;
        }
    
        // Method to calculate modulus without using % operator (using division)
        public static int modUsingDivision(int number, int divisor) {
            int quotient = number / divisor;  // Get the quotient (integer part)
            int product = quotient * divisor; // Multiply the quotient by the divisor
            return number - product;          // The remainder is the difference
        }
    
        public static void main(String[] args) {
            int number = 17;
            int divisor = 5;
    
            // Using subtraction method
            int resultSubtraction = modUsingSubtraction(number, divisor);
            System.out.println("Modulus using subtraction: " + resultSubtraction);  // Expected: 2
    
            // Using division method
            int resultDivision = modUsingDivision(number, divisor);
            System.out.println("Modulus using division: " + resultDivision);  // Expected: 2
        }
    }
    