import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q1316 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		String str, regex;
		boolean[] check = new boolean[26];
		char init;
		
		for(int i=0; i<N; i++) {
			Arrays.fill(check, false);
			str = br.readLine();
			
			while(!str.equals(null) || !str.equals("")) {
				init = str.charAt(0);
				if(check[(int)init-97]==true) {
					cnt++; break;
				}
				
				check[(int)init-97] = true;
				regex = init+"{1,}";
				str = str.replaceFirst(regex, "");
			}
		}
		
		System.out.println(N-cnt);
	}
}
