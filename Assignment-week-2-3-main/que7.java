import java.util.*;

//write a java program for counting the digits present in a number

public class que7 {
    public static void main(String[] args) {
        int number=12222;
        int countDigit=0;
        if(number==0){
            countDigit=1;
        }
        while (number>0) {
            // number%=10;
            countDigit++;
            number/=10; 
        }
        
        System.out.println(countDigit);
        
    }
    
}
