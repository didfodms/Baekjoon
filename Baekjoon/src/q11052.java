import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q11052 {

	static int[] P;
	//P[n]은 카드 n개가 들어있는 n번째 카드팩의 가격
	static int[] dp;
	//dp[n]은 카드 n개를 갖기 위해 지불해야 하는 금액의 최댓값
	
	static int cost(int n) {
		
		if(n==1) dp[n] = P[1];
		
		if(dp[n] > 0) return dp[n];
		for(int i=1; i<=n; i++) {
			dp[n] = Math.max(dp[n], cost(n-i)+P[i]);
		}
		return dp[n];
		
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		P = new int[n+1];
		dp = new int[n+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) {
			P[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(cost(n));
		
	}

}
