import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q4948_2 {

	static int PN = 0;	//소수 개수
	static int[] A;
	static boolean[] isPrime;
	
	static int primeCnt(int n) {
		int res = 0;
		for(int i=n+1; i<=n*2; i++) {
			if(isPrime[i]) res++;
		}
		
		return res;
	}
	
	public static void main(String[] args) throws Exception {
		
		A = new int[1000001];
		isPrime = new boolean[1000001];
		
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		
		for(int i=2; i<isPrime.length; i++) {
			if(isPrime[i]) {
				A[PN++] = i;
				for(int j=i*2; j<isPrime.length; j+=i) {
					isPrime[j] = false;
				}
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			
			sb.append(primeCnt(n)+"\n");
		}
		
		System.out.println(sb.toString().trim());
		
	}

}
