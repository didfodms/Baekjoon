import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q16194 {

	static int[] P;		//P[n]은 n번째 카드팩 가격
	static int[] dp;	//dp[n]은 카드 n개 지불 금액의 최솟값
	
	static int cost(int n) {
		
		if(n==0) dp[n] = 0;
		if(n==1) dp[n] = P[1];
		
		if(dp[n] > -1) return dp[n];
		for(int i=1; i<=n; i++) {
			if(dp[n] == -1) dp[n] = cost(n-i) + P[i];
			dp[n] = Math.min(dp[n], cost(n-i)+P[i]);
		}
		
		return dp[n];
		
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		P = new int[n+1];	dp = new int[n+1];
		Arrays.fill(dp, -1);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) {
			P[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(cost(n));
		
	}

}
