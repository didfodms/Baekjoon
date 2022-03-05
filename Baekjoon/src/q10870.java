//동적 프로그래밍


import java.util.Arrays;
import java.util.Scanner;

public class q10870 {
	static int[] dp;
	
	static int Fibo(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		if(dp[n] != -1) return dp[n];
		dp[n] = Fibo(n-1)+Fibo(n-2);
		return dp[n];
	}
	
	public static void main(String[] args) {
		dp = new int[20];	Arrays.fill(dp,  -1);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); sc.close();
		
		System.out.println(Fibo(n));
	}
}