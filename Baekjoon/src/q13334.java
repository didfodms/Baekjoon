import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class q13334 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] rail = new int[N][2];
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int t1 = Integer.parseInt(st.nextToken());
			int t2 = Integer.parseInt(st.nextToken());
			rail[i][0] = Math.min(t1,  t2); rail[i][1] = Math.max(t1, t2);
		}
		int D = Integer.parseInt(br.readLine());
		
		Arrays.sort(rail, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return (o1[1]-o2[1]);
			}
		});
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int mm = 0;
		for(int i=0; i<N; i++) {
			pq.add(rail[i][0]);
			int dis = rail[i][1]-D;
			while( !pq.isEmpty() && pq.peek()<dis ) pq.poll();
			mm = Math.max(mm,  pq.size());
		}
		System.out.println(mm);	
	}
}
