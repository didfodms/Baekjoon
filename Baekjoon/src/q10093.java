import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q10093 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		long n = 0;
		if(A>B) {
			n = A-B-1;
			for(int i=1; i<=n; i++) {
				sb.append((B+i)+" ");
			}
		} else {
			n = B-A-1;
			for(int i=1; i<=n; i++) {
				sb.append((A+i)+" ");
			}
		}
		
		if(n<=0) n++;
		System.out.println(n);
		System.out.println(sb.toString().trim());
	}

}
