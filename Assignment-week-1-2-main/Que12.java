
// Add two different numbers in five Ways using funaction and control statement

public class Que12 {

    public static void Add(int n , int m){
        System.out.println(n+m);
    }
    public static void Addition(int n,int m){
        System.out.println(n^m);
    }
    public static int Addcontrol(int n,int m){
        for(int i=0;i<m;i++){
            n++;
        }
        return n;
    }
    public static int addRec(int n,int m){
        
        if(m==0){
            return n;
        
        }

        return 1+addRec(n,m-1);
    }

    //Method 5: Add two numbers using a control statement (if-else logic for positive/negative numbers)
    public static void AddUsingControlStatement(int n, int m) {
        if (m > 0) {
            int sum = n;
            for (int i = 0; i < m; i++) {
                sum++;
            }
            System.out.println("Add using control statement (if-else): " + sum);
        } else if (m < 0) {
            int sum = n;
            for (int i = 0; i > m; i--) {
                sum--;
            }
            System.out.println("Add using control statement (if-else): " + sum);
        } else {
            System.out.println("Add using control statement (if-else): " + n);
        }
    }

    public static void main(String[] args) {
        int n=2;
        int m=7;
        Add(n,m);
        Addition(n,m);
        System.out.println(Addcontrol(n,m));
        System.out.println(addRec(n,m));
        AddUsingControlStatement(n,m);

        
    }
    
}
