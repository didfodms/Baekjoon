import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q2252 {

	static int N, M;
	static ArrayList<ArrayList<Integer>> G;
	static int[] incnt;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		G = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<N; i++) {
			G.add(new ArrayList<Integer>());
		}
		incnt = new int[N];		//진입 차수 개수
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int t1 = Integer.parseInt(st.nextToken())-1;
			int t2 = Integer.parseInt(st.nextToken())-1;
			incnt[t2]++;	G.get(t1).add(t2);
		}
		
		Queue<Integer> q = new LinkedList<>();
		for(int i=0; i<N; i++) {
			if(incnt[i]==0) q.add(i);
		}
		
		StringBuilder sb = new StringBuilder();
		while(!q.isEmpty()) {
			int e = q.poll();
			sb.append((e+1)+" ");
			for(int u: G.get(e)) {
				incnt[u]--;
				if(incnt[u]==0) q.add(u);
			}
		}
		
		System.out.println(sb.toString());
	}

}
