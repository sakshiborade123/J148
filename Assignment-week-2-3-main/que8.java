import java.util.*;
//Remove all Adjacent Duplicate in string

public class que8 {
    public static void main(String[] args) {
        String str="moon";
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            
            
            if (i > 0 && str.charAt(i) == str.charAt(i - 1)) {
               
                continue;
            }
            
            
            sb.append(str.charAt(i));
        }


        System.out.println(sb.toString());
        
    }
}
