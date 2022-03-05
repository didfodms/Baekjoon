import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q11866 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		Queue<Integer> q = new LinkedList<>();
		int N = Integer.parseInt(st.nextToken());	int K = Integer.parseInt(st.nextToken());
		for(int i=1; i<=N; i++) q.add(i);
		for(int i=1; !q.isEmpty(); i++) {
			if(i%K==0) {
				sb.append(q.poll());
				if(!q.isEmpty()) sb.append(", ");
			} else {
				q.add(q.poll());
			}
		}
		System.out.println("<"+sb.toString()+">");
	}
}
