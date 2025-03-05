import java.util.*;

public class Que16{
    public static void ArrayinputSum(int n){
        int arr[]=new int[n];
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the Array element ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int j=0;j<n;j++){
            sum+=arr[j];
        }

        System.out.println("Sum of Array: "+sum);



    }
    public static void main(String[] args) {
        ArrayinputSum(5);
        
    }

}