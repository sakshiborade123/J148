//Calculate Power of Number 

import java.util.*;

import javax.swing.text.html.StyleSheet;
public class Que3 {
    public static void Power(int n,int m) {
        int pow=0;

        for(int i=0;i<m;i++){
            pow+=n;

        }
        System.out.println("Power Number :"+pow);

        
    }
    public static int  Power1(int n,int m){
        return (int) Math.pow(n, m);
    }
    public static void main(String[] args) {
        Power(4, 2);
        System.out.println("Power : "+Power1(3, 4));
        
    }
    
}
