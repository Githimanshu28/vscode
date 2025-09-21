import java.util.Scanner;

public class SparseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = 3, cols = 3;
        int[][] matrix = new int[rows][cols];

        
        System.out.println("Enter elements of 3x3 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

    
        int nonZero = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != 0) {
                    nonZero++;
                }
            }
        }

        
        int[][] sparseMatrix = new int[nonZero][3];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != 0) {
                    sparseMatrix[k][0] = i;      
                    sparseMatrix[k][1] = j;     
                    sparseMatrix[k][2] = matrix[i][j]; 
                    k++;
                }
            }
        }

        
        System.out.println("\nOriginal 3x3 Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        
        System.out.println("\nSparse Matrix (row, col, value):");
        for (int i = 0; i < nonZero; i++) {
            System.out.println(sparseMatrix[i][0] + " " + sparseMatrix[i][1] + " " + sparseMatrix[i][2]);
        }

        sc.close();
    }

}
