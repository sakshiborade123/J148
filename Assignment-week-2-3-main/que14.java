
import java.util.*;
public class que14 {
    public static void ToggleCharacter(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
             char c=str.charAt(i);
             if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
             }else if(Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
             }
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        ToggleCharacter("VaiShnvai");

        
    }
}
