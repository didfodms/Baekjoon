import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2961 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int n = 1, m = 0, min = 1000000000;
		while(t-- > 0) {
			st = new StringTokenizer(br.readLine());
			n *= Integer.parseInt(st.nextToken());
			m += Integer.parseInt(st.nextToken());
			min = n-m<min?n-m:min;
		}
		System.out.println(Math.round(Math.abs(min)));
	}
}
