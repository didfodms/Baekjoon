import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q15990 {

	static int n;
	static int[][] dp;
	//dp[i][j]�� i�� ���ӵ��� ���� 1,2,3�� ������ ��Ÿ���� ����� ��
	//1,2,3�� ���ؼ� i�� ���� ��, ���������� ���� ���� j

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
