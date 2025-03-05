// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class Que9 {

   public static void Palindrom(String var0) {
      if (var0.length() == 1) {
         System.out.println(var0);
      } else if (var0.length() > 0) {
         byte var1 = 0;
         if (var1 < var0.length()) {
            if (var0.charAt(var1) != var0.charAt(var0.length() - 1 - var1)) {
               System.out.println("String is  not palindrome ");
               return;
            }

            System.out.println("string is palindrome");
            return;
         }
      }

   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      String var2 = var1.nextLine();
      Palindrom(var2);
   }
}
