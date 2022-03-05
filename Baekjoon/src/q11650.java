import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class q11650 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] p = new int[N][2];
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			p[i][0] = Integer.parseInt(st.nextToken());
			p[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(p, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				int res = o1[0] - o2[0];
				if(res == 0) return o1[1] - o2[1];
				return res;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			for(int j=0; j<2; j++) {
				sb.append(p[i][j]+" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString().trim());
	
	}

}
