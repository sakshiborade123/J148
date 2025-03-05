import java.util.*;
// Valid Anagram
public class que10 {
    public static boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            System.out.println("it is not Anagram ");
            return false;
        }
        char[] str1Arr= str1.toCharArray();
        char[] str2Arr=str2.toCharArray();
        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);
        for(int i=0;i<str1.length()-1;i++){
            
                if(str1Arr[i]!=str2Arr[i]){
                     return false;
                   
                }
        }
         return true;
    }
    public static void main(String[] args) {
        boolean result=isAnagram("hello", "elloh");
        if(result==true){
            System.out.println("Its is Angram");
        }else {
            System.out.println("Its is Not Anagram ");
        }
        
    }
    
}
