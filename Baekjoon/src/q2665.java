import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

class GEntry implements Comparable<GEntry>{
	int r, c, count;
	GEntry(int rr, int cc, int cnt){
		r = rr; c = cc; count = cnt;
	}
	@Override
	public int compareTo(GEntry o) {
		return (this.count - o.count); //우선순위 기준 : this.cost < o.cost 수록..
	}
}

public class q2665 {
	
	static boolean Valid(int r, int c, int N) {
		if(r < 0 || c < 0 || r > N-1 || c > N-1) {
			return false;
		}
		return true;
	}
	
	public static int DijkPq(int[][] B, int N) {
		boolean[][] V = new boolean[N][N]; //간적있는지 체크
		int[][] count = new int[N][N]; //cnt측정..
		for(int i=0; i<N; i++) {
			Arrays.fill(V[i], false); Arrays.fill(count[i], Integer.MAX_VALUE);
		}
		int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
		
		PriorityQueue<GEntry> pq = new PriorityQueue<GEntry>();
		count[0][0] = B[0][0];
		pq.add(new GEntry(0, 0, count[0][0]));
		
		while(!pq.isEmpty()) {
			GEntry qe = pq.poll();
			int r = qe.r, c = qe.c, cnt = qe.count;
			
			if(!V[r][c]) V[r][c] = true;
			if(r==N-1 && c==N-1) return count[r][c];
			
			for(int i=0; i<dir.length; i++) {
				int nr = r + dir[i][0], nc = c + dir[i][1];
				if(Valid(nr, nc, N) && count[nr][nc] > cnt + B[nr][nc]) {
					count[nr][nc] = cnt + B[nr][nc];
					pq.add(new GEntry(nr, nc, count[nr][nc]));
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] A = new String[N];
		int[][] B = new int[N][N];
		for(int i=0; i<N; i++) {
			Arrays.fill(B[i], 0); //벽은 1, 그냥은 0
		}
		
		for(int i=0; i<N; i++) {
			A[i] = br.readLine();
			for(int j=0; j<N; j++) {
				if(A[i].charAt(j)=='0') B[i][j] = 1; //0이었던 벽을 1로..
				else B[i][j] = 0;
			}
		}
		
		System.out.println(DijkPq(B, N));
	}

}
