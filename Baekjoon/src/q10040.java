import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q10040 {

	static int N, M;
	static int[] A, vote;
	
	static void Vote(int n) {
		int res = 0;
		for(int i=1; i<=N; i++) {
			if(A[i] <= n) {
				res = i;
				break;
			}
		}
		
		vote[res]++;
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		A = new int[N+1];
		vote = new int[M+1];

		for(int i=1; i<=N; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		for(int i=1; i<=M; i++) {
			int n = Integer.parseInt(br.readLine());
			Vote(n);
		}
		
		int max = vote[0];
		int maxIndex = 0;
		for(int i=1; i<=M; i++) {
			if(vote[i] > max) {
				max = vote[i];
				maxIndex = i;
			}
		}
		
		System.out.println(maxIndex);
	}

}
