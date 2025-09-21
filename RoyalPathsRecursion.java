import java.util.Scanner;

public class RoyalPathsRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the size of the chessboard (N):");
        int N = scanner.nextInt();

        
        int[][] matrix = new int[N][N];

    
        System.out.println("Enter the elements of the matrix (row by row):");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int sumMainDiagonal = 0;
        int sumSecondaryDiagonal = 0;

        
        for (int i = 0; i < N; i++) {
            
            sumMainDiagonal += matrix[i][i];

            
            sumSecondaryDiagonal += matrix[i][N - 1 - i];
        }

        
        System.out.println("Sum of the main diagonal: " + sumMainDiagonal);
        System.out.println("Sum of the secondary diagonal: " + sumSecondaryDiagonal);

        scanner.close();
    }
}
