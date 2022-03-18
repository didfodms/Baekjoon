import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class q7568 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] dung = new int[n][2];
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			dung[i][0] = Integer.parseInt(st.nextToken());
			dung[i][1] = Integer.parseInt(st.nextToken());
			
		}
		
	}

}
