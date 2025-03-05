import java.util.*;

//Swap two Numbers
public class Que4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Fist Number: ");
        int n=sc.nextInt();
        System.out.println("Enter Secount Number : ");
        int m=sc.nextInt();

        System.out.println("First Number "+n);
        System.out.println("Secount Number "+m);

        // int temp=n;
        // n=m;
        // m=temp;

        n=m+n;
        m=n-m;
        n=n-m;


        System.out.println("First Number "+n);
        System.out.println("Secount Number "+m);

        
    }
    
}
