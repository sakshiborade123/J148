import java.util.*;

public class que3 {
    public static int[][] Input2DArry(int row,int col){
        Scanner sc=new Scanner(System.in);
        int Matrix[][]=new int[row][col];
        System.out.println("Enter the 2D Array of "+row+"x"+col+":");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                Matrix[i][j]=sc.nextInt();

            }
        }
        return Matrix;
    }
    public static void Print2DArray(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void Addition(int matrix1[][],int Matrix2[][]){
        int result[][]=new int[matrix1.length][matrix1[0].length];
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<Matrix2[0].length;j++){
                result[i][j]=matrix1[i][j]+Matrix2[i][j];
            }
        }
        System.out.println("Addition 2D Array : ");
        Print2DArray(result);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number Rows And Columns of First 2D Array : ");
        int row1=sc.nextInt();
        int col1=sc.nextInt();
        System.out.println("Enter the Number Rows And Columns of Second 2D Array : ");
        int row2=sc.nextInt();
        int col2=sc.nextInt();
        int Matrix1[][]=Input2DArry(row1,col1);
        int Matrix2[][]=Input2DArry(row2, col2);

        System.out.println("2D Arrays ");
        Print2DArray(Matrix1);
        System.out.println("2D Arrays ");
        Print2DArray(Matrix2);
        Addition(Matrix1,Matrix2);

        

        
    }
    
}
