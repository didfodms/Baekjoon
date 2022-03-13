import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2480 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int res = 0;
		
		if(a==b && b==c) {
			res = 10000 + a*1000;
		}
		else if(a==b || b==c || c==a) {
			if(a==b || b==c) res = 1000 + b*100;
			else res = 1000 + c*100;
		}
		else {
			res = Math.max(a, Math.max(b, c))*100;
		}
		
		System.out.println(res);
	}

}
