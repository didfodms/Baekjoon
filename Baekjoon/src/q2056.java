import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q2056 {

	static int N;
	static ArrayList<ArrayList<Integer>> G;
	static int[] incnt, V, E;
	//V는 노드 가중치 모음, E는 최대 갱신값
	
	static int Topo() {
		int MAX = -1;
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i=0; i<N; i++) {
			if(incnt[i]==0) {
				q.add(i);
				E[i] = V[i];
			}
		}
		
		while(!q.isEmpty()) {
			int e = q.poll();
			for(int u : G.get(e)) {
				incnt[u]--;
				E[u] =  Math.max(E[u], E[e]+V[u]);
				if(incnt[u]==0) q.add(u);
			}
		}
		
		for(int i=0; i<N; i++) {
			MAX = Math.max(MAX, E[i]);
		}
		
		return MAX;
	}
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		G = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<N; i++) {
			G.add(new ArrayList<Integer>());
		}
		incnt = new int[N];	V = new int[N];	E = new int[N];
		
		//입력
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			V[i] = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			for(int j=0; j<t; j++) {
				int tt = Integer.parseInt(st.nextToken())-1;
				G.get(i).add(tt);
				incnt[tt]++;
			}
		}
		
		System.out.println(Topo());
		
	}

}
