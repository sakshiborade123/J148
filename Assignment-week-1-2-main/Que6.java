import java.util.*;
class circle{
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double Area(){
        return 3.14*radius*radius;
    }
    public double Circumference(){
        return 2*radius*3.14;
    }
}
public class Que6 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        circle c=new circle();
        System.out.println("Enter area of circle : ");
        int r=sc.nextInt();
        c.setRadius(r);
        System.out.println(c.Area());
        System.out.println(c.Circumference());
      
        
    }
    
}
