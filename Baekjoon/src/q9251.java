import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class q9251 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
		String S1 = sc.next(); String S2 = sc.next();
		sc.close();
		int L1 = S1.length(); int L2 = S2.length();
		int[][] A = new int[L1+1][L2+1];	//자바는 자동으로 모두 0으로 초기화
		
		for(int i=1; i<L1+1; i++) {
			for(int j=1; j<L2+1; j++) {
				if(S1.charAt(i-1)==S2.charAt(j-1)) {
					A[i][j] =A[i-1][j-1]+1;
					//sb.append(S1.charAt(i-1));
				}
				else {
					if(A[i-1][j] > A[i][j-1]) A[i][j] = A[i-1][j];
					else A[i][j] = A[i][j-1];
				}
			}
			if(S1.charAt(i-1)==S2.charAt(j-1)) {
				sb.append(S1.charAt(i-1));
			}
		}
		System.out.println(A[L1][L2]);
		//System.out.println(sb.toString());
	}
	/*
	static String S1, S2;
	static int L1, L2;
	static int[][] dp;
	
	public static int CalcLCS(int i, int j) {	//인자가 두개면 dp 2차원
		int t1, t2, r;
		if(i==L1 || j==L2) return 0;
		if(dp[i][j] != -1) return dp[i][j];
		if(S1.charAt(i)==S2.charAt(j)) {
			dp[i][j] = CalcLCS(i+1, j+1)+1;
			return dp[i][j];
		} else {
			t1 = CalcLCS(i, j+1);
			t2 = CalcLCS(i+1, j);
			dp[i][j] = Math.max(t1, t2);
			return dp[i][j];
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		S1 = sc.next(); S2 = sc.next();
		sc.close();
		L1 = S1.length(); L2 = S2.length();
		dp = new int[L1+1][L2+1];
		for(int i=0; i<L1+1; i++) Arrays.fill(dp[i], -1);
		
		System.out.println(CalcLCS(0, 0));
	}
	*/
}
