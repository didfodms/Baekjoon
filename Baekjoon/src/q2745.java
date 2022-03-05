import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2745 {

	static int to10(String N, int B) {
		int res = 0, dd = 1;
		
		for(int i=N.length()-1; i>=0; i--) {
			int n = (int)(N.charAt(i));
			if(65 <= n && n <= 90) {
				n -= 55;
			} else {
				n -= 48;
			}
			
			res += n * dd;
			dd *= B;
		}
		
		return res;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String N = st.nextToken();
		int B = Integer.parseInt(st.nextToken());
		
		System.out.println(to10(N, B));
	}

}
