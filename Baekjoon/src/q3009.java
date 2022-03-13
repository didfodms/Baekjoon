import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class q3009 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] xy = new int[3][3];
		
		for(int i=0; i<xy.length; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			xy[i][0] = Integer.parseInt(st.nextToken());
			xy[i][1] = Integer.parseInt(st.nextToken());
			
		}
		
		Arrays.sort(xy, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				int res = o1[0] - o2[0];
				if(res == 0) res = o1[1] - o2[1];
				return res;
			}
		});
		
		

	}

}
