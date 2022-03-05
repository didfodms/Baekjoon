import java.util.Scanner;

public class q14889 {
	
	static int N;
	static int[] team;
	static int[][] capa;
	static int min=1000000000;
	
	public static void Combi (int t, int n) {
		if(t==n) {
			for(int i=0; i<t; i++) team[i] = 1;
			Eval();
			return;
		}
		if(n==0) {
			for(int i=0; i<t; i++) team[i] = 0;
			Eval();
			return;
		}
		team[t-1] = 0;
		Combi(t-1, n);
		team[t-1] = 1;
		Combi(t-1, n-1);
	}
	
	static void Eval() {
		int s=0, l=0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(team[i]==team[j] && team[i]==0)
					s += capa[i][j];
				if(team[i]==team[j] && team[i]==1)
					l += capa[i][j];
			}
		}
		int r = Math.abs(s-l);
		min = Math.min(min, r);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		capa = new int[N][N];
		team = new int[N];
		
		for(int i=0; i<N; i++)
			for(int j=0; j<N; j++)
				capa[i][j] = sc.nextInt();
		sc.close();
		
		Combi(N, N/2);
		System.out.println(min);
	}

}
