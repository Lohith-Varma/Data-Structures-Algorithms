import java.util.*;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of rows and columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];
        int[][] resultMatrix = new int[rows][cols];

        System.out.println("Enter elements of first matrix: ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter elements of second matrix: ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        
        System.out.println("Matrix after Addition:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
