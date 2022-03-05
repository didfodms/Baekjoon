import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class q17298 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int k = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] A = new int[k];
		for(int i=0; i<k; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] res = new int[k];
		Stack<Integer> s = new Stack<>();
		for(int i=0; i<k; i++) {
			
			while (!s.empty() && (A[s.peek()] < A[i])) {
				res[s.peek()] = A[i];
				s.pop();
			}
			
			s.push(i);
		}
		
		while(!s.empty()) {
			res[s.pop()] = -1;
		}
		
		for(int i=0; i<k; i++) {
			sb.append(res[i]+" ");
		}
		
		System.out.println(sb.toString().trim());
	}
}
