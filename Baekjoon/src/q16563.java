import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q16563 {
	
	static int PN = 0;
	static int[] A = new int[5000001];
	static boolean[] isPrime = new boolean[5000001];
	
	static String smallNumber(int n) {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while(true) {
			if(n==1) break;
			
			if(n%A[i] == 0) {
				n /= A[i];
				sb.append(A[i]+" ");
			} else i++;
		}
		
		return sb.toString().trim();
	}
	
	public static void main(String[] args) throws Exception {
		
		//에라토스테네스의 체
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		for(int i=2; i<isPrime.length; i++) {
			if(isPrime[i]) {
				A[PN++] = i;
				for(int j=i+i; j<isPrime.length; j+=i) {
					isPrime[j] = false;
				}
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(N-- > 0) {
			int k = Integer.parseInt(st.nextToken());
			sb.append(smallNumber(k)+"\n");
		}
		
		System.out.println(sb.toString().trim());
	}

}
