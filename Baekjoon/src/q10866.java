import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class q10866 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		Deque<Integer> d = new ArrayDeque<>();
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0) {
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
				case "push_front" : {
					d.addFirst(Integer.parseInt(st.nextToken()));
					break;
				}
				case "push_back" : {
					d.addLast(Integer.parseInt(st.nextToken()));
					break;
				}
				case "pop_front" : {
					sb.append(d.isEmpty()?"-1\n":d.pollFirst()+"\n");
					break;
				}
				case "pop_back" : {
					sb.append(d.isEmpty()?"-1\n":d.pollLast()+"\n");
					break;
				}
				case "size" : {
					sb.append(d.size()+"\n");
					break;
				}
				case "empty" : {
					sb.append((d.isEmpty()?1:0)+"\n");
					break;
				}
				case "front" : {
					sb.append((d.isEmpty()?-1:d.peekFirst())+"\n");
					break;
				}
				case "back" : {
					sb.append((d.isEmpty()?-1:d.peekLast())+"\n");
					break;
				} default : break;
			}
		}
		System.out.println(sb.toString());
	}
}
