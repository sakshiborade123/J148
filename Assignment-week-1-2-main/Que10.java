import java.util.*;

public class Que10 {

    // Recursive method to calculate Fibonacci numbers and store them in the array
    public static void fibonaceusingRec(int n, int first, int second, int i, int[] feb) {
        if (i < n) {
            int next = first + second;
            // feb[i] = next;
            System.out.print(next + " ");
            fibonaceusingRec(n, second, next, i + 1, feb);  // Recursive call for the next Fibonacci number
        }
    }

    // Method to print Fibonacci series and store it in the array
    public static void fibonaceSeries(int n) {
        int[] feb = new int[n];  // Array to store Fibonacci numbers
        int first = 0;
        int second = 1;
        
        // Handle the first number separately
        if (n > 0) {
            feb[0] = first;
            System.out.print(first + " ");
        }
        
        // Handle the second number if n > 1
        if (n > 1) {
            feb[1] = second;
            System.out.print(second + " ");
        }

        // Calculate the rest of the Fibonacci numbers iteratively
        int next = first + second;
        for (int i = 2; i < n; i++) {
            feb[i] = next;
            System.out.print(next + " ");
            first = second;
            second = next;
            next = first + second;
        }
        
        // Print the Fibonacci array (optional if you want the stored values as well)
        System.out.println("\nStored Fibonacci series in the array:");
        for (int i = 0; i < n; i++) {
            System.out.print(feb[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci series (Iterative approach):");
        fibonaceSeries(10);  // Prints the first 10 Fibonacci numbers

        System.out.println("\nFibonacci series (Recursive approach):");
        int n = 10;
        int[] feb = new int[n];
        feb[0] = 0;  // Starting point
        feb[1] = 1;  // Second number in Fibonacci series
        fibonaceusingRec(n, 0, 1, 2, feb);  // Print the Fibonacci series recursively
    }
}
