import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q24392 {

	static int N, M;
	static int[][] glass;
	
	static boolean check(int i, int j) {
		if(i<0 || j<0 || i>=N || j>=M) return false;
		return true;
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		glass = new int[N][M];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				glass[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=N-1; i>N; i--) {
			for(int j=0; j<M; i++) {
				if(j==0 && glass[i][j]==0) continue;
				
			}
		}
		
	}

}
