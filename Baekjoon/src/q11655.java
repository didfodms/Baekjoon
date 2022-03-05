import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q11655 {

	static char change(char ch) {
		int res = (int)ch;
		if(Character.isUpperCase(ch)) {
			res = (int)ch + 13;
			if(res > 90) res -= 26;
		} else if(Character.isLowerCase(ch)) {
			res = (int)ch + 13;
			if(res > 122) res -= 26;
		}
		return (char)res;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			sb.append(change(str.charAt(i)));
		}
		
		System.out.println(sb.toString());
	}

}
