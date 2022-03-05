import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1676 {
	
	static int cnt(int n) { //n을 소인수 분해해서 5의 개수 리턴 (2의 개수는 항상 더 많기 때문)
		int cnt = 0;
		int i = 2;
		while(n>1) {
			if(n%i==0) {
				if(i==5) cnt++;
				n /= i;
			} else i++;
		}
		return cnt;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		int cnt5 = 0;
		for(int i=2; i<=N; i++) { //팩토리얼 소인수분해
			cnt5 += cnt(i);
		}
		
		System.out.println(cnt5);
	}

}
