import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q2089 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		if(n==0) {
			sb.append(0);
		}
		
		
		int r = 0, dd = -2;
		while(n != 0) {
			
			if(n%dd <0) {
				r = 1;
				if(n < 0) n--;
				if(n > 0) n++;
				n /= dd;
			}
			else {
				r = n%dd;
				n /= dd;
			}
			
			sb.append(r);
			
		}
		
		System.out.println(sb.reverse().toString());
	}

}
