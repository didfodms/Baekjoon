import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q10845 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		Queue<Integer> q = new LinkedList<>();
		int t = Integer.parseInt(st.nextToken());
		int x = 0;
		while(t-- > 0) {
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
				case "push" : {
					x = Integer.parseInt(st.nextToken());
					q.add(x);
					break;
				}
				case "pop" : {
					if(!q.isEmpty()) sb.append(q.poll()+"\n");
					else sb.append("-1\n");
					break;
				}
				case "size" : {
					sb.append(q.size()+"\n");
					break;
				}
				case "empty" : {
					if(q.isEmpty()) sb.append("1\n");
					else sb.append("0\n");
					break;
				}
				case "front" : {
					if(!q.isEmpty()) sb.append(q.peek()+"\n");
					else sb.append("-1\n");
					break;
				}
				case "back" : {
					if(!q.isEmpty()) sb.append(x+"\n");
					else sb.append("-1\n");
					break;
				} default : break;
			}
		}
		System.out.println(sb.toString());
	}
}
