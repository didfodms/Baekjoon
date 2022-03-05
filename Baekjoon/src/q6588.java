import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class q6588 {

	static int[] prime = new int[1000001];	//소수 저장
	static int pn = 0;	//소수 개수
	
	static boolean isPrime(boolean[] check, int n) {
		return check[n];
	}
	
	static String isGold(boolean[] check, int n) {
		String str = "Goldbach's conjecture is wrong.";
		for(int i=2; i*2<=n; i++) {
			if(isPrime(check, i) && isPrime(check, n-i)) {
				str = n+" = "+i+" + "+(n-i);
				return str;
			}
		}
		return str;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//에라토스테네스의 체
		boolean[] check = new boolean[1000001]; //제거 체크
		Arrays.fill(check, true);
		check[0] = check[1] = false;
		for(int i=2; i<=1000; i++) {
			if(check[i]) {
				prime[pn++] = i;
				for(int j=i*2; j<=1000001-i; j+=i) {
					check[j] = false;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		int N = 0;
		do {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			if(N==0) break;
			
			sb.append(isGold(check, N)+"\n");
		} while(!(N==0));
		
		System.out.println(sb.toString().trim());
	}

}
