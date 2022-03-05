import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q17250 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int res = 1; int r = 16769023;
		for(int i=0; i<(n+1)/2; i++) {
			res = ((res%r)*2)%r;
		}
		
		System.out.println(res);
		
	}

}
