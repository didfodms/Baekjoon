import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1978 {

	static int isPrime(int n) {
		if(n<2) return 0;
		for(int i=2; i*i<=n; i++) {	//i*i<=n로 시간복잡도는 O(루트n)
			if(n%i==0) return 0;
		}
		return 1;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int sum = 0;
		while(t-- > 0) {
			int n = Integer.parseInt(st.nextToken());
			sum += isPrime(n);
		}
		System.out.println(sum);

	}

}
