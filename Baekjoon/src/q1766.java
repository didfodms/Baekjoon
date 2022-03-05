import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q1766 {

	static int N, M;
	static ArrayList<ArrayList<Integer>> G;	//관계 작성
	static int[] incnt;						//진입 차수 개수
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		incnt = new int[N];
		G = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<N; i++) {
			G.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int t1 = Integer.parseInt(st.nextToken())-1;
			int t2 = Integer.parseInt(st.nextToken())-1;
			G.get(t1).add(t2);	incnt[t2]++;
		}
		
		Queue<Integer> q = new LinkedList<>();
		for(int i=0; i<N; i++) {
			Collections.sort(G.get(i));
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N && !q.isEmpty(); i++) {	//진입차수==0 인거 하나만 넣기
			if(incnt[i]==0) {
				sb.append((i+1)+" ");
				for(int u : G.get(i)) {
					incnt[u]--;
					sb.append((u+1)+" ");
				}
			}
		}
		
		System.out.println(sb.toString().trim());
	}

}
