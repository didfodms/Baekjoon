import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class q1927 {

	public static void main(String[] args) throws Exception {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			int t = Integer.parseInt(br.readLine());
			if(t==0) {
				if(pq.size()==0) sb.append("0\n");
				else sb.append(pq.poll() + "\n");
			}
			else pq.add(t);
		}
		System.out.println(sb.toString());
	}
}
