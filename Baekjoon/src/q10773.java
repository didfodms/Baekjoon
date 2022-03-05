import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class q10773 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> s = new Stack<>();
		int t = Integer.parseInt(br.readLine());
		int sum = 0;
		while(t-- > 0) {
			int x = Integer.parseInt(br.readLine());
			if(x==0) {
				sum -= s.pop();
			} else {
				sum += s.push(x);
			}
		}
		System.out.println(sum);
	}
}
