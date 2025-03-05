// import java.util.*;
//find square root without Squareroot method


public class Que13 {
    public static void Squareroot(int n){
        double squareeoot=Math.sqrt(n);
        System.out.println(squareeoot);
    }
    public static void Squareroot1(double n){
        float sq=(float)Math.pow(n,1/2);
        System.out.println(sq);
    }
    public static void main(String[] args) {
        Squareroot(10);
        Squareroot1(10);
        
    }
    
}
