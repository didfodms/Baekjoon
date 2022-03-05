import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q14567 {

	static int N, M;
	static ArrayList<ArrayList<Integer>> G;
	static int[] incnt, seq;
	
	static void Topo() {
		
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=0; i<N; i++) {
			if(incnt[i]==0) {
				seq[i] = 1;	//왜?
				q.add(i);
			}
		}
		
		while(!q.isEmpty()) {
			int e = q.poll();
			for(int t : G.get(e)) {
				incnt[t]--;
				seq[t] = Math.max(seq[t], seq[e]+1);
				if(incnt[t] == 0) {
					q.add(t);
				}
			}
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		incnt = new int[N]; seq = new int[N];
		G = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<N; i++) {
			G.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int t1 = Integer.parseInt(st.nextToken())-1; //index 맞추기
			int t2 = Integer.parseInt(st.nextToken())-1;
			G.get(t1).add(t2);	incnt[t2]++;
		}
		
		Topo();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(seq[i] + " ");
		}
		System.out.println(sb.toString());
		
	}

}
