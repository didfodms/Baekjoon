import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q11727 {

	static int n;
	static int[] dp;
	
	static int tile(int n) {
		if(n==1) dp[n] = 1;
		if(n==2) dp[n] = tile(n-1)+2;
		
		if(dp[n]>0) return dp[n];
		dp[n] = (tile(n-1)%10007)+((tile(n-2)*2)%10007);
		return dp[n];
	}
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		dp = new int[n+1];
		
		System.out.println(tile(n)%10007);
	}

}
