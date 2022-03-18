import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q2447 {
	
	static String pattern(int n) {
		if(n < 3) return "*";
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			sb.append(pattern(n/3));
		}
		sb.append("\n");
		for(int i=0; i<n; i++) {
			if(i%3==0 || i%3==2) sb.append(pattern(n/3));
			else sb.append(" ");
		}
		sb.append("\n");
		for(int i=0; i<n; i++) {
			sb.append(pattern(n/3));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(pattern(n));
	}

}
