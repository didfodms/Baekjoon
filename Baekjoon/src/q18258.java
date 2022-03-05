import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q18258 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		Queue<Integer> q = new LinkedList<>();
		int t = Integer.parseInt(br.readLine());
		int x = 0;
		while(t-- > 0) {
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) { 
				case "push" :{
					x = Integer.parseInt(st.nextToken());
					q.add(x);
					break;
				}
				case "pop" :{
					sb.append((!q.isEmpty()?q.poll():-1)+"\n");
					break;
				}
				case "size" :{
					sb.append(q.size()+"\n");
					break;
				}
				case "empty" :{
					sb.append((!q.isEmpty()?0:1)+"\n");
					break;
				}
				case "front" :{
					sb.append((!q.isEmpty()?q.peek():-1)+"\n");
					break;
				}
				case "back" :{
					sb.append((!q.isEmpty()?x:-1)+"\n");
					break;
				} default : break;
			}
		}
		System.out.println(sb.toString());
	}
}
