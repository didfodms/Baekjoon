import java.util.Arrays;
import java.util.Scanner;

public class q9461 {
	static long[] dp;	//전역변수로 dp 선언
	
	static long wave(int n) {
		
		if(n==0) return 0;
		if(n==1||n==2) return 1;
		if(dp[n] != -1) return dp[n];
		dp[n] = wave(n-2)+wave(n-3);
		return dp[n];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int t = sc.nextInt(); int n;
		dp = new long[101];	Arrays.fill(dp, -1); //-1로 채움
		for(int i=0; i<t; i++) {
			n = sc.nextInt(); sb.append(wave(n)+"\n");
		}
		sc.close();
		
		System.out.println(sb.toString());
	}
}
