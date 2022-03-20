import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q17425 {

	static int f(int n) {
		int sum = 0;
		for(int i=1; i*i<=n; i++) {
			if(n%i==0) {
				if(i*i!=n) sum += i + n/i;
				else sum += i;
			}
		}
		return sum;
	}
	
	static int g(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum += f(i);
		}
		return sum;
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			sb.append(g(N)+"\n");
		}

		System.out.println(sb.toString().trim());
	}

}
