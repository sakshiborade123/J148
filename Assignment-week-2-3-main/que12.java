import java.util.*;
public class que12 {
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,5};
        for(int i=0;i<arr.length;i++){
            if(isEven(arr[i])){
                System.out.println("Even Number :"+arr[i]);
            }
        }
        
        
    }
    
}
