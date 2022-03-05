import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q10816 {

	static int N, M;
	static int[] cardP, cardM, query;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//input
		N = Integer.parseInt(br.readLine());
		cardP = new int[10000001];
		cardM = new int[10000001];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int n = Integer.parseInt(st.nextToken());
			if(n < 0) cardM[Math.abs(n)]++;
			else cardP[n]++;
		}
		
		M = Integer.parseInt(br.readLine());
		query = new int[M];
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<M; i++) {
			query[i] = Integer.parseInt(st.nextToken());
			
			int res = 0;
			if(query[i] < 0) {
				res = cardM[Math.abs(query[i])];
			} else res = cardP[query[i]];
			
			sb.append(res+" ");
		}
		
		System.out.println(sb.toString().trim());
	}

}
