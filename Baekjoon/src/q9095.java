import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q9095 {
	
	static int[] dp;
	//dp[n]은 n을 1,2,3의 합으로 나타낼 수 있는 경우의수
	
	static int sum123(int n) {
		
		if(n==1) dp[n] = 1;
		if(n==2) dp[n] = 2;
		if(n==3) dp[n] = sum123(n-1)+sum123(n-2)+1;
		
		if(dp[n] > 0) return dp[n];
		dp[n] = sum123(n-1)+sum123(n-2)+sum123(n-3);
		return dp[n];
		
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			dp = new int[n+1];
			
			sb.append(sum123(n)+"\n");
		}
		
		System.out.println(sb.toString().trim());
		
	}
}
