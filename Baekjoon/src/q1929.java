import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q1929 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int[] prime = new int[1000001]; //소수 저장
		int pn = 0; //소수 개수
		boolean[] check = new boolean[1000001]; //지워지면 false
		Arrays.fill(check, true);
		for(int i=2; i<=N; i++) {
			if(check[i]) {
				prime[pn++] = i;
				for(int j=i*2; j<=N; j+=i) {
					check[j] = false;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<pn; i++) {
			if(M<=prime[i]) {
				sb.append(prime[i]+"\n");
			}
		}
		System.out.println(sb.toString().trim());
	}
	
}
