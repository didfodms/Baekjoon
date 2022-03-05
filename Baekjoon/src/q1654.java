import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q1654 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[] line = new int[K];
		for(int i=0; i<line.length; i++) {
			line[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(line);
		int res = 0;	int cnt = 0;
		for(int i=line[0]; i>0; i--) {
			cnt = 0;
			for(int j=0; j<line.length; j++) {
				cnt += line[j]/i;
			}
			if(cnt==N) {
				res = i; break;
			}
		}
		
		System.out.println(res);
	}

}
