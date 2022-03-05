import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q1032 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] str = new String[T];
		
		for(int i=0; i<T; i++) {
			str[i] = br.readLine();
		}
		
		String res = str[0];
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<T; i++) {
			sb.setLength(0);
			for(int j=0; j<res.length(); i++) {
				if(str[i].charAt(j)==res.charAt(j)) {
					sb.append(str[i].charAt(j));
				}
				else {
					sb.append("?");
				}
			}
			res = sb.toString();
		}
		
		System.out.println("res");
	}

}
