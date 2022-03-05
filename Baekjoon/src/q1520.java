import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1520 {
	static int N, M;
	static int[][] G, dp;
	static boolean[][] V;
	
	static boolean valid(int x, int y) {
		if(x<0||x>=M) return false;
		if(y<0||y>=N) return false;
		return true;
	}
	
	static int Traverse(int x, int y) {
		int sum = 0;
		if(x==M-1 && y==N-1) return 1;
		if(dp[x][y] != -1) return dp[x][y];
		
		V[x][y] = true;
		if(valid(x-1, y)==true && V[x-1][y]==false && G[x-1][y] < G[x][y])
			sum += Traverse(x-1, y);
		if(valid(x+1, y)==true && V[x+1][y]==false && G[x+1][y] < G[x][y])
			sum += Traverse(x+1, y);
		if(valid(x, y-1)==true && V[x][y-1]==false && G[x][y-1] < G[x][y])
			sum += Traverse(x, y-1);
		if(valid(x, y+1)==true && V[x][y+1]==false && G[x][y+1] < G[x][y])
			sum += Traverse(x, y+1);
		V[x][y] = false; dp[x][y] = sum;
		return sum;
	}
	
	public static void main(String[] args) throws Exception {
		int res;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();	// 출력을 위해
		
		StringTokenizer st = new StringTokenizer(br.readLine());   // 한 줄 읽고
		M = Integer.parseInt(st.nextToken());	// 줄 내에서 하나씩
		N = Integer.parseInt(st.nextToken());
		G = new int[M][N];
		dp = new int[M][N];
		V = new boolean[M][N];
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				G[i][j] = Integer.parseInt(st.nextToken());
				V[i][j] = false;
				dp[i][j] = -1;
			}
		}

		res = Traverse(0, 0);
		System.out.println(res);	
	}
}