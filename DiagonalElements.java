import java.util.Scanner;

public class  DiagonalElements{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns:");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        if (rows != cols) {
            System.out.println("The matrix is not square. Diagonal elements cannot be determined.");
            return;
        }

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Diagonal elements:");
        for (int i = 0; i < rows; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        scanner.close();
    }
}