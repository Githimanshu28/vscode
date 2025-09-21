import java.util.Scanner;

public class RoyalTournament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] scoreboard = new int[N][M];

        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                scoreboard[i][j] = sc.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE; 
        int winnerIndex = -1;  

    
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < M; j++) {
                sum += scoreboard[i][j];
            }

            
            
            if (sum > maxSum) {
                maxSum = sum;
                winnerIndex = i;
            }
        }

        
        System.out.println(winnerIndex);
        
        sc.close();
    }
}
