
import java.io.*;
import java.util.Scanner;
class Matrixaddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the row");
        int row=sc.nextInt();
        System.out.print("enetr the colomns");
        int col=sc.nextInt();
        int[][]mat1=new int[row][col];
        int[][]mat2=new int[row][col];
        int[][]sum=new int[row][col];
        System.out.println("enter the matrix1 elements");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the matrix2 elements");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("the matrix is");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    
    }
}