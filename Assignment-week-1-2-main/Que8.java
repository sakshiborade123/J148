import java.util.*;

public class Que8 {
    public static boolean isPrime(int num){
        if(num<0){
            return false;

        }
       for(int i=2;i<num;i++){
        if(num%i==0){
            return false;

        }
       }
        return true;
    }

    public static void PrintprimeNum1to100(){
        for(int i=2;i<100;i++){
            if(isPrime(i)){
                System.out.print(""+i+" ");
            }
        }
    }
    public static void PrintprimeNum1toN(int n){
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                System.out.print(""+i+" ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isPrime(3));
        PrintprimeNum1to100();
        System.out.println();
        PrintprimeNum1toN(50);
    }
    
}
