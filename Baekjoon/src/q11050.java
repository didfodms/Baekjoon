import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q11050 {

	static int C(int n, int k) {
		int res = 1;
		for(int i=0; i<k; i++) {
			res *= n-i;
		}
		for(int i=1; i<=k; i++) {
			res /= i;
		}
		
		return res;
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		System.out.println(C(N, K));
		
	}

}
