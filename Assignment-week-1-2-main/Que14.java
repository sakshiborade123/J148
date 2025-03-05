//Armstrong Properties


import java.util.*;

public class Que14 {
    public static int countNum(int n){
        int count=0;
        if(n<0){
            return 0;
        }
        
        while (n>0) {
            count++;
            n=n/10;
            
        }

        return count;

    }
    public static boolean Armstrong(int n){
       
        double sum=0;
        double OriginalNum=n;
        int count=String.valueOf(n).length();
        while(n>0){
        int digit=n%10;
        sum+=Math.pow(digit,count);
        n/=10;
        }

        System.out.println(sum);

        return (OriginalNum==sum);
    }
    public static void main(String[] args) {
        // System.out.println(countNum(123));
        boolean result=Armstrong(153);
        if(result){
            System.out.println("Number is Armstrong . . . .");
        }else{
            System.out.println("Number is Not Armstrong . . . .");
        }
        

    }
    
}

