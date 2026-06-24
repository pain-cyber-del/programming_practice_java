
import java.io.*;
import java.util.Scanner;
class Transposematrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the row");
        int row=sc.nextInt();
        System.out.print("enetr the colomns");
        int col=sc.nextInt();
        int[][] mat=new int[row][col];
        System.out.println("enter the matrix elements");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("the original matrix is");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("the transpose matrix is");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[j][i]+ " ");
            }
            System.out.println();
        }
        sc.close();
    
    }
}