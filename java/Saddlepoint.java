import java.util.Scanner;
public class Saddlepoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix elements are:");
		for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                System.out.print(matrix[i][j] + " ");
            }
			System.out.println();
        }
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            int minRow = matrix[i][0];
            int column = 0;
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < minRow) {
                    minRow = matrix[i][j];
                    column = j;
                }
            }
            boolean isSaddle = true;
            for (int k = 0; k < rows; k++) {
                if (matrix[k][column] > minRow) {
                    isSaddle = false;
                    break;
                }
            }
            if (isSaddle) {
                System.out.println("Saddle point is: " + minRow);
                found = true;
            }
        } 
        if (!found) {
            System.out.println("No saddle point found");
        }
        sc.close();
    }
}