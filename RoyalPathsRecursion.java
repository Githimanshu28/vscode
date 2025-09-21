import java.util.Scanner;

public class RoyalPathsRecursion {
    static long sumMain = 0;
    static long sumSecondary = 0;

    
    static void process(int[][] matrix, int i, int j, int N) {
        
        if (i == N) return;
        
        if (i == j) {
            sumMain += matrix[i][j];
        }
        if (i + j == N - 1) {
            sumSecondary += matrix[i][j];
        }

        
        if (j < N - 1) {
            process(matrix, i, j + 1, N);
        } else {  
            process(matrix, i + 1, 0, N);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] matrix = new int[N][N];

        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        
        process(matrix, 0, 0, N);

        System.out.println(sumMain + " " + sumSecondary);
        sc.close();
    }
}

