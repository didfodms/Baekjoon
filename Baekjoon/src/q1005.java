import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class q1005 {

	static int N, K, W;
	static ArrayList<ArrayList<Integer>> G;
	static int[] incnt, V, E;
	//V는 건설 시간, E는 최솟값 구하는 과정
	
	static int Topo() {
		
		
		
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			//객체 생성
			incnt = new int[N]; V = new int[N]; E = new int[N];
			G = new ArrayList<ArrayList<Integer>>();
			for(int j=0; j<N; j++) {
				G.add(new ArrayList<Integer>());
			}
			
			//입력 받기
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				V[j] = Integer.parseInt(st.nextToken());
			}
			
			for(int j=0; j<K; j++) {
				st = new StringTokenizer(br.readLine());
			
				int t1 = Integer.parseInt(st.nextToken())-1;
				int t2 = Integer.parseInt(st.nextToken())-1;
				incnt[t2]++;
				G.get(t1).add(t2);
			}
			
			W = Integer.parseInt(br.readLine());
			
			sb.append(Topo()+"\n");
		}
		
		System.out.println(sb.toString().trim());
	}

}
