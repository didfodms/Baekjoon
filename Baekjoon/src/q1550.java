import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q1550 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] hex = br.readLine().toCharArray();
		
		int n = 0, x = 1, ans = 0;
		for(int i=hex.length-1; i>=0; i--) {
			if(hex[i]=='A') n = 10;
			else if(hex[i]=='B') n = 11;
			else if(hex[i]=='C') n = 12;
			else if(hex[i]=='D') n = 13;
			else if(hex[i]=='E') n = 14;
			else if(hex[i]=='F') n = 15;
			else n = hex[i]-48;
			ans += n * x;
			x *= 16;
		}
		
		System.out.println(ans);
	}

}
