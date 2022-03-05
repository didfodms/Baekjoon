import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q18429 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] healthKitNum = new int[K];
		int[] weight = new int[K];
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			healthKitNum[i] = i;
			weight[i] = Integer.parseInt(st.nextToken());
		}
		
		
	}
}
