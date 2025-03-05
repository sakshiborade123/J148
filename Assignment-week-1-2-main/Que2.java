//Find Compound interest

import java.util.Scanner;

public class Que2 {

    public static void CompoundInterest(int time,float rate,double principle,double n){
        double A=0;
        A=principle*Math.pow(1+(rate/n),(n*time));
        System.out.println(A);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Time: ");
        int time=sc.nextInt();
        System.out.println("Enter Rate : ");
        float rate=sc.nextFloat();
        System.out.println("Enter The Princile :");
        double principle=sc.nextDouble();
        System.out.println("Enter value of N(Number of time that interest is coumpounded: )");
        int n=sc.nextInt();
        CompoundInterest(time, rate, principle,n);

        sc.close();
    }
    
}
