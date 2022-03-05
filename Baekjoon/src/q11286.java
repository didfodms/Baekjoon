import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

class AbsComparator implements Comparator<Integer> {
	public int compare(Integer o1, Integer o2) {
		int res = Math.abs(o1) - Math.abs(o2);
		if (res == 0) return (o1 - o2);
		else return res;
	}
}

public class q11286 {
	static PriorityQueue<Integer> pq;
	public static void main(String[] args) throws Exception {
		pq = new PriorityQueue<Integer>(new AbsComparator());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			int t = Integer.parseInt(br.readLine());
			if(t==0) {
				if(pq.size()==0) sb.append("0\n");
				else sb.append(pq.poll() + "\n");
			} else pq.add(t);
		}
		System.out.println(sb.toString());
	}
}
