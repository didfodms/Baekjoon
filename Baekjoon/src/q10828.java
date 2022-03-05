import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class q10828 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		Stack<Integer> s = new Stack<>();
		
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
				case "push" : {
					s.push(Integer.parseInt(st.nextToken()));
					break;
				}
				case "pop" : {
					if(!s.isEmpty()) {
						bw.write(s.pop()+"\n");
					} else {
						bw.write("-1\n");
					}
					break;
				}
				case "size" : {
					bw.write(s.size()+"\n");
					break;
				}
				case "empty" : {
					if(!s.isEmpty()) bw.write("0\n");
					else bw.write("1\n");
					break;
				}
				case "top" : {
					if(!s.isEmpty()) {
						bw.write(s.peek()+"\n");
					} else {
						bw.write("-1\n");
					}
					break;
				}
				default : 
					break;
			}
		}
		bw.flush();
	}
}
