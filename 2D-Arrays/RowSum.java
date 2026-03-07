import java.util.Scanner;
public class RowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int Matrix[][] = new int[rows][cols];
        System.out.println("Enter a Matrix:");
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                Matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("sum of rows in a matrix is: ");
        for(int i=0; i<rows; i++) {
            int sum = 0;
            for(int j=0; j<cols; j++) {
                sum += Matrix[i][j];
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
