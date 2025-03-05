import java.util.*;

public class Factorial{

public static int Factorial1(int n){
    int fact=1;
    for(int i=n;i>0;i--){
        fact=fact*i;

    }
return fact;
}
public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter Number : ");
    int n=Sc.nextInt();
    System.out.println( Factorial1(n));
   

}
}