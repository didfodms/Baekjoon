import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class GEntry implements Comparable<GEntry>{
	int r, c, cost;
	GEntry (int rr, int cc, int co){
		r = rr; c = cc; cost = co;
	}
	@Override
	public int compareTo(GEntry o) {
		return (this.cost - o.cost);
	}
}

//�ִ� ��η� ����! ���ͽ�Ʈ�� �˰��� (�켱���� ť)
public class q4485 {
	
	static int N;
	static int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
	//Right, Left, Down, Up
	static int[][] A;
	
	static boolean Valid(int r, int c) { //������ ������ �ȵǴϱ�~
		if(r<0 || r>N-1 || c<0 || c>N-1) {
			return false;
		}
		return true;
	}
	
	public static int DijkPq() { //
		boolean[][] V = new boolean[N][N];
		int[][] cost = new int[N][N]; //
		PriorityQueue<GEntry> pq = new PriorityQueue<GEntry>();
		
		for(int i=0; i<N; i++) {
			Arrays.fill(cost[i], Integer.MAX_VALUE);
		}
		
		cost[0][0] = A[0][0]; //��� ��� ���� (0, 0)
		pq.add(new GEntry(0, 0, cost[0][0]));
		while (!pq.isEmpty()) {
			GEntry qe = pq.poll(); //
			int r = qe.r, c = qe.c, co = qe.cost;
			
			if(!V[r][c]) V[r][c] = true; //��带 ���������� ����
			if(r==N-1 && c==N-1) return cost[r][c]; //�����ϸ� �ִܰ�� ����
			
			for(int i=0; i<dir.length; i++) { //��ȸ
				int nr = r+dir[i][0], nc = c+dir[i][1];
				if(Valid(nr, nc) && cost[nr][nc] > co + A[nr][nc]) {
					cost[nr][nc] = co + A[nr][nc];
					pq.add(new GEntry(nr, nc, cost[nr][nc]));
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int cnt = 0;
		while(true){
			N = Integer.parseInt(br.readLine());
			if(N==0) break;
			
			cnt++;
			A = new int[N][N];
			for(int i=0; i<N; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<N; j++) {
					A[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			sb.append("Problem "+cnt+": "+DijkPq()+"\n");
		}
		
		System.out.println(sb.toString());
	}

}
