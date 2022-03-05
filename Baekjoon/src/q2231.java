import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q2231 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int res = 0;
		
		for(int i=1; i<N; i++) {
			int n = i;
			int sum = n;
			res = sum;
			
			while(n > 0) {
				int dd = n%10;
				n /= 10;
				
				sum += dd;
				if(sum > N) {
					res = 0;
					break;
				}
			}
			if(sum < N) res = 0;
			if(sum == N) break;
		}
		
		System.out.println(res);
	}

}
