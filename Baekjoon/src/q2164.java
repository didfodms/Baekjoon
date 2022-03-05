import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class q2164 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> q = new LinkedList<>();
		int N = Integer.parseInt(br.readLine());
		for(int i=1; i<=N; i++) {
			q.add(i);
		}
		for(int i=1; q.size()!=1; i++) {
			if(i%2==1) {
				q.poll();
			} else {
				q.add(q.poll());
			}
		}
		System.out.println(q.poll());
	}
}
