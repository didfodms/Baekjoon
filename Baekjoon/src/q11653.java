import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q11653 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//에라토스테네스의 체 채우기
		int PN = 0; //소수 개수
		int[] A = new int[10000000];
		boolean[] isPrime = new boolean[10000000];
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		
		for(int i=2; i<10000000; i++) {
			if(isPrime[i]==true) {
				A[PN++] = i;
				for(int j=i+i; j<10000000; j+=i) {
					isPrime[j] = false;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int cur = 0;
		while(N != 1) {
			if(N%A[cur]==0) {
				sb.append(A[cur]+"\n");
				N /= A[cur];
			} else {
				cur++;
			}
		}
		
		System.out.println(sb.toString().trim());
	}
}
