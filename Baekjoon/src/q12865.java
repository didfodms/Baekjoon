import java.util.Arrays;
import java.util.Scanner;

public class q12865 {
		static int[][] K, dp;
		static int N, C;
		
		static int knap(int n, int left) {
			if (n==N) return 0;
			if (dp[n][left] != -1) return dp[n][left];
			int mm = knap(n+1, left);
			if (K[n][0] <= left)
				mm = Math.max(mm, 
						knap(n+1, left-K[n][0]) + K[n][1]); 
			dp[n][left] = mm;
			return mm;
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			N = sc.nextInt();	C = sc.nextInt();
			K = new int[N][2];
			for (int i=0; i<N; i++) {
				K[i][0] = sc.nextInt();
				K[i][1] = sc.nextInt();
			}
			
			dp = new int[N+1][C+1];
			for (int i=0; i<N+1; i++)
				Arrays.fill(dp[i], -1);
			sc.close();
			
			System.out.println(knap(0, C));
		}
}
	