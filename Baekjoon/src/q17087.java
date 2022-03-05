import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q17087 {
	
	static int GCD(int a, int b) {
		if(b==0) return a;
		return GCD(b, a%b);
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] d = new int[N];
		for(int i=0; i<N; i++) {
			d[i] = Math.abs(Integer.parseInt(st.nextToken())-S);
		}
		
		int ans = d[0];
		for(int i=1; i<N; i++) {
			ans = GCD(ans, d[i]);
		}
		
		System.out.println(ans);
	}

}
