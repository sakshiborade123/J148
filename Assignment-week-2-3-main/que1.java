//Reverse Array
import java.util.*;
public class que1{
    public static void ReverseArr(int arr[]){
        // int start = 0;
        // int end = arr.length - 1;
        // while (start < end) {
        //     // Swap elements at start and end
        //     int temp = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = temp;
        //     start++;
        //     end--;
        // }
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
    
           }

        
    }
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void SortArr(int arr[]){
        for(int j=0;j<arr.length-1;j++){
        for(int i=0;i<arr.length-1;i++){

            if(arr[i]<arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;

            }
        }
    }
    }
    public static void main(String[] args) {
        int arr[]={1,2,6,3,4,5};
        // ReverseArr(arr);
        SortArr(arr);
      
       PrintArr(arr);
    
        
    }
}