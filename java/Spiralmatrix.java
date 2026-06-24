import java.util.Scanner;
class Spiralmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols=sc.nextInt();
        int[][] matrix=new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
		System.out.println("The matrix elements are:");
		for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                System.out.print(matrix[i][j] + " ");
            }
			System.out.println();
        }
        int top=0;
        int bottom=rows-1;
        int left=0;
        int right=cols-1;
        System.out.println("Spiral order of matrix:");
        while(top<=bottom && left<=right) {
            for(int i=left;i<=right;i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;
            for(int i=top; i<=bottom;i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;
            if(top<=bottom) {
                for(int i=right; i>=left;i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }
            if(left <= right) {
                for(int i=bottom; i>=top;i--){
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
        sc.close();
    }
}