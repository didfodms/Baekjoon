import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q1316 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		String str = "", regex = "";
		while(N-- > 0) {
			str = br.readLine();
			for(int i=0; i<26; i++) {
				regex = (char)(i+97)+"{1,}";
				str = str.replaceFirst(regex, "");
			}
			if(str.equals("")||str.equals(null)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
