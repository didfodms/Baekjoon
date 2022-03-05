import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

class q17608 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		Stack<Integer> s = new Stack<>();
		while(N-- > 0) {
			int n = Integer.parseInt(br.readLine());
			if(s.isEmpty()) s.push(n);
			else if(s.peek() > n) {
				s.push(n);
			}
			else {
				s.
			}
		}
		
		
	}

}
