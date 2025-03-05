import java.util.*;
//Java Program to find ASCII value of character 
public class Que7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        if(input.length()>0){
            char character=input.charAt(0);
            System.out.println("Original character "+character);
            System.out.println("AsCII value Original character "+(int)character);
            

        }else{
            System.out.println("There is no Character");
        }
        

        
    }
    
}
