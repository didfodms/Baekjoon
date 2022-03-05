import java.util.Scanner;

public class q20047 {
	static final char Up=0, Left=1, Diag=2;
	static int N, a, b;
	static char ta, tb;
	
	static boolean lcs(String s1, String s2) {
		int L1 = s1.length(); int L2 = s2.length();
		int[][] dyn = new int[L1+1][L2+1];
		char[][] pre = new char[L1+1][L2+1];
		boolean[] V = new boolean[L2];
		StringBuilder br = new StringBuilder();
		
		for(int i=1; i<L1+1; i++) {
			for(int j=1; j<L2+1; j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					dyn[i][j] = dyn[i-1][j-1]+1;
					pre[i][j] = Diag;
				} else {
					if(dyn[i-1][j]>=dyn[i][j-1]) {
						dyn[i][j] = dyn[i-1][j];
						pre[i][j] = Up;
					} else {
						dyn[i][j] = dyn[i][j-1];
						pre[i][j] = Left;
					}
				}
			}
		}
		
		
	}
}
