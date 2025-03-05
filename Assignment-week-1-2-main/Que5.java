import java.util.*;

public class Que5 {
public static void AreaRec(double length,double breath ) {
    System.out.println("Area Of Rectangle : "+length*breath);

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length : ");
        double len=sc.nextDouble();
        System.out.println("Enter the Breadth : ");
        double bre=sc.nextDouble();
        AreaRec(len, bre);

        

    }
    
}
