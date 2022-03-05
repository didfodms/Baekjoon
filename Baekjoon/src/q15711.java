import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

//에라토스테네스의 체 클래스 구현
class EraSieve {
	
	boolean[] isPrime;
	ArrayList<Integer> A = new ArrayList<Integer>();
	
	EraSieve(int B){
		isPrime = new boolean[B];
		Arrays.fill(isPrime,  true);
		isPrime[0] = isPrime[1] = false;
		for(int i=2; i<isPrime.length; i++) {
			if(isPrime[i] == true) {
				A.add(i);
				for(int j=i+i; j<isPrime.length; j+=i) {
					isPrime[j] = false;
				}
			}
		}
	}
	
}


public class q15711 {
	
	static EraSieve es;
	
	static boolean isPrime(long l) {
		for(int i: es.A) {	//ArrayList에서 반복문 쓰는법
			long p = (long)i; //ArrayList에 들어간 소수
			if(p*p > l) break;
			if(l%p == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) throws Exception {
		
		es = new EraSieve(1500000);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long l = Long.parseLong(st.nextToken()) + Long.parseLong(st.nextToken());
			
			if(l <= 3) sb.append("NO\n");
			else if(l%2 == 0) sb.append("YES\n"); //4이상의 짝수는 (소수)+(소수) 가능!
			else {
				if(isPrime(l-2)==true) {
					sb.append("YES\n");
				}
				else sb.append("NO\n");
			}
		}
		
		System.out.println(sb.toString());
		
	}

}
