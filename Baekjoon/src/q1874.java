import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class q1874 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int m = 0;
		Stack<Integer> s = new Stack<>();
		while(t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			if(n > m) {
				while(n > m) {
					s.push(++m);
					sb.append("+\n");
				}
				s.pop();
				sb.append("-\n");
			} else {
				if(s.peek()!=n) {
					System.out.println("NO");
					System.exit(0);
				}
				s.pop();
				sb.append("-\n");
			}
		}
		System.out.println(sb.toString());
	}
}
