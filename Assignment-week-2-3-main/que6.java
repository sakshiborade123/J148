
import java.util.*;
public class que6{
    
    public static void ConcatArray(int arr1[],int arr2[]){
        int[] ConcatArray=new int[arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++){
            ConcatArray[i]=arr1[i];
        }
        int nextidx=arr1.length;
        for(int i=0;i<arr2.length;i++){
            ConcatArray[nextidx]=arr2[i];
            nextidx++;
        }

        PrintArray(ConcatArray);

    }
    public static void PrintArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={6,7,8,9};
        ConcatArray(arr1,arr2);
        
    }

}