import java.util.Scanner;
import java.util.Arrays;

public class q9252 {
	static final char Up=0, Left=1, Diag=2;
	
	static void lcs(String s1, String s2) {
		int L1 = s1.length(); int L2 = s2.length();
		int[][] dyn = new int[L1+1][L2+1];
		char[][] pre = new char[L1+1][L2+1];
		
		for(int i=1; i<L1+1; i++) {
			for(int j=1; j<L2+1; j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dyn[i][j] = dyn[i-1][j-1] + 1;
					pre[i][j] = Diag;
				}
				else {
					if(dyn[i-1][j] >= dyn[i][j-1]) {
						dyn[i][j] = dyn[i-1][j];
						pre[i][j] = Up;
					}
					else {
						dyn[i][j] = dyn[i][j-1];
						pre[i][j] = Left;
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		int r = L1, c = L2;
		while(true) {	//pre[r][c]부터 거꾸로 올라감
			if(r==0 || c==0) break;
			if(pre[r][c]==Up) r--;
			else if(pre[r][c]==Left) c--;
			else {
				sb.append(s1.charAt(r-1));
				r--; c--;
			}
		}
		sb.reverse();
		System.out.println(dyn[L1][L2]+"\n"+sb.toString());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next(); String s2 = sc.next();
		sc.close();
		lcs(s1, s2);
	}
}