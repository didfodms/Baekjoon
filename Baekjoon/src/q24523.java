import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class q24523 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N+1];
		int[] change = new int[N+1];

		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<Integer> s = new Stack<>();
		for(int i=1; i<=N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
			s.push(A[i]);
		}

		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=N; i++) {
			if(i>1 && A[i] != A[i-1]) {
				
			} else s.push(A[i]);
		}
		
	}

}
