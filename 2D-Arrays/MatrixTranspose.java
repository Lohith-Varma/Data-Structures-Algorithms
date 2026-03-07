import java.util.Scanner;
public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        
        System.out.println("Enter a Matrix:");
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int transpose[][] = new int[cols][rows];

        for(int i=0;i<cols;i++) {
            for(int j=0;i<rows;j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        for(int i=0; i<transpose[i].length; i++){
            for(int j=0; j<transpose.length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

