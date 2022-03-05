import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q15990 {

	static int n;
	static int[][] dp;
	//dp[i][j]는 i를 연속되지 않은 1,2,3의 합으로 나타내는 경우의 수
	//1,2,3을 더해서 i를 만들 때, 마지막으로 더한 숫자 j

	static int sum123(int n) {
		
		for(int i=1; i<=n; i++) {
			if(i==1) dp[i] 
		}
		
		if(dp[n])
		
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			
			n = Integer.parseInt(br.readLine());
			dp = new int[n+1][3+1];
			for(int i=0; i<=n; i++) {
				Arrays.fill(dp, -1);
			}
			
			sb.append(sum123(n)+"\n");
			
		}
		
		System.out.println(sb.toString().trim());
		
	}

}
