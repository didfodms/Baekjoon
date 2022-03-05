import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q16283_1 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		//p는 양의 수, q는 염소의 수
		int p = 0; int q = 0; int cnt = 0;
		for(int i=1; i<=1000 && i<n; i++) {
			if(i*a+(n-i)*b == w) {
				if(cnt == 1) {
					System.out.println(-1);
					System.exit(0);
				}
				p = i;	q = n-i;
				cnt++;
			}
		}
		
		if(cnt==1) System.out.println(p+" "+q);
		else System.out.println(-1);
		
	}

}
