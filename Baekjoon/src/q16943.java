import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q16943 {

	static int N, K;
	static int A, B, C = -1;
	
	public static void Proc(int[] t) {
		int n = 0;
		if(t[0] == 0) return;
		for(int i=0; i<N; i++)
			n = n*10 + t[i];
		if(n<=B && n>C)
			C = n;
	}

	static void Perm(int[] t, int loc) {
		int p;
		if(loc == N) {
			Proc(t); return;
		}
		for(int i=loc; i<N; i++) {
			p = t[loc]; t[loc] = t[i]; t[i] = p;
			Perm(t, loc+1);
			p = t[loc]; t[loc] = t[i]; t[i] = p;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		int[] digitA = new int[10];
		while(A > 0) {
			digitA[N++] = A%10;
			A /= 10;
		}
		Perm(digitA, 0);
		System.out.println(C);
	}
}
