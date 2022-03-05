import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class q1406 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		Stack<Character> left = new Stack<>();
		Stack<Character> right = new Stack<>();
		
		String str = br.readLine();
		int i=0;
		for(i=0; i<str.length(); i++) {
			left.push(str.charAt(i));
		}
		
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken().charAt(0)) {
				case 'L' : {
					if(!left.isEmpty()) {
						right.push(left.pop());
					}
					break;
				}
				case 'D' : {
					if(!right.isEmpty()) {
						left.push(right.pop());
					}
					break;
				}
				case 'B' : {
					if(!left.isEmpty()) {
						left.pop();
					}
					break;
				}
				case 'P' : {
					String x = st.nextToken();
					left.push(x.charAt(0));
					break;
				}
				default : break;
			}
		}
		while(!left.isEmpty()) {
			right.push(left.pop());
		}
		while(!right.isEmpty()) {
			bw.write(right.pop());
		}
		bw.flush();
	}
}
