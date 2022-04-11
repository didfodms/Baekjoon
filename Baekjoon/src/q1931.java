import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class q1931 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] time = new int[n][2];
		StringTokenizer st;
		
		int mm = Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());

			time[i][0] = Integer.parseInt(st.nextToken());
			time[i][1] = Integer.parseInt(st.nextToken());
			
			mm = mm < time[i][1] ? mm : time[i][1];
		}
		
		Arrays.sort(time, new Comparator<int[]>(){
			@Override
			public int compare(int[] o1, int[] o2) {
				int res = o1[0]-o2[0];
				if(res == 0) return o1[1]-o2[1];
				return res;
			}
		});
		
		int count = 0;
		int first = 0;
		int last = 0;
		int maxCount = -1;
		for(int i=0; i<n && time[i][0] <= mm; i++) {
			
			count = 1;
			first = time[i][0];
			last = time[i][1];
			
			for(int j=i; j<n; j++) {
				if(time[j][0] >= last) {
					count++;
					first = time[j][0];
					last = time[j][1];
				}
			}
			
			maxCount = maxCount>count?maxCount:count;
		}

		System.out.println(maxCount);
		
	}

}
